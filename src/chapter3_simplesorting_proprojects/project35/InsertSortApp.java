package chapter3_simplesorting_proprojects.project35;

public class InsertSortApp {

	public static void main(String[] args) {
		int maxSize = 100;
		ArrayIns arr;
		arr = new ArrayIns(maxSize);
		
//random
//		arr.insert(77);
//		arr.insert(99);
//		arr.insert(44);
//		arr.insert(55);
//		arr.insert(22);
//		arr.insert(88);
//		arr.insert(11);
//		arr.insert(00);
//		arr.insert(66);
//		arr.insert(33);

//inversely sorted
//		arr.insert(99);
//		arr.insert(88);
//		arr.insert(77);
//		arr.insert(66);
//		arr.insert(55);
//		arr.insert(44);
//		arr.insert(33);
//		arr.insert(22);
//		arr.insert(11);
//		arr.insert(00);

//  partially sorted
		arr.insert(00);
		arr.insert(22);
		arr.insert(11);
		arr.insert(33);
		arr.insert(88);
		arr.insert(55);
		arr.insert(66);
		arr.insert(77);
		arr.insert(44);
		arr.insert(99);
		
		arr.display();
		
		arr.insertionSort();
		
		arr.display();
	}

}
