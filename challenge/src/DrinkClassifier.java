public class DrinkClassifier {

    private final String name;
    private  final double temp;


    private DrinkClassifier(String name,double temp){
        this.name = name;
        this.temp = temp;
    }

    public String getName (){
        return  name;
    }

    public  String getMessage(){
        if(temp >= 30 && temp <= 60 ){
            return  "Templada";
        } else if ( temp < 30 ) {
            return "Fría";
        }
        return  "Caliente";
    }


}
