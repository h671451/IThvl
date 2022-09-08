package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

  public static void main(String[] args) {
    String heltall = showInputDialog("skriv inn n");

    long n = Integer.parseInt(heltall);
    long fakultet = n;
    System.out.print(n + "! = " + n);
    
    do {
      fakultet--;
      n = n * fakultet;
      System.out.print("*" + fakultet);
      
    } while (fakultet != 1);
    System.out.print(" = " + n);

  }

}
