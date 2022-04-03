package entities;

public class Student {
    public String estudante;
    public double notas1;
    public double notas2;
    public double notas3;

    public double finalGrade(){
        return notas1 + notas2 + notas3;
    }
    public double missingPoints(){
        if (finalGrade() < 60){
            return 60 - finalGrade();
        }
        else {
            return 0.0;
        }
    }
    public String status(){
        if (finalGrade()< 60){
            return "reproved";
        }
        else {
            return "passed";
        }
    }
}
