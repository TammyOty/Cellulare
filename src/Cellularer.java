import java.util.Scanner;

public class Cellularer {

    //proprietà
    private final float COSTO = 0.50f;
    private float credito;
    private String modelloCellulare;
    private String gestoreCellulare;
    private int durata;
    private float costoChiamata;

    int sommaDurata ;

    float sommaCosto ;
    Scanner sc;
    OperatoreTelefonico operatoreTelefonico;
    // creiamo un oggetto con le proprietà inizializzate
    //generiamo costruttore


    public Cellularer(String modelloCellulare, String gestoreCellulare) {
        this.credito = 5;
        this.modelloCellulare = modelloCellulare;
        this.gestoreCellulare = gestoreCellulare;
         sc = new Scanner(System.in);
    }
//metodi get per leggere proprietà, con metodo get esporto all'esterno della classe le proprietà del cellulare


    public int getDurata() {
        return durata;
    }

    public float getCostoChiamata() {
        return costoChiamata;
    }

    //metodi della classe
    public void ricarica (){
        System.out.println("inserisci importo ricarica ( min 5 euro, max 50 euro");
        int importoRicarica = sc.nextInt();
        if (importoRicarica >= 5 && importoRicarica <=500){
            credito = credito + importoRicarica;
            System.out.println("Ricarica effettuata di: " + importoRicarica);

        }else {
            System.out.println("La ricarica non è andata a buon fine");
        }

    }
    public void mostraCredito(){
        System.out.printf("Credito residuo è: " + credito);
    }

    public void recuperaDati (){ //modello e gestore telefonico
        System.out.println("Modello telefono: "+ modelloCellulare +"\nGestore in uso: "+ gestoreCellulare );
    }
    public void spegniCellulare(){
        System.out.println("Telefono in fase di chiusura");
        System.exit(0);
    }

    public void gestioneTelefonata(){
        operatoreTelefonico = new OperatoreTelefonico();
        //se il credito > 1 puoi chiamare
        //random x la chiamata da 1 a 3  (simulazione durata chiamata)
        //scarichiamo il costo della chiamata dal credito residuo
    float costoChiamata = 0;
    //3 minuti
    if (credito >= 1) {
        int durata = (int) ((Math.random() * 3) + 1);
        costoChiamata = durata * COSTO;
        int limiteChiamata = (int) (credito / costoChiamata);//limite chiamata
       // if (limiteChiamata >= credito){
            credito = credito - costoChiamata;
        System.out.println("Durata della chiamata: " + durata);
        System.out.println("Costo della chiamata: " + costoChiamata);

      // operatoreTelefonico.registra();
          /*  for (int i = 0; i < operatoreTelefonico.durata.length; i++) {

                if (operatoreTelefonico.durata[i] == 0){

                    operatoreTelefonico.durata[i]= durata;
                    break;

                }

            } for (int i = 0; i < operatoreTelefonico.costo.length; i++) {

                if (operatoreTelefonico.costo[i] == 0){

                    operatoreTelefonico.costo[i]= costoChiamata;
                    break;

                }

            }*/
            sommaCosto += costoChiamata;
            sommaDurata += durata;

        mostraCredito();
    }
        else{
           // durata = limiteChiamata;
            costoChiamata = durata * COSTO;
            System.out.println("Durata della chiamata: "+ durata);
            System.out.println("Costo della chiamata: " + costoChiamata);
            mostraCredito();
       // }
    }
   /* else {
        System.out.println("Credito insufficiente");
    System.out.println("Ricarica");

    */
  //  }}


    /*
    if(credito>=1){
            int durata= (int) (Math.random()*limiteChiamata+1);
            costoChiamata=durata*COSTO;
            credito-=COSTO;
            System.out.printf("Durata della chiamata: %d\n Costo della chiamata: %.2f", durata, costoChiamata);
        }

     */
    }}

