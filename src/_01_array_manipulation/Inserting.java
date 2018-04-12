package _01_array_manipulation;

public class Inserting {
	static int[] insertAt(int[] testArray, int location, int value) {
		int[] newArray = new int[testArray.length + 1];
		for (int i = 0; i < location; i++) {
			newArray[i] = testArray[i];
		}
		newArray[location] = value;
		for (int i = location + 1; i < testArray.length + 1; i++) {
			newArray[i] = testArray[i - 1];
		}
		return newArray;

	}

	static String[] insertAlphabetically(String[] orderedArray, String word) {
		String[] newArray = new String[orderedArray.length + 1];
		newArray[orderedArray.length] = word;
		for (int i = 0; i < orderedArray.length; i++) {
			newArray[i] = orderedArray[i];
		}

		for (int i = 0; i < newArray.length; i++) {
			for (int j = i + 1; j < newArray.length; j++) {
				String j1 = newArray[j];
				String i1 = newArray[i];
				int value = newArray[i].compareTo(newArray[j]);
				if (value > 0) {
					newArray[i] = j1;
					newArray[j] = i1;
				} else {

				}
			}
		}
		return newArray;
	}

}
