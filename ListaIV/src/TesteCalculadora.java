/**
 *
 * @author pat
 */
public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Soma de 2 e 3: " + calc.somar(2, 3));
        System.out.println("Soma de 2, 3 e 4: " + calc.somar(2, 3, 4));
        System.out.println("Soma de 2.5 e 3.5: " + calc.somar(2.5, 3.5));
    }
}
