package madLibs;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

public class MadLibs extends JFrame {
	//declares some GUI elements
	private JTextField txtAdjective;
	private JTextField txtVerb;
	private JTextField txtColor;
	private JTextField txtNoun;
	private JTextArea txtArea;
	
	//method to declare what our applicaiton class does
	public MadLibs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("LawtonHimSelf's GUI MadLibs");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LawtonHimSelf's Wacky MadLibs App");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(81, 11, 272, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter an Adjective: ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(22, 50, 152, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter a Verb Ending in -ed: ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(10, 81, 164, 14);
		getContentPane().add(lblNewLabel_2);
		
		txtAdjective = new JTextField();
		txtAdjective.setBounds(173, 47, 68, 20);
		getContentPane().add(txtAdjective);
		txtAdjective.setColumns(10);
		
		txtVerb = new JTextField();
		txtVerb.setBounds(173, 78, 68, 20);
		getContentPane().add(txtVerb);
		txtVerb.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Enter a Color: ");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(245, 50, 90, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Enter a Noun: ");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(245, 81, 90, 14);
		getContentPane().add(lblNewLabel_4);
		
		txtColor = new JTextField();
		txtColor.setBounds(336, 47, 68, 20);
		getContentPane().add(txtColor);
		txtColor.setColumns(10);
		
		txtNoun = new JTextField();
		txtNoun.setBounds(334, 78, 68, 20);
		getContentPane().add(txtNoun);
		txtNoun.setColumns(10);
		
		JButton btnNewButton = new JButton("Press Here to View your MadLib Creation!");
		btnNewButton.addActionListener(new ActionListener() {
			//listener for when the button is pressed, it will display the completed mad lib
			public void actionPerformed(ActionEvent e) {
					//clears the text first in cause user presses button again before restarting application
					txtArea.setText("");
					//appends the text area to include the madlib and pulls in the data from the textfields
					txtArea.append("The " + txtColor.getText() + " dragon " + txtVerb.getText() + " at the " + txtAdjective.getText() + " " + txtNoun.getText() + ".\n");
					txtArea.append("And everyone lived happily ever after.\n");
					txtArea.append("The end.");
			}
		});
		btnNewButton.setBounds(77, 129, 279, 23);
		getContentPane().add(btnNewButton);
		
		txtArea = new JTextArea();
		txtArea.setBounds(10, 163, 414, 87);
		getContentPane().add(txtArea);
		txtArea.setEditable(false);
	}

	public static void main(String[] args) {
		//declares the new madLib and sets the size/sets to visible 
		MadLibs madLib = new MadLibs();
		madLib.setSize(new Dimension(450,300));
		madLib.setVisible(true);
		

	}
}
