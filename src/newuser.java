import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.TextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class newuser {

	public JFrame frame;
	JLabel lblUserid ;
	TextField t1;
	TextField t2;
	TextField t3;
	private JPasswordField p1;
	private JPasswordField p2;
	private JLabel lblCreateAcoount;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newuser window = new newuser();
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
	public newuser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 153, 204));
		frame.getContentPane().setForeground(new Color(153, 0, 51));
		frame.setBounds(100, 100, 488, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(new Color(255, 255, 102));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(61, 104, 88, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMobNo = new JLabel("MOb no");
		lblMobNo.setForeground(new Color(255, 255, 102));
		lblMobNo.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblMobNo.setBounds(61, 166, 103, 24);
		frame.getContentPane().add(lblMobNo);
		
		JLabel lblDateOfBirth = new JLabel("Password");
		lblDateOfBirth.setForeground(new Color(255, 255, 102));
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblDateOfBirth.setBounds(61, 276, 123, 31);
		frame.getContentPane().add(lblDateOfBirth);
		
		JLabel lblAge = new JLabel("confirm ");
		lblAge.setForeground(new Color(255, 255, 102));
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblAge.setBounds(61, 332, 103, 31);
		frame.getContentPane().add(lblAge);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBackground(new Color(255, 51, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "password");
					String sql="insert into user4 values(?,?,?,?)";
					PreparedStatement stmt=con.prepareStatement(sql);
					stmt.setString(1,t1.getText());
					stmt.setString(2, t2.getText());
					stmt.setString(3, t3.getText());
					stmt.setString(4, p1.getText());
					//stmt.setString(5, p2.getText());
					String s14=t3.getText();
					if(s14.length()!=8)
					{
						JOptionPane.showMessageDialog(null, "Id must contain 8 digits");
						t3.setText("");
						t3.setBackground(Color.RED);
						t3.requestFocus();
					}
					else
					{
					if(p1.getText().equals(p2.getText()))
					{
					frame.dispose();
		           JOptionPane.showMessageDialog(null,"User Added");
					login l=new login();
					l.frame.setVisible(true);
					stmt.execute();
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Wrong password");
					}
					}
				}
					
				 catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(162, 387, 131, 31);
		frame.getContentPane().add(btnNewButton);
		
		t1 = new TextField();
		t1.setBounds(190, 104, 246, 24);
		frame.getContentPane().add(t1);
		
		t2 = new TextField();
		t2.setBounds(190, 166, 246, 24);
		frame.getContentPane().add(t2);
		
		p1 = new JPasswordField();
		p1.setBounds(196, 284, 240, 22);
		frame.getContentPane().add(p1);
		
		p2 = new JPasswordField();
		p2.setBounds(196, 340, 240, 22);
		frame.getContentPane().add(p2);
		
		lblUserid= new JLabel("User-id");
		lblUserid.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblUserid.setForeground(new Color(255, 255, 102));
		lblUserid.setBounds(61, 223, 123, 24);
		frame.getContentPane().add(lblUserid);
		
		t3 = new TextField();
		t3.setBounds(196, 223, 240, 24);
		frame.getContentPane().add(t3);
		
		lblCreateAcoount = new JLabel("Create Acoount");
		lblCreateAcoount.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCreateAcoount.setForeground(new Color(204, 0, 0));
		lblCreateAcoount.setBounds(123, 35, 221, 31);
		frame.getContentPane().add(lblCreateAcoount);
	}
}
