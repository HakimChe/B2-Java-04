package fr.voxi.admin;

public class Abonnement {
	private int numero ; 
	private String dateSouscription;
	private static int DureeMaxAbonnement = 3 ; 
	
	public Abonnement(int numero, String dateSouscription) {
		this.numero = numero ; 
		this.dateSouscription = dateSouscription ; 
	}
	
	public int getNumero() {
		return numero ; 
	}
	
	public void setNumero(int numero) {
		this.numero = numero ; 
	}
	
	public String getDateSousCription() {
		return dateSouscription ; 
	}
	
	public void setDateSousCription( String dateSouscription ) {
		this.dateSouscription = dateSouscription ; 
	}
	
	public String toString() {
		return "Oeuvre [" + numero + ", " + dateSouscription +  DureeMaxAbonnement + "]" ;
	}
		
}
