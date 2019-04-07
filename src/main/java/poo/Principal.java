package poo;

/**
 * Neste método é informado tempo: horas, minutos e segundos
 *
 * @author Joseane Bortoli
 */
public class Principal {
    public static void main(String[] args) {

        Tempo a = new Tempo(07,20,12);
        Tempo b = new Tempo(12,45,23);
        Tempo c = new Tempo(13,0,0);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

        System.out.println(a.setHora(1));
        System.out.println(a.setMinuto(30));
        System.out.println(a.setSegundos(59));

        System.out.println(a.toString());

        System.out.println(a.setFullHora(12, 35, 00));

        System.out.println(a.toString());

        //Teste
        System.out.println("A diferença entre: " + a + " e " + b + " é de:" + a.diferenca(b)+ " Segundos");

        System.out.println(c+ " hora(s) em segundos é: "+ c.toSeconds());
    }
}