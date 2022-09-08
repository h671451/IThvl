package no.hvl.dat100;
import java.util.Scanner;
public class OppgaveO1 {

	public static void main(String[] args) {
		try (Scanner num = new Scanner(System.in)) {
			System.out.println("skriv inn din bruttoinntekt");
			double brutto = num.nextDouble();
			
			double trinn1 = brutto/100 * 0.93;
			double trinn2 = brutto/100 * 2.41;
			double trinn3 = brutto/100 * 11.52;
			double trinn4 = brutto/100 * 14.52;


			if (brutto >164101 && brutto<230950 ){
				System.out.println("Din trinnskatt(1) er " + trinn1 + "kr med 0,93% sats");
			} else {
				
				if (brutto > 230951 && brutto<580650) {
					System.out.println("Din trinnskatt(2) er " + trinn2 + "kr med 2,41% sats");
				} else {
					
					if (brutto >580651 && brutto<934050) {
						System.out.println("Din trinnskatt(3) er " + trinn3 + "kr med 11,52% sats" );
					} else {
						if (brutto >934051) {
							System.out.println("Din trinnskatt(4) er " + trinn4 + "kr med 14,52% sats" );

						} else {
							if (brutto<164100) {
								System.out.println("Ingen trinnskatt");
							}
						}
					}
				}

			}
		}
			
	}
	
}

			