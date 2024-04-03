package arrayexample1;

public class Array2 {

	public void add(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) { // bujna garo vako xa yo line
			int num = array[i]; // array[0] array[1]
 			sum += num;
		}
		System.out.println("Sum of all  the elements: " + sum);
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 }; // yo chai element oF an array ho
		Array2 computeValues = new Array2();
		computeValues.add(arr);
		System.out.println("product of all the elements: " + computeValues.multiply(arr));
	}

	public int multiply(int[] anant) {
		int product = 1;
		for (int i = 0; i < anant.length; i++) { // bujna garo vako xa yo line
			int num = anant[i];
			product *= num;
		}
		return product;
	}

}