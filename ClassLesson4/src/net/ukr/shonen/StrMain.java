package net.ukr.shonen;

public class StrMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("hello world");
		
		sb.setCharAt(0, 'H');
		
		sb.insert(6, "my ");
		
//		sb.reverse();
		
		String text = sb.toString();
		
		System.out.println(text);

	}

}
