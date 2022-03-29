package Pract9;

import java.util.Random;

public class RandomCharacter {

	private Random random;

	public RandomCharacter() {
		this.random = new Random();
	}

	public char getRandomLowerCaseLetter() {
		// ascii 97 - 122
		return (char) getRandomValue(97, 123);
	}

	public char getRandomUpperCaseLetter() {
		// ascii 65 - 90
		return (char) getRandomValue(65, 91);
	}

	public char getRandomDigitLetter() {
		// ascii 48 - 57
		return (char) getRandomValue(48, 58);
	}

	public char getRandomLetter() {
		switch (getRandomValue(0, 3)) {
		case 0:
			return getRandomLowerCaseLetter();
		case 1:
			return getRandomUpperCaseLetter();
		}
		return getRandomDigitLetter();
	}

	private int getRandomValue(int lowerBound, int upperBound) {
		return random.nextInt(upperBound - lowerBound) + lowerBound;
	}

}
