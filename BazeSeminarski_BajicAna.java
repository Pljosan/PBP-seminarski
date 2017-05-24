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
	private JLabel lblDatumUpisa;
	private JLabel lblSmer;
	private JButton btnChooseAnother;
	private JButton btnChoose;
	
	private Connection con;
	private String indeks;
	private JButton btnPrint;
	private JTextField tfIdSmera;

	//pripremanje drajvera
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
		con = null;
		String url = "jdbc:db2://localhost:50001/VSTUD";
			
		try {
			//konektovanje
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
			 
			btnChoose = new JButton("Izaberi!");
			btnChoose.setBounds(396, 36, 160, 23);
			mainFrame.getContentPane().add(btnChoose);
			  
			panel = new JPanel();
			panel.setBackground(new Color(175, 238, 238));
			panel.setBounds(10, 83, 720, 463);
			mainFrame.getContentPane().add(panel);
			panel.setLayout(null);
			  
			tfIme = new JTextField();
			tfIme.setBounds(10, 11, 195, 20);
			panel.add(tfIme);
			tfIme.setColumns(10);
			  
			tfPrezime = new JTextField();
			tfPrezime.setBounds(365, 11, 195, 20);
			panel.add(tfPrezime);
			tfPrezime.setColumns(10);
			  
			tfPol = new JTextField();
			tfPol.setBounds(10, 42, 195, 20);
			panel.add(tfPol);
			tfPol.setColumns(10);
			
			tfJmbg = new JTextField();
			tfJmbg.setBounds(365, 42, 195, 20);
			panel.add(tfJmbg);
			tfJmbg.setColumns(10);
			
			tfDatumRodjenja = new JTextField();
			tfDatumRodjenja.setBounds(10, 140, 195, 20);
			panel.add(tfDatumRodjenja);
			tfDatumRodjenja.setColumns(10);
			  
			tfMestoRodjenja = new JTextField();
			tfMestoRodjenja.setBounds(365, 140, 195, 20);
			panel.add(tfMestoRodjenja);
			tfMestoRodjenja.setColumns(10);
			
			tfDrzavaRodjenja = new JTextField();
			tfDrzavaRodjenja.setBounds(10, 171, 195, 20);
			panel.add(tfDrzavaRodjenja);
			tfDrzavaRodjenja.setColumns(10);
			
			tfImeOca = new JTextField();
			tfImeOca.setBounds(10, 109, 195, 20);
			panel.add(tfImeOca);
			tfImeOca.setColumns(10);
			
			tfImeMajke = new JTextField();
			tfImeMajke.setBounds(365, 109, 195, 20);
			panel.add(tfImeMajke);
			tfImeMajke.setColumns(10);
			  
			tfUlica = new JTextField();
			tfUlica.setBounds(10, 238, 195, 20);
			panel.add(tfUlica);
			tfUlica.setColumns(10);
			  
			tfBroj = new JTextField();
			tfBroj.setBounds(365, 238, 195, 20);
			panel.add(tfBroj);
			tfBroj.setColumns(10);
			
			tfMesto = new JTextField();
			tfMesto.setBounds(10, 269, 195, 20);
			panel.add(tfMesto);
			tfMesto.setColumns(10);
			
			tfDrzava = new JTextField();
			tfDrzava.setBounds(365, 269, 195, 20);
			panel.add(tfDrzava);
			tfDrzava.setColumns(10);
			 
			tfBrojTelefona = new JTextField();
			tfBrojTelefona.setBounds(365, 300, 195, 20);
			panel.add(tfBrojTelefona);
			tfBrojTelefona.setColumns(10);
			
			tfBrojMobilnog = new JTextField();
			tfBrojMobilnog.setBounds(10, 331, 195, 20);
			panel.add(tfBrojMobilnog);
			tfBrojMobilnog.setColumns(10);
			  
			tfEmail = new JTextField();
			tfEmail.setBounds(365, 331, 195, 20);
			panel.add(tfEmail);
			tfEmail.setColumns(10);
			  
			tfDatumUpisa = new JTextField();
			tfDatumUpisa.setBounds(10, 398, 195, 20);
			panel.add(tfDatumUpisa);
			tfDatumUpisa.setColumns(10);
			  
			tfSmer = new JTextField();
			tfSmer.setBounds(10, 427, 195, 20);
			panel.add(tfSmer);
			tfSmer.setColumns(10);
			  
			JLabel lblNewLabel = new JLabel("Ime");
			lblNewLabel.setForeground(new Color(0, 0, 0));
			lblNewLabel.setBounds(215, 14, 140, 14);
			panel.add(lblNewLabel);
			  
			JLabel lblPrezime = new JLabel("Prezime");
			lblPrezime.setBounds(570, 14, 140, 14);
			panel.add(lblPrezime);
			  
			JLabel lblPol = new JLabel("Pol");
			lblPol.setBounds(215, 45, 140, 14);
			panel.add(lblPol);
			  
			JLabel lblJmbg = new JLabel("JMBG");
			lblJmbg.setBounds(570, 45, 140, 14);
			panel.add(lblJmbg);
			  
			JLabel lblDatumRodjenja = new JLabel("Datum rodjenja");
			lblDatumRodjenja.setBounds(215, 143, 140, 14);
			panel.add(lblDatumRodjenja);
		      
			JLabel lblMestoRodjenja = new JLabel("Mesto rodjenja");
			lblMestoRodjenja.setBounds(570, 143, 140, 14);
			panel.add(lblMestoRodjenja);
  
			lblDrzavaRodjenja = new JLabel("Drzava rodjenja");
			lblDrzavaRodjenja.setBounds(215, 174, 140, 14);
			panel.add(lblDrzavaRodjenja);
  
			lblImeOca = new JLabel("Ime oca");
			lblImeOca.setBounds(215, 112, 140, 14);
			panel.add(lblImeOca);
  
			lblImeMajke = new JLabel("Ime majke");
			lblImeMajke.setBounds(570, 112, 140, 14);
			panel.add(lblImeMajke);
			  
			lblUlica = new JLabel("Ulica");
			lblUlica.setBounds(215, 241, 140, 14);
			panel.add(lblUlica);
			  
			lblBoj = new JLabel("Broj");
			lblBoj.setBounds(570, 241, 140, 14);
			panel.add(lblBoj);
			  
			lblMesto = new JLabel("Mesto");
			lblMesto.setBounds(215, 272, 140, 14);
			panel.add(lblMesto);
			  
			tfPostanskiBroj = new JTextField();
			tfPostanskiBroj.setBounds(10, 302, 195, 20);
			panel.add(tfPostanskiBroj);
			tfPostanskiBroj.setColumns(10);
			  
			lblDrzava = new JLabel("Drzava");
			lblDrzava.setBounds(570, 272, 140, 14);
			panel.add(lblDrzava);
			  
			lblPostanskiBroj = new JLabel("Postanski broj");
			lblPostanskiBroj.setBounds(215, 305, 140, 14);
			panel.add(lblPostanskiBroj);
			  
			lblNewLabel_1 = new JLabel("Broj telefona");
			lblNewLabel_1.setBounds(570, 303, 140, 14);
			panel.add(lblNewLabel_1);
		      
			lblBrojMobilnog = new JLabel("Broj mobilnog");
			lblBrojMobilnog.setBounds(215, 334, 140, 14);
			panel.add(lblBrojMobilnog);
			 
			lblEmail = new JLabel("Email");
			lblEmail.setBounds(570, 334, 140, 14);
			panel.add(lblEmail);
			  
			lblDatumUpisa = new JLabel("Datum upisa");
			lblDatumUpisa.setBounds(215, 401, 140, 14);
			panel.add(lblDatumUpisa);
			
			lblSmer = new JLabel("Smer");
			lblSmer.setBounds(215, 430, 140, 14);
			panel.add(lblSmer);
			  
			JButton btnSaveChanges = new JButton("Sacuvaj izmene");
			btnSaveChanges.setBounds(556, 398, 160, 23);
			panel.add(btnSaveChanges);
			  
			btnPrint = new JButton("Ispisi u datoteku");
			btnPrint.setBounds(556, 427, 160, 23);
			panel.add(btnPrint);
			
			tfIdSmera = new JTextField();
			tfIdSmera.setBounds(269, 427, 86, 20);
			panel.add(tfIdSmera);
			tfIdSmera.setColumns(10);
			  
			btnChooseAnother = new JButton("Izaberi novog!");
			btnChooseAnother.setBounds(566, 36, 160, 23);
			mainFrame.getContentPane().add(btnChooseAnother);


  
  
  
			//------------------------------
			//------------------------------
			//----------- LOGIKA -----------
			//------------------------------
			//------------------------------
		   	  
		    tfSmer.setEditable(false);
			panel.setVisible(false);
			lblError.setVisible(false);
			btnChooseAnother.setEnabled(false);
			  
			//dugme kojim se bira sledeci student
			btnChooseAnother.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					btnChoose.setEnabled(true);
					textField.setEditable(true);
					textField.setText("");
					panel.setVisible(false);
					btnChooseAnother.setEnabled(false);
					//obrada jednog studenta je jedna transakcija
					//da li onda ovde treba commit?
					//posto vec postoji neki dole kod upadetova
//					try {
//						con.commit();
//					} catch (SQLException e1) {
//						e1.printStackTrace();
//					}
				}
			});
			  
			//dugme kojim se ispisuju podaci o studentu sa unetim indeksom
			btnChoose.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					btnPrint.setEnabled(true);
					  
					//procita se indeks
					indeks = textField.getText();
					try {
						String selectInd = "select indeks " +
										   "from dosije " +
										   "where indeks = ?";  
						PreparedStatement s = con.prepareStatement(selectInd);
						
						//provera formata
						if(indeks.length() != 8 || indeks.matches("\\d+") == false){
							lblError.setText("neispravan format indeksa!");
							lblError.setVisible(true);
							return;
						}
						
						s.setString(1, indeks);
						ResultSet res = s.executeQuery();
						
						//provera da li dati indeks postoji u bazi
						if(!res.next()){
							lblError.setText("nema studenta sa tim indeksom!");
							lblError.setVisible(true);
							s.close();
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
												" email, datum_upisa, " +
												" naziv, d.id_smera " +
												"from dosije d join smer s " +
												"	on d.id_smera = s.id_smera " +
												"where indeks = ?";
							
							s = con.prepareStatement(selectInfo);
							s.setString(1, indeks);
							res = s.executeQuery();
							
							res.next();
							
							//popunjavaju se textfields podacima
							fillInfo(res, s);
							
							panel.setVisible(true);
							lblError.setText("");
							lblError.setVisible(false);
							btnChoose.setEnabled(false);
							btnChooseAnother.setEnabled(true);
							
							s.close();
							res.close();
						} //end else
						textField.setEditable(false); //indeks ne sme da se menja
						if(lblError.isVisible())
							textField.setEditable(true);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
				} //end action performed

				private void fillInfo(ResultSet res, PreparedStatement s) {
					try {
						try{
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
							tfDatumUpisa.setText(res.getString("datum_upisa"));
							tfSmer.setText(res.getString("naziv").trim());
							tfIdSmera.setText(res.getString("id_smera"));
						} catch(SQLException e3){
							//citaju se podaci iz baze, pa proveravamo da li mozemo da im pristupimo
							if(e3.getErrorCode() == -911 || e3.getErrorCode() == -913){
								System.out.println("Objekat je zakljucan");
								res.close();
								con.rollback();
								System.out.println("Rollback");
								res = s.executeQuery();
							}
						}
						//proverava se da li je doslo do promene nekog polja
						//ako jeste, ispis u datoteku se onemoguci
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
						tfs.add(tfDatumUpisa);
						tfs.add(tfIdSmera);

						btnPrint.setEnabled(true);
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
					
				} //end fill info 
			}); //end btnChoose action listener
	  
			//dugme za ispis u datoteku
			btnPrint.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String datName = indeks + ".txt"; //postavlja se ime datoteke
					
					try(PrintWriter out = new PrintWriter(Files.newBufferedWriter(Paths.get(datName), StandardCharsets.UTF_8))){
						out.println("Ime:\t\t\t\t\t" + tfIme.getText());
						out.println("Prezime:\t\t\t\t" + tfPrezime.getText());
						out.println("JMBG:\t\t\t\t\t" + tfJmbg.getText());
						out.println("Pol:\t\t\t\t\t" + tfPol.getText());	
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
						out.println("Datum upisa:\t\t\t" + tfDatumUpisa.getText());
						out.println("Broj indeksa:\t\t\t" + textField.getText());
						out.println("Smer:\t\t\t\t\t" + tfSmer.getText());
						out.println("ID smera:\t\t\t\t" + tfIdSmera.getText());
						
						JOptionPane.showMessageDialog(null, "Podaci su upisani u datoteku!");
					} catch(IOException e1){
						e1.printStackTrace();
					}
				} 
			}); //end btnPrint action listener
			  
			//dugme kojim se promenjeni podaci upisuju u bazu
			btnSaveChanges.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					try {
						String update = "update dosije " +
								   "set ime = ?, " +
								   "	prezime = ?, " +
								   "	pol = ?, " +
								   "	jmbg = ?, " +
								   "	datum_rodjenja = ?, " +
								   "	mesto_rodjenja = ?, " +
								   "	drzava_rodjenja = ?, " +
								   "	ime_oca = ?, " +
								   "	ime_majke = ?, " +
								   "	ulica_stanovanja = ?, " +
								   "	mesto_stanovanja = ?, " +
								   "	kucni_broj = ?, " +
								   "	drzava_stanovanja = ?, " +
								   "	telefon = ?, " +
								   "	mobilni_telefon = ?, " +
								   "	email = ?, " +
								   "	datum_upisa = ?, " +
								   "	postanski_broj = ?, " +
								   "	id_smera = ? " +
								   "where indeks = ?";
				
						PreparedStatement s2;
						
						String pol = Character.toString(tfPol.getText().charAt(0)).toLowerCase();
						
						s2 = con.prepareStatement(update);
						s2.setString(1, tfIme.getText());
						s2.setString(2, tfPrezime.getText());
						s2.setString(3, pol);
						s2.setString(4, tfJmbg.getText());
						s2.setString(5, tfDatumRodjenja.getText());
						s2.setString(6, tfMestoRodjenja.getText());
						s2.setString(7, tfDrzavaRodjenja.getText());
						s2.setString(8, tfImeOca.getText());
						s2.setString(9, tfImeMajke.getText());
						s2.setString(10, tfUlica.getText());
						s2.setString(11, tfMesto.getText());
						s2.setString(12, tfBroj.getText());
						s2.setString(13, tfDrzava.getText());
						s2.setString(14, tfBrojTelefona.getText());
						s2.setString(15, tfBrojMobilnog.getText());
						s2.setString(16, tfEmail.getText());
						s2.setString(17, tfDatumUpisa.getText());
						s2.setString(18, tfPostanskiBroj.getText());
						s2.setString(19, tfIdSmera.getText());
						s2.setString(20, textField.getText());
					
						try{
							s2.executeUpdate();
							System.out.println("Updated!");
							s2.close();
							con.commit();
							JOptionPane.showMessageDialog(null, "Izmenjeni podaci su upisani u bazu!");
						} catch(SQLException e3){
							//ako ne mozemo da dobijemo X katanac 
							if(e3.getErrorCode() == -911 || e3.getErrorCode() == -913){
								System.out.println("Objekat je zakljucan");
								con.rollback();
								System.out.println("Rollback");
							}
						}
						
						//potrebno je promeniti naziv smera kad se promeni id
						String selectNewSmer = "select naziv " +
											   "from dosije d join smer s " +
											   "	on d.id_smera = s.id_smera " +
											   "where indeks = ?";
						PreparedStatement s3 = con.prepareStatement(selectNewSmer);
						s3.setString(1, indeks);
						ResultSet res1 = s3.executeQuery();
						res1.next();
						try{	
							tfSmer.setText(res1.getString("naziv").trim());
							res1.close();
						} catch(SQLException e3){
							//s katanac je potreban za citanje novog naziva smera
							if(e3.getErrorCode() == -911 || e3.getErrorCode() == -913){
								System.out.println("Objekat je zakljucan");
								res1.close();
								con.rollback();
								System.out.println("Rollback");
								res1 = s3.executeQuery();
							}
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
					//izmene su sacuvane pa moze da se pise u datoteku
					btnPrint.setEnabled(true); 
				}
			}); //end btnSaveChanges action listener
			  
			  
			//------------------------------
			//------------------------------
			//----------- LOGIKA -----------
			//------------------------------
			//------------------------------
  
			  
			  
			  
			mainFrame.addWindowListener(new WindowListener() {
				//kad se prozor zatvori, raskida se konekcija sa bazom
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
			}); //end mainFrame window listener
		      
			mainFrame.setVisible(true);  
		    
			
		} catch(SQLException e){
			e.printStackTrace();
		}
	} //end prepare gui
}