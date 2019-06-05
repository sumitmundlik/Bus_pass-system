import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class genn extends set2{

	public JFrame frame;
	private JLabel lblCollege;
	private JLabel lblDob;
	private JLabel lblSource;
	private JLabel lblDestination;
	private JLabel lblPassDate;
	private JLabel l5;
	private JLabel l6;
	private JLabel label;
	private JLabel l4;
	private JLabel l3;
    private JLabel l2;
	private JLabel l1;
	private JLabel lblExpiresOn;
	private JLabel l7;
	private JLabel lblYourPassIs;
	private JLabel lblDuration;
	private JLabel l8;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					genn window = new genn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		/*
		l4.setText(s4);
		l5.setText(s5);
		l6.setText(s6);*
	*/}

	/**
	 * Create the application.
	 */
	public genn() {
		
		initialize();

//		l2.setText(s2);
	//	l3.setText(s3);
		//l4.setText(s4);
//		l5.setText(s5);
	//	l6.setText(s6);
		lblCollege = new JLabel("College");
		lblCollege.setForeground(new Color(0, 0, 102));
		lblCollege.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblCollege.setBounds(37, 185, 94, 40);
		frame.getContentPane().add(lblCollege);
		
		lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblDob.setForeground(new Color(0, 0, 102));
		lblDob.setBounds(37, 238, 62, 36);
		frame.getContentPane().add(lblDob);
		
		lblSource = new JLabel("Source");
		lblSource.setForeground(new Color(0, 0, 102));
		lblSource.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblSource.setBounds(37, 287, 94, 35);
		frame.getContentPane().add(lblSource);
		
		lblDestination = new JLabel("Destination");
		lblDestination.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblDestination.setForeground(new Color(0, 0, 102));
		lblDestination.setBounds(37, 344, 144, 25);
		frame.getContentPane().add(lblDestination);
		
		lblPassDate = new JLabel("Pass Date");
		lblPassDate.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblPassDate.setForeground(new Color(0, 0, 102));
		lblPassDate.setBounds(37, 393, 130, 25);
		frame.getContentPane().add(lblPassDate);
		
		l5 = new JLabel(str4);
		l5.setFont(new Font("Tahoma", Font.BOLD, 20));
		l5.setForeground(new Color(255, 255, 102));
		l5.setBounds(179, 344, 224, 25);
		frame.getContentPane().add(l5);
		
		l6 = new JLabel(pdate);
		l6.setFont(new Font("Tahoma", Font.BOLD, 20));
		l6.setForeground(new Color(255, 255, 102));
		l6.setBounds(179, 388, 224, 30);
		frame.getContentPane().add(l6);
		
		JButton btnDone = new JButton("Done");
		btnDone.setBackground(new Color(51, 204, 0));
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				login l=new login();
				l.frame.setVisible(true);}
		});
		btnDone.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDone.setBounds(190, 571, 89, 42);
		frame.getContentPane().add(btnDone);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\ASDD\\src\\img\\trolleybus-filled.png"));
		label.setBounds(12, 0, 99, 122);
		frame.getContentPane().add(label);
		
		l4 = new JLabel(str3);
		l4.setFont(new Font("Tahoma", Font.BOLD, 20));
		l4.setForeground(new Color(255, 255, 102));
		l4.setBounds(153, 297, 224, 25);
		frame.getContentPane().add(l4);
		
		l3 = new JLabel(date);
		l3.setFont(new Font("Tahoma", Font.BOLD, 20));
		l3.setForeground(new Color(255, 255, 102));
		l3.setBounds(143, 249, 224, 25);
		frame.getContentPane().add(l3);
		
		l2 = new JLabel(str2);
		l2.setFont(new Font("Tahoma", Font.BOLD, 20));
		l2.setForeground(new Color(255, 255, 102));
		l2.setBounds(156, 200, 224, 25);
		frame.getContentPane().add(l2);
		
		l1 = new JLabel(str1);
		l1.setForeground(new Color(255, 255, 102));
		l1.setFont(new Font("Tahoma", Font.BOLD, 20));
		l1.setBounds(143, 147, 224, 25);
		frame.getContentPane().add(l1);
		
		lblExpiresOn = new JLabel("Expires on");
		lblExpiresOn.setForeground(new Color(0, 0, 102));
		lblExpiresOn.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblExpiresOn.setBounds(37, 444, 130, 25);
		frame.getContentPane().add(lblExpiresOn);
		
		l7 = new JLabel(edate);
		l7.setFont(new Font("Tahoma", Font.BOLD, 20));
		l7.setForeground(new Color(255, 255, 102));
		l7.setBounds(179, 439, 224, 30);
		frame.getContentPane().add(l7);
		
		lblYourPassIs = new JLabel("Your pass is generated");
		lblYourPassIs.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 22));
		lblYourPassIs.setForeground(new Color(153, 255, 255));
		lblYourPassIs.setBounds(123, 32, 331, 40);
		frame.getContentPane().add(lblYourPassIs);
		
		lblDuration = new JLabel("Duration");
		lblDuration.setForeground(new Color(0, 0, 102));
		lblDuration.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblDuration.setBounds(37, 491, 130, 25);
		frame.getContentPane().add(lblDuration);
		
		l8 = new JLabel(dura);
		l8.setFont(new Font("Tahoma", Font.BOLD, 20));
		l8.setForeground(new Color(255, 255, 102));
		l8.setBounds(179, 486, 224, 30);
		frame.getContentPane().add(l8);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 153, 255));
		frame.setBounds(100, 100, 484, 667);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(51, 51, 102));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblName.setBounds(37, 141, 94, 31);
		frame.getContentPane().add(lblName);

	}
}
