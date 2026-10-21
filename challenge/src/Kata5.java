public class Kata5 {

    /**
     * Menu interactivo con switch
     * */


    public static void  main (String[] args){
        int option = 7;
        int total = 0;
         final int COFFE_PRICE = 4000;
         final int MUFFIN_PRICE = 3500;
         final  int SANDWITCH = 7500;
         final int JUICE = 5000;
         final  int TE = 3000;
        do {
            System.out.println("""
        --- Menú de la Cafetería ---
        1. Café ($4.000)
        2. Muffin ($3.500)
        3. Sandwich ($7.500)
        4. Jugo ($5.000)
        5. Té ($3.000)
        6. Salir
        """);
            option = ConsoleScanner.readInt("Selecciona una opcion del 1 al 6");
            switch (option){
                case 1 -> {
                    System.out.println(" Producto agregado Café: 4.000");
                    total += COFFE_PRICE;
                }
                case 2 -> {
                    System.out.println(" Producto agregado Muffin : $3500");
                    total +=  MUFFIN_PRICE;
                }
                case 3 -> {
                    System.out.println(" Producto agregado Sandwutch: $7.500");
                    total += SANDWITCH;
                }
                case 4 -> {
                    System.out.println(" Producto agregado Jugo: 5.000");
                    total += JUICE;
                }
                case 5 -> {
                    System.out.println(" Producto agregado Té : $3.000");
                    total  += TE;
                }
                case 6 -> {
                    System.out.println(" total pedido: $" + String.format("%,d", total));
                }
                default -> System.out.println("Opción inválida");

            }

        } while (option != 6);

        ConsoleScanner.close();
    }
}
