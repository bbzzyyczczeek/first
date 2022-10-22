public enum ContractType {
    UMOWA_O_PRACE(0,"Umowa o prace"),UMOWA_ZLECENIE(1,"Umowa zlecenie"),UMOWA_O_DZIELO(2,"Umowa o dzielo");
    private final int TYP;
    private final String DESCRYPTION;

    ContractType(int TYP, String DESCRYPTION) {
        this.TYP = TYP;
        this.DESCRYPTION = DESCRYPTION;
    }

    public int getTYP() {
        return TYP;
    }

    public String getDESCRYPTION() {
        return DESCRYPTION;
    }
    static ContractType createInt(int typ){
        return ContractType.values()[typ];

    }

    @Override
    public String toString() {
        return
                 TYP +" - "+
               DESCRYPTION ;
    }
}

