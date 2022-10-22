public class Jobb {

    public  static void jobb(){
        System.out.println("Podaj liczbe przepracowanych godzin w tym miesiacu");
        double hour=CalcApp.sc.nextDouble();
        System.out.println("Podaj stawke godzinowa");
        double hourlyRate=CalcApp.sc.nextDouble();
        System.out.println("Podaj kwote premi");
        double bonus= CalcApp.sc.nextDouble();
        System.out.println("Podaj typ umowy");
        printContractType();

         ContractType contractType ;
       contractType=ContractType.createInt(CalcApp.sc.nextInt());
     System.out.println(  contractType.getDESCRYPTION());



            switch (contractType){

                case UMOWA_O_PRACE :

                     Calc.payCalculator(hour,hourlyRate,bonus);


                    break;
                case UMOWA_ZLECENIE:
                    Calc.payCalculator(hour,hourlyRate,bonus);

                break;
                case UMOWA_O_DZIELO:
                 Calc.payCalculator(hour,hourlyRate,bonus);
                 break;



            }
        }

    private static void printContractType(){
        for (ContractType typ:ContractType.values()
             ) {
            System.out.println(typ);

        }
    }
}
