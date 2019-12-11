import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**                              
  *
  * Beschreibung
  *
  * @version 1.0 vom 26.11.2019
  * @author 
  */

public class GuiSchueler extends JFrame {
  // Anfang Attribute
  private List<Schueler>schuelerListe;
  private JLabel Titel = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JNumberField jNumberField1 = new JNumberField();
  private JTextField jTextField2 = new JTextField();
  private JNumberField jNumberField2 = new JNumberField();
  private JLabel Name_ = new JLabel();
  private JLabel Alter = new JLabel();
  private JLabel Geschlecht = new JLabel();
  private JLabel DNote = new JLabel();
  private JButton anlegen = new JButton();
  private JTextField jTextField3 = new JTextField();
  private JNumberField jNumberField3 = new JNumberField();
  private JTextField jTextField4 = new JTextField();
  private JNumberField jNumberField4 = new JNumberField();
  private JButton ausgeben = new JButton();
  private JButton loeschen = new JButton();
  private JTextField suchLeiste = new JTextField();
  private JLabel suche = new JLabel();
  private JLabel Name1 = new JLabel();
  private JLabel Alter2 = new JLabel();
  private JLabel Geschlecht2 = new JLabel();
  private JLabel DNote2 = new JLabel();
  // Ende Attribute
  
  public GuiSchueler(){
    schuelerListe = new List();
    
    
  }
  
   
  
  
  
  
  
  
  
  
  
  
  public GuiSchueler(String title) { 
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 814; 
    int frameHeight = 730;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    Titel.setBounds(248, 56, 195, 49);
    Titel.setText("SchuelerAusgabe");
    cp.add(Titel);
    jTextField1.setBounds(56, 160, 153, 33);
    cp.add(jTextField1);
    jNumberField1.setBounds(232, 160, 121, 33);
    jNumberField1.setText("");
    cp.add(jNumberField1);
    jTextField2.setBounds(384, 160, 113, 33);
    cp.add(jTextField2);
    jNumberField2.setBounds(536, 160, 137, 33);
    jNumberField2.setText("");
    cp.add(jNumberField2);
    Name_.setBounds(56, 136, 163, 19);
    Name_.setText("Name");
    cp.add(Name_);
    Alter.setBounds(232, 136, 123, 19);
    Alter.setText("Alter");
    cp.add(Alter);
    Geschlecht.setBounds(384, 136, 115, 19);
    Geschlecht.setText("Geschlecht");
    cp.add(Geschlecht);
    DNote.setBounds(536, 136, 147, 19);
    DNote.setText("DNote");
    cp.add(DNote);
    anlegen.setBounds(288, 216, 113, 25);
    anlegen.setText("anlegen");
    anlegen.setMargin(new Insets(2, 2, 2, 2));
    anlegen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        anlegen_ActionPerformed(evt);
      }
    });
    cp.add(anlegen);
    jTextField3.setBounds(48, 360, 153, 33);
    cp.add(jTextField3);
    jNumberField3.setBounds(224, 360, 121, 33);
    jNumberField3.setText("");
    cp.add(jNumberField3);
    jTextField4.setBounds(376, 360, 113, 33);
    cp.add(jTextField4);
    jNumberField4.setBounds(528, 360, 137, 33);
    jNumberField4.setText("");
    cp.add(jNumberField4);
    ausgeben.setBounds(280, 416, 113, 25);
    ausgeben.setText("ausgeben");
    ausgeben.setMargin(new Insets(2, 2, 2, 2));
    ausgeben.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        ausgeben_ActionPerformed(evt);
      }
    });
    cp.add(ausgeben);
    loeschen.setBounds(280, 472, 113, 25);
    loeschen.setText("loeschen");
    loeschen.setMargin(new Insets(2, 2, 2, 2));
    loeschen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        loeschen_ActionPerformed(evt);
      }
    });
    cp.add(loeschen);
    suchLeiste.setBounds(56, 472, 161, 25);
    cp.add(suchLeiste);
    suche.setBounds(56, 448, 171, 19);
    suche.setText("Suche");
    cp.add(suche);
    Name1.setBounds(48, 336, 155, 19);
    Name1.setText("Name");
    cp.add(Name1);
    Alter2.setBounds(224, 336, 131, 19);
    Alter2.setText("Alter");
    cp.add(Alter2);
    Geschlecht2.setBounds(376, 336, 115, 19);
    Geschlecht2.setText("Geschlecht");
    cp.add(Geschlecht2);
    DNote2.setBounds(528, 336, 139, 19);
    DNote2.setText("DNote");
    cp.add(DNote2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public GuiSchueler
  
  // Anfang Methoden
  public void anlegen_ActionPerformed(ActionEvent evt) {
         System.out.println("Nächste Arbeit wird eh Sechs,weil man nur verkacken kann");
  } // end of anlegen_ActionPerformed
  
  public void ausgeben_ActionPerformed(ActionEvent evt) {
    
  } // end of ausgeben_ActionPerformed
  
  public void loeschen_ActionPerformed(ActionEvent evt) {
    // Schueler wird ausgelesen und geloescht(Liste aufrufen an bestimmte stelle und loeschen)
  } // end of loeschen_ActionPerformed
  
  // Ende Methoden
  
  public static void main(String[] args) {
    new GuiSchueler("GuiSchueler");
  } // end of main
  
} // end of class GuiSchueler
