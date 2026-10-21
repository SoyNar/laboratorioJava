public class Kata4 {

    /**
     * Validador de horarios
     *
     * */

   public static void main(String[] args) {


       //pedir dia y hora
       int day = ConsoleScanner.readInt("Escribe el día");
       int hour = ConsoleScanner.readInt("Escribe la hora ");

       //validar dia
       if (day < 1 || day > 7){
           System.out.println("El dia es invalido");
           return;
       }

       if(hour < 1 || hour > 23){
           System.out.println( "Hora invalida");
           return;

       }

       boolean open = false;

      String schedule =  switch (day){
           case 1,2,3,4,5 -> "Horario de lunes a viernes: 6:00 AM - 8:00 PM";
            case 6 -> "Horario de 7 a, a 2 pm";

            case  7 ->  "Cerrado todo el día";
          default -> "";

       };

      switch (day) {
          case 1,2,3,4,5 -> open  = hour >= 6 && hour < 20;
          case 6 -> open = hour >= 7 && hour < 14;
          case 7 -> open = false;
      }

       String mesagge = open  ?  " La Cafeteria está abierta " : "La Cafeteria está cerrada";
       System.out.println(mesagge);
       System.out.println(schedule);

    ConsoleScanner.close();

   }



}
