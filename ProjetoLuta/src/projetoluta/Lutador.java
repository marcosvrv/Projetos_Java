package projetoluta;

public class Lutador {

    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Métodos
    public void apresentar() {
        System.out.println("----------------------------------------------------");
        System.out.println("CHEGOU A HORA!");
        System.out.println("Apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamemte da(o): " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + "m de altura");
        System.out.println("Pesando: " + this.getPeso() + "kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
        System.out.println("----------------------------------------------------");
    }
    
    public void Status() {
        System.out.println("----------------------------------------------------");
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vez(es)");
        System.out.println("Perdeu " + this.getDerrotas() + " vez(es)");
        System.out.println("Empatou " + this.getEmpates() + " vez(es)");
        System.out.println("----------------------------------------------------");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    // Métodos Especiais
    public Lutador(String no, String nac, int id, float alt, float pe, int vit, int der, int emp) {
        this.nome = no;
        this.nacionalidade = nac;
        this.idade = id;
        this.altura = alt;
        this.setPeso(pe);
        this.vitorias = vit;
        this.derrotas = der;
        this.empates = emp;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2f) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3f) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9f) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2f) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
