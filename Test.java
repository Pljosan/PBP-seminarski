import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;

import java.io.*;

public class Test {
	 private JFrame mainFrame;
	 private JPanel panel;
	 private JTextField textField;
	 private JLabel lblError;
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
	 
	 private Connection con;
	 private String indeks;
	 private JButton btnPrint;
	 
	   static {
		   try {
			   Class.forName("com.ibm.db2.jcc.DB2Driver");
		   } catch(Exception e){
			   e.printStackTrace();
		   }
	   }	 
	 
	   public Test(){
	      prepareGUI();
	   }
	   
	   public static void main(String[] args){
		  Test studentInfo = new Test();     
	   }
	   
	   private void prepareGUI(){
		  //connection iz java sql
		  con = null;
		  String url = "jdbc:db2://localhost:50001/VSTUD";
			
		  try {
			  con = DriverManager.getConnection(url, "student", "abcdef");
			  System.out.println("Connected!");
			
		   
		      mainFrame = new JFrame("Podaci o studentu");
		      mainFrame.setResizable(false);
		      mainFrame.getContentPane().setBackground(new Color(175, 238, 238));
		      mainFrame.setSize(756,586);
		      mainFrame.getContentPane().setLayout(null);
		      
		      JLabel lblInfo = new JLabel("Unesite broj indeksa studenta");
		      lblInfo.setBounds(10, 11, 241, 23);
		      mainFrame.getContentPane().add(lblInfo);
		      
		      textField = new JTextField();
		      textField.setBounds(20, 37, 86, 20);
		      mainFrame.getContentPane().add(textField);
		      textField.setColumns(10);
		      
		      lblError = new JLabel("neispravan format indeksa!");
		      lblError.setForeground(new Color(255, 0, 0));
		      lblError.setBounds(117, 40, 240, 14);
		      mainFrame.getContentPane().add(lblError);
		      
		      JButton btnChoose = new JButton("Izaberi!");
		      btnChoose.setBounds(566, 36, 89, 23);
		      mainFrame.getContentPane().add(btnChoose);
		      
		      panel = new JPanel();
		      panel.setBackground(new Color(175, 238, 238));
		      panel.setBounds(10, 73, 720, 463);
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
		      btnSaveChanges.setBounds(556, 377, 160, 23);
		      panel.add(btnSaveChanges);
		      
		      btnPrint = new JButton("Ispisi u datoteku");
		      btnPrint.setBounds(556, 415, 160, 23);
		      panel.add(btnPrint);
	
	
			  //------------------------------
			  //----------- LOGIKA -----------
			  //------------------------------
		      
		   	  panel.setVisible(false);
			  lblError.setVisible(false);
			  
			  btnChoose.addActionListener(new ActionListener(){
				  public void actionPerformed(ActionEvent e) {
					  indeks = textField.getText();
					  
					  //ako ne postoji u bazi, isto prikazi
					  					  
					  try {
						String selectInd = "select indeks " +
										   "from dosije " +
					  					   "where indeks = ?";  
						PreparedStatement s = con.prepareStatement(selectInd);
						

						if(indeks.length() != 8 || indeks.matches("\\d+") == false){
							lblError.setText("neispravan format indeksa!");
							lblError.setVisible(true);
							return;
						}
						
						
						s.setString(1, indeks);
						ResultSet res = s.executeQuery();
						
						if(!res.next()){
							lblError.setText("nema studenta sa tim indeksom!");
							lblError.setVisible(true);
							return;
						}
						
						else{
							String selectInfo = "select ime, prezime, pol, jmbg, " +
												" datum_rodjenja, mesto_rodjenja, " +
												" drzava_rodjenja, ime_oca, " +
												" ime_majke, ulica_stanovanja, " +
												" kucni_broj, mesto_stanovanja, " +
												" postanski_broj, drzava_stanovanja, " +
												" telefon, mobilni_telefon, " +
												" email, 'www uri', datum_upisa, " +
												" naziv " +
												"from dosije d join smer s " +
												"	on d.id_smera = s.id_smera " +
												"where indeks = ?";
							
							s = con.prepareStatement(selectInfo);
							s.setString(1, indeks);
							res = s.executeQuery();
							
							res.next();
							
							fillInfo(res);
							
						    panel.setVisible(true);
						    lblError.setText("");
						    lblError.setVisible(false);
						    
						}
					  } catch (SQLException e1) {
						  e1.printStackTrace();
					  }
					  
					  
					
				  }

				private void fillInfo(ResultSet res) {
					try {
						tfIme.setText(res.getString("ime").trim());
						tfPrezime.setText(res.getString("prezime").trim());
						tfPol.setText(res.getString("pol").compareTo("z") == 0 ? "Zenski" : "Muski");
						tfJmbg.setText(res.getString("jmbg"));
						tfDatumRodjenja.setText(res.getString("datum_rodjenja"));
						tfMestoRodjenja.setText(res.getString("mesto_rodjenja"));
						tfDrzavaRodjenja.setText(res.getString("drzava_rodjenja"));
						tfImeOca.setText(res.getString("ime_oca"));
						tfImeMajke.setText(res.getString("ime_majke"));
						tfUlica.setText(res.getString("ulica_stanovanja"));
						tfBroj.setText(res.getString("kucni_broj"));
						tfMesto.setText(res.getString("mesto_stanovanja"));
						tfDrzava.setText(res.getString("drzava_stanovanja"));
						tfPostanskiBroj.setText(res.getString("postanski_broj"));
						tfBrojTelefona.setText(res.getString("telefon"));
						tfBrojMobilnog.setText(res.getString("mobilni_telefon"));
						tfEmail.setText(res.getString("email"));
						tfWww.setText(res.getString(18));
						tfDatumUpisa.setText(res.getString("datum_upisa"));
						tfSmer.setText(res.getString("naziv").trim());
						
					     ArrayList<JTextField> tfs = new ArrayList<>();
					     tfs.add(tfIme);
					     tfs.add(tfPrezime);
					     tfs.add(tfPol);
					     tfs.add(tfJmbg);
					     tfs.add(tfImeOca);
					     tfs.add(tfImeMajke);
					     tfs.add(tfDatumRodjenja);
					     tfs.add(tfMestoRodjenja);
					     tfs.add(tfDrzavaRodjenja);
					     tfs.add(tfUlica);
					     tfs.add(tfBroj);
					     tfs.add(tfMesto);
					     tfs.add(tfDrzava);
					     tfs.add(tfPostanskiBroj);
					     tfs.add(tfBrojTelefona);
					     tfs.add(tfBrojMobilnog);
					     tfs.add(tfEmail);
					     tfs.add(tfWww);
					     tfs.add(tfDatumUpisa);
					     tfs.add(tfSmer);
					     
					     for(JTextField t : tfs){
					    	t.getDocument().addDocumentListener(new DocumentListener(){
								public void insertUpdate(DocumentEvent e) {
									btnPrint.setEnabled(false);
								}
								public void removeUpdate(DocumentEvent e) {
									btnPrint.setEnabled(false);					
								}
								public void changedUpdate(DocumentEvent e) {
									btnPrint.setEnabled(false);						
								}
					    		
					    	});
					     };		
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			  });	      
	  
			  
			  btnPrint.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String no = indeks.substring(4);
					String year = indeks.substring(2, 4);
					String datName = "mi" + year + no + ".txt";
					
					//mozda bi bilo naaajbolje da ovo bude citanje iz baze
					//ili nekako onemoguciti print bez commita
					//ako se nesto promenilo
					try(PrintWriter out = new PrintWriter(Files.newBufferedWriter(Paths.get(datName), StandardCharsets.UTF_8))){
						out.println("Ime:\t\t\t\t\t" + tfIme.getText());
						out.println("Prezime:\t\t\t\t" + tfPrezime.getText());
						out.println("JMBG:\t\t\t\t\t" + tfJmbg.getText());
						out.println("Pol:\t\t\t\t\t" + (tfPol.getText().compareTo("z") == 0 ? "Zenski" : "Muski"));	
						out.println("Ime oca:\t\t\t\t" + tfImeOca.getText());
						out.println("Ime majke:\t\t\t\t" + tfImeMajke.getText());
						out.println("Datum rodjenja:\t\t\t" + tfDatumRodjenja.getText());
						out.println("Mesto rodjenja:\t\t\t" + tfMestoRodjenja.getText());
						out.println("Drzava rodjenja:\t\t" + tfDrzavaRodjenja.getText());
						out.println("Ulica stanovanja:\t\t" + tfUlica.getText());
						out.println("Kucni broj:\t\t\t\t" + tfBroj.getText());
						out.println("Mesto stanovanja:\t\t" + tfMesto.getText());
						out.println("Drzava stanovanja:\t\t" + tfDrzava.getText());
						out.println("Postanski broj:\t\t\t" + tfPostanskiBroj.getText());
						out.println("Broj telefona:\t\t\t" + tfBrojTelefona.getText());
						out.println("Broj mobilnog:\t\t\t" + tfBrojMobilnog.getText());
						out.println("Email:\t\t\t\t\t" + tfEmail.getText());
						out.println("WWW uri:\t\t\t\t" + tfWww.getText());
						out.println("Datum upisa:\t\t\t" + tfDatumUpisa.getText());
						out.println("Broj indeksa:\t\t\t" + textField.getText());
						out.println("Smer:\t\t\t\t\t" + tfSmer.getText());
						
						
					} catch(IOException e1){
						e1.printStackTrace();
					}
				} 
			  });
			  
			  btnSaveChanges.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					//commituj izmene
					btnPrint.setEnabled(true);
				}
				  
			  });
			  
			  //------------------------------
			  //----------- LOGIKA -----------
			  //------------------------------
	
			  
		      mainFrame.addWindowListener(new WindowListener() {
		         public void windowClosing(WindowEvent windowEvent){
		            try {
						con.close();
						System.out.println("Disconnected!");
					} catch (SQLException e) {
						e.printStackTrace();
					}
		            System.exit(0);
		         }
		         
				 public void windowOpened(WindowEvent e) {}
				 public void windowClosed(WindowEvent e) {}
				 public void windowIconified(WindowEvent e) {}
				 public void windowDeiconified(WindowEvent e) {}
				 public void windowActivated(WindowEvent e) {}
				 public void windowDeactivated(WindowEvent e) {}   
				
		      });
		      
		      mainFrame.setVisible(true);  
		      
		      
		      
		  } catch(SQLException e){
			  e.printStackTrace();
		  }
	   }
}