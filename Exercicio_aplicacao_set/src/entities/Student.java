package entities;

import java.util.Objects;

public class Student {

    private String course;
    private Integer studentCode;

    public Student(String course, Integer studentCode) {
        this.course = course;
        this.studentCode = studentCode;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(Integer studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStudentCode().equals(student.getStudentCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentCode());
    }
}
