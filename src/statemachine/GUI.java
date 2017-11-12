/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class GUI extends JFrame{
	
	
	private JButton cinciBani = new JButton("5 Bani");
	private JButton zeceBani = new JButton("10 Bani");
	private JButton cafeaMica = new JButton("Cafea Mica");
	private JButton cafeaMare = new JButton("Cafea Mare");
	private JLabel sold = new JLabel("Sold ");
	private JLabel sold2 = new JLabel("0");
	private JPanel mainPanel = new JPanel();
	private int bani = 0;
	
	CoffeeMachine obj = new CoffeeMachine();
	
	
	public GUI() {
		super("Coffee Machine");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
	    setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		setLayout(null);
		
		mainPanel.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0));
		mainPanel.setBounds(6, 6, 480, 260);
		add(mainPanel);
		mainPanel.setLayout(null);
		
		
		cinciBani.setBounds(40, 100, 70, 30);
		mainPanel.add(cinciBani);
		
		zeceBani.setBounds(130, 100, 70, 30);
		mainPanel.add(zeceBani);
		
		cafeaMica.setBounds(220, 100, 100, 30);
		mainPanel.add(cafeaMica);
		
		cafeaMare.setBounds(340, 100, 100, 30);
		mainPanel.add(cafeaMare);
		
		sold.setBounds(210, 40, 50, 30);
		sold.setFont(new Font("Tahoma", 1, 15));
		mainPanel.add(sold);
		
		sold2.setBounds(260, 40, 60, 30);
		sold2.setFont(new Font("Tahoma", 1, 15));
		mainPanel.add(sold2);
		
		
		
		cafeaMica.setEnabled(false);
		cafeaMare.setEnabled(false);
		
		
		
		
		
		cinciBani.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	        	bani+= 5;
	        	sold2.setText(String.valueOf(bani));
	    		System.out.println(obj.stareUrmatoare(5));
	        	if(bani==10) {
	        		cafeaMica.setEnabled(true);
	        	}
	        	else if(bani==15) {
	        		cafeaMica.setEnabled(true);
	        		cafeaMare.setEnabled(true);
	        		cinciBani.setEnabled(false);
	        		zeceBani.setEnabled(false);
	        	}
	        }
	    });
		
		 
		zeceBani.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	        	bani+= 10;
	        	sold2.setText(String.valueOf(bani));
	    		System.out.println(obj.stareUrmatoare(10));
	        	if(bani==10) {
	        		cafeaMica.setEnabled(true);
	        	}
	        	else if(bani==15) {
	        		cafeaMica.setEnabled(true);
	        		cafeaMare.setEnabled(true);
	        		cinciBani.setEnabled(false);
	        		zeceBani.setEnabled(false);
	        	}
	        	else if(bani==20) {
	        		cafeaMare.setEnabled(true);
	        		cinciBani.setEnabled(false);
	        		zeceBani.setEnabled(false);
	        	}
	        }
	    });
		
		
		
		
		cafeaMica.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	        	bani-= 10;
	        	sold2.setText(String.valueOf(bani));
	        	if(bani<15) {
	        		cinciBani.setEnabled(true);
	        		zeceBani.setEnabled(true);
	        		cafeaMare.setEnabled(false);
	        		if(bani<10) {
		        		cafeaMica.setEnabled(false);
	        		}
	        	}
	    		System.out.println(obj.stareUrmatoare(1));
	        }
	    });
		
		
		cafeaMare.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	        	bani-= 15;
	        	sold2.setText(String.valueOf(bani));
	        	if(bani<15) {
	        		cinciBani.setEnabled(true);
	        		zeceBani.setEnabled(true);
	        		cafeaMica.setEnabled(false);
	        		cafeaMare.setEnabled(false);
	        	}
	    		System.out.println(obj.stareUrmatoare(2));
	        }
	    });
		
		
		
		
	}

	
}

