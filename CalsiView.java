package com.view;
import java.awt.Color;

import javax.swing.*;

import com.controller.CalsiController;
public class CalsiView {
	public JFrame f;
	public JLabel l1,l2,l3,l4;
	public JTextField t1,t2,t3;
	public JButton b1,b2,b3,b4,b5,b6;
	
	public CalsiView()
	{
		f=new JFrame("Calculator");
		l1=new JLabel("First No: ");
		t1=new JTextField();
		l2=new JLabel("Second No: ");
		t2=new JTextField();
		b1=new JButton("+");
		b2=new JButton("-");
		b3=new JButton("*");
		b4=new JButton("/");
		l3=new JLabel("Result: ");
		t3=new JTextField();
		b5=new JButton("Reset");
		b6=new JButton("Cancel");
		l4=new JLabel();
		
		b1.addActionListener(new CalsiController(this));
		b2.addActionListener(new CalsiController(this));
		b3.addActionListener(new CalsiController(this));
		b4.addActionListener(new CalsiController(this));
		b5.addActionListener(new CalsiController(this));
		b6.addActionListener(new CalsiController(this));
		
		l1.setBounds(10,10,100,40);
		t1.setBounds(120,10,100,40);
		l2.setBounds(10,60,100,40);
		t2.setBounds(120,60,100,40);
		b1.setBounds(10,110,50,40);
		b2.setBounds(70,110,50,40);
		b3.setBounds(130,110,50,40);
		b4.setBounds(190,110,50,40);
		l3.setBounds(10,160,100,40);
		t3.setBounds(120,160,100,40);
		b5.setBounds(30,210,100,40);
		b6.setBounds(150,210,100,40);
		f.getContentPane().setBackground(Color.gray);
		
		f.add(l1); f.add(t1); f.add(l2); f.add(t2);
		f.add(b1); f.add(b2); f.add(b3); f.add(b4);
		f.add(l3); f.add(t3); f.add(b5); f.add(b6);
		f.add(l4);
		
		f.setSize(300,300);
		f.setVisible(true);
		f.setLayout(null);
			
	}
}
