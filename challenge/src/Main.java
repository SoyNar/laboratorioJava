import javax.imageio.plugins.tiff.TIFFDirectory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    /**
     * Ejercicio calculador de propinas, uso una clase centralizada para el scanner
     * */
    double total = ConsoleScanner.readDouble("Ingrese porfavor el total:");
    double percentage = ConsoleScanner.readDouble("Ingrese el porcentaje porfavor");

    var calculator = new TipCalculator(total,percentage);
    if (!calculator.isValidTotal()){
        System.out.println("Total invalido deberia ser mayor a cero");
        return;
    }
    if ((!calculator.validPercent())){
        System.out.println("Error porcentaje no valido");
        return;
    }

        System.out.printf("propina : $%.0f%n", calculator.calulateTip());
        System.out.printf("Total a pagar: $%.0f%n", calculator.totalToPay());
        String message = calculator.getMessage();
        if(!message.isEmpty()){
            System.out.println(message);
        }
    }




}