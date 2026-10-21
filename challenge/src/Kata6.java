import java.util.Locale;

public class Kata6 {

    public static void main(String[] args) {
        int totalClients = 0;
        int hoursCount = 0;
        int peakHour = -1;
        int maxClients = -1;

        int hour = ConsoleScanner.readInt("Ingresa la hora (0-23, -1 para terminar)");

        while (hour != -1) {

            if (hour < 0 || hour > 23) {
                System.out.println("Hora inválida");
                hour = ConsoleScanner.readInt("Ingresa la hora (0-23, -1 para terminar)");
                continue;
            }

            int clients = ConsoleScanner.readInt("Ingresa el número de clientes en esa hora");

            if (clients < 0) {
                System.out.println("Número de clientes inválido");
                hour = ConsoleScanner.readInt("Ingresa la hora (0-23, -1 para terminar)");
                continue;
            }

            totalClients += clients;
            hoursCount++;

            if (clients > maxClients) {
                maxClients = clients;
                peakHour = hour;
            }

            hour = ConsoleScanner.readInt("Ingresa la hora (0-23, -1 para terminar)");
        }

        if (hoursCount == 0) {
            System.out.println("No se ingresaron datos");
            return;
        }

        double average = (double) totalClients / hoursCount;

        System.out.println("--- Reporte de Clientes ---");
        System.out.println("Total de clientes: " + totalClients);
        System.out.println("Promedio por hora: " + String.format(Locale.US, "%.2f", average));
        System.out.println("Hora con más clientes: " + peakHour + " (" + maxClients + " clientes)");
    }
}