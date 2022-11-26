import java.util.Scanner;
import java.util.Scanner; 
public class idade2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i,idade,maior=0,menor=200,soma = 0,media;
		
		for(i=1;i<=10;i++) {
			
		System.out.println("Digite a idade:");
		idade = in.nextInt();
		
			if(idade>=maior)
				maior=idade;
			if (idade<=menor) {
				menor=idade;
			}
			soma = idade+soma;
		}
			media = soma/10;
			System.out.println("O mais velho tem: "+maior+" anos");
			System.out.println("O mais novo tem: "+menor+" anos");
			System.out.println("A M�dia da idade � de "+media);
	}
}
