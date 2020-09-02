/*сортировка пузырьком: последовательно между двумя соседними значениями ищется наибольший и сдвигается вправо 
 * (максимальный элемент оказывается последним). Действие продолжается с оставшимеся элементами (кроме максимального), 
 * следующий элемент после максимально оказывается предпоследним и т.д.
 */
public class Lesson49_sortirovkaP {

	public static void main(String[] args) {
		int [] array = new int [10];
		fill(array);
		print(array);
		sort(array);
		print(array);
	}

	static void fill(int [] array) {
		for (int i = 0; i < array.length; i++) 
			array[i] = (int)(Math.random() * 100);
	}
	
	static void print(int [] array) {
		for (int i = 0; i < array.length; i++) 
			System.out.println("array[" + i + "]= " + array[i]);
	}
			
	static void sort(int [] array) {
		int unsorted = array.length;
		while (unsorted != 0) {
			for (int i = 1; i < unsorted; i++) {
				if (array[i-1] >= array[i]) {
					int a = array[i];
					array[i] = array[i-1];
					array[i-1] = a;
				}
			}
			unsorted -=1;
		}
	}
		
}
