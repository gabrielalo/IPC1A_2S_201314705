import java.util.Scanner;
    public class NumerosPares {
	public static void main (String [] args){
		Scanner en = new Scanner(System.in);
		int num;
			System.out.println("Ingrese un n�mero:");
			    num=en.nextInt();
	     if (num%2==0) 
		System.out.println("N�mero Par");
	     else
		System.out.println("N�mero Impar");	

}
}
