package ifes.edu.thread.application;

import ifes.edu.thread.cdp.PrimeiraThread;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PrimeiraThread primeiraThread = new PrimeiraThread();
        primeiraThread.setName("Primeira thread");
        primeiraThread.start();
        System.out.println("Opa e ae");
    }
}
