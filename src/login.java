

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
//import javax.swing.ImageIcon;


public class login {

	public JFrame frame;
	public JPasswordField pass;
	TextField user;
	String s1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 204, 153));
		frame.setBounds(100, 100, 472, 463);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("Login");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 31));
		lbl1.setBounds(211, 73, 156, 48);
		frame.getContentPane().add(lbl1);
		
		JLabel lblusername = new JLabel("Username");
		lblusername.setToolTipText("Enter the user-ID");
		lblusername.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblusername.setBounds(71, 194, 97, 24);
		frame.getContentPane().add(lblusername);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setToolTipText("Enter the password");
		lblpassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblpassword.setBounds(71, 251, 90, 16);
		frame.getContentPane().add(lblpassword);
		
		pass = new JPasswordField();
		pass.setBounds(180, 249, 187, 22);
		frame.getContentPane().add(pass);
		
		user = new TextField();
		user.setBounds(180, 194, 187, 24);
		frame.getContentPane().add(user);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "password");
					Statement stmt=con.createStatement();
					@SuppressWarnings("deprecation")
					String sql="select * from user4 where id='"+user.getText()+"' and pass='"+pass.getText().toString()+"'";
					//access data from database
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next())
					{
						
							s1=user.getText();
							
						JOptionPane.showMessageDialog(null, "Login Successfully...");
						frame.dispose();
					set2 m=new set2();
					m.frame.setVisible(true);
					}
					else
						JOptionPane.showMessageDialog(null, "Incorrect username or password");
					con.close();
				} catch (Exception e1) {
					System.out.print(e1);
				}
			}
		});
		btnLogin.setBounds(85, 307, 97, 25);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Cancel");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setText(null);
				pass.setText(null);
			}
		});
		btnReset.setBounds(246, 305, 97, 28);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("New Account");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				newuser q=new newuser();
				q.frame.setVisible(true);
			
			}
		});
		btnExit.setBounds(155, 376, 143, 25);
		frame.getContentPane().add(btnExit);
		
		JLabel lblBus = new JLabel("  Bus    Pass");
		lblBus.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblBus.setBounds(167, 34, 202, 48);
		frame.getContentPane().add(lblBus);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\ASDD\\src\\img\\trolleybus-filled.png"));
		lblNewLabel.setBounds(64, 13, 105, 114);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 204, 102));
		separator.setBackground(new Color(51, 204, 51));
		separator.setBounds(0, 140, 454, 24);
		frame.getContentPane().add(separator);
	}
}
