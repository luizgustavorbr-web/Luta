
package exercicio02.pkg16_05;
public class Exercicio0216_05 {
    public static void main(String[] args) {
        Lutador l1 = new Lutador("João", "Brasil", 30, 1.75f, 68.9f, 10, 2, 1);
        Lutador l2 = new Lutador("Carlos", "México", 28, 1.80f, 69.5f, 9, 3, 2);

        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l1, l2);
        UFC01.lutar();

        l1.status();
        l2.status();
    }
}
