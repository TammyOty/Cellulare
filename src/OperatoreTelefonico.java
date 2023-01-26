public class OperatoreTelefonico {
    //IMPLEMENTIAMO CODICE:
    //- possibilità di estrarre i dati di chiamate (durata, costo e credito residuo)
    //usiamo arrays ---> dimensionati a 50 telefonate (max 50 chiamate),
    // uno x durata , uno x costo
    int dimensione = 50; //dimensione array
    int durata [] = new int[dimensione];
    float costo[] = new float[dimensione];

    Cellularer cellularer;
    private int indexArray = 0;

    public OperatoreTelefonico() {

        cellularer = new Cellularer("Samsung", "Tim");
    }

  /*  public void registra (){ //QUESTO METODO NON REGISTRA
        durata[indexArray] = cellularer.getDurata(); //durata letta dalla variabile durata di cellulare
        costo[indexArray] = cellularer.getCostoChiamata();
        //indexArray++;
        //passare agli array i valori */


  //  }
    public void reportDati (){
        System.out.println("Totale minuti e costi");
        int durataChiamata = 0;
        float costoTotale = 0.0f;
        for (int i = 0; i < dimensione; i++){
            durataChiamata = durataChiamata + durata[i];
            costoTotale = costoTotale + costo[i];
        }
        System.out.println("Durata minuti conversazione: " + durataChiamata);
        System.out.println("Totale costo chiamate: "+ costoTotale);
    }

    public void mostraTotale(int durata[]){

        int sommaDurata = 0;

        for (int i = 0; i < durata.length; i++) {

            sommaDurata += durata[i];


        }
        System.out.println(" la durata totale delle tue chiamate è: " + sommaDurata + ".");

    }
   /* public void mostraCosto( float costo[]){

        float sommaCosto = 0.0f;

        for (int i = 0; i < costo.length; i++) {

            sommaCosto += costo[i];

        }
        System.out.println(" Il costo totale delle tue chiamate è: " + sommaCosto + "."); } */





}
