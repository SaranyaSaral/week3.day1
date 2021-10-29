package week3.day1;

public class Replace {

	public static void main(String[] args) {
		String sentence = "I am working with Java8";
		
		int len=sentence.length();
		System.out.println(len);
		 String bb=sentence.replace('r', 'i');
		 System.out.println(bb);
		String all= sentence.replaceAll("[\\D]","");
		System.out.println(all);
		String print=sentence.substring(5,14);
		System.out.println(print);
		
	}

}
