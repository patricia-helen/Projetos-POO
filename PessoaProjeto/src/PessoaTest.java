/**
 *
 * @author pat
 */
import java.util.Scanner;

public class PessoaTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Pessoa pessoa = new Pessoa();
        pessoa.displayMessage();// Chama o método  sem passar o nome
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        pessoa.displayMessage(nome); // Chama o método passando  o nome digitado
        
        //Testa os métodos get e set 
        
        pessoa.setNomePessoa(nome);
        System.out.println("O nome da pessoa é: " + pessoa.getNomePessoa());
        
       
    }
    
}
