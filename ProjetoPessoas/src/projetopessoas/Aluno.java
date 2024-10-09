package projetopessoas;

public class Aluno extends Pessoa {
    //ATRIBUTOS
    private int matricula;
    private String curso;
    
    //Métodos
    public void cancelarMatricula(){
        System.out.println("Matrícula será cancelada!");
    }
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do(a) aluno(a) " + this.nome + ".");
    }
    
    
    //Métodos Especiais

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    }

    
    
    
    

