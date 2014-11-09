import java.util.Scanner;
import java.util.*;
public class Juego {
	public static int tok=1;
	public static int carta3=0;
	public static int carta4=0;
	public static void main (String[] args) {
		for(int i=0;i<=1;i++)
		System.out.println(" ");
		System.out.println("*----------Bienvenido a Love Letters----------*");	
		int menu=0;
		while(menu!=4){
			for(int i=0;i<=3;i++)System.out.println(" ");	
				System.out.println("*-----------MENU-----------*");
				System.out.println("    1. Jugar una Partida");
				System.out.println(" 2. Número de Tokens a Jugar");
				System.out.println("    3. Reglas de Juego");
				System.out.println("    4. Salir del Juego");
			Scanner men= new Scanner(System.in);
				menu=men.nextInt();
		switch(menu){
			case 1:
				partida();
			break;
			case 2:
				token();
			break;
			case 3:
				reglas();
			break;
		default:
			break;
		}	
	}
	}
	public static void partida() {
			int carta1;
			int carta2;
			String nom1; 
			String nom2;
			int cont=3;
			Integer[] cartas = new Integer[] { 1,1,1,1,1,2,2,3,3,4,4,5,5,6,7,8};
			Collections.shuffle(Arrays.asList(cartas));
			Scanner jugador=new Scanner(System.in);
					System.out.println("Ingrese su nombre:");
						nom1=jugador.next();
					System.out.println("Ingrese nombre del oponente");
						nom2=jugador.next();
					Scanner deb=new Scanner(System.in);
						System.out.println("¿Desea que se muestren las cartas del oponente?");
						System.out.println("1.Si");
						System.out.println("2.No");
						int debug=deb.nextInt();
				
				System.out.println("*-Nombre:"+nom1+"-*        #Tokens="+tok+"                         *-Oponente:-*"+nom2+"-*        #Tokens="+tok);
					carta1=cartas[cont++]; 
					carta2=cartas[cont++];
					carta3=cartas[cont++];
					carta4=cartas[cont++];
				if (carta1==1)
					System.out.print("Tienes en tu mano: "+carta1+". Guard   ");
				else if (carta1==2)
					System.out.print("Tienes en tu mano: "+carta1+". Priest  ");
				else if (carta1==3)
					System.out.print("Tienes en tu mano: "+carta1+". Baron  ");
				else if(carta1==4)
					System.out.print("Tienes en tu mano: "+carta1+". HandMain  ");
				else if (carta1==5)
					System.out.print("Tienes en tu mano: "+carta1+". Prince  ");
				else if (carta1==6)
					System.out.print("Tienes en tu mano: "+carta1+". King  ");
				else if (carta1==7)
					System.out.print("Tienes en tu mano: "+carta1+". Counntes  ");
				else if (carta1==8)
					System.out.print("Tienes en tu mano: "+carta2+". Princess  ");	
				if (carta2==1)
					System.out.print("y "+carta2+". Guard");
				else if (carta2==2)
					System.out.print("y "+carta2+". Priest");
				else if (carta2==3)
					System.out.print("y "+carta2+". Baron");
				else if(carta2==4)
					System.out.print("y "+carta2+". HandMain");
				else if (carta2==5)
					System.out.print("y "+carta2+". Prince");
				else if (carta2==6)
					System.out.print("y "+carta2+". King");
				else if (carta2==7)
					System.out.print("y "+carta2+". Counntes");
				else if (carta2==8)
					System.out.print("y "+carta2+". Princess");
			if(debug==1){
					if (carta3==1){
						System.out.print("                "+carta3+". Guard");
					}else if (carta3==2){
						System.out.print("                "+carta3+". Priest");
					}else if (carta3==3)
					{	System.out.print("                "+carta3+". Baron");
					}else if(carta3==4)
						System.out.print("                "+carta3+". HandMain");
					else if (carta3==5)
					{	System.out.print("                "+carta3+". Prince");
					}else if (carta3==6)
					{	System.out.print("                "+carta3+". King");
					}else if (carta3==7)
					{	System.out.print("                "+carta3+". Counntes");
					}else if (carta3==8)
					{	System.out.print("                "+carta3+". Princess");}
					if (carta4==1){
						System.out.print("                "+carta4+". Guard");
					}else if (carta4==2){
						System.out.print("                "+carta4+". Priest");
					}else if (carta4==3)
					{	System.out.print("                "+carta4+". Baron");
					}else if(carta4==4)
						System.out.print("                "+carta4+". HandMain");
					else if (carta4==5)
					{	System.out.print("                "+carta4+". Prince");
					}else if (carta4==6)
					{	System.out.print("                "+carta4+". King");
					}else if (carta4==7)
					{	System.out.print("                "+carta4+". Counntes");
					}else if (carta4==8)
					{	System.out.print("                "+carta4+". Princess");}
						System.out.println(" ");
						System.out.println("ºººººººººººººººº");
						System.out.println("1. Usar Carta #1");
						System.out.println("2. Usar Carta #2");
						System.out.println("3. Terminar Juego");
					Scanner car=new Scanner(System.in);
					int opcion=car.nextInt();
					switch(opcion){
					case 1:
						opcion=1;
						if (opcion==1)
							System.out.println("Seleccione la carta del 1 al 8");
								Scanner sele=new Scanner(System.in);
								int uno= sele.nextInt();
						if ((uno==carta3) || (uno==carta4))
							System.out.println("ganó");
						else 
							System.out.println("perdió");
						if ((uno==2))
							
							
					break;
					case 2:
						opcion=2;
						System.out.println("Carta # 2 jugada: "+carta2);
					break;
					default:
						oponente();
				}
			}
			}
	public static void oponente(){
		if ((carta3==8) && (carta4!=8))
			System.out.println(carta4);
		else if ((carta4==8) && (carta3!=8))
			System.out.println(carta3);
		if ((carta3==7) && ((carta4==5) || (carta4==6)))
			System.out.println(carta3);
		else if ((carta4==7) && ((carta3==5) || (carta3==6)))
			System.out.println(carta4);
		if ((carta3==7) && ((carta4!=5) || (carta4!=6)))
			System.out.println(carta4);
		else if ((carta4==7) && ((carta3!=5) || (carta3!=6)))
			System.out.println(carta3);
		if ((carta3==6) &&(carta4==5))
			System.out.println(carta4);
		else if ((carta4==6) &&(carta3==5))
			System.out.println(carta3);
		if ((carta3==6) && (carta4!=6))
			System.out.println(carta3);
		else if ((carta4==6) &&(carta3!=6))
			System.out.println(carta4);
		if((carta3==6) && ((carta4!=5) || (carta4!=7) || (carta4!=8)))
			System.out.println(carta4);
		else if ((carta4==6) && ((carta3!=5) || (carta3!=7) || (carta3!=8)))
			System.out.println(carta3);
		//pila de descarte//
		if((carta3==5) && (carta4==1))
			System.out.println(carta4);
		else if ((carta4==5) && (carta3==1))
			System.out.println(carta3);
		if ((carta3==5) && ((carta4==3) || (carta4==2) || (carta4==1)))
			System.out.println(carta3);
		else if ((carta4==5) && ((carta3==3) || (carta3==2) || (carta3==1)))
			System.out.println(carta4);
		if ((carta3==4) && (carta4==4))
			System.out.println(carta4);
		else 
			System.out.println(carta3);
		if ((carta3==4) && (carta4<=3))
			System.out.println(carta4);
		else if ((carta4==4) && (carta3<=3))
			System.out.println(carta3);
		if ((carta3==3) && (carta4==3))
			System.out.println(carta3);
		else
			System.out.println(carta4);
		if ((carta3==3) && (carta4<=2))
			System.out.println(carta4);
		else if ((carta4==3) && (carta3<=2))
			System.out.println(carta3);
		if ((carta3==2) && (carta4==2))
			System.out.println(carta3);
		else
			System.out.println(carta4);
		if ((carta3==2) && (carta4<=1))
			System.out.println(carta4);
		else if ((carta4==2) && (carta3<=1))
			System.out.println(carta3);
		if ((carta3==1) && (carta4==1))
			System.out.println(carta3);
		else
			System.out.println(carta4);
	}
	public static void reglas() {
		for(int i=0;i<=5;i++)
			System.out.println(" ");
			System.out.println("*****---------------Reglas del Juego---------------*****");
			System.out.println("Número y Poder de la Carta");
			System.out.println("     1. Guard: Trata de adivinar la carta que el rival tiene en la mano----------(5 en el mazo)");
			System.out.println("     2. Priest: Mostrará el nombre de la carta que tiene el rival en su mano-----(2 en el mazo)");
			System.out.println("     3. Baron: Mostrará el nombre de las 2 cartas, y que jugador gana la ronda---(2 en el mazo)");
			System.out.println("     4. HandMaid: Volverá al jugador que use la carta invulnerable por 1 turno---(2 en el mazo)");
			System.out.println("     5. Prince: Debe mostrar una mensaje para seleccionar a que jugador botar la mano, si el rival esta");
			System.out.println("                protegido, debe forzar al jugador a botar su mano. Debe dar una carta nueva del mazo al jugador que");
			System.out.println("                haya sido afectado por el efecto del prince.---------------------(2 en el mazo)");
			System.out.println("     6. King: Por defecto elige al rival para intercambiar mano, si este esta protegido el turno termina.----(1 en el mazo)");
			System.out.println("     7. Countess: Si el jugador tiene un Prince o King en su mano y la Countess debe jugar esta carta.-------(1 en el mazo)");
			System.out.println("     8. Princess: Si el jugador usa esta carta el rival gana la ronda y se le suma un token.-----------------(1 en el mazo)");
		}

	public static void token(){
		int t=0;
		while (t!=4){
				System.out.println("----------Elija el número de tokens ----------");
				System.out.println("1. 01 token");
				System.out.println("2. 03 tokens");
				System.out.println("3. 07 tokens");
				System.out.println("4. Volver a menú");
			Scanner to = new Scanner(System.in);
				 t = to.nextInt();
		switch(t){
			case 1:
				tok=1;
				System.out.println("Numero de tokens actualizados:"+tok);
			break;
			case 2:
				tok=3;
				System.out.println("Número de tokens actualizados:"+tok);
			break;
			case 3:
				tok=7;
				System.out.println("Número de tokens actualizados:"+tok);
			break;
			default:
		}
		
		}
	}
}