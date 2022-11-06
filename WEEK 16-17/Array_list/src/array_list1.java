import java.util.*;
public class array_list1 {
	private ArrayList<String> list = new ArrayList<>();
	public void addElement(String word) {
		list.add(word);
		printList();
	}
	public void removeElementindex(int i) {
		list.remove(i);
		printList();
	}
	public void removeElement(String word) {
		list.remove(word);
		printList();
	}
	public void replaceElement(int i, String word) {
		list.remove(i);
		list.add(i, word);
		printList();
	}
	public boolean checkEmpty() {
		return list.isEmpty();
	}
	public int checkLength() {
		return list.size();
	}
	public boolean contains(String word) {
		return list.contains(word);
	}
	public String elementatindex(int i) {
		return list.get(i);
	}
	public int size() {
		return list.size();
	}
	public void clear() {
		list.clear();
		printList();
	}
	public void printList() {
		System.out.println();
		for (String word : list) {
			System.out.print(word + " ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		array_list1 array = new array_list1();
		System.out.println("Options, Enter 1-11\n"
				+ "1. Add Element to list\n"
				+ "2. Remove Element at Index\n"
				+ "3. Remove First Occurance of Element\n"
				+ "4. Replace Element at index\n"
				+ "5. Check if list is empty\n"
				+ "6. Check if list contains a word\n"
				+ "7. Print size of list\n"
				+ "8. Print element at index\n"
				+ "9. Print the size of the list\n"
				+ "10. Clear the list\n"
				+ "11. Print the whole list");
		int num = input.nextInt();
		while (num<12 && num > 0) {
			if (num == 1) {
				array.addElement(input.next());
			} else if (num == 2) {
				array.removeElementindex(input.nextInt());
			} else if (num == 3) {
				array.removeElement(input.next());
			} else if (num == 4) {
				array.replaceElement(input.nextInt(), input.next());
			} else if (num == 5) {
				System.out.println(array.checkEmpty());
			} else if (num == 6) {
				System.out.println(array.contains(input.next()));
			} else if (num == 7) {
				System.out.println(array.checkLength());
			} else if (num == 8) {
				System.out.println(array.elementatindex(input.nextInt()));
			} else if (num == 10) {
				array.clear();
			} else if (num == 9) {
				System.out.println(array.size());
			} else if (num == 11) {
				array.printList();
			}
			System.out.println("Enter Option 1-11");
			num = input.nextInt();
		}
		input.close();
	}
}