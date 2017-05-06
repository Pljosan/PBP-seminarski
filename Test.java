import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test {
	 private JFrame mainFrame;
	 private JTextField textField;
	 private JTextField tfName;
	 private JTextField tfSurname;
	 private JTextField textField_1;
	 private JTextField textField_2;
	 private JTextField textField_3;
	 private JTextField textField_4;
	 private JTextField textField_5;
	 private JTextField textField_6;
	 private JTextField textField_7;
	 private JTextField textField_8;
	 private JTextField textField_9;
	 private JTextField textField_10;
	 private JTextField textField_11;
	 private JTextField textField_12;
	 private JTextField textField_13;
	 private JTextField textField_14;
	 private JTextField textField_15;
	 private JTextField textField_16;
	 private JTextField textField_17;
	 private JLabel lblDrzavaRodjenja;
	 private JLabel lblImeOca;
	 private JLabel lblImeMajke;
	 private JLabel lblUlica;
	 private JLabel lblBoj;
	 private JLabel lblMesto;
	 private JTextField textField_20;
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
	      mainFrame = new JFrame("Java SWING Examples");
	      mainFrame.getContentPane().setBackground(new Color(175, 238, 238));
	      mainFrame.setSize(775,615);
	      mainFrame.getContentPane().setLayout(null);
	      
	      JLabel lblInfo = new JLabel("Unesite indeks studenta");
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
	      btnChoose.setBounds(392, 36, 89, 23);
	      mainFrame.getContentPane().add(btnChoose);
	      
	      JPanel panel = new JPanel();
	      panel.setBackground(new Color(175, 238, 238));
	      panel.setBounds(10, 73, 739, 492);
	      mainFrame.getContentPane().add(panel);
	      panel.setLayout(null);
	      
	      tfName = new JTextField();
	      tfName.setBounds(10, 11, 195, 20);
	      panel.add(tfName);
	      tfName.setColumns(10);
	      
	      tfSurname = new JTextField();
	      tfSurname.setBounds(10, 42, 195, 20);
	      panel.add(tfSurname);
	      tfSurname.setColumns(10);
	      
	      textField_1 = new JTextField();
	      textField_1.setBounds(10, 73, 195, 20);
	      panel.add(textField_1);
	      textField_1.setColumns(10);
	      
	      textField_2 = new JTextField();
	      textField_2.setBounds(10, 104, 195, 20);
	      panel.add(textField_2);
	      textField_2.setColumns(10);
	      
	      textField_3 = new JTextField();
	      textField_3.setBounds(10, 135, 195, 20);
	      panel.add(textField_3);
	      textField_3.setColumns(10);
	      
	      textField_4 = new JTextField();
	      textField_4.setBounds(10, 166, 195, 20);
	      panel.add(textField_4);
	      textField_4.setColumns(10);
	      
	      textField_5 = new JTextField();
	      textField_5.setBounds(10, 197, 195, 20);
	      panel.add(textField_5);
	      textField_5.setColumns(10);
	      
	      textField_6 = new JTextField();
	      textField_6.setBounds(10, 228, 195, 20);
	      panel.add(textField_6);
	      textField_6.setColumns(10);
	      
	      textField_7 = new JTextField();
	      textField_7.setBounds(10, 254, 195, 20);
	      panel.add(textField_7);
	      textField_7.setColumns(10);
	      
	      textField_8 = new JTextField();
	      textField_8.setBounds(10, 287, 195, 20);
	      panel.add(textField_8);
	      textField_8.setColumns(10);
	      
	      textField_9 = new JTextField();
	      textField_9.setBounds(10, 318, 195, 20);
	      panel.add(textField_9);
	      textField_9.setColumns(10);
	      
	      textField_10 = new JTextField();
	      textField_10.setBounds(10, 347, 195, 20);
	      panel.add(textField_10);
	      textField_10.setColumns(10);
	      
	      textField_11 = new JTextField();
	      textField_11.setBounds(10, 380, 195, 20);
	      panel.add(textField_11);
	      textField_11.setColumns(10);
	      
	      textField_12 = new JTextField();
	      textField_12.setBounds(365, 11, 195, 20);
	      panel.add(textField_12);
	      textField_12.setColumns(10);
	      
	      textField_13 = new JTextField();
	      textField_13.setBounds(365, 42, 195, 20);
	      panel.add(textField_13);
	      textField_13.setColumns(10);
	      
	      textField_14 = new JTextField();
	      textField_14.setBounds(365, 73, 195, 20);
	      panel.add(textField_14);
	      textField_14.setColumns(10);
	      
	      textField_15 = new JTextField();
	      textField_15.setBounds(365, 104, 195, 20);
	      panel.add(textField_15);
	      textField_15.setColumns(10);
	      
	      textField_16 = new JTextField();
	      textField_16.setBounds(365, 135, 195, 20);
	      panel.add(textField_16);
	      textField_16.setColumns(10);
	      
	      textField_17 = new JTextField();
	      textField_17.setBounds(365, 166, 195, 20);
	      panel.add(textField_17);
	      textField_17.setColumns(10);
	      
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
	      lblImeOca.setBounds(215, 231, 140, 14);
	      panel.add(lblImeOca);
	      
	      lblImeMajke = new JLabel("Ime majke");
	      lblImeMajke.setBounds(215, 257, 140, 14);
	      panel.add(lblImeMajke);
	      
	      lblUlica = new JLabel("Ulica");
	      lblUlica.setBounds(215, 290, 140, 14);
	      panel.add(lblUlica);
	      
	      lblBoj = new JLabel("Broj");
	      lblBoj.setBounds(215, 321, 140, 14);
	      panel.add(lblBoj);
	      
	      lblMesto = new JLabel("Mesto");
	      lblMesto.setBounds(215, 350, 140, 14);
	      panel.add(lblMesto);
	      
	      textField_20 = new JTextField();
	      textField_20.setBounds(10, 416, 195, 20);
	      panel.add(textField_20);
	      textField_20.setColumns(10);
	      
	      lblDrzava = new JLabel("Drzava");
	      lblDrzava.setBounds(215, 383, 140, 14);
	      panel.add(lblDrzava);
	      
	      lblPostanskiBroj = new JLabel("Postanski broj");
	      lblPostanskiBroj.setBounds(215, 419, 140, 14);
	      panel.add(lblPostanskiBroj);
	      
	      lblNewLabel_1 = new JLabel("Broj telefona");
	      lblNewLabel_1.setBounds(570, 14, 140, 14);
	      panel.add(lblNewLabel_1);
	      
	      lblBrojMobilnog = new JLabel("Broj mobilnog");
	      lblBrojMobilnog.setBounds(570, 45, 140, 14);
	      panel.add(lblBrojMobilnog);
	      
	      lblEmail = new JLabel("Email");
	      lblEmail.setBounds(570, 76, 140, 14);
	      panel.add(lblEmail);
	      
	      lblWwwUri = new JLabel("WWW uri");
	      lblWwwUri.setBounds(570, 107, 140, 14);
	      panel.add(lblWwwUri);
	      
	      lblDatumUpisa = new JLabel("Datum upisa");
	      lblDatumUpisa.setBounds(570, 138, 140, 14);
	      panel.add(lblDatumUpisa);
	      
	      lblSmer = new JLabel("Smer");
	      lblSmer.setBounds(570, 169, 140, 14);
	      panel.add(lblSmer);
	      
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });
	      mainFrame.setVisible(true);  
	   }
}
