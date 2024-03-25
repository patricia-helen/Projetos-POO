
/**
 *
 * @author pat
 */
public class Pessoa {
    private String nomePessoa;
    
    public void displayMessage(){
        System.out.println("Eu sou uma pessoa");
    }
    //Modificado para aceitar  um nome como parâmetro
    public void displayMessage(String nome){
       System.out.println("Olá, sou uma pessoa e meu nome é: " + nome);
        }
    // Métodos get e set  para nomePessoa
    public String getNomePessoa(){
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa){
        this.nomePessoa = nomePessoa;
    }
}
