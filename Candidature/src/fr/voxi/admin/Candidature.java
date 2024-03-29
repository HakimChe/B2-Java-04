package fr.voxi.admin;

import java.time.LocalDate ;

public class Candidature {
	private int numero ; 
	private LocalDate DepotDate ; 
	private LocalDate ReponseDate ;
	private int etat = EN_ATTENTE ;  
	
	public static final int EN_ATTENTE = 1 ;
	public static final int ETUDIEE = 2 ; 
	public static final int ANNULER= 3 ;
	public static final int ACCEPTEE = 4 ;
	public static final int REJETEE = 5 ;
	
	public Candidature(int numero, LocalDate DepotDate, LocalDate ReponseDate, int etat ){
		this.numero = numero ; 
		this.DepotDate = DepotDate ; 
		this.ReponseDate = ReponseDate ; 
		this.etat = etat ; 
	}
	
	public Candidature(int numero, LocalDate DepotDate) {
		this.numero = numero ; 
		this.DepotDate = DepotDate ; 
		this.etat = EN_ATTENTE ; 
	}
	
	public int getNumero() {
		return numero ; 
	}
	
	public void setNumero(int numero ) {
		this.numero = numero ; 
	}
	
	public LocalDate getDepotDate() {
		return DepotDate ; 
	}
	
	public void setDepotDate(LocalDate DepotDate ) {
		this.DepotDate = DepotDate ; 
	}
	
	public LocalDate getReponseDate() {
		return ReponseDate; 
	}
	
	public void setReponseDate(LocalDate ReponseDate ) {
		this.ReponseDate= ReponseDate ; 
	}
	
	public int getEtat() {
		return etat ; 
	}
	
	public void setEtat(int etat ) {
		this.etat = etat ;
	}
	
	public void annuler() {
		if(this.etat == EN_ATTENTE) {
			this.etat = ANNULER ;
		}
	}
	
	public void etudier() {
		if(this.etat == EN_ATTENTE) {
			this.etat = ETUDIEE ;
		}
	}
	
	public void accepter() {
		if(this.etat == ETUDIEE) {
			this.etat = ACCEPTEE ;
		}
	}
	
	public void rejeter() {
		if(this.etat == ETUDIEE) {
			this.etat = REJETEE ;
		}
	}
	
	
	
	public String toString() {
		return "Oeuvre [" + numero + ", " + DepotDate + ", " + ReponseDate + ", " + etat + " ]" ;  
	}
	
}
