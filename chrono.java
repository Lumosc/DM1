public class chrono(){

  private int secondes,minutes,heures;

  public chrono(secondes, minutes, heures){
    secondes = this.secondes;
    minutes = this.minutes;
    heures = this.heures;
  }

  public void rebours(){
    if(secondes == 0){
        if(minutes == 0){
          if(heures == 0){
            System.out.println("On a finis de décompter!");
            exit(0);
          }else{
            heures --;
          }
        }else{
          minutes --;
        }
    }else{
        secondes --;
    }
  }

  public void setHeures(int heure){

  }

  public void setMinutes(int minute){

  }

  public void setSecondes(int seconde){

  }

  public int getHeures(){

  }

  public int getMinutes(){

  }

  public int getSecondes(){

  }
}
