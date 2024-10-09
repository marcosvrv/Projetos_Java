package projetopessoas;

public class Tecnico extends Aluno {

    protected int registroProfissional;
    
    public void praticar(){
        System.out.println("O técnico " + this.nome + " do registro " + this.registroProfissional + " está praticando.");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
