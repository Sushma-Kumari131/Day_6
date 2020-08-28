import java.util.Scanner;

public class AllPrograms {
	
	//Remove whitespaces
	public static void whitespaces(String s1) {
		System.out.println(s1.replace(" ",""));
	}
	
	
	//Strings are palindrome or not
	public static void palindrome(String s2) {
		int i=0,j=s2.length()-1;
		boolean isPalindrome=true;
		while(i<j) {
			if(s2.charAt(i)!=s2.charAt(j)) {
				isPalindrome= false;	
				break;
			}
			i++;
			j--;
		}
		if(isPalindrome)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}	
	
	
	// Strings are rotations of each other or not
	public static void stringRotation(String s2,String s3) {
		boolean isRotation=false;
		String temp=s2+s2;
		if((s2.length()==s3.length()) && temp.indexOf(s3)!=-1) {
			isRotation=true;
		}
		if(isRotation)
			System.out.println("Rotations of each other");
		else
			System.out.println("Not rotations of each other");		
	}
	
	
	//Duplicate words in a String
	public static void duplicateWords(String s1) {
		String words[]=s1.split(" ");
		for(int i=0;i<words.length;i++) {
			int count=1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j]="0";
				}
			}
			if(count>1 && words[i]!="0")
				System.out.println(words[i]);
		}
	}
	
	
	//Smallest and largest word in a string
	public static void largestAndSmallestWord(String s1){
		String s[]=s1.split(" ");
		String smallest=s[0];
		String largest="";
		for(String str:s) {
			if(str.length()<smallest.length())
				smallest=str;
			else if(str.length()>largest.length())
				largest=str;
		}
		System.out.println("Smallest: "+smallest+" and Largest: "+largest);
	}
	
	
	//swap two string variables
	public static void swap(String s2,String s3) {
		System.out.println("Before swapping s2: "+s2+" and s3: "+s3);
		s2=s2+s3;
		s3=s2.substring(0,s2.length()-s3.length());
		s2=s2.substring(s3.length());
		System.out.println("After swapping s2: "+s2+" and s3: "+s3);
	}
	
	
	//Strings are anagram or not
	public static void anagram(String s2,String s3) {
		boolean isAnagram=true;
		int a[]=new int[256];
		for(char c:s2.toCharArray()) {
			int index=(int) c;
			a[index]++;
		}
		
		for(char c:s3.toCharArray()) {
			int index=(int) c;
			a[index]--;
		}
		
		for(int i=0;i<256;i++) {
			if(a[i]!=0) {
				isAnagram=false;
				break;
			}
		}
		
		if(isAnagram)
			System.out.println("Anagram");
		else
			System.out.println("Not anagram");		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.next();
		String s3=sc.next();
		sc.close();
		whitespaces(s1);
		palindrome(s2);
		stringRotation(s2,s3);
		duplicateWords(s1);
		largestAndSmallestWord(s1);
		swap(s2,s3);
		anagram(s2,s3);

	}

}
