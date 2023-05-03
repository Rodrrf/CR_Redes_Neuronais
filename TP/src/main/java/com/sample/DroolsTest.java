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
       	 	
       	 	
       	 	detecaoPerimetro det = new detecaoPerimetro(d1, true);
       	 	kSession.insert(det);
       	 	
       	 	CamVigilancia cam1 = new CamVigilancia(d1, false);
    	 	CamVigilancia cam2 = new CamVigilancia(d2, false);
    	 	CamVigilancia cam3 = new CamVigilancia(d3, false);
       	 	kSession.insert(cam1);
       	 	kSession.insert(cam2);
       	 	kSession.insert(cam3);
       	
       	 	SensorMov sensor1 = new SensorMov( d2, false ); //rua tem sensor de movimento
       	 	SensorMov sensor2 = new SensorMov( d2, false ); //escritório tem sensor de movimento
       	 	SensorMov sensor3 = new SensorMov( d3, false); //sala tem sensor de movimento
       	 	kSession.insert( sensor1 );
       	 	kSession.insert( sensor2 );
       	 	kSession.insert( sensor3 );
       	 	
       	 	Intruso i1 = new Intruso (d1, "pessoa"); //Intruso na rua
       	 	Intruso i2 = new Intruso (d2, "pessoa"); //Intruso no escritório
       	 	Intruso i3 = new Intruso (d3, "cao"); //Falso Intruso na sala
       	 	kSession.insert( i1 );
       	 	kSession.insert( i2 );
       	 	kSession.insert( i3 ); 
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }


}
