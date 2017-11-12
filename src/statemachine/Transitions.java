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
public class Transitions {
    
    int locatieCurenta;
	int input;
	int locatieDestinatie;
	
	
	
	public Transitions(int locatieCurenta, int input, int locatieDestinatie) {
		this.locatieCurenta = locatieCurenta;
		this.input = input;
		this.locatieDestinatie = locatieDestinatie;
		
	}
}
