public class Kata2 {
    /**
     * Ejercicio sobre clasificación de bebidas
     * centralcé el escaner para no repetirlo en todas las clases
     *
     * */
    public  static  void  main(String[] args){


        String name = ConsoleScanner.readLine("Escribí el  nombre de la bebida porfa:");
        double temp = ConsoleScanner.readDouble("Dame la temperatura de la bebida porfa:");
        String clasification = "";


        if(temp > 60){
             clasification = "Caliente";
        } else if (temp >= 30) {
            clasification =  "Templada";

        }else {
             clasification =  "Fria";
        }
        System.out.println( name + ": " + clasification);

        ConsoleScanner.close();

    }
    //cerrar el scaner


}
