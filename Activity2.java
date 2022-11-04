/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.activity1;

import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;   
import javax.swing.border.LineBorder;
import java.util.*;
import java.lang.*;

/**
 *
 * @author SGDS
 */
public class Activity2 extends JFrame implements ActionListener{
     public class steve
{
    String name;
    String email;
    String dob;
    steve(String name,String email,String dob)
    {
        this.name=name;
        this.email=email;
        this.dob=dob;
    }
}
     JLabel l1,l2,l3,l11,l22,l33;
     ArrayList<steve> res=new ArrayList<>();
    Activity2(String name,String email,String dob)
    {
        super("Activity-2");
        steve r=new steve(name,email,dob);
        res.add(r);
        for(steve i:res)
        {
            System.out.print(i.name+" "+i.email+" "+i.dob);
            System.out.println('\n');
        }
 
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p2=new JPanel();                                   
        p2.setLayout(null);
        p2.setBackground(new Color (221, 223, 142));
        p2.setBounds(0,0,600,400);
        add(p2);
        
        l11 = new JLabel("USERNAME:- ");
        l11.setFont(new Font("SAN_SKRIF",Font.PLAIN,14));
        l11.setForeground(Color.BLACK);
        l11.setBounds(30,10,250,80);
        p2.add(l11);
        
        l1 = new JLabel();
        l1.setFont(new Font("SAN_SKRIF",Font.PLAIN,14));
         l1.setForeground(Color.BLACK);
        l1.setBounds(150,10,250,80);
        l1.setText(name);
        p2.add(l1);
        
        
        l22 = new JLabel("EMAIL:- ");
        l22.setFont(new Font("SAN_SKRIF",Font.PLAIN,14));
         l22.setForeground(Color.BLACK);
        l22.setBounds(30,25,250,200);
        p2.add(l22);
        
        l2 = new JLabel();
        l2.setFont(new Font("SAN_SKRIF",Font.PLAIN,14));
        l2.setBounds(150,25,250,200);
         l2.setForeground(Color.BLACK);
        l2.setText(email);
        p2.add(l2);
        
        l33 = new JLabel("DATE OF BIRTH:- ");
        l33.setFont(new Font("SAN_SKRIF",Font.PLAIN,14));
        l33.setBounds(30,90,250,200);
         l33.setForeground(Color.BLACK);
        p2.add(l33);
        
        l3 = new JLabel();
        l3.setFont(new Font("SAN_SKRIF",Font.PLAIN,14));
        l3.setBounds(150,90,250,200);
         l3.setForeground(Color.BLACK);
        l3.setText(dob);
        p2.add(l3);
        
        
         setSize(600,400);
          setLocation(350,200);
    setVisible(true);
    }
    
     public static void main(String[] args) {
        new Activity2().setVisible(true);
        
    }

    private Activity2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


   
    
}
