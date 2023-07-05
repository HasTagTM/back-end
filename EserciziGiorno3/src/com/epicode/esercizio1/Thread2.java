package com.epicode.esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thread2 extends Thread{

	private String simboloAssociato = "*";
	private static Logger log = LoggerFactory.getLogger(Thread2.class);

	public Thread2() {
		super();

	}

	@Override
	public String toString() {
		return "Thread2 [simboloAssociato=" + simboloAssociato + "]";
	}

	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			
			try {
				log.info("ecco i simboli associati a Thread2 : " + simboloAssociato);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				log.error(e.getMessage());
			}
		}
	}
	
	
}
