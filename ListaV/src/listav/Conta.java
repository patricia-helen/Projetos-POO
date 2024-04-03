
package listav;

public class Conta {
    private static int  totalDeContas;
    
    Conta(){
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }  
    
    public static int  getTotalDeContas(){
        return Conta.totalDeContas;
    }
    
}
