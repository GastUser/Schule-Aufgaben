/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 26.11.2019
  * @author 
  */

public class Schueler {
  
  // Anfang Attribute
  private String Name;
  private int Alter;
  private String Geschlecht;
  private double DNote;
  // Ende Attribute
  
  // Anfang Methoden
  public void setName(String Name) {
    this.Name = Name;
  }

  public String getName() {
    return Name;
  }

  public int getAlter() {
    return Alter;
  }

  public void setAlter(int Alter) {
    this.Alter = Alter;
  }

  public String getGeschlecht() {
    return Geschlecht;
  }

  public void setGeschlecht(String Geschlecht) {
    this.Geschlecht = Geschlecht;
  }

  public double getDNote() {
    return DNote;
  }

  public void setDNote(double DNote) {
    this.DNote = DNote;
  }

  // Ende Methoden
} // end of Schueler
