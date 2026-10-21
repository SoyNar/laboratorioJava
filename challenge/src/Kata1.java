public class Kata1 {


    /**
     * Ejercicio Kata 1 Calculador de propina
     *  x > 0.3 mensagge -> propina generosa
     * x < 0.05 propina muy baja
     *  si 0.05 <= x <= 0.3 no muestra nada
     *  centralicé el scanner en una clase para no repetirlo en todas partes
     * */


    public static void main(String[] args){

        double total = ConsoleScanner.readDouble("Ingrese el total porfa:");
        double percentage = ConsoleScanner.readDouble("Ingree porfa el porcentaje:");

        if(total<=0){
            System.out.println("Error el total debe ser mayor a cero");
            return;

        }

        if(percentage < 0 || percentage > 100){
            System.out.println("Error porcentaje no valido ");
            return;
        }

        double tip = total * percentage /100;
        double totalToPay = total + tip;

        System.out.println("propina: " + tip);
        System.out.println("Total a pagar: " + totalToPay);

        if(percentage > 30 ){
            System.out.println("Propina generosa");
        } else if (percentage < 5) {
            System.out.println("Propina muy baja");

        }
        ConsoleScanner.close();
    }
}
