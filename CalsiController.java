package com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.model.CalsiModel;
import com.view.CalsiView;

public class CalsiController implements ActionListener {
	CalsiView v;
	CalsiModel m;
	public CalsiController(CalsiView v)
	{
		this.v=v;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==v.b1)
		{
			int n1=Integer.parseInt(v.t1.getText());
			int n2=Integer.parseInt(v.t2.getText());
			int res=n1+n2;
			v.t3.setText(Integer.toString(res));
		}
		if(e.getSource()==v.b2)
		{
			int n1=Integer.parseInt(v.t1.getText());
			int n2=Integer.parseInt(v.t2.getText());
			int res=n1-n2;
			v.t3.setText(Integer.toString(res));
		}
		if(e.getSource()==v.b3)
		{
			int n1=Integer.parseInt(v.t1.getText());
			int n2=Integer.parseInt(v.t2.getText());
			int res=n1*n2;
			v.t3.setText(Integer.toString(res));
		}
		if(e.getSource()==v.b4)
		{
			int n1=Integer.parseInt(v.t1.getText());
			int n2=Integer.parseInt(v.t2.getText());
			int res=n1/n2;
			v.t3.setText(Integer.toString(res));
		}
		if(e.getSource()==v.b5)
		{
			v.t1.setText(" ");
			v.t2.setText(" ");
			v.t3.setText(" ");
		}
		if(e.getSource()==v.b6)
		{
			v.f.dispose();
		}	
	}
}
