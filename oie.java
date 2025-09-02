package oie;

import java.util.Scanner;

public class Aluno {
	
    double nota1 = 0, nota2 = 0, media = 0;
    
    public Aluno(double nota1, double nota2, double media) {
    	
    }
    
    public void prova1() {
    	System.out.println("Informe a primeira nota.");
    	Scanner s = new Scanner(System.in);
    	nota1 = s.nextDouble();
    }
    
    public void prova2() {
    	System.out.println("Informe a segunda nota.");
    	Scanner o = new Scanner(System.in);
    	nota2 = o.nextDouble();
    }
    
    public void nota() {
    	media = (nota1 + nota2)/2;
    	System.out.println("A média é " + media);
    	if ( media >= 7 )
    	{
    		System.out.println("Aprovado!");
    	}
    	else
    	{
    		System.out.println("Reprovado!");
    	}
    }

	public static void main(String[] args) {
		Aluno c1 = new Aluno(0, 0, 0);
		c1.prova1();
		c1.prova2();
		c1.nota();
        
	}

}
