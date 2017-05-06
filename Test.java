import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test {
	 private JFrame mainFrame;
	 private JTextField textField;
	 private JTextField tfIme;
	 private JTextField tfPrezime;
	 private JTextField tfPol;
	 private JTextField tfJmbg;
	 private JTextField tfDatumRodjenja;
	 private JTextField tfMestoRodjenja;
	 private JTextField tfDrzavaRodjenja;
	 private JTextField tfImeOca;
	 private JTextField tfImeMajke;
	 private JTextField tfUlica;
	 private JTextField tfBroj;
	 private JTextField tfMesto;
	 private JTextField tfDrzava;
	 private JTextField tfBrojTelefona;
	 private JTextField tfBrojMobilnog;
	 private JTextField tfEmail;
	 private JTextField tfWww;
	 private JTextField tfDatumUpisa;
	 private JTextField tfSmer;
	 private JLabel lblDrzavaRodjenja;
	 private JLabel lblImeOca;
	 private JLabel lblImeMajke;
	 private JLabel lblUlica;
	 private JLabel lblBoj;
	 private JLabel lblMesto;
	 private JTextField tfPostanskiBroj;
	 private JLabel lblDrzava;
	 private JLabel lblPostanskiBroj;
	 private JLabel lblNewLabel_1;
	 private JLabel lblBrojMobilnog;
	 private JLabel lblEmail;
	 private JLabel lblWwwUri;
	 private JLabel lblDatumUpisa;
	 private JLabel lblSmer;

	   public Test(){
	      prepareGUI();
	   }
	   public static void main(String[] args){
	      Test swingControlDemo = new Test();  
//	      swingControlDemo.showEventDemo();       
	   }
	   private void prepareGUI(){
	      mainFrame = new JFrame("Podaci o studentu");
	      mainFrame.getContentPane().setBackground(new Color(175, 238, 238));
	      mainFrame.setSize(742,586);
	      mainFrame.getContentPane().setLayout(null);
	      
	      JLabel lblInfo = new JLabel("Unesite broj indeksa studenta");
	      lblInfo.setBounds(10, 11, 241, 23);
	      mainFrame.getContentPane().add(lblInfo);
	      
	      textField = new JTextField();
	      textField.setBounds(20, 37, 86, 20);
	      mainFrame.getContentPane().add(textField);
	      textField.setColumns(10);
	      
	      JLabel lblError = new JLabel("neispravan format indeksa!");
	      lblError.setForeground(new Color(255, 0, 0));
	      lblError.setBounds(117, 40, 220, 14);
	      mainFrame.getContentPane().add(lblError);
	      
	      JButton btnChoose = new JButton("Izaberi!");
	      btnChoose.setBounds(566, 36, 89, 23);
	      mainFrame.getContentPane().add(btnChoose);
	      
	      JPanel panel = new JPanel();
	      panel.setBackground(new Color(175, 238, 238));
	      panel.setBounds(10, 73, 706, 463);
	      mainFrame.getContentPane().add(panel);
	      panel.setLayout(null);
	      
	      tfIme = new JTextField();
	      tfIme.setBounds(10, 11, 195, 20);
	      panel.add(tfIme);
	      tfIme.setColumns(10);
	      
	      tfPrezime = new JTextField();
	      tfPrezime.setBounds(10, 42, 195, 20);
	      panel.add(tfPrezime);
	      tfPrezime.setColumns(10);
	      
	      tfPol = new JTextField();
	      tfPol.setBounds(10, 73, 195, 20);
	      panel.add(tfPol);
	      tfPol.setColumns(10);
	      
	      tfJmbg = new JTextField();
	      tfJmbg.setBounds(10, 104, 195, 20);
	      panel.add(tfJmbg);
	      tfJmbg.setColumns(10);
	      
	      tfDatumRodjenja = new JTextField();
	      tfDatumRodjenja.setBounds(10, 135, 195, 20);
	      panel.add(tfDatumRodjenja);
	      tfDatumRodjenja.setColumns(10);
	      
	      tfMestoRodjenja = new JTextField();
	      tfMestoRodjenja.setBounds(10, 166, 195, 20);
	      panel.add(tfMestoRodjenja);
	      tfMestoRodjenja.setColumns(10);
	      
	      tfDrzavaRodjenja = new JTextField();
	      tfDrzavaRodjenja.setBounds(10, 197, 195, 20);
	      panel.add(tfDrzavaRodjenja);
	      tfDrzavaRodjenja.setColumns(10);
	      
	      tfImeOca = new JTextField();
	      tfImeOca.setBounds(365, 11, 195, 20);
	      panel.add(tfImeOca);
	      tfImeOca.setColumns(10);
	      
	      tfImeMajke = new JTextField();
	      tfImeMajke.setBounds(365, 42, 195, 20);
	      panel.add(tfImeMajke);
	      tfImeMajke.setColumns(10);
	      
	      tfUlica = new JTextField();
	      tfUlica.setBounds(365, 73, 195, 20);
	      panel.add(tfUlica);
	      tfUlica.setColumns(10);
	      
	      tfBroj = new JTextField();
	      tfBroj.setBounds(365, 104, 195, 20);
	      panel.add(tfBroj);
	      tfBroj.setColumns(10);
	      
	      tfMesto = new JTextField();
	      tfMesto.setBounds(365, 133, 195, 20);
	      panel.add(tfMesto);
	      tfMesto.setColumns(10);
	      
	      tfDrzava = new JTextField();
	      tfDrzava.setBounds(365, 166, 195, 20);
	      panel.add(tfDrzava);
	      tfDrzava.setColumns(10);
	      
	      tfBrojTelefona = new JTextField();
	      tfBrojTelefona.setBounds(10, 287, 195, 20);
	      panel.add(tfBrojTelefona);
	      tfBrojTelefona.setColumns(10);
	      
	      tfBrojMobilnog = new JTextField();
	      tfBrojMobilnog.setBounds(10, 318, 195, 20);
	      panel.add(tfBrojMobilnog);
	      tfBrojMobilnog.setColumns(10);
	      
	      tfEmail = new JTextField();
	      tfEmail.setBounds(10, 349, 195, 20);
	      panel.add(tfEmail);
	      tfEmail.setColumns(10);
	      
	      tfWww = new JTextField();
	      tfWww.setBounds(10, 380, 195, 20);
	      panel.add(tfWww);
	      tfWww.setColumns(10);
	      
	      tfDatumUpisa = new JTextField();
	      tfDatumUpisa.setBounds(365, 287, 195, 20);
	      panel.add(tfDatumUpisa);
	      tfDatumUpisa.setColumns(10);
	      
	      tfSmer = new JTextField();
	      tfSmer.setBounds(365, 318, 195, 20);
	      panel.add(tfSmer);
	      tfSmer.setColumns(10);
	      
	      JLabel lblNewLabel = new JLabel("Ime");
	      lblNewLabel.setForeground(new Color(0, 0, 0));
	      lblNewLabel.setBounds(215, 14, 140, 14);
	      panel.add(lblNewLabel);
	      
	      JLabel lblPrezime = new JLabel("Prezime");
	      lblPrezime.setBounds(215, 45, 140, 14);
	      panel.add(lblPrezime);
	      
	      JLabel lblPol = new JLabel("Pol");
	      lblPol.setBounds(215, 76, 140, 14);
	      panel.add(lblPol);
	      
	      JLabel lblJmbg = new JLabel("JMBG");
	      lblJmbg.setBounds(215, 107, 140, 14);
	      panel.add(lblJmbg);
	      
	      JLabel lblDatumRodjenja = new JLabel("Datum rodjenja");
	      lblDatumRodjenja.setBounds(215, 138, 140, 14);
	      panel.add(lblDatumRodjenja);
	      
	      JLabel lblMestoRodjenja = new JLabel("Mesto rodjenja");
	      lblMestoRodjenja.setBounds(215, 169, 140, 14);
	      panel.add(lblMestoRodjenja);
	      
	      lblDrzavaRodjenja = new JLabel("Drzava rodjenja");
	      lblDrzavaRodjenja.setBounds(215, 200, 140, 14);
	      panel.add(lblDrzavaRodjenja);
	      
	      lblImeOca = new JLabel("Ime oca");
	      lblImeOca.setBounds(570, 14, 140, 14);
	      panel.add(lblImeOca);
	      
	      lblImeMajke = new JLabel("Ime majke");
	      lblImeMajke.setBounds(570, 45, 140, 14);
	      panel.add(lblImeMajke);
	      
	      lblUlica = new JLabel("Ulica");
	      lblUlica.setBounds(570, 76, 140, 14);
	      panel.add(lblUlica);
	      
	      lblBoj = new JLabel("Broj");
	      lblBoj.setBounds(570, 107, 140, 14);
	      panel.add(lblBoj);
	      
	      lblMesto = new JLabel("Mesto");
	      lblMesto.setBounds(570, 136, 140, 14);
	      panel.add(lblMesto);
	      
	      tfPostanskiBroj = new JTextField();
	      tfPostanskiBroj.setBounds(365, 202, 195, 20);
	      panel.add(tfPostanskiBroj);
	      tfPostanskiBroj.setColumns(10);
	      
	      lblDrzava = new JLabel("Drzava");
	      lblDrzava.setBounds(570, 169, 140, 14);
	      panel.add(lblDrzava);
	      
	      lblPostanskiBroj = new JLabel("Postanski broj");
	      lblPostanskiBroj.setBounds(570, 205, 140, 14);
	      panel.add(lblPostanskiBroj);
	      
	      lblNewLabel_1 = new JLabel("Broj telefona");
	      lblNewLabel_1.setBounds(215, 290, 140, 14);
	      panel.add(lblNewLabel_1);
	      
	      lblBrojMobilnog = new JLabel("Broj mobilnog");
	      lblBrojMobilnog.setBounds(215, 321, 140, 14);
	      panel.add(lblBrojMobilnog);
	      
	      lblEmail = new JLabel("Email");
	      lblEmail.setBounds(215, 352, 140, 14);
	      panel.add(lblEmail);
	      
	      lblWwwUri = new JLabel("WWW uri");
	      lblWwwUri.setBounds(215, 383, 140, 14);
	      panel.add(lblWwwUri);
	      
	      lblDatumUpisa = new JLabel("Datum upisa");
	      lblDatumUpisa.setBounds(570, 290, 140, 14);
	      panel.add(lblDatumUpisa);
	      
	      lblSmer = new JLabel("Smer");
	      lblSmer.setBounds(570, 321, 140, 14);
	      panel.add(lblSmer);
	      
	      JButton btnSaveChanges = new JButton("Sacuvaj izmene");
	      btnSaveChanges.setBounds(556, 377, 140, 23);
	      panel.add(btnSaveChanges);
	      
	      JButton btnPrint = new JButton("Ispisi u datoteku");
	      btnPrint.setBounds(556, 415, 140, 23);
	      panel.add(btnPrint);
	      
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });
	      mainFrame.setVisible(true);  
	   }
}
