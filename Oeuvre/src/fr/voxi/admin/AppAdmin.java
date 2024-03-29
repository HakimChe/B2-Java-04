package fr.voxi.admin;

public class AppAdmin {
	public static void main(String [] args) {
		Oeuvre oeuvre103 = new Oeuvre( 103, "Le Crépuscule et l'Aube") ;
		System.out.println( oeuvre103.toString() ) ;
		
		System.out.println( Oeuvre.getNbOeuvre() ) ; 
		
		Oeuvre oeuvre302 = new Oeuvre( 302, "Nature Humaine") ;
		System.out.println( oeuvre302.toString() ) ;
		
		System.out.println( Oeuvre.getNbOeuvre() ) ; 
		
		//Oeuvre oeuvre318 = new Oeuvre( 318, "L'Anomalie") ;
		
		System.out.println( Oeuvre.getNbOeuvre() ) ;
		
		//System.out.println( oeuvre103.getNbOeuvre() ) ;
		
		// Nous cherchons à démontrer qu'avec l'instruction précédente que nous pouvons connaître le NbOeuvre créer avec un objet de la classe déjà créer, que cette valeur est évolutif en fonction du nombre d'oeuvre qu'on crée et qu'elle est la même pour tous les objets de la classe Oeuvre. 
		
	}

}
