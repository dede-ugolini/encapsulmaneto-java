public class Aluno {
    private String aluno;
    private int matricula;
    private double notaFinal;

    public Aluno(String nome, int matricula, double notaFinal){
        aluno = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }
    public void setNotaFinal(double notaFinal){
        this.notaFinal = notaFinal;
    }
    public boolean situacaoAluno(double notaFinal){
        boolean aprovado;
        if (notaFinal >= 7) {
            aprovado = true;
            return aprovado;
        }
        else {
            aprovado = false;
            return aprovado;
        }
    }
    public void setName(String name){
        aluno = name;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public String getName(){
        return aluno;
    }
    public int getMatricula(){
        return matricula;
    }
    public String getAprovado(){
        if (situacaoAluno(notaFinal)) {
            return "Aprovado";
        }
        return "Reprovado";
    }
    public void info(){
        System.out.println("Nome do aluno: "+getName()+". Número da matricula: "+getMatricula()+". Situação do Aluno "+getAprovado());
    }
    public static void main(String args[]){
        Aluno aluno = new Aluno("Dedé", 20253120, 10);  
        aluno.info();
    }
}
