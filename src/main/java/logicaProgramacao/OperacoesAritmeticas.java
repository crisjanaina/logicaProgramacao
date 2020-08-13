package logicaProgramacao;

public class OperacoesAritmeticas {

	// 1. Entrar via teclado com a base e a altura de um retângulo, calcular e
	// exibir sua área.

	public int getAreaRetangulo(int base, int altura) {

		int area = base * altura;
		return area;
	}

	// 6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
	// digitados.

	public float getMediaAritmetica(float um, float dois, float tres, float quatro) {

		float soma = um + dois + tres + quatro;
		float media = soma / 4;
		return media;

	}

	// 15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade
	// de dólares.
	// Calcular e exibir o valor correspondente em Reais (R$).

	public float getReais(float cotacao, float qtdDolar) {

		return cotacao * qtdDolar;

	}
	
	//17.	Entrar via teclado com dois valores quaisquer “X” e “X”.
	//Calcular e exibir o cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
	
	public double getExponencial(double x, double y) {
		
		double exp = Math.pow(x, y);
		
		return exp;
		
		
		
		
	}
}
