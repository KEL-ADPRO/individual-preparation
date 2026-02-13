package com.example.individualprep;

import com.example.individualprep.service.ArithmeticUtility;
import com.example.individualprep.service.VectorUtility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class IndividualprepApplicationTests {

	@InjectMocks
	ArithmeticUtility arithmeticUtility;

	@InjectMocks
	VectorUtility vectorUtility;

	double o1;
	double o2;
	int zero;
	int n;

	double[] v1;
	double[] v2;
	double[] v3;
	int x;

	@BeforeEach
	void setUp() {
		o1 = 6.0;
		o2 = 2.0;
		zero = 0;
		n = 2;

		v1 = new double[]{1.0, 2.0, 3.0};
		v2 = new double[]{4.0, 5.0, 6.0};
		v3 = new double[]{7.0, 8.0};
		x = 3;
	}

	@Test
	void testArithmeticException() {
		IllegalArgumentException divException = assertThrows(IllegalArgumentException.class, () -> {
			arithmeticUtility.divide(o1, zero);
		});

		assertEquals("Cannot divide by zero", divException.getMessage());
	}
	@Test
	void testAddArithmetic() {
		double addResult = arithmeticUtility.add(o1,o2);
		assertEquals(8.0, addResult);
	}

	@Test
	void testSubtractArithmetic() {
		double subtractResult = arithmeticUtility.subtract(o1,o2);
		assertEquals(4.0, subtractResult);
	}

	@Test
	void testMultiplyArithmetic() {
		double multiplyResult = arithmeticUtility.multiply(o1,o2);
		assertEquals(12.0, multiplyResult);
	}

	@Test
	void testDivideArithmetic() {
		double divideResult = arithmeticUtility.divide(o1, o2);
		assertEquals(3.0, divideResult);
	}

	@Test
	void testExponentArithmetic() {
		double exponentResult = arithmeticUtility.exponent(o1, n);
		assertEquals(36.0, exponentResult);
	}

	@Test
	void testVectorException() {
		IllegalArgumentException addException = assertThrows(IllegalArgumentException.class, () -> {
			vectorUtility.add(v1, v3);
		});

		IllegalArgumentException subException = assertThrows(IllegalArgumentException.class, () -> {
			vectorUtility.subtract(v1, v3);
		});

		IllegalArgumentException dotException = assertThrows(IllegalArgumentException.class, () -> {
			vectorUtility.dotProduct(v1, v3);
		});

		assertEquals("Vector lengths must be the same", addException.getMessage());
		assertEquals("Vector lengths must be the same", subException.getMessage());
		assertEquals("Vector lengths must be the same", dotException.getMessage());
	}

	@Test
	void testAddVector() {
		double[] expected = new double[] {5.0, 7.0, 9.0};
		double[] result = vectorUtility.add(v1, v2);
		assertArrayEquals(expected, result);
	}

	@Test
	void testSubVector() {
		double[] expected = new double[] {3.0, 3.0, 3.0};
		double[] result = vectorUtility.subtract(v2, v1);
		assertArrayEquals(expected, result);
	}

	@Test
	void testMultiplyVector() {
		double[] expected = new double[] {3.0, 6.0, 9.0};
		double[] result = vectorUtility.multiply(v1, x);
		assertArrayEquals(expected, result);
	}

	@Test
	void testDotVector() {
		double expected = 32.0;
		double result = vectorUtility.dotProduct(v1, v2);
		assertEquals(expected, result);
	}

	@Test
	void testNormVector() {
		double expected = Math.sqrt(14.0);
		double result = vectorUtility.norm(v1);
		assertEquals(expected, result);
	}

}

