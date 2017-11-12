/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine;

import java.util.ArrayList;
import java.util.List;


public class CoffeeMachine extends StateMachine{
	
	
	public CoffeeMachine() {
		
		stareCurenta = 0;
		
		
		
		listTransition = new ArrayList<Transitions>();
		Transitions transition;
		transition = new Transitions(0, 10, 1);
		listTransition.add(transition);
		transition = new Transitions(1, 5, 2);
		listTransition.add(transition);
		transition = new Transitions(0, 5, 4);
		listTransition.add(transition);
		transition = new Transitions(1, 10, 3);
		listTransition.add(transition);
		//transition = new Transitions(2, 5, 3);
		//listTransition.add(transition);
		transition = new Transitions(4, 10, 2);
		listTransition.add(transition);
		transition = new Transitions(4, 5, 1);
		listTransition.add(transition);
		
		//1 - cafea mica | 2 - cafea mare
		transition = new Transitions(1, 1, 0);
		listTransition.add(transition);
		transition = new Transitions(2, 2, 0);
		listTransition.add(transition);
		transition = new Transitions(3, 2, 4);
		listTransition.add(transition);
		transition = new Transitions(2, 1, 4);
		listTransition.add(transition);
		transition = new Transitions(3, 1, 1);
		listTransition.add(transition);

		
		
		//listTransition.add(new Transition(0, 10, 1));
		
		
		//1 - cafea mica | 2 - cafea mare
		listInputs = new ArrayList<Integer>();
		listInputs.add(5);
		listInputs.add(10);
		listInputs.add(1);
		listInputs.add(2);
		
		
		listLocatii = new ArrayList<Integer>();
		listLocatii.add(0);
		listLocatii.add(1);
		listLocatii.add(2);
		listLocatii.add(3);
		listLocatii.add(4);
		

		
		/*
		//Test
		System.out.println(transition.locatieCurenta);
		for(int i=0; i<listTransition.size(); i++) {
			transition = listTransition.get(i);
			System.out.println(transition.locatieCurenta);
			System.out.println(transition.locatieDestinatie);
			System.out.println(transition.input);
		}
		*/
		
		
	}


	

}


