import java.util.*;
class a_s_r {
	
	
	private ArrayList<String> mylist = new ArrayList<String>();
	public void addWord(String word) {
		mylist.add(word);
	}
	public int numWordsOfLength(int len) {
		int count = 0;
		for (String word : this.mylist) {
			if (word.length() == len) {
				count++;
			}
		}
		return count;
	}
	public void removeWordsOfLength(int len) {
		int length = mylist.size();
		int i = 0;
		while (i <= length-1) {
			if (mylist.get(i).length() == len) {
				mylist.remove(i);
				length = mylist.size();
				i = 0;
			} else {
				i++;
			}
		}
		
	}
	public void printarray() {
		for (String word : this.mylist) {
			System.out.print(word + " ");
		}
	}
	public static void main(String[] args) {
		a_s_r list = new a_s_r();
		Scanner input = new Scanner(System.in);
		System.out.println("How many words would you like to add");
		int count = input.nextInt();
		System.out.println("Please input " + count + " words");
		for (int i = 0; i < count;i++) {
			String word = input.next();
			list.addWord(word);
		}
		list.printarray();
		System.out.println("\nWhat is the length of characters in each word you would like to search for?");
		int characters = input.nextInt();
		System.out.println("\n"+ list.numWordsOfLength(characters));
		list.removeWordsOfLength(characters);
		System.out.println("Wordlist with words of length " + characters + " removed");
		list.printarray();
	}
}
