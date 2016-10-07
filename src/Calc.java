import java.util.Scanner;

public class Calc {

	double num;
	double res = 0;
	char op = ' ';
	Scanner s = new Scanner(System.in);

	public Calc() {
		do
			Calculadora();
		while (res <= 0 || res >= 0);
	}

	public void Calculadora() {
		System.out.println("O resultado é " + res);

		System.out.println("Introduza o operando (+,-,*,/) ou 0 para sair da calculadora");
		op = s.next().charAt(0);

		if (op == '0') {
			System.out.println("Obrigado por teres utilizado a calculadora bootlag");
			System.exit(0);
		} else {

			System.out.println("Introduza o número");
			num = s.nextDouble();

			switch (op) {
			case ('+'):
				res = res + num;
				break;
			case ('-'):
				res = res - num;
				break;
			case ('*'):
				res = res * num;
				break;
			case ('/'):
				res = res / num;
				break;

			}
		}
	}
}
