public class Grades extends Teacher{
    private  String grades;
    private String comment;

    public Grades(int id, String grades, String comment) {
        super(id);
        this.grades = grades;
        this.comment = comment;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "id:"+ super.getId()+
                " Ocena:" + grades +
                " Komentarz do oceny:" + comment
                ;
    }
}
