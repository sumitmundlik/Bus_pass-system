import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;

public class conf3 extends set2{

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conf3 window = new conf3();
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
	public conf3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 204, 51));
		frame.setBounds(100, 100, 363, 331);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You will hava to pay");
		lblNewLabel.setForeground(new Color(51, 51, 51));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(44, 56, 266, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Procced");
		btnNewButton.setBackground(new Color(51, 204, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null,"Your pass is Generating");
				trans g=new trans();
				frame.dispose();
				g.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(12, 226, 122, 25);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel(amo);
		label.setForeground(new Color(102, 102, 153));
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(107, 104, 56, 24);
		frame.getContentPane().add(label);
		
		JLabel lblRs = new JLabel("RS");
		lblRs.setForeground(new Color(51, 51, 51));
		lblRs.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblRs.setBounds(164, 104, 56, 35);
		frame.getContentPane().add(lblRs);
		
		JLabel lblProccedFerther = new JLabel("Procced Ferther");
		lblProccedFerther.setForeground(new Color(51, 51, 51));
		lblProccedFerther.setBackground(new Color(255, 255, 255));
		lblProccedFerther.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblProccedFerther.setBounds(73, 167, 237, 46);
		frame.getContentPane().add(lblProccedFerther);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				set2 s=new set2();
				s.frame.setVisible(true);
			}
		});
		btnCancel.setBackground(new Color(204, 0, 0));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCancel.setBounds(213, 226, 97, 25);
		frame.getContentPane().add(btnCancel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 152, 345, 15);
		frame.getContentPane().add(separator);
	}
}
