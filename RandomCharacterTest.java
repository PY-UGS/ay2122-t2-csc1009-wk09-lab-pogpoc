package Pract9;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

class RandomCharacterTest {

	RandomCharacter randomCharacter;

	@BeforeEach
	void setUp() throws Exception {
		this.randomCharacter = new RandomCharacter();
	}

	@RepeatedTest(value = 15)
	public void testGetRandomLowerCaseLetter() {
		assertTrue(
				Pattern.compile("[a-z]").matcher(String.valueOf(randomCharacter.getRandomLowerCaseLetter())).matches());
	}

	@RepeatedTest(value = 15)
	public void testGetRandomUpperCaseLetter() {
		assertTrue(
				Pattern.compile("[A-Z]").matcher(String.valueOf(randomCharacter.getRandomUpperCaseLetter())).matches());
	}

	@RepeatedTest(value = 15)
	public void testGetRandomDigitLetter() {
		assertTrue(
				Pattern.compile("[0-9]").matcher(String.valueOf(randomCharacter.getRandomDigitLetter())).matches());
	}

	@RepeatedTest(value = 15)
	public void testGetRandomCharacter() {
		assertTrue(
				Pattern.compile("[a-zA-Z0-9]").matcher(String.valueOf(randomCharacter.getRandomLetter())).matches());
	}

	@RepeatedTest(value = 15)
	public void testGetRandomDigitCharacterIsPrime() {
		boolean isPrime = true;
		int i = randomCharacter.getRandomDigitLetter();

		for (int j = 2; j < i; j++) {
			if (i % j == 0 | i == 1) {
				isPrime = false;
				assertFalse(isPrime);
				return;
			}
		}
		assertTrue(isPrime);
		System.out.println("Is number " + i + " a Prime Number? " + isPrime);
	}

}

