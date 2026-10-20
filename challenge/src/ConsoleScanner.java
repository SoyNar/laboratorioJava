import java.util.Locale;
import java.util.Scanner;

public class ConsoleScanner {

    private static final Scanner scanner = new Scanner(System.in);
    static {
        scanner.useLocale(Locale.US);
    }
    private ConsoleScanner(){}

    public static  double readDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public static  int readInt (String prompt){
        System.out.println(prompt);
        return  scanner.nextInt();

    }

    public static String readText(String prompt){
        System.out.println(prompt);
        return  scanner.next();
    }

    public  static  String readLine(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static  void  close(){
        scanner.close();
    }
}
