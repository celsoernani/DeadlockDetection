/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreaddetection;

import java.util.concurrent.Semaphore;


/**
 *
 * @author celso
 */
public class Recursos {
    
        private static int lastId = 0;
	private String nome;
	private int id;
        private final int amount;
        private int availableInstances;
        Semaphore disponivel = new Semaphore(1);
   
	

	
	public Recursos( int id, String nome, int amount) {
		this.nome = nome;
		this.id = id;
                this.amount = amount;
		this.availableInstances = this.amount;
		this.id = ++lastId;
	}

	
	
           public int getAvailableInstances() {
		return this.availableInstances;
	}
           
           
           public void decrementInstances() {
		this.availableInstances--;
            }
	
	public void incrementInstances() {
		this.availableInstances++;
	}
        
        
        public void takeInstance() throws InterruptedException {
		this.disponivel.acquire();
	}
        
        public int availableInstances() {
		return this.disponivel.availablePermits();
	}
	
	
	// Getters and Setters
	
	public String getName() {
		return nome;
	}
	
	public void setName(String name) {
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
        public int getAmount() {
		return amount;
	}
	
	
	
	@Override
	public String toString() {
		return "Id: " + this.id + "\nName: " + this.nome;
	}
	
}
    
 