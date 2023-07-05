package com.epicode.esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thread1 extends Thread{
	
	private String simboloAssociato = "!";
	
	private static Logger log = LoggerFactory.getLogger(Thread1.class);

	public Thread1() {
		super();

	}



	@Override
	public String toString() {
		return "Thread1 [simboloAssociato=" + simboloAssociato + "]";
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			
			try {
				log.info("ecco i simboli associati a Thread1: " + simboloAssociato);
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
	
}
