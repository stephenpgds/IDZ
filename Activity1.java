/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.activity1;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;   
import javax.swing.border.LineBorder;
/**
 *
 * @author SGDS
 */
public class Activity1 extends JFrame implements ActionListener{
    JButton b1;
     JTextField tfusername,tfemail,tfdob;
     JLabel lbemail,lbusername,lbdob;
     Activity1(){
         super("Activity-1");
          setSize(600,400);
          setLocation(350,200);
          setLayout(null);

          getContentPane().setBackground(Color.CYAN);

//          JPanel p1=new JPanel();
//          p1.setBackground(Color.CYAN);
//          p1.setBounds(0,0,450,450);
//          p1.setLayout(null);
//          add(p1);

        

        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.CYAN);
        p2.setBounds(0,0,500,500);
        add(p2);
    
        lbusername = new JLabel("Username");
        lbusername.setBounds(30,10,100,25);
        lbusername.setFont(new Font("SAN_SKRIF",Font.PLAIN,20));
        p2.add(lbusername);

        tfusername=new JTextField();
        tfusername.setBounds(30,50,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);

        lbemail = new JLabel("Email");
        lbemail.setBounds(30,100,100,25);
        lbemail.setFont(new Font("SAN_SKRIF",Font.PLAIN,20));
        p2.add(lbemail);

        tfemail=new JTextField();
        tfemail.setBounds(30,130,300,30);
        tfemail.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfemail);
        
        lbdob = new JLabel("Date of birth");
        lbdob.setBounds(30,160,150,100);
        lbdob.setFont(new Font("SAN_SKRIF",Font.PLAIN,20));
        p2.add(lbdob);

        tfdob=new JTextField();
        tfdob.setBounds(30,230,300,30);
        tfdob.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfdob);

        b1 =new JButton("Submit");
        b1.setBounds(30,280,100,30);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
//        login.setBorder(new LineBorder(new Color(133,193,200)));
        p2.add(b1);

        b1.addActionListener(this);

        

      
          setVisible(true);  
    }
   
     public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
//            this.setVisible(false);
            new Activity2(tfusername.getText(),tfemail.getText(),tfdob.getText()).setVisible(true);
//             Activity2 act = new Activity2(tfusername.getText(), tfemail.getText(),tfdob.getText()); 
//             act.setVisible(true);
        }
    }
     
     
     
     
     
     public static void main(String[] args) {
        new Activity1().setVisible(true);
    }

    

   
}
