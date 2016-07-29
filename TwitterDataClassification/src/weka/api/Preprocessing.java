package weka.api;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
/**
*
* @author RAKESH RAY
*/
public class Preprocessing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Preprocessing frame = new Preprocessing();
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
	public Preprocessing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 776, 32);
		contentPane.add(panel);
		
		JButton button = new JButton("PREPROCESSING");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setForeground(Color.BLUE);
		panel.add(button);
		
		JButton btnProbability = new JButton("CLASSIFICATION");
		btnProbability.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			thirdf ss=new thirdf();
			ss.setVisible(true);
			}
		});
		panel.add(btnProbability);
		
		JButton button_2 = new JButton("EXIT");
		panel.add(button_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setBounds(0, 31, 776, 24);
		contentPane.add(panel_1);
		
		JLabel lblTextPreprocessing = new JLabel("TEXT PREPROCESSING");
		lblTextPreprocessing.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblTextPreprocessing);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 66, 596, 299);
		contentPane.add(scrollPane);
		JTextArea textArea = new JTextArea();
		scrollPane.setRowHeaderView(textArea);
		JButton btnNewButton = new JButton("Fetch Tweets");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser =new JFileChooser();
				chooser.showOpenDialog(null);
				File f =chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				try {
					FileReader reader = new FileReader(filename);
					BufferedReader br= new BufferedReader(reader);
					textArea.read(br, null);
					br.close();
					textArea.requestFocus();
				}
				catch(Exception r) {
					JOptionPane.showMessageDialog(null, e);
				}
				
			}
		});
		btnNewButton.setBounds(646, 89, 119, 23);
		contentPane.add(btnNewButton);
		
		JButton btnRemoveStopwords = new JButton("Remove Stopwords");
		btnRemoveStopwords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] stopwords1 = {"able","about","across","after","all","almost",
					    "also","am","among","an","and","any","are","as","at","be","because","been","but","by","can",
					    "cannot","could","dear","did","do","does","either","else","ever","every","for","from","get",
					    "got","had","has","have","he","her","hers","him","his","how","however","i","if","in","into",
					    "is","it","its","just","least","let","like","likely","may","me","might","most","must","my",
					    "neither","no","nor","not","of","off","often","on","only","or","other","our","own","rather","said",
					    "say","says","she","should","since","so","some","than","that","the","their","them","then","there",
					    "these","they","this","its","to","too","twas","us","wants","was","we","were","what","when","where",
					    "which","while","who","whom","why","will","with","would","yet","you","your","https://","@","#","http:/",
					    "engineeringProblems","RT"};
				String stopwords[]={"https://","@","#","http:/","engineeringProblems","RT"};
                                       // System.out.println("Into the program");
			            String fileName="file.txt";
                        int f=0;
                        char ch;
			            String line=null,oldtext="",writetext="";
                        StringBuilder result =new StringBuilder(); 
			            try
			            {
			               	FileReader fr =new FileReader(fileName);
			            	BufferedReader br=new BufferedReader(fr);
                            while((line=br.readLine())!= null)
                            {
                                            //System.out.println(line);
			            	oldtext=" ";
			            	oldtext+=line;
                                            String []words = oldtext.split("\\s+");
                                            for(int j=0;j<words.length;j++)
                                            {
                                                f=0;
                                                if(words[0].equalsIgnoreCase("RT"))
                                                {
                                                	f=1;
                                                	continue;
                                                	
                                                }
                                                	
                                                words[j].toLowerCase();
                                                for(int i=0;i<stopwords1.length;i++)
                                                {
                                                    String str= stopwords1[i];
                                                    if(words[j].contains(str))
                                                    {
                                                        f=1;
                                                       break;
                                                    }
			            	                                                     
                                            }
                                                if(f==0)
                                                  writetext+=words[j]+" ";
                                                
			            	}
                                            
                                            writetext+="\n";
                                           // System.out.println("Append-->"+writetext);
                                            }
                                            br.close();
			            	
			            }
			            catch(Exception r) {
							//JOptionPane.showMessageDialog(null, arg0);
                                            System.out.println(" Reading Error");
                                            r.printStackTrace();
						}
                                         try
			            			{
			            			FileWriter fw =new FileWriter("Result.txt");
			            			BufferedWriter bw= new BufferedWriter(fw);
			            			bw.write(writetext);
			            			//bw.newLine();
			            			bw.close();
			            			}
			            			catch(Exception r) {
			        					JOptionPane.showMessageDialog(null, arg0);
                                             //                   System.out.println("Writing error");
			        				}
                                      
                            try {
							FileReader reader = new FileReader("Result.txt");
							BufferedReader br= new BufferedReader(reader);
							textArea.read(br, null);
							br.close();
							textArea.requestFocus();
						}
						catch(Exception r) {
							JOptionPane.showMessageDialog(null, arg0);
						}
			}				
			
		});
		btnRemoveStopwords.setBounds(38, 386, 164, 23);
		contentPane.add(btnRemoveStopwords);
		
		JButton btnRemove = new JButton("Remove Non letters");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String oldtext=null,writetext="",line="";
			
				try
	            {
	               	FileReader fr =new FileReader("Tweet.txt");
	            	BufferedReader br=new BufferedReader(fr);
                    while((line=br.readLine())!= null)
                    {
                                    //System.out.println(line);
	            	oldtext=" ";
	            	oldtext+=line;
	            	oldtext.replaceAll("[^a-zA-Z]","");
                    writetext+=oldtext+"\n"; 
                    }
                    br.close();	            
	            }
	            catch(Exception r) {
					//JOptionPane.showMessageDialog(null, arg0);
                                    System.out.println(" Reading Error");
                                    r.printStackTrace();
                                    }
				 try
     			{
     			FileWriter fw =new FileWriter("Result.txt");
     			BufferedWriter bw= new BufferedWriter(fw);
     			bw.write(writetext);
     			//bw.newLine();
     			bw.close();
     			}
     			catch(Exception r) {
 					JOptionPane.showMessageDialog(null, arg0);
                          //                   System.out.println("Writing error");
 				}
                   
         try {
			FileReader reader = new FileReader("Result.txt");
			BufferedReader br= new BufferedReader(reader);
			textArea.read(br, null);
			br.close();
			textArea.requestFocus();
		}
		catch(Exception r) {
			JOptionPane.showMessageDialog(null, arg0);
		}
}				
				
				
			
		});
		btnRemove.setBounds(410, 386, 143, 23);
		contentPane.add(btnRemove);
		
		JButton btnRemoveRepeatedLettets = new JButton("Remove Repeated lettets");
		btnRemoveRepeatedLettets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String oldtext=null,writetext="",line="";
				
				try
	            {
	               	FileReader fr =new FileReader("Tweet.txt");
	            	BufferedReader br=new BufferedReader(fr);
                    while((line=br.readLine())!= null)
                    {
                                    //System.out.println(line);
	            	oldtext=" ";
	            	oldtext+=line;
	            	String ourString="";
	                int j = 0;
	                for (int i=0; i<oldtext.length()-1 ; i++){
	                    j = i+1;
	                    if(oldtext.charAt(i)!=oldtext.charAt(j)){
	                        ourString+=oldtext.charAt(i);
	                    }

	                }

                    writetext+=ourString+"\n"; 
                    }
                    br.close();	            
	            }
	            catch(Exception r) {
					//JOptionPane.showMessageDialog(null, arg0);
                                    System.out.println(" Reading Error");
                                    r.printStackTrace();
                                    }
				 try
     			{
     			FileWriter fw =new FileWriter("Result.txt");
     			BufferedWriter bw= new BufferedWriter(fw);
     			bw.write(writetext);
     			//bw.newLine();
     			bw.close();
     			}
     			catch(Exception r) {
 					JOptionPane.showMessageDialog(null, arg0);
                          //                   System.out.println("Writing error");
 				}
                   
         try {
			FileReader reader = new FileReader("Result.txt");
			BufferedReader br= new BufferedReader(reader);
			textArea.read(br, null);
			br.close();
			textArea.requestFocus();
		}
		catch(Exception r) {
			JOptionPane.showMessageDialog(null, arg0);
		}
			}
		});
		btnRemoveRepeatedLettets.setBounds(216, 385, 184, 24);
		contentPane.add(btnRemoveRepeatedLettets);
	}
}
