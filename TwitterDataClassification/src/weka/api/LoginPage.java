package weka.api;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
*
* @author RAKESH RAY
*/

public class LoginPage extends JFrame {

public static void main(String[] args) {
LoginPage frameTabel = new LoginPage();
}

JButton blogin = new JButton("Login");
JPanel panel = new JPanel();
JTextField txuser = new JTextField(15);
JPasswordField pass = new JPasswordField(15);

LoginPage(){
super("Login Autentification");
setSize(300,200);
setLocation(500,280);
panel.setLayout (null); 


txuser.setBounds(70,30,150,20);
pass.setBounds(70,65,150,20);
blogin.setBounds(110,100,80,20);

panel.add(blogin);
panel.add(txuser);
panel.add(pass);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
actionlogin();
}

public void actionlogin(){
blogin.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
String puname = txuser.getText();
String ppaswd = pass.getText();
if(puname.equals("14MCA0062") && ppaswd.equals("12345")) {
//newframe regFace =new newframe();
//regFace.setVisible(true);
//	thirdf sc =new thirdf();
//	sc.setVisible(true);
	Preprocessing p= new Preprocessing();
	p.setVisible(true);
dispose();
} else {

JOptionPane.showMessageDialog(null,"Wrong Password / Username");
txuser.setText("");
pass.setText("");
txuser.requestFocus();
}

}
});
}
}