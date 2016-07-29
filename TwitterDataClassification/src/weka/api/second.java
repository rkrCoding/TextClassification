package weka.api;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
/**
*
* @author RAKESH RAY
*/
public class second extends JFrame {

	private JPanel contentPane;
	private JTextField txtTweets;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					second frame = new second();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public second() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 11, 424, 32);
		contentPane.add(panel);
		
		JButton btnClassification = new JButton("CLASSIFICATION");
		btnClassification.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				thirdf thf= new thirdf();
				thf.setVisible(true);
			}
		});
		panel.add(btnClassification);
		
		JButton btnNewButton_1 = new JButton("CLUSTERING");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("EXIT");
		panel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 54, 171, 188);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		txtTweets = new JTextField();
		txtTweets.setText("Tweets");
		txtTweets.setBounds(47, 248, 86, 20);
		contentPane.add(txtTweets);
		txtTweets.setColumns(10);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(232, 54, 169, 186);
		contentPane.add(textArea_1);
		
		textField = new JTextField();
		textField.setText("Tweets");
		textField.setColumns(10);
		textField.setBounds(275, 248, 86, 20);
		contentPane.add(textField);
		
	}
}
