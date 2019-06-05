import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextField;
import javax.swing.JRadioButton;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class trans {

	public JFrame frame;
	TextField Y8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trans window = new trans();
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
	public trans() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 204, 51));
		frame.setBounds(100, 100, 486, 672);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTransactionForm = new JLabel("Transaction form");
		lblTransactionForm.setBounds(116, 32, 258, 37);
		lblTransactionForm.setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.getContentPane().add(lblTransactionForm);
		
		JLabel lblEnterTransactionId = new JLabel("Enter transaction id");
		lblEnterTransactionId.setBounds(12, 119, 299, 54);
		lblEnterTransactionId.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(lblEnterTransactionId);
		
		TextField textField = new TextField();
		textField.setBounds(126, 191, 212, 24);
		frame.getContentPane().add(textField);
		
		JLabel lblEnterPassword = new JLabel("Enter password");
		lblEnterPassword.setBounds(12, 243, 299, 54);
		lblEnterPassword.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(lblEnterPassword);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(126, 312, 212, 24);
		frame.getContentPane().add(textField_1);
		
		Button button = new Button("Transfer");
		button.setBounds(160, 528, 128, 37);
		button.setForeground(new Color(204, 255, 204));
		button.setBackground(new Color(0, 51, 255));
		button.setFont(new Font("Tahoma", Font.BOLD, 23));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/log2", "root", "GARINplz");
					String sql="insert into trans values(?,?,?)";
					PreparedStatement stmt=con.prepareStatement(sql);
					stmt.setString(1,textField.getText());
					stmt.setString(2, textField_1.getText());
					stmt.setString(3, Y8.getText());
					String s14=textField.getText();
					if(s14.length()!=8)
					{
						JOptionPane.showMessageDialog(null, "Id must contain 8 digits");
						textField.setText("");
						textField.setBackground(Color.RED);
						textField.requestFocus();
					}
					else
					{
						frame.dispose();
				           JOptionPane.showMessageDialog(null,"Transaction is in proccess");
							 genn g=new genn();
							g.frame.setVisible(true);
							stmt.execute();
					}
					
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		frame.getContentPane().add(button);
		
		JLabel lblConfrPassword = new JLabel("CONFr password");
		lblConfrPassword.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblConfrPassword.setBounds(12, 385, 299, 54);
		frame.getContentPane().add(lblConfrPassword);
		
		 Y8 = new TextField();
		Y8.setBounds(126, 454, 212, 24);
		frame.getContentPane().add(Y8);
	}
}
