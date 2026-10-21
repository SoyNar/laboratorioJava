public class Kata3 {

    /**
     * calculadora de pedidos con iva
     * el usuario ingresa el precio de los producrtos
     * el programa calcula el total
     * */

    public static void main(String[] args){
      double subototal = 0;
      double priceProduct;



        do {
             priceProduct = ConsoleScanner.readDouble("Ingresa el precio del producto (introduce cero para conocer el total y salir)");
             if(priceProduct > 0){
                 subototal += priceProduct;


             }else if(priceProduct < 0){
                 System.out.println("Error el precio de los productos debe ser mayor a cero");
             }

        }while(priceProduct != 0);

        double iva = subototal * 0.19;
        double totalWithIva = subototal + iva;

        if(totalWithIva > 50000){
            double discount = totalWithIva * 0.10;
            double totalFinal = totalWithIva - discount;

            System.out.println("Subtotal: $" + String.format("%.0f", subototal));
            System.out.println("Iva (19%): $" + String.format("%.0f", iva));
            System.out.println("Total con iva: $" + String.format("%.0f", totalWithIva));
            System.out.println("Descuento: $" + String.format("%.0f", discount));
            System.out.println("Total a pagar: $" + String.format("%.0f", totalFinal));
        }else {
            System.out.println("Subtotal $:" + String.format("%.0f",subototal));
            System.out.println("Iva (19%): $" + String.format("%.0f", iva));
            System.out.println("Total a pagar: $" + String.format("%.0f", totalWithIva));

        }
        ConsoleScanner.close();


        }

}
