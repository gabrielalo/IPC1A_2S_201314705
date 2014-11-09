import java.util.Scanner;
    public class NumerosPares {
	public static void main (String [] args){
		Scanner en = new Scanner(System.in);
		int num;
			System.out.println("Ingrese un número:");
			    num=en.nextInt();
	     if (num%2==0) 
		System.out.println("Número Par");
	     else
		System.out.println("Número Impar");	

}
}
