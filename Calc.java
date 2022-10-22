public class Calc {
   static private double lacznaLiczbaGodzin;
   static public double stawkaGodzinowa;
   static private double pramia;


    public static double payCalculator( double lacznaLiczbaGodzin,double stawkaGodzinowa,double pramia) {
        double sum = (lacznaLiczbaGodzin * stawkaGodzinowa) + pramia;
        System.out.println( "Twoja wyplata to "+sum+" zl");
        return sum;



    }
}
