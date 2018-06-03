package dreaddetection;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author celso
 */
public class Processos implements Runnable{
    
    private static int lastPid = 0;
    private int Pid;
    private LinkedList<Recursos> resourcesHeld = new LinkedList<>();
    private ArrayList<Integer> resourcesTimes = new ArrayList<Integer>(); 
    private int processRequestTime;
    private int processUsageTime;
    private int[] recursos;
    private Recursos requestedResouce;
    private int currentRequest = -1;
    private SystemOperacional sistemaOperacional;
    private boolean keepAlive = true;
    Semaphore mutex = new Semaphore(1);
    
    public Processos(SystemOperacional so,int processUsageTime, int processRequestTime, int numRecursos){
        this.Pid = lastPid++;
        this.processRequestTime = processRequestTime;
        this.processUsageTime = processUsageTime;
        this.recursos = new int[numRecursos];
        this.sistemaOperacional = so;
    } 
    
    @Override
    public void run() {
        int aux = 0;
   
        while(keepAlive){
            
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Processos.class.getName()).log(Level.SEVERE, null, ex);
            }
            aux++;
            
            if(aux%processRequestTime==0){
              //quando o tempo em segundos de solicitação passar ele tem que solicitar um recurso ainda nao usado por ele próprio  
                try {
                    mutex.acquire();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Processos.class.getName()).log(Level.SEVERE, null, ex);
                }
                                    currentRequest  =sistemaOperacional.randomRecurse(this.Pid);

                   if(currentRequest >= 0) {
                                
                            requestedResouce = this.sistemaOperacional.getResourceById(currentRequest + 1);
                            System.out.println( "P"+this.Pid+" solicitou "+requestedResouce.getName());
                           if(requestedResouce.getAvailableInstances() == 0)
					{
						System.out.println("P"+this.Pid+" bloqueiou com  "+requestedResouce.getName());	
					}

                   
                   }
                    
                    
              
            }
            
            
    
    }
    
        
    }
        
      public int liberarRecurso() {
         //falta implementar
                return 1;
    }   
      public int usarRecurso() {
         //falta implementar 
                return 1;
    }   
      
    // Getters and Setters
 

	public void setarRecursos(int[] resourcesInstances) {
		this.recursos = resourcesInstances;
	}

	

	public int getPedidoatual() {
		return currentRequest;
	}
       
        @Override
	public String toString() {
		return "Processo: " + this.Pid;
	}

	public int getPid() {
		return this.Pid;
	}

	public void setKeepAlice(boolean b) {
		keepAlive = false;

	}

   public int[] obterRecursos() {
        return recursos;
       
    }

    

    
    

}
