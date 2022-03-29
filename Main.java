package Pract9;

public class Main {

	public static void main(String[] args) {
		RandomCharacter randomCharacter = new RandomCharacter();

		for (int i = 0; i < 15; i++) {
			System.out.println("Random Lowercase Letter " + i + ": " + randomCharacter.getRandomLowerCaseLetter());
			System.out.println("Random Uppercase Letter " + i + ": " + randomCharacter.getRandomUpperCaseLetter());
			System.out.println("Random Digit/Letter " + i + ": " + randomCharacter.getRandomDigitLetter());
			System.out.println("Random Letter " + i + ": " + randomCharacter.getRandomLetter());
			System.out.println();
		}
	}
}
