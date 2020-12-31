import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class classQuiz2 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					classQuiz2 window = new classQuiz2();
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
	public classQuiz2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 102, 102));
		frame.setBounds(100, 100, 576, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("How much water should I drink?");
		lblNewLabel1.setForeground(new Color(255, 255, 204));
		lblNewLabel1.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
		lblNewLabel1.setBounds(164, 21, 253, 37);
		frame.getContentPane().add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel("Weight (kg): ");
		lblNewLabel2.setForeground(new Color(255, 255, 204));
		lblNewLabel2.setFont(new Font("Trebuchet MS", Font.ITALIC, 14));
		lblNewLabel2.setBounds(152, 125, 86, 37);
		frame.getContentPane().add(lblNewLabel2);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		textField.setBounds(248, 126, 182, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Result");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double weight;
				double water;
				
				try {
					weight = Double.parseDouble(textField.getText());
					
					water = weight * 0.033;
					JOptionPane.showMessageDialog(null, "Reminder: You should drink " + water + "L of water per day!!");
					
				}catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Weight");
				}
				
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 204));
		btnNewButton.setBackground(new Color(204, 153, 153));
		btnNewButton.setFont(new Font("Yu Gothic UI", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(204, 207, 100, 37);
		frame.getContentPane().add(btnNewButton);
	}
}
