import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class set2 {

	public JFrame frame;
	static String str1, str2, str3, str4, str5, str6, str7;
	TextField textField_4;
	TextField textField_5;
	@SuppressWarnings("rawtypes")
	JComboBox comboBox_3;
	@SuppressWarnings("rawtypes")
	JComboBox comboBox;
	JLabel label_7;
	@SuppressWarnings("rawtypes")
	JComboBox comboBox_1;
	@SuppressWarnings("rawtypes")
	JComboBox comboBox_2;
	JButton btnSubmit;
	TextField textField;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_4;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_5;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_6;
	JLabel lab;
	static String eadd;
	static String eyear;
	static String esetmonth;
	static String amo;
	static String date ;
	static String pdate;
	static String edate;
	static String dura;
	private JLabel lblRs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					set2 window = new set2();
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
	public set2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 204, 102));
		frame.setBounds(100, 100, 496, 681);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("Name");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBackground(Color.WHITE);
		label.setBounds(34, 61, 75, 24);
		frame.getContentPane().add(label);

		textField = new TextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(213, 61, 191, 24);
		frame.getContentPane().add(textField);

		TextField textField_1 = new TextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_1.setBounds(214, 114, 180, 24);
		frame.getContentPane().add(textField_1);

		JLabel label_1 = new JLabel("College name");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(34, 104, 149, 42);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("DOB");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBounds(34, 174, 56, 16);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("Source");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_3.setBounds(34, 230, 75, 16);
		frame.getContentPane().add(label_3);

		JLabel label_4 = new JLabel("Destination");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_4.setBounds(34, 281, 109, 24);
		frame.getContentPane().add(label_4);

		JLabel label_5 = new JLabel("Pass Date");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_5.setBounds(34, 334, 125, 24);
		frame.getContentPane().add(label_5);

		textField_4 = new TextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_4.setBounds(214, 281, 180, 24);
		frame.getContentPane().add(textField_4);

		textField_5 = new TextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_5.setBounds(214, 222, 180, 24);
		frame.getContentPane().add(textField_5);

		comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String item_index = (String) comboBox_3.getSelectedItem();
				
				//1 Year (1800 RS)  

				switch (item_index) {
				case "1 Month (300 RS)":
				{
					lab.setText("300");
					amo="300";
					break;
				}
				case "2 Month (500 RS)":{
					lab.setText("500");
					amo="500";
					break;
				}
				case "3 Month (800 RS)":{
					lab.setText("800");
					amo="800";
					break;
				}
				case "6 Month (1000 RS)":{
					lab.setText("1000");
					amo="1000";
					break;
				}
				case "1 Year (1800 RS)":{
					lab.setText("1800");
					amo="1800";
					break;
				}
				default:
					lab.setText("ERROR");
					break;
				}
			}
		});
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1 Month (300 RS)", "2 Month (500 RS)", "3 Month (800 RS)", "6 Month (1000 RS)", "1 Year (1800 RS)"}));
		comboBox_3.setBounds(171, 393, 201, 22);
		frame.getContentPane().add(comboBox_3);

		label_7 = new JLabel("Duration");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_7.setBounds(34, 391, 90, 24);
		frame.getContentPane().add(label_7);

		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
						"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		comboBox.setBounds(143, 168, 58, 22);
		frame.getContentPane().add(comboBox);

		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox_1.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_1.setBounds(218, 168, 58, 22);
		frame.getContentPane().add(comboBox_1);

		comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "1995", "1996", "1997", "1998", "1999", "2000",
				"2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013",
				"2014", "2015", "2016", "2017", "2018" }));
		comboBox_2.setBounds(297, 168, 107, 22);
		frame.getContentPane().add(comboBox_2);

		btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(0, 204, 255));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root","password");
					String sql = "insert into pass9 (name,clg,dob,src,dest,pass,exp, dur,amt)values(?,?,?,?,?,?,?,?,?)";
					PreparedStatement stmt = con.prepareStatement(sql);
					
								str1 = textField.getText();
								str2 = textField_1.getText();
					String day = (String) comboBox.getSelectedItem();
					String month = (String) comboBox_1.getSelectedItem();
					String year = (String) comboBox_2.getSelectedItem();
								 date = day +"/"+ month +"/"+ year;
								str3 = textField_5.getText();
								str4 = textField_4.getText();
					String pday = (String) comboBox_4.getSelectedItem();
					String pmonth = (String) comboBox_5.getSelectedItem();
					String pyear = (String) comboBox_6.getSelectedItem();
								 pdate = pday +"/"+ pmonth +"/"+ pyear;
								

								 //	static String s90=t90.getText();
								
					String emonth = (String) comboBox_3.getSelectedItem();
					//String eadd;
					switch (emonth) {	
					case "1 Month (300 RS)": {
						eadd = "1";
						break;
					}
					case "2 Month (500 RS)": {
						eadd = "2";
						break;
					}
					case "3 Month (800 RS)": {
						eadd = "3";
						break;
					}
					case "6 Month (1000 RS)": {
						eadd = "6";
						break;
					}
					case "1 Year (1800 RS)": {
						eadd = "12";
						break;
					}
					}
					//eyear=
					int q = 0;
					//String one="1";
					int e1 = 0;
					int ex=Integer.parseInt(eadd);
					String ppmonth=(String) comboBox_5.getSelectedItem();
					String ppyear=(String) comboBox_6.getSelectedItem();
					if(ex<12)
					{
						 q=Integer.parseInt(ppmonth)+Integer.parseInt(eadd);
						//String eyear=;
						e1=Integer.parseInt(ppyear);
						if(q>12)
						{
							int qq=12-Integer.parseInt(pmonth);
							
							q=qq;
							e1=Integer.parseInt(pyear)+1;
						}
					}
					else
					{
						e1=Integer.parseInt(pyear)+1;
						q=Integer.parseInt(ppmonth);
					}
								 edate=pday+"/"+q+"/"+e1;
								 dura = (String) comboBox_3.getSelectedItem();
					// s6 = t6.getText();
					stmt.setString(1, str1);
					stmt.setString(2, str2);
					stmt.setString(3, date);
					stmt.setString(4, str3);
					stmt.setString(5, str4);
					stmt.setString(6, pdate);
					stmt.setString(7, edate);
					stmt.setString(8, dura);
					stmt.setString(9, amo);
					stmt.execute();
					frame.dispose();
					conf3 c=new conf3();
					c.frame.setVisible(true);

				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnSubmit.setBounds(188, 569, 107, 42);
		frame.getContentPane().add(btnSubmit);

		comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox_4.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
						"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		comboBox_4.setBounds(174, 336, 58, 22);
		frame.getContentPane().add(comboBox_4);

		comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox_5.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_5.setBounds(257, 336, 58, 22);
		frame.getContentPane().add(comboBox_5);

		comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] { "2018", "2019", "2020" }));
		comboBox_6.setBounds(327, 336, 107, 22);
		frame.getContentPane().add(comboBox_6);

		lab = new JLabel("");
		lab.setForeground(new Color(0, 102, 204));
		lab.setFont(new Font("Tahoma", Font.BOLD, 20));
		lab.setBounds(159, 444, 97, 24);
		frame.getContentPane().add(lab);

		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAmount.setBounds(34, 444, 90, 24);
		frame.getContentPane().add(lblAmount);
		
		lblRs = new JLabel("RS");
		lblRs.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRs.setBounds(257, 444, 56, 24);
		frame.getContentPane().add(lblRs);
	}
}
