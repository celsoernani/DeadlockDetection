/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreaddetection;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Random;
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
       
  

   public int randomRecurse(int id) {
        Processos process;

		// Retrieving the correct process
		int i = 0;
		while(i < this.processes.size() && this.processes.get(i).getPid() != id) {
			i++;
		}

		if(i >= this.processes.size()) {
			return -1;
		}

		process = this.processes.get(i);

		// Checking for possible resources
		ArrayList<Integer> possible = new ArrayList<>();
		for(int j = 0; j < this.resources.size(); j++) {
			if(process.obterRecursos()[j] < this.resources.get(j).getAmount()) {
				possible.add(j);
			}
		}

		if(possible.isEmpty()) {
			return -1;
		}

		Random random = new Random();
		return possible.get(random.nextInt(possible.size()));
                
    }

   
public Recursos getResourceById(int id)
	{
		for (Recursos rs : resources) {
			if(rs.getId()==id)
				return rs;
		}
		return null;
	}

   

}
        
        
   