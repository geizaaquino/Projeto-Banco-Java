import java.util.Scanner;

public class Main {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		
		input = new Scanner(System.in);
		
		int op ;
		int oc;
		Conta cp = null;
		Conta cc =null;
		
		do {
		
		System.out.println("1 - Abrir conta ");

		System.out.println("4 - Saldo ");
		System.out.println("5 - Sair ");
		op = input.nextInt();
		
		if(op==1) {
			
			System.out.println("Qual o tipo de conta?\n1 - Poupanca\n2 - Corrente ");
			oc = input.nextInt();
			if(oc==1) {
				cp = new ContaPoupanca();
			
			
			}else {
				cc = new ContaCorrente();
			}
			
			System.out.println("Conta criada com sucesso!");
			}else if(op==2) {
				
			
			}else if(op==3) {
			
			}else if(op==4) {
			System.out.println("Qual o tipo de conta?\n1 - Poupanca\n2 - Corrente ");
			oc = input.nextInt();
			if(oc==1) {
				System.out.println("Saldo da conta poupança: "+cp.getSaldo());
				
			
			
			}else {
				System.out.println("Saldo da conta corrente: "+cc.getSaldo());
				System.out.println("Qual o valor do saque?");
			 
			}
		}
		
	}while(op!=5);
}
}


