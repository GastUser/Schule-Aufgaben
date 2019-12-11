/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 26.11.2019
  * @author 
  */
                                                                 
public class Verwaltung {                                     
  List<Schueler> schuelerliste2;
  List<Schueler> schuelerliste;
  
  
  public Verwaltung(){                                 
    schuelerliste2 = new List<Schueler>();
    schuelerliste = new List<Schueler>();              
    Schueler besterSchueler;
    Schueler aktueller;
    schuelerListe.toFirst();
    
    
  }
  public void sortieren(){
    while(schuelerliste.hasAccess()){
      besterSchueler = schuelerliste.getContent();
      
      
      while (schuelerliste.hasAccess()) { 
        
        aktueller=schuelerliste.getContent();              
        if(aktueller.getDNote()<besterSchueler.getDNote()){
          besterSchueler=aktueller;
          
        }
        schuelerliste.next(); 
        
      } // end of while
      
      schuelerliste2.append(besterSchueler);
      schuelerliste.toFirst();
    }
    
    if(aktueller.getName().equals(besterSchueler.getName())){
      schuelerliste.remove();
    }
    
    schuelerliste.toFirst();
  }                                   
  schuelerliste.concat(schuelerliste2);   
} // end of Verwaltung                          