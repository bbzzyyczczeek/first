public class Student extends Teacher{
    private String clas;

    public Student(int id, String firstName, String lastName, String city, String pesel, String clas) {
        super(id, firstName, lastName, city, pesel);
        this.clas = clas;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Klasa:" + clas ;
    }
}
