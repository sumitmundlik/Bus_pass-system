import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.TextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;

public class set {

	public JFrame frame;
	TextField t6;
	TextField t7;
	TextField t8;
	static String s1;
	static String s2;
	static String s3;
	static String s4;
	static String s5;
	static String s6;
	static String d;
	JLabel lab;
	JComboBox comboBox;
	JComboBox c3;
	JComboBox c2;
	JComboBox c1;
	String s19;
	String s18;
	String s16;
	String s22;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					set window = new set();
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
	public set() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 153, 153));
		frame.setBounds(100, 100, 486, 634);
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

		TextField t4 = new TextField();
		t4.setBounds(213, 185, 180, 24);
		frame.getContentPane().add(t4);

		TextField t5 = new TextField();
		t5.setBounds(214, 247, 180, 24);
		frame.getContentPane().add(t5);

		t6 = new TextField();
		t6.setBounds(167, 300, 38, 24);
		frame.getContentPane().add(t6);

		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/log2", "root",
							"GARINplz");
					String sql = "insert into pass8 (name,clg,dob,src,dest,pass,exp, dur,amt)values(?,?,?,?,?,?,?,?,?)";
					PreparedStatement stmt = con.prepareStatement(sql);
					String sss = s16 + "/" + s18 + "/" + s19;
					s1 = t1.getText();
					s2 = t2.getText();
					// s3 = t3.getText();
					s4 = t4.getText();
					s5 = t5.getText();
					// s6 = t6.getText();
					stmt.setString(1, t1.getText());
					stmt.setString(2, t2.getText());
					stmt.setString(3, sss);
					stmt.setString(4, t4.getText());
					stmt.setString(5, t5.getText());
					String s23 = t8.getText();
					String s8 = t6.getText() + "/" + t7.getText() + "/" + s23;
					stmt.setString(6, s8);

					String a = t6.getText();// 11
					String s2 = t7.getText();
					String s5 = t8.getText();
					int dd = Integer.parseInt(a);
					int x = Integer.parseInt(s22);
					String s24 = null;
					
					if (x <= 12) {
						s3 = s22;
					} else {
						if (x == 12) {
							s24 = s23 + "1";
						}
					}

					String s3 = "1";
					int ddd = Integer.parseInt(s5);

					d = dd + "/" + s3 + "/" + s24;
					String s7 = d;
					stmt.setString(7, d);

					String s13 = (String) comboBox.getSelectedItem();
					;
					String s14 = null;
					switch (s13) {
					case "1 Month (300 RS)": {
						s14 = "1 Month";
						s22 = "1";
						break;
					}
					case "2 Month (500 RS)": {
						s14 = "2 Month";
						s22 = "2";
						break;
					}
					case "3 Month (800 RS)": {
						s14 = "3 Month";
						s22 = "3";
						break;
					}
					case "6 Month (1000 RS)": {
						s14 = "1 Month";
						s22 = "6";
						break;
					}
					case "1 Year (1800 RS)": {
						s14 = "1 Year";
						s22 = "12";
						break;
					}
					}
					stmt.setString(8, s14);

					String s11 = (String) comboBox.getSelectedItem();
					String s12 = null;
					switch (s11) {
					case "1 Month (300 RS)": {
						s12 = "300";
						break;
					}
					case "2 Month (500 RS)": {
						s12 = "500";
						break;
					}
					case "3 Month (800 RS)": {
						s12 = "800";
						break;
					}
					case "6 Month (1000 RS)": {
						s12 = "300";
						break;
					}
					case "1 Year (1800 RS)": {
						s12 = "300";
						break;
					}
					}
					stmt.setString(9, s12);
					stmt.execute();
					JOptionPane.showMessageDialog(null, "Pass is proccessing");
					frame.dispose();
					conf g = new conf();
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
		btnSend.setBounds(167, 517, 136, 42);
		frame.getContentPane().add(btnSend);

		t7 = new TextField();
		t7.setBounds(224, 300, 38, 24);
		frame.getContentPane().add(t7);

		t8 = new TextField();
		t8.setBounds(300, 300, 104, 24);
		frame.getContentPane().add(t8);

		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int item_index = comboBox.getSelectedIndex();

				switch (item_index) {
				case 0:
					lab.setText("300");

					break;
				case 1:
					lab.setText("500");
					break;
				case 2:
					lab.setText("800");
					break;
				case 3:
					lab.setText("1000");
					break;
				case 4:
					lab.setText("1800");
					break;
				default:
					lab.setText("ERROR");
					break;
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1 Month (300 RS)", "2 Month (500 RS)", "3 Month (800 RS)", "6 Month (1000 RS)", "1 Year (1800 RS)  "}));
		comboBox.setBounds(171, 359, 136, 22);
		frame.getContentPane().add(comboBox);

		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDuration.setBounds(34, 357, 90, 24);
		frame.getContentPane().add(lblDuration);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 468, 593);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		lab = new JLabel("");
		lab.setBackground(new Color(153, 0, 255));
		lab.setBounds(173, 410, 150, 35);
		panel.add(lab);

		c1 = new JComboBox();
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int item_index1 = c1.getSelectedIndex();

				switch (item_index1) {
				case 0:
					s16 = "1";
					break;
				case 1:
					s16 = "2";
					break;
				case 2:
					s16 = "3";
					break;
				case 3:
					s16 = "4";
					break;
				case 4:
					s16 = "5";
					break;
				case 5:
					s16 = "6";
					break;
				case 6:
					s16 = "7";
					break;
				case 7:
					s16 = "8";
					break;
				case 8:
					s16 = "9";
					break;
				case 9:
					s16 = "10";
					break;
				case 10:
					s16 = "11";
					break;
				case 11:
					s16 = "12";
					break;
				case 12:
					s16 = "13";
					break;
				case 13:
					s16 = "14";
					break;
				case 14:
					s16 = "15";
					break;
				case 15:
					s16 = "16";
					break;
				case 16:
					s16 = "17";
					break;
				case 17:
					s16 = "18";
					break;
				case 18:
					s16 = "19";
					break;
				case 19:
					s16 = "20";
					break;
				case 20:
					s16 = "21";
					break;
				case 21:
					s16 = "22";
					break;
				case 22:
					s16 = "23";
					break;
				case 23:
					s16 = "24";
					break;
				case 24:
					s16 = "25";
					break;
				case 25:
					s16 = "26";
					break;
				case 26:
					s16 = "27";
					break;
				case 27:
					s16 = "28";
					break;
				case 28:
					s16 = "29";
					break;
				case 29:
					s16 = "30";
					break;
				case 30:
					s16 = "31";
					break;
				}

			}
		});
		c1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		c1.setBounds(152, 135, 58, 22);
		panel.add(c1);

		c2 = new JComboBox();
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int item_index1 = c2.getSelectedIndex();

				switch (item_index1) {
				case 0:
					s18 = "1";
					break;
				case 1:
					s18 = "2";
					break;
				case 2:
					s18 = "3";
					break;
				case 3:
					s18 = "4";
					break;
				case 4:
					s18 = "5";
					break;
				case 5:
					s18 = "6";
					break;
				case 6:
					s18 = "7";
					break;
				case 7:
					s18 = "8";
					break;
				case 8:
					s18 = "9";
					break;
				case 9:
					s18 = "10";
					break;
				case 10:
					s18 = "11";
					break;
				case 11:
					s18 = "12";
					break;
				}
			}
		});
		c2.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		c2.setBounds(227, 135, 58, 22);
		panel.add(c2);

		c3 = new JComboBox();
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int item_index3 = c3.getSelectedIndex();

				switch (item_index3) {
				case 0:
					s19 = "1995";
					break;
				case 1:
					s19 = "1996";
					break;
				case 2:
					s19 = "1997";
					break;
				case 3:
					s19 = "1998";
					break;
				case 4:
					s19 = "1999";
					break;
				case 5:
					s19 = "2000";
					break;
				case 6:
					s19 = "2001";
					break;
				case 7:
					s19 = "2002";
					break;
				case 8:
					s19 = "2003";
					break;
				case 9:
					s19 = "2004";
					break;
				case 10:
					s19 = "2005";
					break;
				case 11:
					s19 = "2006";
					break;
				case 12:
					s19 = "2007";
					break;
				case 13:
					s19 = "2008";
					break;
				case 14:
					s19 = "2009";
					break;
				case 15:
					s19 = "2010";
					break;
				case 16:
					s19 = "2011";
					break;
				case 17:
					s19 = "2012";
					break;
				case 18:
					s19 = "2013";
					break;
				case 19:
					s19 = "2014";
					break;
				case 20:
					s19 = "2015";
					break;
				case 21:
					s19 = "2016";
					break;
				case 22:
					s19 = "2017";
					break;
				case 23:
					s19 = "2018";
					break;
				}

			}
		});
		c3.setModel(new DefaultComboBoxModel(new String[] { "1995", "1996", "1997", "1998", "1999", "2000", "2001",
				"2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014",
				"2015", "2016", "2017", "2018" }));
		c3.setBounds(306, 135, 107, 22);
		panel.add(c3);
	}
}
