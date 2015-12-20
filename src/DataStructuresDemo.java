import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class DataStructuresDemo {

	public static void main(String[] args) {
		/*
		 * Arrays demo
		 */
		
		System.out.println("*********Arrays***********");
		
		ArrayDemo ad = new ArrayDemo();
		ad.show();
		ad.sortList();
		
		System.out.println("*********Array- List***********");
		
		ArrayListDemo ald = new ArrayListDemo();
		ald.displayList();
		ald.sortList();
		ald.findElement();
		ald.deleteElement();
		
		System.out.println("\n*********Hash-Map***********");
		
		HashMapDemo hmd = new HashMapDemo();
		hmd.addElement();
		hmd.display();
		
		System.out.println("\n*********Queue-Demo***********");
		
		QueueDemo qd = new QueueDemo();
		qd.addToQueue();
		qd.display();
	}

}

class ArrayDemo {
	
	int[] numberList = new int[10];
	int[] numberList1 = {5,7,3,12,2};
	
	double[] numList = new double[20];
	double[] numList1 = {1.0,2.0,3.0,4.0,5.0};
	
	
	public void show(){
		for(int i =0;i< 10 ; i++){
			numberList[i] = i*10;
		}
		
		for(int i =0;i< numberList.length ; i++){
			System.out.print(numberList[i] + " ");
		}
		
		System.out.println();
	}
	
	public void sortList(){
		System.out.println("Before sorting");
		for(int element : numberList1){
			System.out.print(element + " ");
		}
		
		System.out.println();
		
		Arrays.sort(numberList1);
		System.out.println("After sorting");
		
		for(int element : numberList1){
			System.out.print(element + " ");
		}
		
		System.out.println();
	}
}

class ArrayListDemo{
	List<Integer> myList = new ArrayList<Integer>();
	
	public void addToList(){
		myList.add(1);
		myList.add(100);
		myList.add(50);
		myList.add(25);
	}
	
	public void displayList(){
		addToList();
		
		for(Integer element : myList){
			System.out.print(element + " ");
		}
		
		myList.add(2, 60);// Add 60 at index 2
		
		System.out.println("\nAnother Way to iterate");
		
		/*
		 * There is no length property here as compared to array
		 * also we cannot get the element using myList[index]
		 */
		for(int i =0;i< myList.size();i++){
			System.out.print(myList.get(i) + " ");
		}
		
		System.out.println("\nUsing iterator");
		
		Iterator<Integer> itr = myList.iterator();
		
		while(itr.hasNext()){
			System.out.print(itr.next() + " ");
		}
		
	}
	
	public void sortList(){
		Collections.sort(myList);
		System.out.println("\nAfter Sorting the List");
		
		for(Integer element : myList){
			System.out.print(element + " ");
		}
		System.out.println();
		
	}
	/*
	 * This function uses the contains and index of methods.
	 */
	
	public void findElement(){		
		if (myList.contains(60)){
			System.out.println("Mylist contains 60");
		}		
		if(myList.indexOf(100) != -1){
			System.out.println("Mylist contains 100");
		}	
	}
	
	public void deleteElement(){
		System.out.println("Deleting Elements:");
		@SuppressWarnings("unused")
		Integer num = myList.remove(0);
		for(Integer element: myList){
			System.out.print(element + " ");
		}
		System.out.println();
		@SuppressWarnings("unused")
		boolean deleted = myList.remove(new Integer(60));
		
		for(Integer element: myList){
			System.out.print(element + " ");
		}
		
	}
}

class HashMapDemo{
	Map<Integer,Student> myMap = new HashMap<Integer,Student>();
	
	public void addElement(){
		Student s1 = new Student("Nishant",27);
		Student s2 = new Student("Suresh",25);
		Student s3 = new Student("Vipin",27);
		
		myMap.put(1,s1);
		myMap.put(2, s2);
		myMap.put(3, s3);
		
	}
	
	public void display(){
		
		System.out.println("Using map.keySet()");
		for(Integer key : myMap.keySet()){
			System.out.println(key + " " + myMap.get(key).toString());
		}
		
		System.out.println("Using map.values()");
		
		
		for (Student s : myMap.values()){
			System.out.println(s.toString());
		}
		
		System.out.println("Using Map.Entry<Integer, Student> me : myMap.entrySet()");
		
		for (Map.Entry<Integer, Student> me : myMap.entrySet()){
			System.out.println(me.getKey() + " " + me.getValue().toString());
		}
	}
	
	
}

class QueueDemo{
	Queue<Student> myQueue= new LinkedList<Student>();
	
	public void addToQueue(){
		Student s1 = new Student("Nishant",27);
		Student s2 = new Student("Suresh",25);
		Student s3 = new Student("Vipin",27);
		
		myQueue.offer(s1);
		myQueue.offer(s2);
		myQueue.offer(s3);		
	}
	
	public void display(){
		
		System.out.println("After doing myQueue.peek()");
		
		Student temp = myQueue.peek(); // It just returns the front element without deleting it.
		System.out.println(temp.toString());
		
		System.out.println("Displaying using doing myQueue.poll()");
		
		while(!myQueue.isEmpty()){
			System.out.println(myQueue.poll().toString()); // Poll returns and removes the element in the front of the queue.
		}
		
	}
}

class LinkedListDemo{
	LinkedList<Student> myLinkedList = new LinkedList<Student>();
	
	
	public void add(){
		/*
		 * It has functions like add first,add last,add at index etc..
		 */
		//myLinkedList.
		
	}
}

class StackDemo{
	Stack<Student> myStack = new Stack<Student>();	
	
	public void add(){
		Student s1 = new Student("Nishant",27);
		Student s2 = new Student("Suresh",25);
		Student s3 = new Student("Vipin",27);
		
		myStack.push(s1);
		myStack.push(s2);
		myStack.push(s3);		
	
	}
	
	/*
	 * The functions are myStack.push() and mystack.pop.
	 */
}



class Student{
	public String name;//Just defining public for convenience in this program but not a good habit.
	public int age;
	
	Student(String sName, int sAge){
		this.name = sName;
		this.age = sAge;
	}
	
	@Override
	public String toString(){
		
		return ("Name= " +name + " Age= " + age);
		
	}
}
