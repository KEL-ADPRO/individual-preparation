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
	void testArithmeticAdd() {
		double o1 = 10.0;
		double o2 = 15.0;
		double savedResult = arithmeticUtility.add(o1,o2);
		assertEquals(25.0, savedResult);
	}

}
