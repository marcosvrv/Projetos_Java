package projetopessoas;

public abstract class Pessoa {
    // Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    
    // Métodos
    public void fazerAniv(){
        this.idade++;
    }
    
    // Métodos Especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Dados{" + "nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + '}';
    }

    
}
