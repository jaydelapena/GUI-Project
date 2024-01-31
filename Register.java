package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import com.GUI;

public class Register{

	JFrame frame;
	
	public void yes(){

		JLabel label1 = new JLabel("REGISTER");
		label1.setFont(new Font("Conic Sans", Font.BOLD, 18));
		label1.setBounds(260, 50, 100, 50);


		JLabel label2 = new JLabel("NAME");
		label2.setBounds(50, 100, 100, 50);

		JTextField tf1 = new JTextField();
		tf1.setBounds(50, 140, 400, 20);

		JLabel label3 = new JLabel("USERNAME");
		label3.setBounds(50, 180, 100, 50);

		JTextField tf2 = new JTextField();
		tf2.setBounds(50, 220, 400, 20);

		JLabel label4 = new JLabel("PASSWORD");
		label4.setBounds(50, 260, 100, 50);

		JTextField tf3 = new JTextField();
		tf3.setBounds(50, 300, 400, 20);



		JButton btn1 = new JButton("CANCEL");
		btn1.setForeground(Color.cyan);
		btn1.setBackground(Color.blue);
		btn1.setBorder(BorderFactory.createEtchedBorder());
		btn1.setBounds(260, 350, 100, 30);

		btn1.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e){
              frame.dispose();
              new GUI();

             }
		   });






		JButton btn2 = new JButton("REGISTER");
		btn2.setForeground(Color.cyan);
		btn2.setBackground(Color.blue);
		btn2.setBorder(BorderFactory.createEtchedBorder());
		btn2.setBounds(260, 400, 100, 30);
		btn2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){

				JOptionPane.showMessageDialog(null,"Success!");


			}








		});







		JPanel grayPanel = new JPanel();
		grayPanel.setBackground(Color.gray);
		grayPanel.setBounds(20, 20, 600, 600);
		grayPanel.setLayout(null);

		 frame = new JFrame();
		frame.setSize(700, 700);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);

	grayPanel.add(label1);
	grayPanel.add(label2);
	grayPanel.add(label3);
	grayPanel.add(label4);


	grayPanel.add(tf1);
	grayPanel.add(tf2);
	grayPanel.add(tf3);

	grayPanel.add(btn1);
	grayPanel.add(btn2);

		frame.add(grayPanel);
	}
}