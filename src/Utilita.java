import java.util.Arrays;
import java.util.Scanner;

/**
 * Gestione delle utilità su cellulare
 @version 1.0
 @author tamim
 */


public class Utilita {
    //implementiamo un metodo che richiama il menu
    Scanner sc = new Scanner(System.in);

   // OperatoreTelefonico op = new OperatoreTelefonico();
    public void menu (Cellularer objCellulare){
        //gestire chiamata, ricarica, stampa del credito
        System.out.println("Benvenuto. Cellulare in funzione");
        do {
            System.out.println("\nFunzione: ");
            System.out.println("T] Telefonata");
            System.out.println("M] Mostra credito");
            System.out.println("R] Ricarica");
            System.out.println("D] Mostra modello e gestore");
            System.out.println("E] Esci (Spegni cellulare");
            System.out.println("F] Mostra totale");
            System.out.println("Funzione scelta: ");
            String decisione = sc.next();
            char scelta = decisione.charAt(0);
            switch (scelta){
                case 't': objCellulare.gestioneTelefonata();
                    //System.out.println(Arrays.toString(op.durata));
                    break;
                case 'm': objCellulare.mostraCredito();
                    break;
                case 'r': objCellulare.ricarica();
                    break;
                case 'd': objCellulare.recuperaDati();
                    break;
                case 'e': objCellulare.spegniCellulare();
                    break;
                case 'f':
                    System.out.println("Durata tot: " + objCellulare.sommaDurata);
                    System.out.println("Costo tot: " + objCellulare.sommaCosto);
                   break;
                default:
                    System.out.println("input scelta errato");
            }

        }
        while (true);


    }


}
