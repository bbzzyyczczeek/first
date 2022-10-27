public class SchollArays {


    public static void TeacherAcademy() {
        Teacher teacher[] = new Teacher[3];
        teacher[0] = new Teacher(Teacher.getNumberId(), "Jan", "Kowalski", "Lublin",
                "8300300");
        teacher[1] = new Teacher(Teacher.getNumberId(), "Janina", "Kowalskiowa", "Lubin",
                "8300300");
        teacher[2] = new Teacher(Teacher.getNumberId(), "Janusz", "Czarnota", "Warszawa",
                "8300300");
        for (Teacher t : teacher
        ) {
            System.out.println(t);

        }
    }
    public static void student() {
        Student students[] = new Student[3];
        students[0] = new Student(Teacher.getNumberId(), "Janina", "Kowalska", "Rzeszow",
                "903983", "5a");
        students[1] = new Student(Teacher.getNumberId(), "Jan", "Nowak", "Gdynia",
                "903983", "3c");
        students[2] = new Student(Teacher.getNumberId(), "Olaf", "Kowalski", "Radom",
                "903983", "1a");

        for (Student s : students
        ) {
            System.out.println(s);

        }
    }
    public static void academy(){
        Academy academys[]=new Academy[2];
        academys[0]=new Academy(Teacher.getNumberId(),"Teb"," Kielce","Szkola internetowa");
        academys[1]=new Academy(Teacher.getNumberId(),"Teb"," Warszawa","Szkola Stacjonarna");
        for (Academy a:academys
             ) {
            System.out.println(a);

        }

    }

}
