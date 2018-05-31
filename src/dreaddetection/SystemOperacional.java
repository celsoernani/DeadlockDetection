/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreaddetection;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author celso
 */
public class SystemOperacional implements Runnable {
    
        Semaphore mutex = new Semaphore(1);
	private ArrayList<Recursos> resources = new ArrayList<Recursos>();
	private ArrayList<Processos> processes = new ArrayList<Processos>();
	private int tempo;
        
        public SystemOperacional(int tempo) {
		this.tempo = tempo;
	
	}

        
    @Override
    public void run() {
        while(true){
            
          
            try {
                mutex.acquire();
            } catch (InterruptedException ex) {
                Logger.getLogger(SystemOperacional.class.getName()).log(Level.SEVERE, null, ex);
            }
			ArrayList<Integer> deadlocks = this.procuradeadlocks();
                        mutex.release();
                            
                    //se não tiver deadlock avisa no log
			if(deadlocks != null) {
                           
				System.out.println(deadlocks);
			}

            try {
                sleep(this.tempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(SystemOperacional.class.getName()).log(Level.SEVERE, null, ex);
            }
		}
        
        
                    
        
        }

    

    private ArrayList<Integer> procuradeadlocks() {
            
		//falta implementar, aqui é o cerebro
                //retorno os processos que estao em deadlocks
        return null;
        
                
    }
       
    }
        
        
   