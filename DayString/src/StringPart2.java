import java.util.Scanner;

public class StringPart2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		sc.close();
		int v=0,cnt=0;
		n=n.toLowerCase();
		for(int i=0;i<n.length();i++) {
			char c=n.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				v++;
			}
			else if(c>='a' && c<='z') {
				cnt++;
			}
		}
		System.out.println("No. of vowels: "+v);
		System.out.println("No. of consonants: "+cnt);
	}

}


