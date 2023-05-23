package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.io.FileInputStream;
import java.util.Scanner;

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

           /* // go !
            
        	Proprietario p1 = new Proprietario("Cornélio Fonseca", 969420127); //proprietario da casa
        	kSession.insert(p1); 
        	
        	TeamSecurity team = new TeamSecurity("Verisure", 924257820, false, false); //equipa de segurança
        	kSession.insert(team);
        	
        	Divisao d1 = new Divisao ("rua", false);
       	 	Divisao d2 = new Divisao ("escritório", false);
       	 	Divisao d3 = new Divisao ("sala", false);
       	 	Divisao d4 = new Divisao ("entrada", false);
       	 	kSession.insert( d1 );
       	 	kSession.insert( d2 );
       	 	kSession.insert( d3 );
       	 	kSession.insert( d4 );
       	 	
       	 	//detecaoPerimetro det = new detecaoPerimetro(d1, true);
       	 	//kSession.insert(det);
       	 	
       	 	CamVigilancia cam1 = new CamVigilancia(d1, true, true);	//rua tem camara
    	 	CamVigilancia cam2 = new CamVigilancia(d2, false, true);	//escritório tem camara
    	 	CamVigilancia cam3 = new CamVigilancia(d3, false, true);	//sala tem camara
    	 	CamVigilancia cam4 = new CamVigilancia(d4, false, true);	//entrada tem camara
       	 	kSession.insert(cam1);
       	 	kSession.insert(cam2);
       	 	kSession.insert(cam3);
       	 	kSession.insert(cam4);
       	
       	 	SensorMov sensor1 = new SensorMov( d2, true ); //rua tem sensor de movimento
       	 	SensorMov sensor2 = new SensorMov( d2, false ); //escritório tem sensor de movimento
       	 	SensorMov sensor3 = new SensorMov( d3, false); //sala tem sensor de movimento
       	 	SensorMov sensor4 = new SensorMov( d4, false); //entrada tem sensor de movimento
       	 	kSession.insert( sensor1 );
       	 	kSession.insert( sensor2 );
       	 	kSession.insert( sensor3 );
       	 	kSession.insert( sensor4 );
       	 	
       	 	Intruso i1 = new Intruso (d1, true); //Intruso na rua
       	 	Intruso i2 = new Intruso (d2, true); //Intruso no escritório
       	 	Intruso i3 = new Intruso (d3, false); //Falso Intruso na sala
       	 	kSession.insert( i1 );
       	 	kSession.insert( i2 );
       	 	kSession.insert( i3 ); 
            kSession.fireAllRules();*/
            
            Scanner ler = new Scanner(new FileInputStream("C:\\Users\\rodrf\\Desktop\\2 Ano\\2 Semestre\\CR\\TP\\Trabalho_CR\\TP\\target\\intruso.txt"));
        	String linha = ler.nextLine();
        	while(ler.hasNextLine()) {
        		linha = ler.nextLine();
        		String [] temp = linha.split(";");
        		Divisao d = new Divisao(temp[0], false);
        		kSession.insert(d);
        		if(temp[1].equals("sim")) {
        			Intruso int1 = new Intruso(d, false);
        			kSession.insert(int1);
        		}else {
        			Intruso int1 = new Intruso(d, true);
        			kSession.insert(int1);
        		}
        		if(temp[2].equals("sim")) {
        			detecaoPerimetro dt1 = new detecaoPerimetro(d, true);
        			kSession.insert(dt1);
        		}else {
        			detecaoPerimetro dt1 = new detecaoPerimetro(d, false);
        			kSession.insert(dt1);
        		}
				if(temp[3].equals("sim")) {
        			CamVigilancia cm1 = new CamVigilancia(d, int1, true, true);
        			kSession.insert(cm1);
        		}else {
        			CamVigilancia cm1 = new CamVigilancia(d, int1, false, true);
        			kSession.insert(cm1);
        		}
        		
        		if(temp[4].equals("sim")) {
        			SensorMov sm1 = new SensorMov(d, true);
        			kSession.insert(sm1);
        		}else {
        			SensorMov sm1 = new SensorMov(d, false);
        			kSession.insert(sm1);
        		}
        		if(temp[5].equals("sim")) {
        			TeamSecurity team = new TeamSecurity("TeamBest", 919933231,false, false);
        			kSession.insert(team);
        		}else {
        			TeamSecurity team = new TeamSecurity("TeamBest", 919933231,true, true);
        			kSession.insert(team);
        		}
        		if(temp[6].equals("nao")) {
        			codigo cod = new codigo(false);
        			kSession.insert(cod);
        		}
        	}
        	ler.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }


}
