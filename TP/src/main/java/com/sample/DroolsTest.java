package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
            
        	Divisao d1 = new Divisao ("rua");
       	 	Divisao d2 = new Divisao ("escritório");
       	 	Divisao d3 = new Divisao ("sala");
       	 	kSession.insert( d1 );
       	 	kSession.insert( d2 );
       	 	kSession.insert( d3 ); 
       	 	//rua n tem sensor de movimento
       	 	SensorMov asp2 = new SensorMov( d2, false ); //escritório tem aspersor
       	 	SensorMov asp3 = new SensorMov( d3, false);
       	 	kSession.insert( asp1 ); 
       	 	kSession.insert( asp2 );
       	 	kSession.insert( asp3 );
       	 
       	 	Fogo f1 = new Fogo (d1); //Fogo na cozinha
       	 	Fogo f2 = new Fogo (d2); //Fogo no escritório
       	 	Fogo f3 = new Fogo (d3); //Fogo na sala
       	 	kSession.insert( f1 );
       	 	kSession.insert( f2 );
       	 	kSession.insert( f3 ); 
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }


}
