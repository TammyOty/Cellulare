import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        /*
        Dobbiamo simulare un telefono cellulare
        Il telefono deve gestire:
Abbiamo una variabile credito che si scarica ad ogni minuto di chiamata di 0.50 €
Inizialmente la variabile è inizializzata con 5 €
La chiamata si puo' fare solo se il credito è > di 1 € altrimenti si deve ricaricare
Le chiamate avranno una durata che va da minimo 1 (minuto ) a massimo 3 (minuti)
Quindi in tre minuti scarica 0.5 X 3 = 1.5 euro
Per gestire il telefono simuliamo il menu di scelta ciclico e mettiamo tra una opzione
quella di spegnere il telefono (S)
a) le chiamate ( random dura da 1 minuto a 3 )
b) la ricarica --> carica il credito
c) la visualizzazione del credito --> stampa il credito
d) spegne il cellulare (esce dal menu)
         */

        Cellularer cellularer = new Cellularer("Samsung","Tim");
        //creiamo un oggetto utilità
       // Utilita utilita = new Utilita(); posso scrivere anche solo

       Utilita utilita = new Utilita();
       utilita.menu(cellularer);


    }
}