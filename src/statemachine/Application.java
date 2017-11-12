/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine;

/**
 *
 * @author nicol
 */
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Application {

	
	public static void main(String[] args) {
		
		try {
			 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			//UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
		new GUI();
		
		
		/*
		CoffeeMachine obj = new CoffeeMachine();
		System.out.println(obj.stareUrmatoare(10));
		System.out.println(obj.stareUrmatoare(5));
		System.out.println(obj.stareUrmatoare(2));
		System.out.println();
		
		System.out.println(obj.stareUrmatoare(5));
		System.out.println(obj.stareUrmatoare(5));
		System.out.println(obj.stareUrmatoare(1));
		System.out.println();
		
		System.out.println(obj.stareUrmatoare(10));
		System.out.println(obj.stareUrmatoare(1));
		System.out.println();
		
		System.out.println(obj.stareUrmatoare(10));
		System.out.println(obj.stareUrmatoare(10));
		System.out.println(obj.stareUrmatoare(2));
		System.out.println();

		System.out.println(obj.stareUrmatoare(5));
		System.out.println(obj.stareUrmatoare(1));
		*/
	
	}
}
