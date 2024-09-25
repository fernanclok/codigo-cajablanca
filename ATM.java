import java.util.Scanner;
class  accountBank {
    double cuenta_deposito,cuenta_retiro,balance_banco=0;
    int account_number=1324538965;
    String nameAccount;
    Scanner scanner = new Scanner(System.in);
    void changecustomer_name() {
        System.out.println("cual es tu nombre?");
        nameAccount = scanner.nextLine();
    }
    void checkaccount_number() {
      System.out.println("tu numero de cuenta es:"+account_number);
    }
    void checkbalance() {
        System.out.println("tu saldo es:"+balance_banco);
    }
    void deposito()
    {
     System.out.println("cuanto desea depositar?");
     cuenta_deposito = scanner.nextDouble();
     if (cuenta_deposito > 0 ) {
        balance_banco = balance_banco + cuenta_deposito;
        this.checkbalance(); 
     }
     else System.out.println("tu operacion no puede ser realizada. Ingresa un numero mayor a 0");
    }
    void retiro()
    {
        System.out.println("cuanto desea retirar?");
        cuenta_retiro = scanner.nextDouble();
        if (cuenta_retiro > 0 && cuenta_retiro <= balance_banco) {
            balance_banco = balance_banco - cuenta_retiro;
            this.checkbalance();
        } else System.out.println("tu operacion no puede ser realizada. Ingresa un numero mayor a 0 y menor a tu cuenta bancaria");
        
}
public class ATM{
    public static void main(String[] args) {
        
      Scanner in = new Scanner(System.in);
        accountBank hola = new accountBank();    
        int respuesta;
         hola.changecustomer_name();
         hola.checkaccount_number();
         do {
           System.out.println("que desea ralizar 1)checar saldo 2)retirar 3)depositar 4)salir");
           respuesta = in.nextInt();
           switch (respuesta){
               case 1: System.out.println("saldo");
              hola.checkbalance();
              break;

              case 2: System.out.println("retirar");
              hola.retiro();
              break;

              case 3: System.out.println("depositar");
              hola.deposito();
              break;
             case 4: System.out.println("vuelva pronto!");
              break;
              default: System.out.println("seleccione una opcion valida");
              break;
            }
         } while(respuesta !=4);
    }
}
}