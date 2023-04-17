import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class calc extends JFrame implements ActionListener{
public static JTextField f = new JTextField(10);
public static JButton b = new JButton("1");
public static JButton b1 = new JButton("2");
public static JButton b2 = new JButton("3");
public static JButton b3 = new JButton("4");
public static JButton b4 = new JButton("5");
public static JButton b5 = new JButton("6");
public static JButton b6 = new JButton("7");
public static JButton b7 = new JButton("8");
public static JButton b8 = new JButton("9");
public static JButton b9 = new JButton("0");
public static JButton b10 = new JButton("+");
public static JButton b11 = new JButton("=");
public static JButton b12 = new JButton("-");
public static JButton b13 = new JButton("/");
public static JButton b14 = new JButton("*");
String op;
int a1, a2;
	
	public static void main(String[] args) {
	
		calc a = new calc();
		a.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setText("");
		b.addActionListener(a);
		b1.addActionListener(a);
		b2.addActionListener(a);
		b3.addActionListener(a);
		b4.addActionListener(a);
		b5.addActionListener(a);
		b6.addActionListener(a);
		b7.addActionListener(a);
		b8.addActionListener(a);
		b9.addActionListener(a);
		b10.addActionListener(a);
		b11.addActionListener(a);
		
		b12.addActionListener(a);
		b13.addActionListener(a);
		b14.addActionListener(a);
		
	a.setVisible(true);
	a.setSize(300,300);
	a.setLayout(new GridLayout(3,3));
	a.setTitle("my calculator");
	a.add(f);
	a.add(b);
	a.add(b1);
	a.add(b2);
	a.add(b3);
	a.add(b4);	
	a.add(b5);
	a.add(b6);
	a.add(b7);
	a.add(b8);
	a.add(b9);
	a.add(b10);
	a.add(b11);
	a.add(b12);
	a.add(b13);
	a.add(b14);
	}

	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getActionCommand()=="+") {
			a1=Integer.parseInt(f.getText());
			f.setText("");
			op="+";
		} else
		
		if (arg0.getActionCommand()=="=") {
			
			a2=Integer.parseInt(f.getText());
			
			if (op=="-"){
			System.out.println(a1-a2);
			f.setText(String.valueOf(a1-a2));}
			if (op=="+"){
				System.out.println(a1+a2);
				f.setText(String.valueOf(a1+a2));}
			if (op=="/"){
				System.out.println(a1/a2);
				f.setText(String.valueOf(a1/a2));}
			if (op=="*"){
				System.out.println("*");
				f.setText(String.valueOf(a1*a2));}
		} else 
		
		
		
		if (arg0.getActionCommand()=="-") {
			a1=Integer.parseInt(f.getText());
			f.setText("");
			System.out.print(a1);
			op="-";
		} else
			if (arg0.getActionCommand()=="/") {
				a1=Integer.parseInt(f.getText());
				f.setText("");
				System.out.print(a1);
				op="/";
			} else
				if (arg0.getActionCommand()=="*") {
					a1=Integer.parseInt(f.getText());
					f.setText("");
					System.out.print(a1);
					op="*";
				} else
			
		
	
			
		
		
		
		f.setText(arg0.getActionCommand());
		
		
	
	}

	}
	
	


