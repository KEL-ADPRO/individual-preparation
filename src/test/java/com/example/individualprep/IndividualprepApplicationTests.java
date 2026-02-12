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
		double o1 = 5.0;
		double o2 = 2.0;
		int n = 2;
		double addResult = arithmeticUtility.add(o1,o2);
		double substractResult = arithmeticUtility.subtract(o1,o2);
		double exponentResult = arithmeticUtility.exponent(o1, n);
		assertEquals(7.0, addResult);
		assertEquals(3.0, substractResult);
		assertEquals(25.0, exponentResult);
	}

	@Test
	void testVector() {

	}

}
