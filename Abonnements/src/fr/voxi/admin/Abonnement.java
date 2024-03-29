package fr.voxi.admin;

import java.time.LocalDate;

public class Abonnement {
	private int numero ; 
	private LocalDate dateSouscription;
	private static int DureeMaxAbonnement = 3 ; 
	
	public Abonnement(int numero, LocalDate dateSouscription) {
		this.numero = numero ; 
		this.dateSouscription = dateSouscription ; 
	}
	
	public int getNumero() {
		return numero ; 
	}
	
	public void setNumero(int numero) {
		this.numero = numero ; 
	}
	
	public LocalDate getDateSousCription() {
		return dateSouscription ; 
	}
	
	public void setDateSousCription( LocalDate dateSouscription ) {
		this.dateSouscription = dateSouscription ; 
	}
	
	public static int getDureeMaxAbonnement() {
		return Abonnement.DureeMaxAbonnement ; 
	}
	
	public static void setDureeMaxAbonnement(int dureeMaxAbonnement ) {
		Abonnement.DureeMaxAbonnement = dureeMaxAbonnement ;
	}
	
	public String toString() {
		return "Oeuvre [" + numero + ", " + dateSouscription + ", " +  DureeMaxAbonnement + "]" ;
	}
}
