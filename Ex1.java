public class Ex1{
	
	public static void main(String[] args){
		
		chrono1 chronometre1 = new chrono1();
		chronometre1.setHeures(1);
		chronometre1.setMinutes(30);
		chronometre1.setSecondes(0);
		
		while(chronometre1.rebours() == 0){
			chronometre1.afficher();
		}
		System.out.println("Fin du TD!!");
		
		
		chrono2 chronometre2 = new chrono2();
		chronometre2.setHeures(1);
		chronometre2.setMinutes(30);
		chronometre2.setSecondes(0);
		chronometre2.afficher();
		while(chronometre2.rebours() == 0){
			chronometre2.afficher();
		}
		System.out.println("Fin du TD!!");
	}
	
}

class chrono1{
	
	private int secondes,minutes,heures;
		
	public chrono1(){
	    secondes = 0;
	    minutes = 0;
	    heures = 0;
	}
	
	public int rebours(){
		if(secondes == 0){
	        if(minutes == 0){
	          if(heures == 0){
	        	  return 1;
	          }else{
	        	  heures --;
	        	  minutes = 59;
	          }
	        }else{
	        	minutes --;
	        	secondes = 59;
	        }
	    }else{
	        secondes --;
	    }
		return 0;
	}
	
	public void setHeures(int heure){
		heures = heure;
	}
	
	public void setMinutes(int minute){
		minutes = minute;
	}
	
	public void setSecondes(int seconde){
		secondes = seconde;
	}
	
	public int getHeures(){
		  
		return heures;
	
	}
	
	public int getMinutes(){
		  
		return minutes;
	
	}
	
	public int getSecondes(){
		  
		return secondes;
	}
	
	public void afficher(){
		System.out.println(heures+":"+minutes+":"+secondes);
	}
}

class chrono2{
	
	private int nbSecondes;
	
	public chrono2(){
	    nbSecondes = 0;
	}
	
	public int rebours(){
		if(nbSecondes > 0){
			nbSecondes --;
			return nbSecondes;
	    }else{
	        return 0;
	    }
	}
	
	public void setHeures(int heure){
		nbSecondes += 3600*heure - getHeures();
	}
	
	public void setMinutes(int minute){
		nbSecondes += 60 * minute - getMinutes();
	}
	
	public void setSecondes(int seconde){
		nbSecondes += seconde - getSecondes();
	}
	
	public int getHeures(){
		return nbSecondes/3600;
	
	}
	
	public int getMinutes(){
		  
		return (nbSecondes%3600)/60;
	
	}
	
	public int getSecondes(){
		  
		return nbSecondes%60;
	}
	
	public void afficher(){
		System.out.println(getHeures()+":"+getMinutes()+":"+getSecondes());
	}
	
}