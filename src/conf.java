import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class conf extends set2{

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conf window = new conf();
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
	public conf() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 51, 204));
		frame.getContentPane().setLayout(null);
		
		JLabel lblYouWillhaveTo = new JLabel("You will have to pay");
		lblYouWillhaveTo.setForeground(new Color(51, 204, 0));
		lblYouWillhaveTo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblYouWillhaveTo.setBounds(90, 27, 289, 35);
		frame.getContentPane().add(lblYouWillhaveTo);
		
		JLabel label = new JLabel(amo);
		label.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label.setBounds(115, 86, 84, 35);
		frame.getContentPane().add(label);
		
		JLabel lblRs = new JLabel("RS");
		lblRs.setForeground(new Color(255, 0, 0));
		lblRs.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblRs.setBounds(241, 86, 71, 35);
		frame.getContentPane().add(lblRs);
		
		JLabel lblProccedFerther = new JLabel("Procced Ferther");
		lblProccedFerther.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblProccedFerther.setBounds(115, 147, 200, 35);
		frame.getContentPane().add(lblProccedFerther);
		
		JButton btnYes = new JButton("Yes");
		btnYes.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnYes.setBackground(new Color(0, 255, 51));
		btnYes.setForeground(new Color(255, 255, 255));
		btnYes.setBounds(51, 218, 97, 43);
		frame.getContentPane().add(btnYes);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnCancel.setBackground(new Color(255, 0, 51));
		btnCancel.setBounds(264, 218, 97, 43);
		frame.getContentPane().add(btnCancel);
	}
}
