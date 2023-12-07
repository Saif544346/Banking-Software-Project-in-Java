
package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton login,clr,sinup;
    JTextField actext; 
    JPasswordField pintext;
    Login(){
        setTitle("Green Bank of Bangladesh");
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/Green-Banking.jpg"));
        Image i2=i1.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70, 20, 100, 100);
        add(label);
        JLabel text=new JLabel("WELLCOME TO GREEN BANK");
       
        
        text.setFont(new Font("Osward",Font.BOLD,20));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        JLabel ac=new JLabel("Account No:");
        ac.setFont(new Font("Relway",Font.ITALIC,20));
        ac.setBounds(110, 140, 400, 40);
        add(ac);
        
        actext=new JTextField();
        actext.setBounds(250, 150, 250, 30);
        add(actext);
        
        JLabel pin=new JLabel("Pin No:");
        pin.setFont(new Font("Osward",Font.ITALIC,20));
        pin.setBounds(110, 200, 400, 40);
        add(pin);
        
        pintext=new JPasswordField();
        pintext.setBounds(250, 200, 250, 30);
        add(pintext);
        
        login=new JButton("SiGN IN");
        login.setBounds(250, 270, 90, 25);
        login.addActionListener(this);
        login.setBackground(Color.WHITE);
        login.setForeground(Color.green);
        add(login);
        
        clr=new JButton("CLEAR");
        clr.setBounds(400, 270, 90, 25);
        clr.addActionListener(this);
        clr.setBackground(Color.WHITE);
        clr.setForeground(Color.red);
        add(clr);
        
        sinup=new JButton("SIGN UP");
        sinup.setBounds(250, 320, 250, 35);
        sinup.setBackground(Color.GREEN);
        sinup.addActionListener(this);
        add(sinup);
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(750,450);
        setVisible(true);
        setLocation(300,200);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==clr){
            actext.setText(" ");
            pintext.setText("");
            
        }
        else if(e.getSource()==login){
            
            
            
        }
        else if(e.getSource()==sinup){
            
        }
        
    }
    public static void main(String[] args) {
        new Login();
    }  
}

    