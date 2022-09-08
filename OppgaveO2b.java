package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO2b {

	public static void main(String[] args) {

		for (int i = 0; i <10; i++) {
			String karakter = showInputDialog("Skriv din poengsum(0-100) " + "("+ i +")");
			int x = parseInt(karakter);
			if (x<=100 && x>=90)showMessageDialog(null,"Karakter:A");
			if (x<=89 && x>=80)showMessageDialog(null,"Karakter:B");
			if (x<=79 && x>=60)showMessageDialog(null,"Karakter:C");
			if (x<=59 && x>=50)showMessageDialog(null,"Karakter:D");
			if (x<=49 && x>=40)showMessageDialog(null,"Karakter:E");
			if (x<=39 && x>=0)showMessageDialog(null,"Karakter:F");
			if (x<=-1 || x>=101)showMessageDialog(null,"Ugyldig verdi, skriv poengsum på nytt");
		} 

	}

}