package exerciciosCursoUdemy.POO.student;

public class Student {
    private String nome;
    private int g1;
    private int g2;
    private int g3;

    public Student(String nome, int g1, int g2, int g3){
        this.nome = nome;
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
    }

    public int finalGrade(){
        return g1 + g2 + g3;
    }

    public boolean isAproved(){
        if (this.finalGrade() >= 60){
            return true;
        } else {
            return false;
        }
    }

    public int missingPoints(){
        if(this.finalGrade() < 60){
            return 60 - this.finalGrade();
        } else {
            return 0;
        }
    }
}
