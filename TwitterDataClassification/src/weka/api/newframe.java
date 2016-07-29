package weka.api;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class newframe extends JFrame {
  public newframe() {
	
    JMenuBar bar = new JMenuBar();
    JMenu addMenu = new JMenu("CLASSIFICATION");
    JMenuItem newFrame = new JMenuItem("Internal Frame");
    addMenu.add(newFrame);
    bar.add(addMenu);
    setJMenuBar(bar);
	setSize(800, 800);
    setVisible(true);
	JLabel background=new JLabel(new ImageIcon("C:\\Users\\RAKESH RAY\\Desktop\\twitter.jpg"));
	add(background);
	background.setLayout(new FlowLayout());
    
  }

  public static void main(String args[]) {
	
	  newframe app = new newframe();
  }
}

class MyJPanel extends JPanel {
  public MyJPanel() {
    add(new JLabel("adf"));
  }

}
/**import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class newframe extends JFrame {
	
	private JDesktopPane theDesktop;
	public void JavaMDI()
	{
        super( "JFrame and JDesktop Example" );
        JMenuBar bar = new JMenuBar();
        JMenu addMenu = new JMenu( "New" );
        JMenuItem newFrame = new JMenuItem( "internal frame" );
        addMenu.add( newFrame );
        bar.add( addMenu );
        setJMenuBar( bar );
        theDesktop = new JDesktopPane();
        add( theDesktop );       
        newFrame.addActionListener(
           new ActionListener()
           {
              public void actionPerformed( ActionEvent event )
              {
                 JInternalFrame frame = new JInternalFrame(
                    "JInternal Frame", true, true, true, true );
                    JPanel panel = new JPanel();
                    frame.add( panel, BorderLayout.CENTER );
                    frame.pack(); 
                    theDesktop.add( frame );
                    frame.setVisible( true );
                 }
              }
           );
        } 
       public static void main (String[] args)
       	{
       	JavaMDI desktopFrame = new JavaMDI();
        desktopFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        desktopFrame.setSize( 600, 480 );
        desktopFrame.setVisible( true );
        }
     }

/**public static void main(String[] args) {
newframe frameTabel = new newframe();
}

JLabel welcome = new JLabel("Welcome to a New Frame");
JPanel panel = new JPanel();

newframe(){
super("Welcome");
setSize(300,200);
setLocation(500,280);
panel.setLayout (null); 

welcome.setBounds(70,50,150,60);

panel.add(welcome);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

}*/