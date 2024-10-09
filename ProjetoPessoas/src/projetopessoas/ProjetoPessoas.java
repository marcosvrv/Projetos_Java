package projetopessoas;

public class ProjetoPessoas {

    public static void main(String[] args) {
        /*Pessoa p1 = new Pessoa();
        *Aluno p2 = new Aluno();
        *Professor p3 = new Professor();
        *Funcionario p4 = new Funcionario();
        *
        *p1.setNome("Marcos");
        *p1.setIdade(23);
        *p1.setSexo("M");
        *
        *p2.setNome("Caroline");
        *p2.setIdade(21);
        *p2.setSexo("F");
        *
        *p3.setNome("Marcone");
        *p3.setIdade(50);
        *p3.setSexo("M");
        *
        *p4.setNome("Edileine");
        *p4.setIdade(50);
        *p4.setSexo("F");
        *
        *p2.setCurso("Informática");
        *p3.setSalario(2500.75f);
        *p4.setSetor("Secretaria");
        *
        *System.out.println(p1.toString());
        *System.out.println(p2.toString());
        *System.out.println(p3.toString());
        *System.out.println(p4.toString());*/
        
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1122);
        b1.setNome("Maria");
        b1.setBolsa(15.0f);
        b1.setSexo("F");
        b1.pagarMensalidade();
        
        Tecnico t1 = new Tecnico();
        t1.setNome("João");
        t1.setRegistroProfissional(2222);
        t1.praticar();
        
    }
    
}
