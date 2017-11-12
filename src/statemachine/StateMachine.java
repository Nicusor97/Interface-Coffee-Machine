
package statemachine;

import java.util.ArrayList;
import java.util.List;


public abstract class StateMachine {
	
	int stareCurenta;
	List<Transitions> listTransition;
	ArrayList<Integer> listInputs;
	ArrayList<Integer> listLocatii;
	
	
	

	String stareUrmatoare(int input) {
		
		
		
		for(int i=0; i<listInputs.size(); i++) {
			
			if(listInputs.get(i) == input) {
				for(int j=0; j<listTransition.size(); j++) {
					if((listTransition.get(j).locatieCurenta == stareCurenta) && (listTransition.get(j).input == input )) {
						for(int k = 0;k < listLocatii.size();k++)
						{
							if(listTransition.get(j).locatieDestinatie == listLocatii.get(k))
							{
								
								
								stareCurenta = listTransition.get(j).locatieDestinatie;
								if(input == 1 && listTransition.get(j).input == input) {
									System.out.println("Cafea Mica");
								}
								else if (input == 2 && listTransition.get(j).input == input) {
									System.out.println("Cafea Mare");
								}
								return "Starea " + listTransition.get(j).locatieDestinatie; 
							
								
								
								
							}
						}
					}
					
				}
			}
			
			
		}
		return "Tranzitia nu exista";

		
	}

}
