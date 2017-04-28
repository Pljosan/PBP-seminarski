import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
	//student info variables
	Student student;
			
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Dosije");
		
		student = new Student();
		
		//choose student stage
		Button btnChoose = new Button("Izaberi studenta");
		TextField tfIndexInput = new TextField();
		tfIndexInput.setMaxWidth(100);
		Label lblError = new Label();
		lblError.setTextFill(Color.CRIMSON);
		
		HBox input = new HBox(5);
		input.getChildren().addAll(tfIndexInput, lblError);
		
		VBox chooseBox = new VBox(10);
		chooseBox.setPadding(new Insets(20, 20, 20, 20));
		chooseBox.setAlignment(Pos.CENTER);
		chooseBox.getChildren().addAll(input, btnChoose);
		
		Scene chooseScene = new Scene(chooseBox, 300, 175);
		primaryStage.setScene(chooseScene);
		primaryStage.show();
		
		
		//edit/print student info stage 
		Label lblIndex = new Label();
		lblIndex.setText("Indeks: ");
		TextField tfIndex = new TextField();
		
		Label lblSmer = new Label();
		lblSmer.setText("Smer: ");
		TextField tfSmer = new TextField();
		
		Label lblJmbg = new Label();
		lblJmbg.setText("Jmbg: ");
		TextField tfJmbg = new TextField();
		
		
		
		Label lblIme = new Label();
		lblIme.setText("Ime: ");
		TextField tfIme = new TextField();
		
		Label lblPrezime = new Label();
		lblPrezime.setText("Prezime: ");
		TextField tfPrezime = new TextField();
		
		Label lblPol = new Label();
		lblPol.setText("Pol: ");
		TextField tfPol = new TextField();
		
		
		
		Label lblDatumRodj = new Label();
		lblDatumRodj.setText("Datum rodjenja: ");
		TextField tfDatumRodj = new TextField();
		
		Label lblMestoRodj = new Label();
		lblMestoRodj.setText("Mesto rodjenja: ");
		TextField tfMestoRodj = new TextField();
		
		Label lblDrzavaRodj = new Label();
		lblDrzavaRodj.setText("Drzava rodjenja: ");
		TextField tfDrzavaRodj = new TextField();
		
		
		
		Label lblImeOca = new Label();
		lblImeOca.setText("Ime oca: ");		
		TextField tfImeOca = new TextField();
		
		Label lblImeMajke = new Label();
		lblImeMajke.setText("Ime majke: ");
		TextField tfImeMajke = new TextField();
		
		
		
		Label lblUlica = new Label();
		lblUlica.setText("Ulica: ");
		TextField tfUlica = new TextField();
		
		Label lblBroj = new Label();
		lblBroj.setText("Broj: ");
		TextField tfBroj = new TextField();
		tfBroj.setMaxWidth(45);
		
		HBox ulicaBroj = new HBox(2);
		ulicaBroj.getChildren().addAll(lblUlica, tfUlica, lblBroj, tfBroj);
		
		Label lblMesto = new Label();
		lblMesto.setText("Mesto: ");
		TextField tfMesto = new TextField();
		
		Label lblPostanskiBroj = new Label();
		lblPostanskiBroj.setText("Postanski broj: ");
		TextField tfPostanskiBroj = new TextField();
		tfPostanskiBroj.setMaxWidth(50);
		
		Label lblDrzava = new Label();
		lblDrzava.setText("Drzava: ");
		TextField tfDrzava = new TextField();

		HBox drzavaBroj = new HBox(2);
		drzavaBroj.getChildren().addAll( lblDrzava, tfDrzava, lblPostanskiBroj, tfPostanskiBroj);

		
		Label lblTelefon = new Label();
		lblTelefon.setText("Broj telefona: ");
		TextField tfTelefon = new TextField();
		
		Label lblMobilni = new Label();
		lblMobilni.setText("Broj mobilnog: ");
		TextField tfMobilni = new TextField();
		
		Label lblEmail = new Label();
		lblEmail.setText("Email: ");
		TextField tfEmail = new TextField();
		
		Label lblWww = new Label();
		lblWww.setText("WWW uri: ");
		TextField tfWww = new TextField();
		
		
		
		Label lblDatumUpisa = new Label();
		lblDatumUpisa.setText("Datum upisa: ");
		TextField tfDatumUpisa = new TextField();
		
		HBox firstRow = new HBox(10);
		firstRow.getChildren().addAll(lblIndex, tfIndex, lblSmer, tfSmer, lblJmbg, tfJmbg);
		
		HBox secondRow = new HBox(10);
		secondRow.getChildren().addAll(lblIme, tfIme, lblPrezime, tfPrezime, lblPol, tfPol);
		
		HBox thirdRow = new HBox(10);
		thirdRow.getChildren().addAll(lblDatumRodj, tfDatumRodj, lblMestoRodj, tfMestoRodj, lblDrzavaRodj, tfDrzavaRodj);
		
		HBox fourthRow = new HBox(10);
		fourthRow.getChildren().addAll(lblImeOca, tfImeOca, lblImeMajke, tfImeMajke);
		
		HBox fifthRow = new HBox(10);
		fifthRow.getChildren().addAll(ulicaBroj, lblMesto, tfMesto, drzavaBroj);
		
		HBox sixthRow = new HBox(10);
		sixthRow.getChildren().addAll(lblTelefon, tfTelefon, lblMobilni, tfMobilni);

		HBox seventhRow = new HBox(10);
		seventhRow.getChildren().addAll(lblEmail, tfEmail, lblWww, tfWww);
		
		HBox eightRow = new HBox(10);
		eightRow.getChildren().addAll(lblDatumUpisa, tfDatumUpisa);
		
		VBox infoBox = new VBox(20);
		infoBox.setPadding(new Insets(20, 20, 20, 20));
		infoBox.getChildren().addAll(firstRow, secondRow, thirdRow, fourthRow, fifthRow, sixthRow, seventhRow, eightRow);
		
		Scene infoScene = new Scene(infoBox, 900, 400);		
		Stage infoStage = new Stage();
		infoStage.setTitle("Informacije o studentu");
		infoStage.setScene(infoScene);
		
		//when choosing a student
		btnChoose.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				String ind = tfIndexInput.getText();
				if(ind.length() != 8 || ind.matches("\\d+") == false){
					lblError.setText("Pogresan format indeksa!");
				}
				//TODO: ovde proveri da li indeks postoji u bazi
//				else if (student ne postoji u bazi)
//					lblError.setText("Student sa indeksom " + ind + " ne postoji u bazi");
				else{
					Main.this.student.setIndex(Integer.parseInt(ind));
					primaryStage.close();
					
					//TODO: ovde select * from dosije i popuni polja
					
					infoStage.show();
					
					tfJmbg.requestFocus();
				}	
			}
			
		});
		

	}

}
