package _01_array_manipulation;

public class Inserting {
	static int[] insertAt(int[] testArray, int location, int value) {
		for (int i = location + 1; i < testArray.length - location; i++) {

			testArray[i] = testArray[i - 1];
		}
		testArray[location] = testArray[value];
		return testArray;
	}

}
