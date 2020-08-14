package logicaProgramacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecisaoLogicaTest {

	DesicaoLogica desicaoLogica = new DesicaoLogica();

	@Test
	public void validarV1ComoMaior() {

		int v1 = 10;
		int v2 = 9;

		assertEquals(10, desicaoLogica.getMaior(v1, v2));

	}

	@Test
	public void validarV2ComoMaior() {

		int v1 = 5;
		int v2 = 6;

		assertEquals(6, desicaoLogica.getMaior(v1, v2));

	}

}
