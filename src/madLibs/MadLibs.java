package madLibs;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class MadLibs extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public MadLibs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("LawtonHimSelf's GUI MadLibs");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LawtonHimSelf's Wacky MadLibs App");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(81, 11, 272, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter an Adjective:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(22, 50, 128, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter a Verb Ending in -ed:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(10, 81, 140, 14);
		getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(149, 47, 76, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(149, 78, 76, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Enter a Color:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(245, 50, 79, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Enter a Noun:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(245, 81, 79, 14);
		getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(324, 47, 79, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(324, 78, 79, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Press Here to View your MadLib Creation!");
		btnNewButton.setBounds(94, 129, 246, 23);
		getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 163, 414, 87);
		getContentPane().add(textArea);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
