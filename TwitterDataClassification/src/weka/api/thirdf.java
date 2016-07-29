package weka.api;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
/**
*
* @author RAKESH RAY
*/
public class thirdf extends JFrame {

	private JPanel contentPane;
	private JTextField txtHeavyStudyLoad;
	private JTextField txtLackOfSocial;
	private JTextField txtNegativeEmotion;
	private JTextField txtSleepProblems;
	private JTextField txtDiversityIssues;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thirdf frame = new thirdf();
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
	public thirdf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 424, 32);
		contentPane.add(panel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(472, 51, 280, 311);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea_6 = new JTextArea();
		scrollPane_1.setViewportView(textArea_6);
		
		JButton btnPreprocessing = new JButton("CLASSIFICATION");
		btnPreprocessing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Preprocessing pr =new Preprocessing();
				pr.setVisible(true);
			}
		});
		panel.add(btnPreprocessing);
		
		JButton button_2 = new JButton("EXIT");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	System.
			}
		});
		panel.add(button_2);
		
		txtHeavyStudyLoad = new JTextField();
		txtHeavyStudyLoad.setText("Heavy Study Load");
		txtHeavyStudyLoad.setBounds(20, 217, 142, 20);
		contentPane.add(txtHeavyStudyLoad);
		txtHeavyStudyLoad.setColumns(10);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(174, 215, 93, 22);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(174, 246, 93, 22);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(174, 279, 93, 22);
		contentPane.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(174, 308, 93, 22);
		contentPane.add(textArea_4);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(174, 339, 93, 22);
		contentPane.add(textArea_5);
		
		JButton btnHeavyStudyLoad = new JButton("Heavy Study Load");
		btnHeavyStudyLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnHeavyStudyLoad.setBackground(Color.GREEN);
				int lines=0; 
				String line=null,str1= " ";
				try 
			 	 {
			          // FileReader reads text files in the default encoding.
			          FileReader fileReader = new FileReader("heavystudy1.txt");

			          // Always wrap FileReader in BufferedReader.
			          BufferedReader bufferedReader = new BufferedReader(fileReader);
			          
			          while((line = bufferedReader.readLine()) != null)
			          {
			         	 lines++;
			         	 str1+=line+"\n";
			         	 
			          }
			 	 }
			     	 

		catch(FileNotFoundException ex) {
			System.out.println("Unable to open file ");                
			}
		catch(IOException ex) {
		   System.out.println("Error reading file ");                  
		  
			}
				String str=Integer.toString(lines);
				textArea_1.setText(str);
				textArea_6.setText(str1);
			}
		});
		btnHeavyStudyLoad.setBounds(305, 216, 161, 23);
		contentPane.add(btnHeavyStudyLoad);
		
		txtLackOfSocial = new JTextField();
		txtLackOfSocial.setText("Lack Of Social Engagement");
		txtLackOfSocial.setColumns(10);
		txtLackOfSocial.setBounds(20, 248, 142, 20);
		contentPane.add(txtLackOfSocial);
		
		JButton btnLackOfSocial = new JButton("Lack Of Social Engagement");
		btnLackOfSocial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnLackOfSocial.setBackground(Color.GREEN);
				int lines=0; 
				String line=null,str1= " ";
				try 
			 	 {
			          // FileReader reads text files in the default encoding.
			          FileReader fileReader = new FileReader("lacksocial1.txt");

			          // Always wrap FileReader in BufferedReader.
			          BufferedReader bufferedReader = new BufferedReader(fileReader);
			          
			          while((line = bufferedReader.readLine()) != null)
			          {
			         	 lines++;
			         	 str1+=line+"\n";
			         	 
			          }
			 	 }
			     	 

		catch(FileNotFoundException ex) {
			System.out.println("Unable to open file ");                
			}
		catch(IOException ex) {
		   System.out.println("Error reading file ");                  
		  
			}
				String str=Integer.toString(lines);
				textArea_2.setText(str);
				textArea_6.setText(str1);
			}
			
		});
		btnLackOfSocial.setBounds(305, 250, 161, 23);
		contentPane.add(btnLackOfSocial);
		
		
		
		txtNegativeEmotion = new JTextField();
		txtNegativeEmotion.setText("Negative emotion");
		txtNegativeEmotion.setColumns(10);
		txtNegativeEmotion.setBounds(20, 277, 142, 20);
		contentPane.add(txtNegativeEmotion);
		
		txtSleepProblems = new JTextField();
		txtSleepProblems.setText("Sleep Problems");
		txtSleepProblems.setColumns(10);
		txtSleepProblems.setBounds(20, 310, 142, 20);
		contentPane.add(txtSleepProblems);
		
		txtDiversityIssues = new JTextField();
		txtDiversityIssues.setText("Diversity Issues");
		txtDiversityIssues.setColumns(10);
		txtDiversityIssues.setBounds(20, 341, 142, 20);
		contentPane.add(txtDiversityIssues);
		
		
		
		JButton btnNegativeEmotion = new JButton("Negative Emotion");
		btnNegativeEmotion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNegativeEmotion.setBackground(Color.GREEN);
				int lines=0; 
				String line=null,str1= " ";
				try 
			 	 {
			          // FileReader reads text files in the default encoding.
			          FileReader fileReader = new FileReader("negative.txt");

			          // Always wrap FileReader in BufferedReader.
			          BufferedReader bufferedReader = new BufferedReader(fileReader);
			          
			          while((line = bufferedReader.readLine()) != null)
			          {
			         	 lines++;
			         	 str1+=line+"\n";
			         	 
			          }
			 	 }
			     	 

		catch(FileNotFoundException ex) {
			System.out.println("Unable to open file ");                
			}
		catch(IOException ex) {
		   System.out.println("Error reading file ");                  
		  
			}
				String str=Integer.toString(lines);
				textArea_3.setText(str);
				textArea_6.setText(str1);
			}
			
		});
		btnNegativeEmotion.setBounds(305, 276, 161, 23);
		contentPane.add(btnNegativeEmotion);
		
		JButton btnSleepProblems = new JButton("Sleep Problems");
		btnSleepProblems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSleepProblems.setBackground(Color.GREEN);
				int lines=0; 
				String line=null,str1= " ";
				try 
			 	 {
			          // FileReader reads text files in the default encoding.
			          FileReader fileReader = new FileReader("sleep1.txt");

			          // Always wrap FileReader in BufferedReader.
			          BufferedReader bufferedReader = new BufferedReader(fileReader);
			          
			          while((line = bufferedReader.readLine()) != null)
			          {
			         	 lines++;
			         	 str1+=line+"\n";
			         	 
			          }
			 	 }
			     	 

		catch(FileNotFoundException ex) {
			System.out.println("Unable to open file ");                
			}
		catch(IOException ex) {
		   System.out.println("Error reading file ");                  
		  
			}
				String str=Integer.toString(lines);
				textArea_4.setText(str);
				textArea_6.setText(str1);
			}
			
		});
		btnSleepProblems.setBounds(305, 309, 161, 23);
		contentPane.add(btnSleepProblems);
		
		JButton btnDiversityIssues = new JButton("Diversity Issues");
		btnDiversityIssues.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDiversityIssues.setBackground(Color.GREEN);
				int lines=0; 
				String line=null,str1= " ";
				try 
			 	 {
			          // FileReader reads text files in the default encoding.
			          FileReader fileReader = new FileReader("diversity1.txt");

			          // Always wrap FileReader in BufferedReader.
			          BufferedReader bufferedReader = new BufferedReader(fileReader);
			          
			          while((line = bufferedReader.readLine()) != null)
			          {
			         	 lines++;
			         	 str1+=line+"\n";
			         	 
			          }
			 	 }
			     	 

		catch(FileNotFoundException ex) {
			System.out.println("Unable to open file ");                
			}
		catch(IOException ex) {
		   System.out.println("Error reading file ");                  
		  
			}
				String str=Integer.toString(lines);
				textArea_5.setText(str);
				textArea_6.setText(str1);
			}
			
		});
		btnDiversityIssues.setBounds(305, 340, 161, 23);
		contentPane.add(btnDiversityIssues);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 54, 447, 151);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		try {
			FileReader reader = new FileReader("Result.txt");
			BufferedReader br= new BufferedReader(reader);
			textArea.read(br, null);
			br.close();
			textArea.requestFocus();
		}
		catch(Exception r) {
			JOptionPane.showMessageDialog(null, r);
		}
		
		
		
		
	}
}
