package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import com.Register;
import com.Login;

public class GUI{
       
       JFrame frame;

		public GUI(){

		JLabel label = new JLabel("LOGIN");
		label.setFont(new Font("Conic Sans", Font.BOLD, 20));
		label.setBounds(180, 40, 100, 50);

		JLabel label2 = new JLabel("Username");
		label2.setFont(new Font("Conic Sans", Font.BOLD, 15));
		label2.setBounds(50, 80, 100, 40);

		JTextField tf1 = new JTextField();
		tf1.setBounds(50, 120, 300, 20);

		JLabel label3 = new JLabel("Password");
		label3.setBounds(50, 200, 100, 40);

		JTextField tf2 = new JTextField();
		tf2.setBounds(50, 250, 300, 20);

		//para sa buttons
		JButton btn1 = new JButton("LOGIN");
		btn1.setForeground(Color.cyan);
		btn1.setBackground(Color.gray);
		btn1.setBorder(BorderFactory.createEtchedBorder());
		btn1.setBounds(150, 300, 100, 20);

		btn1.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e){
          	  frame.dispose();
          	  Login oh = new Login();
          	  
             }
		   });


		JButton btn2 = new JButton("REGISTER");
		btn2.setForeground(Color.cyan);
		btn2.setBackground(Color.gray);
		btn2.setBorder(BorderFactory.createEtchedBorder());
		btn2.setBounds(150, 330, 100, 20);

		btn2.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e){
          	  frame.dispose();
          	  Register oh = new Register();
          	  oh.yes();
             }
		   });

		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(20, 20, 400, 400);
		redPanel.setLayout(null);

		 frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);

		redPanel.add(label);
		redPanel.add(label2);
		redPanel.add(label3);


		redPanel.add(tf1);
		redPanel.add(tf2);

		redPanel.add(btn1);
		redPanel.add(btn2);

		frame.add(redPanel);

		}

		public static void main(String args[]){
			  
			 new GUI();
		}


	}