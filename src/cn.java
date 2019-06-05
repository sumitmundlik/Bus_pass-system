import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.TextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.im.InputContext;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class cn {
	public String[] me= {"1","2","3"};
	JLabel lbll1 ;
	public JFrame frame;
	TextField t6;
	TextField t7 ;
	TextField t8;
	static String s1;
	static String s2;
	static	String s3;
	static	String s4;
	static String s5;
	static	String s6;
	static String d;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cn window = new cn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public cn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 153, 153));
		frame.setBounds(100, 100, 487, 671);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblName.setBackground(new Color(255, 255, 255));
		lblName.setBounds(34, 27, 75, 24);
		frame.getContentPane().add(lblName);
		
		JLabel lblCollegeName = new JLabel("College name");
		lblCollegeName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCollegeName.setBounds(34, 70, 125, 42);
		frame.getContentPane().add(lblCollegeName);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDob.setBounds(34, 140, 56, 16);
		frame.getContentPane().add(lblDob);
		
		JLabel lblPassDate = new JLabel("Pass Date");
		lblPassDate.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassDate.setBounds(34, 300, 90, 24);
		frame.getContentPane().add(lblPassDate);
		
		JLabel lblNewLabel = new JLabel("Source");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(34, 203, 75, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDestination.setBounds(34, 247, 109, 24);
		frame.getContentPane().add(lblDestination);
		
		TextField t1 = new TextField();
		t1.setBounds(213, 27, 191, 24);
		frame.getContentPane().add(t1);
		
		TextField t2 = new TextField();
		t2.setBounds(214, 80, 180, 24);
		frame.getContentPane().add(t2);
		
		TextField t3 = new TextField();
		t3.setBounds(214, 140, 180, 24);
		frame.getContentPane().add(t3);
		
		TextField t4 = new TextField();
		t4.setBounds(213, 185, 180, 24);
		frame.getContentPane().add(t4);
		
		TextField t5 = new TextField();
		t5.setBounds(214, 247, 180, 24);
		frame.getContentPane().add(t5);
		
		
		
		t6=new TextField();
		t6.setBounds(167, 300, 38, 24);
		frame.getContentPane().add(t6);
			
	
		
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "password");
					String sql="insert into pass6 (name,clg,dob,src,dest,pass,exp)values(?,?,?,?,?,?,?)";
					PreparedStatement stmt=con.prepareStatement(sql);
					s1 = t1.getText();
					s2 = t2.getText();
				s3 = t3.getText();
					s4 = t4.getText();
				s5 = t5.getText();
					s6 = t6.getText();
					stmt.setString(1,t1.getText());
					stmt.setString(2,t2.getText());
					stmt.setString(3,t3.getText());
					stmt.setString(4,t4.getText());
					stmt.setString(5,t5.getText());
					String s8=t6.getText()+"/"+t7.getText()+"/"+t8.getText();
					stmt.setString(6,s8);
					String a=t6.getText();//11
					String s2=t7.getText();
					String s5=t8.getText();
					int dd=Integer.parseInt(a);
					String s3="1";
					int ddd=Integer.parseInt(s5);
					int c=Integer.parseInt(s2)+Integer.parseInt(s3);
					
			
					d=dd+"/"+c+"/"+ddd;
					//String s7=d;
					stmt.setString(7, d);		
					stmt.execute();
					
					frame.dispose();
					
					genn g=new genn();
					g.frame.setVisible(true);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		btnSend.setBounds(159, 575, 136, 42);
		frame.getContentPane().add(btnSend);
		
		t7= new TextField();
		t7.setBounds(224, 300, 38, 24);
		frame.getContentPane().add(t7);
		
		t8 = new TextField();
		t8.setBounds(300, 300, 104, 24);
		frame.getContentPane().add(t8);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDuration.setBounds(34, 363, 90, 24);
		frame.getContentPane().add(lblDuration);
		//com1.addActionListener(this);	
		
		
		lbll1= new JLabel("New label");
		lbll1.setBounds(344, 353, 104, 31);
		frame.getContentPane().add(lbll1);
		
	}
}
