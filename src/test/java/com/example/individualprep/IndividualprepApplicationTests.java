package com.example.individualprep;

import com.example.individualprep.service.ArithmeticUtility;
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
	@BeforeEach
	void setUp() {
	}

	@Test
	void testArithmetic() {
		double o1 = 6.0;
		double o2 = 2.0;
		int n = 2;
		double addResult = arithmeticUtility.add(o1,o2);
		double subtractResult = arithmeticUtility.subtract(o1,o2);
		double multiplyResult = arithmeticUtility.multiply(o1,o2);
		double divideResult = arithmeticUtility.divide(o1, o2);
		double exponentResult = arithmeticUtility.exponent(o1, n);
		assertEquals(8.0, addResult);
		assertEquals(4.0, subtractResult);
		assertEquals(12.0, multiplyResult);
		assertEquals(3.0, divideResult);
		assertEquals(36.0, exponentResult);
	}

	@Test
	void testVector() {

	}

}

