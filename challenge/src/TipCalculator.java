public class TipCalculator {

    /**
     * Ejercicio Kata 1 Calculador de propina
     *  x > 0.3 mensagge -> propina generosa
     * x < 0.05 propina muy baja
     *  si 0.05 <= x <= 0.3 no muestra nada
     * */

    private final double total;
    private  final double percent;

    public TipCalculator(double total, double percent){
        this.total = total;
        this.percent = percent;

    }


    public boolean validPercent(){
        return  percent >= 0 && percent <= 100;
    }

    public boolean isValidTotal(){
        return  total > 0;
    }

    public double calulateTip(){
       return   total * percent / 100;
    }

    public double totalToPay(){
        return total + calulateTip();
    }

    public String getMessage(){
        if(percent > 30){
            return "propina generosa";
        } else if (percent < 5 ) {
            return  "Propina muy baja";
            
        }
        return "";
    }






}
