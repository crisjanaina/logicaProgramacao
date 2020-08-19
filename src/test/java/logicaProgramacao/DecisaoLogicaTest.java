package logicaProgramacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecisaoLogicaTest {

	DecisaoLogica decisaoLogica = new DecisaoLogica();

	@Test
	public void validarV1ComoMaior() {

		int v1 = 10;
		int v2 = 9;

		assertEquals(10, decisaoLogica.getMaior(v1, v2));

	}

	@Test
	public void validarV2ComoMaior() {

		int v1 = 5;
		int v2 = 6;

		assertEquals(6, decisaoLogica.getMaior(v1, v2));

	}

	@Test
	public void validarAbaixoDoPeso() {

		double peso = 60;
		double altura = 1.75;

		String r = decisaoLogica.getPesoIdeal(peso, altura);
		assertEquals("Abaixo do peso!", r);
	}

	@Test
	public void validarPesoIdeal() {

		double peso = 75;
		double altura = 1.75;

		String r = decisaoLogica.getPesoIdeal(peso, altura);
		assertEquals("Peso ideal", r);

	}

	@Test
	public void validarAcimaDoPeso() {

		double peso = 100;
		double altura = 1.75;

		String r = decisaoLogica.getPesoIdeal(peso, altura);
		assertEquals("Acima do peso!", r);

	}
	
	@Test
	public void validarMaiorOuIgualV1() {
		
		int v1 = 120;
		int v2 = 60;
		
		Object maior = decisaoLogica.getMaiorOuIgual(v1, v2);
		assertEquals(v1, maior);
	}
	

	@Test
	public void validarMaiorOuIgualV2() {
		
		int v1 = 12;
		int v2 = 60;
		
		Object maior = decisaoLogica.getMaiorOuIgual(v1, v2);
		assertEquals(v2, maior);
	}
	
	@Test
	public void validarMaiorOuV1IgualV2() {
		
		int v1 = 38;
		int v2 = 38;
		
		Object situacao = decisaoLogica.getMaiorOuIgual(v1, v2);
		assertEquals("Os números são idênticos!", situacao);
	}
	
	@Test
	public void validarTrianguloEscaleno() {
		
		int a = 10;
		int b = 11;
		int c = 12;
		
		String escaleno = decisaoLogica.getTriangulo(a, b, c);
		assertEquals("Triângulo Escaleno", escaleno);
	}
	
	@Test
	public void validarTrianguloEquilatero() {
		
		int a = 31;
		int b = 31;
		int c = 31;
		
		String equilatero = decisaoLogica.getTriangulo(a, b, c);
		assertEquals("Triângulo Equilátero", equilatero);
	}
	
	@Test
	public void validarTrianguloIsosceles() {
		
		int a = 3;
		int b = 3;
		int c = 6;
		
		String isosceles = decisaoLogica.getTriangulo(a, b, c);
		assertEquals("Triângulo Isósceles", isosceles);
	}
	
	@Test
	public void validarQueNaoETriangulo() {
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		String naoetriangulo = decisaoLogica.getTriangulo(a, b, c);
		assertEquals("Não é um triângulo!", naoetriangulo);
	}


}
