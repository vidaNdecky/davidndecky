package groupeisi.sn;

import groupeisi.sn.service.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DavidndeckyApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void additionTest() {
		Calculator calculatrice = new Calculator();
		int result = calculatrice.addition(2, 3);
		Assertions.assertEquals(5, result);
	}

	@Test
	public void soustractionTest() {
		Calculator calculatrice = new Calculator();
		int result = calculatrice.soustraction(5, 2);
		Assertions.assertEquals(3, result);
	}

	@Test
	public void multiplicationTest() {
		Calculator calculatrice = new Calculator();
		int result = calculatrice.multiplication(4, 2);
		Assertions.assertEquals(8, result);
	}

	@Test
	public void divisionTest() {
		Calculator calculatrice = new Calculator();
		double result = calculatrice.division(10, 5);
		Assertions.assertEquals(2.0, result);
	}

}
