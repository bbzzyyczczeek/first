public class Teacher {

    // id, imie, nazwisko, miejscowość, pesel
    private static int numberId=1;
    private int id;
    private String firstName;
    private String lastName;
    private String city;
    private String pesel;

    public Teacher(int id) {
        this.id = id;
        numberId++;

    }

    public Teacher(int id,String city) {
        this.id = id;
        this.city=city;
        numberId++;
    }

    public Teacher(int id, String firstName, String pesel) {
        this.id = id;
        this.firstName = firstName;
        this.pesel = pesel;
        numberId++;
    }

    public Teacher(int id, String firstName, String lastName, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        numberId++;
    }

    public Teacher(int id, String firstName, String lastName, String city, String pesel) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.pesel = pesel;
        numberId++;
    }

    public int getId() {
        return id;
    }

    public static int getNumberId() {
        return numberId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return
                "id:" + id +
                " Imie:" + firstName +
                " Nazwisko:" + lastName +
                " Miasto:" + city +
                " pesel:" + pesel;
    }
}
