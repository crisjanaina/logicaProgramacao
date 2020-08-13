package logicaProgramacao;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.Test;

public class OperacoesAritmeticasTest {

	OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	@Test
	public void validarAreaRetangulo() {

		int area;

		area = opAritmeticas.getAreaRetangulo(10, 10);

		assertEquals(100, area);
	}

	@Test
	public void validarMediaAritmetica() {

		float media = opAritmeticas.getMediaAritmetica(10,10,10,10);

		assertEquals(10, media, 0);

	}
	
	@Test
	public void validarConversaoReais() {
		
		float reais = opAritmeticas.getReais(5.29f,5);
		
		BigDecimal reaisF = new BigDecimal(reais).setScale(2, RoundingMode.HALF_EVEN);
		
		assertEquals(26.45, (reaisF.doubleValue()), 0);
	}
	
	@Test
	public void validarExponencial() {
		
		double exp = opAritmeticas.getExponencial(2, 3);
		
		assertEquals(8, exp, 0);
		
	}

}
