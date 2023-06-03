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

            // go !
            
            Scanner ler = new Scanner(new FileInputStream("C:\\Users\\rodrf\\Desktop\\2 Ano\\2 Semestre\\CR\\TP\\Trabalho_CR\\TP\\target\\intruso.txt"));
        	String linha = ler.nextLine();
        	while(ler.hasNextLine()) {
        		linha = ler.nextLine();
        		String [] temp = linha.split(";");
        		Divisao d = new Divisao(temp[0], false);
        		Intruso intruso1 = new Intruso(d, false);
        		kSession.insert(d);
        		if(temp[1].equals("sim")) {
        			intruso1 = new Intruso(d, false);
        			kSession.insert(intruso1);
        		}else {
        			intruso1 = new Intruso(d, true);
        			kSession.insert(intruso1);
        		}
        		if(temp[2].equals("sim")) {
        			detecaoPerimetro dt1 = new detecaoPerimetro(d, true);
        			kSession.insert(dt1);
        		}else {
        			detecaoPerimetro dt1 = new detecaoPerimetro(d, false);
        			kSession.insert(dt1);
        		}
				if(temp[3].equals("sim")) {
        			CamVigilancia cm1 = new CamVigilancia(d, intruso1, true, true);
        			kSession.insert(cm1);
        		}else {
        			CamVigilancia cm1 = new CamVigilancia(d, intruso1, false, true);
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
