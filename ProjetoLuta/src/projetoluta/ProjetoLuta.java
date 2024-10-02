package projetoluta;

public class ProjetoLuta {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Benoit Sait-Denis", "França", 28, 1.80f, 69.9f, 11, 2, 1);
        l[1] = new Lutador("Charles Oliveira", "Brasil", 34, 1.78f, 70.0f, 14, 2, 3);
        l[2] = new Lutador("Colby Covington", "EUA", 36, 1.81f, 76.5f, 12, 2, 1);
        l[3] = new Lutador("Leon Edwards", "Inglaterra", 31, 1.88f, 77.0f, 13, 0, 2);
        l[4] = new Lutador("Marcos Rogério de Lima", "Brasil", 39, 1.85f, 118.0f, 5, 4, 3);
        l[5] = new Lutador("Daniel Cormier", "EUA", 45, 1.84f, 114.1f, 9, 5, 3);
        
        Luta ufc01 = new Luta();
        ufc01.marcarLuta(l[4], l[5]);
        ufc01.lutar();
        
        l[0].Status();
        l[1].Status();
    }
    
}
