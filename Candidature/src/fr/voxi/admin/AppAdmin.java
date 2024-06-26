package fr.voxi.admin;

import java.time.LocalDate;

public class AppAdmin {
	public static void main(String[] args) {
		
		// Tous les affichages doivent faire apparaître le numéro de la question
		
		
		// 1- Créer puis afficher la candidature référencée par la variable cdt1
		//		Caractéristiques de la candidature :
		//			Numéro : 1
		//			État : En attente
		//			Dépôt : 11/01/2024
		
		System.out.println( "\n\n-----[Question 1]-----\n\n" ) ;
		
		/* Votre code pour la question 1 ici */
		
		Candidature cdt1 = new Candidature (1, LocalDate.of(2024, 01, 11)) ;
		System.out.println(cdt1.toString()) ;



		// 2- Tenter d'étudier la candidature 1
		//		Si l'opération s'est déroulée avec succés, afficher "2- Candidature en cours d'étude"
		//		Sinon afficher "2- La candidature ne peut pas être étudiée"
		// 3- ... puis afficher la candicature
		
		/* Votre code pour les questions 2 et 3 ici */
		
		System.out.println( "\n\n-----[Question 2]-----\n\n" ) ;
		
		cdt1.etudier();
		if(cdt1.getEtat() == 2 ) {
			System.out.println("2- Candidature en cours d'étude.") ;
		}
		else{
			System.out.println("2- La candidature ne peut pas être étudiée.") ;
		}
		System.out.println( "\n\n-----[Question 3]-----\n\n" ) ;
		
		System.out.println(cdt1.toString()) ;
		
		// 4- Afficher l'état de la candidature
		//		Si la candidature est en attente afficher "4- Candidature en attente."
		//		Si la candidature est en cours d'étude "4- Candidature en cours d'étude."
		//		Si la candidature est annulée "4- Candidature annulée."
		//		Si ...
		
		/* Votre code pour la question 4 ici */
		
		System.out.println( "\n\n-----[Question 4]-----\n\n" ) ;
		
		System.out.println(cdt1.getEtat()) ;
		
		if(cdt1.getEtat() == 1 ) {
			System.out.println("4- Candidature en attente.") ;
		}
		else if (cdt1.getEtat() == 2){
			System.out.println("4- Candidature en cours d'étude.") ;
		}
		else if (cdt1.getEtat() == 3){
			System.out.println("4- Candidature annulée.") ;
		}
		else if (cdt1.getEtat() == 4){
			System.out.println("4- Candidature acceptée.") ;
		}
		else if (cdt1.getEtat() == 5){
			System.out.println("4- Candidature rejetée.") ;
		}
		
		
		// 5- Accepter puis afficher la candidature
		
		/* Votre code pour la question 5 ici */
		
		System.out.println( "\n\n-----[Question 5]-----\n\n" ) ;
		
		cdt1.accepter(); 
		System.out.println(cdt1.toString()) ;
		
		
		
		// 6- Afficher l'état de la candidature 
		//		(voir question 4)
		//		...
		
		System.out.println( "\n\n-----[Question 6]-----\n\n" ) ;
		
		/* Votre code pour la question 6 ici */
		
		System.out.println( cdt1.getEtat() ) ;
		
		
						
		
		// 7- Tenter d'annuler la candidature
		//		Si l'opération d'annulation est réalisée avec succès, afficher "7- Candidature annulée."
		//		Sinon afficher "7- Annulation refusée."
		// 8- ... puis afficher la candidature
		
		/* Votre code pour les questions 7 et 8 ici */
		
		System.out.println( "\n\n-----[Question 7 et 8]-----\n\n" ) ;
		
		cdt1.annuler(); 
		if(cdt1.getEtat() == 3 ) {
			System.out.println( "7- Candidature annulée." ) ;
		}
		else {
			System.out.println( "7- Annulation refusée." ) ;
		}
		System.out.println(cdt1.toString()) ;
		
		
		// 9- Tenter de rejeter la candidature
		//		Si l'opération est réalisée avec succès, afficher "9- Candidature rejetée."
		//		Sinon afficher "9- Opération refusée."
		// 10- ... puis afficher la candidature
		
		/* Votre code pour les questions 9 et 10 ici */
		
		System.out.println( "\n\n-----[Question 9 et 10]-----\n\n" ) ;
		
		cdt1.rejeter();
		if(cdt1.getEtat() == 5 ) {
			System.out.println( "9- Candidature rejetée.") ;
		}
		else {
			System.out.println( "9- Opération refusée.") ;
		}
		System.out.println(cdt1.toString()) ;
					
	
	
	
		// 11- Tenter d'accepter la candidature
		//		Si l'opération est réalisée avec succès, afficher "11- Candidature acceptée."
		//		Sinon afficher "12- Opération refusée."
		// 12- ... puis afficher la candidature
		
		/* Votre code pour les questions 11 et 12 ici */
		
		System.out.println( "\n\n-----[Question 11 et 12]-----\n\n" ) ;
		
		cdt1.accepter();
		if(cdt1.getEtat() == 3 ) {
			System.out.println( "11- Candidature acceptée.") ;
		}
		else {
			System.out.println( "12- Opération refusée.") ;
		}
		System.out.println(cdt1.toString()) ;
	

	}

}
