package rw.ac.rca.webapp.orm;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "marks")
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int marksId;
    @Column
    @NotNull
    private int totalMarks;
    @Column
    @NotNull
    private int marksScored;
    @Column
    @NotNull
    private char gradeGotten;
    @Column
    @NotNull
    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;
    @Column
    @NotNull
    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;

    public Marks(){

    }

    public Marks(int totalMarks, int marksScored, char gradeGotten, Course course, Student student) {
        this.totalMarks = totalMarks;
        this.marksScored = marksScored;
        this.gradeGotten = gradeGotten;
        this.course = course;
        this.student = student;
    }

    public int getMarksId() {
        return marksId;
    }

    public void setMarksId(int marksId) {
        this.marksId = marksId;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public int getMarksScored() {
        return marksScored;
    }

    public void setMarksScored(int marksScored) {
        this.marksScored = marksScored;
    }

    public char getGradeGotten() {
        return gradeGotten;
    }

    public void setGradeGotten(char gradeGotten) {
        this.gradeGotten = gradeGotten;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
