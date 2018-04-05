package _01_array_manipulation;

public class Sorting {
	static String[] sort(String testArray[]) {
		for (int i = 0; i < testArray.length; i++) {
			for (int j = i + 1; j < testArray.length; j++) {
				String j1 = testArray[j];
				String i1 = testArray[i];
				int value = testArray[i].compareTo(testArray[j]);
				if (value > 0) {
					testArray[i] = j1;
					testArray[j] = i1;
				} else {

				}
			}
		}

		System.out.println(testArray[0]);
		System.out.println(testArray[1]);
		System.out.println(testArray[2]);
		System.out.println(testArray[3]);
		System.out.println(testArray[4]);
		System.out.println(testArray[5]);
		System.out.println(testArray[6]);
		System.out.println(testArray[7]);
		System.out.println(testArray[8]);
		System.out.println(testArray[9]);

		return testArray;
	}
}
