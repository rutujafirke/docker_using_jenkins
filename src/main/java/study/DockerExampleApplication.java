package study;
public class DockerExampleApplication {
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
	public static void main(String[] args) {
		System.out.println(checkIfInputIsAnEvenNumber(122));
		// Testing in the main method
	}

	public static boolean checkIfInputIsAnEvenNumber(int
			number){
		return number % 2 == 0;
	}


}
