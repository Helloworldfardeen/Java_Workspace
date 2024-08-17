
//=========================================================
/*Let me explain the arraylist here we are declareing the constructor first because we are 
 * when ever the object is created so our constructor called first and after we using temp varaible
 * inside the add()method while checking condition simple.... so the we can increase the
 * capasity of our array so the we can swap our element into it ... after the after all the process is simple 
 * we are just implementing different different method like remove(),getElement(),getPresentLength(),
 * display() and alll but my main question is to why are we doing 
 * this kind of stuff because our array is fixed value 
 * by using copy temp logic we are basally solve our problem... throught this.... */
package day05;

public class DynamicArrayList {
	int arr[];
	int capacity;
	int presentlength;

	public DynamicArrayList() {
		// assigning the value using constructor because our array is dynamic and We
		// want dynamic memory..
		capacity = 2;
		arr = new int[capacity];
		presentlength = 0;
	}

	public static void main(String[] args) {
		DynamicArrayList Arraylist = new DynamicArrayList();
		// our dynamic array list is ready now ..... so be happy
		Arraylist.add(5);
		Arraylist.add(9);
		Arraylist.add(1);
		Arraylist.add(6);
		Arraylist.remove();
		System.out.println("Returning the element at index::" + Arraylist.getElement(3));
		System.out.println("Returning the present Lenght  ::" + Arraylist.getPresentLength());
		Arraylist.remove();
		Arraylist.Display();
	}

	public void add(int data) {
		if (presentlength == capacity) {
			int temp[] = new int[2 * capacity];// make temporary array as the capacity....
			for (int i = 0; i < presentlength; i++) {
				temp[i] = arr[i];
			}
			capacity = capacity * 2;
			arr = temp;// because our capacity is increased that why.....allocating temp array to
						// original array
		}
		arr[presentlength] = data;
		presentlength++;
	}

	public int getElement(int index) {
		if (index < presentlength) {
			return arr[index];
		}
		return -1;
	}

	public void remove() {
		presentlength--;
		return;

	}

	public int getPresentLength() {
		return presentlength;
	}

	public void Display() {
		for (int i = 0; i < presentlength; i++) {
			System.out.print(arr[i] + ",");
		}
	}
}
