package lang;

public class Strings {

	public static void main(String[] args) {
		
		char data[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'z', 'w', 'y'};
		
		String str = new String(data);
		
		System.out.println(str);
		
		// Pega a String depois do 1 e antes do 10, 
		System.out.println(str.substring(1, 10));
	}
}
