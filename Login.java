package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import com.GUI;

public class Login{
	JFrame frame ;
	
	public Login(){

			JLabel label = new JLabel("Welcome");
			label.setBounds(50, 50, 100, 30);

			JButton btn1 = new JButton("LOGOUT");
			btn1.setForeground(Color.cyan);
			btn1.setBackground(Color.gray);
			btn1.setBorder(BorderFactory.createEtchedBorder());
			btn1.setBounds(100, 100, 100, 30);	

			btn1.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e){
          	  frame.dispose();
          	  GUI oh = new GUI();
          	  
             }
		   });

			JPanel grayPanel = new JPanel();
			grayPanel.setBackground(Color.gray);
			grayPanel.setBounds(20, 20, 300, 300);
			grayPanel.setLayout(null);

			 frame = new JFrame();
			frame.setSize(400, 400);
			frame.setLayout(null);
			frame.setResizable(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);

			grayPanel.add(label);

			grayPanel.add(btn1);

			frame.add(grayPanel);
	}
}