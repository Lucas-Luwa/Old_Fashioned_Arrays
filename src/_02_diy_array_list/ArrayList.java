package _02_diy_array_list;

import java.util.Set;

public class ArrayList<T> {
	T[] list = (T[]) new Object[0];;

	public static void main(String[] args) {
	}

	ArrayList() {
		T[] newArray = (T[]) new Object[0];
	}

	void add(T number) {
		T[] newArray = (T[]) new Object[list.length + 1];

		for (int j = 0; j < list.length; j++) {
			newArray[j] = list[j];
		}
		newArray[newArray.length - 1] = number;
		list = newArray;
	}

	T get(int value) {
		T x = list[value];
		return x;
	}

	void set(int number, T value) {
		list[2] = value;
	}

	void addAt(int number, T value) {
		T[] newArray = (T[]) new Object[list.length + 1];
		for (int j = 0; j < number; j++) {
			newArray[j] = list[j];
		}
		newArray[number] = value;
		for (int i = number + 1; i < list.length + 1; i++) {
			newArray[i] = list[i - 1];
		}
		list = newArray;
	}

	void remove(int number) {
		T[] newArray = (T[]) new Object[list.length - 1];
		for (int i = 0; i < number; i++) {
			newArray[i] = list[i];
		}
		for (int i = number; i < list.length - 1; i++) {
			newArray[i] = list[i + 1];
		}
		list = newArray;
	}
	boolean contains(String word) {
		boolean value = false;
		for (int i = 0; i < list.length; i++) {
			if(list[i].equals(word)) {
				value = true;
			}
		}
		return value;
	}
}
