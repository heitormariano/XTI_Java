package br.com.xti.aula080;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	
	public Calculadora(){
		super("Calculadora");
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4,4,5,5));
		
		
		c2.add(new JButton("7"));
		c2.add(new JButton("8"));
		c2.add(new JButton("9"));
		c2.add(new JButton("/"));
		
		c2.add(new JButton("4"));
		c2.add(new JButton("5"));
		c2.add(new JButton("6"));
		c2.add(new JButton("*"));
		
		c2.add(new JButton("1"));
		c2.add(new JButton("2"));
		c2.add(new JButton("3"));
		c2.add(new JButton("-"));
		
		c2.add(new JButton("0"));
		c2.add(new JButton("."));
		c2.add(new JButton("="));
		c2.add(new JButton("+"));
		
		c.add(BorderLayout.CENTER, new JTextField());
		c.add(BorderLayout.SOUTH, c2);
		
		setSize(250,190);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculadora();
	}
}
