/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.thread.cdp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 20122bsi0387
 */
public class PrimeiraThread extends Thread {
  
    @Override
    public void run() {
        try {
            System.out.println("Carregando...");
            sleep(2000);
            System.out.println("Carregado");
        } catch (InterruptedException ex) {
            Logger.getLogger(PrimeiraThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
