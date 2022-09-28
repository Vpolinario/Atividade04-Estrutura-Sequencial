package Atts_Montanha;
import java.util.Scanner;

public class att4 {
	public static void main (String[] args){
		Scanner scanner = new Scanner (System.in);
		
		double prova1 = 0, prova2 = 0, prova3 = 0, mediaNota;
		
		System.out.println("Digite a nota da primiera prova:");
		prova1 = scanner.nextDouble();
		
		System.out.println("Digite a nota da segunda prova: ");
		prova2 = scanner.nextDouble();
		
		System.out.println("Digite a nota da terceira prova: ");
		prova3 = scanner.nextDouble();
		
		mediaNota = prova1 + prova2 + prova3 /3;
		
		
		System.out.println("A media das notas foram: " + mediaNota);
	}
}