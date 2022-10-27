public class Academy extends Teacher{
    //id, nazwa, miejscowość, opis
    private  String name;
    private  String despription;

    public Academy(int id, String name, String city, String despription) {
        super(id, city);
        this.name=name;
        this.despription = despription;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDespription() {
        return despription;
    }

    public void setDespription(String despription) {
        this.despription = despription;
    }

    @Override
    public String toString() {
        return  "id:"+ super.getId()+" Nazwa:"+name+
                " Opis:" + despription ;
    }
}

