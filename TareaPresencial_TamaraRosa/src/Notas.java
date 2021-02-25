import com.sun.tools.javac.parser.Scanner;

/**
* @author Tamara
*/


public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int n = 0;
		String calificacion="";

		System.out.print ("Introduzca una nota: ");
		n = reader.nextInt();
		int nota;
		if(n>=0 && nota<5)
			calificacion="Suspenso";
		else
			if(n>=5 && nota<=10)
				calificacion="Aprobado";
			else
				calificacion="La nota introducida no es correcta";
		System.out.println (calificacion);
		reader.close();
	}

	}

