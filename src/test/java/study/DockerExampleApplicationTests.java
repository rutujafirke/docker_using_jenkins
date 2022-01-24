package study;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DockerExampleApplicationTests {

	@Test
	public void testInputIsEven(){
		 assertTrue(DockerExampleApplication.checkIfInputIsAnEvenNumber(22));
	}

}
