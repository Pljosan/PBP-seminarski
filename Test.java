import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test {
	 private JFrame mainFrame;
	 private JTextField textField;
	 private JTextField textField_1;

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
	      mainFrame.setSize(522,400);
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
	      panel.setBounds(10, 73, 486, 277);
	      mainFrame.getContentPane().add(panel);
	      panel.setLayout(null);
	      
	      textField_1 = new JTextField();
	      textField_1.setBounds(10, 11, 116, 20);
	      panel.add(textField_1);
	      textField_1.setColumns(10);
	      
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });
	      mainFrame.setVisible(true);  
	   }
}
