package pl.pjatk.OktWic.model;

public class Homework {

    public Homework() {
    }

    private String subject;
    private String grade;

    public Homework(String subject, String grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
