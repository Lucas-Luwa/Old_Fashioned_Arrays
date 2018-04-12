package _02_diy_array_list;

public class ArrayList<T> {
	T[] list;

	ArrayList() {
		T[] newArray = (T[]) new Object[0];
	}

	T[] add(T number) {
		list[list.length] = number;
		return list;
	}

	T[] get(T value) {
		T get = list(value);
		return  get;
	}


}
