package fr.voxi.admin;

import java.time.LocalDate;

public class AppAdmin {
	public static void main(String [] args) {
		
		Abonnement abn1 = new Abonnement(201, LocalDate.of(2024,1,3));
		Abonnement abn2 = new Abonnement(202, LocalDate.of(2024,1,10)) ;
		
		System.out.println(abn1.toString()) ;
		System.out.println(abn2.toString()) ;
		
		System.out.println(Abonnement.getDureeMaxAbonnement()) ;
		
		Abonnement.setDureeMaxAbonnement(7);
		System.out.println(Abonnement.getDureeMaxAbonnement());
		
		abn1.setDureeMaxAbonnement(7);
		System.out.println(abn1.toString()) ;
		System.out.println(abn2.toString()) ;
		
		System.out.println(Abonnement.getDureeMaxAbonnement()) ;
		
	}
}
