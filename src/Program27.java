import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program27 {

	static void Anchor() {
		System.out.println(Pattern.compile("^Hello").matcher("Hello  how are you").find()); // matches the line starting with Hello
		
		System.out.println(Pattern.compile("you$").matcher("Hello  how are you").find()); // matches the line ending with you
		
		System.out.println(Pattern.compile("^Hello how are you$").matcher("Hello how are you").find()); // matches the whole start and end
		
		System.out.println(Pattern.compile("Hello").matcher("Hello how are you").find()); // matches specific word with pattern
	}

	static void Declare() {
		Pattern p = Pattern.compile(".s"); // .(dot) means any single character can be special
		Matcher m = p.matcher("as");
		boolean b = m.matches();

		boolean b1 = Pattern.compile("..s").matcher("res").matches();

		boolean b2 = Pattern.matches("A......", "AADITYA");
		System.out.println(b + " " + b1 + " " + b2);
	}

	static void charClass() {
		System.out.println(Pattern.matches("[abcd]", "d")); // any of the char mentioned in bracket
		
		System.out.println(Pattern.matches("[^abcd]", "x")); // except the char mentioned in bracket
		
		System.out.println(Pattern.matches("[a-zA-Z]", "B")); // any char from A-Z irrespective of case sensitivity
		
		System.out.println(Pattern.matches("[a-f[x-z]]", "y")); // a to f Or x to z [a-fx-z]
		
		System.out.println(Pattern.matches("[a-z&&[fax]]", "f")); // between a to z and in f,a, or x
		
		System.out.println(Pattern.matches("[a-z&&[^doc]]", "t")); // between a to z and not in d,o or c
	}

	static void quantifiers() {
		System.out.println("Quantifier ? ([xyz]? - x,y,z comes one time or not at all)------------------------");
		System.out.println(Pattern.matches("[amn]?", "m"));
		System.out.println(Pattern.matches("[amn]?", ""));
		System.out.println(Pattern.matches("[A-Za-z]?", ""));
		System.out.println(Pattern.matches("[A-Za-z]?", "T")); // Takes single char irrespective of case sensitivity

		System.out.println("Quantifier + ([xyz]+ - x,y,zcomes one or more time)------------------------");
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));
		System.out.println(Pattern.matches("[amn]+", "aamna"));
		System.out.println(Pattern.matches("[A-Za-z]+", ""));
		System.out.println(Pattern.matches("[A-Za-z]+", "Aaditya"));

		System.out.println("Quantifier * ([xyz]* - x,y,z comes zero or more time)------------------------");
		System.out.println(Pattern.matches("[amn]*", "aammmnn"));
		System.out.println(Pattern.matches("[amn]*", "anm"));
		System.out.println(Pattern.matches("[A-Za-z]*", ""));
		System.out.println(Pattern.matches("[A-Za-z]*", "Aaditya"));

		System.out.println("Quantifier [xyz]{2} - x,y,z comes n times here n=2-----------------------");
		System.out.println(Pattern.matches("[amn]{2}", "aa"));
		System.out.println(Pattern.matches("[A-Za-z]{7}", "Aaditya"));

		System.out.println("Quantifier [xyz]{2,} - x,y,z comes n times and more times here n=2-----------------------");
		System.out.println(Pattern.matches("[amn]{2,}", "aaaaa"));
		System.out.println(Pattern.matches("[a-zA-Z]{6,}", "Aaditya"));

		System.out.println("Quantifier [xyz]{2,3} - x,y,z comes at least y times but less than z times here y=2, z=3-----------------------");
		System.out.println(Pattern.matches("[amn]{2,3}", "aaa"));
		System.out.println(Pattern.matches("[a-zA-Z]{2}", "aa"));
	}

	static void metaChar() {
		System.out.println("\\d -Any digits------------------------");
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d{2}", "19"));
		
		System.out.println("\\D -Any non-digits------------------------");
		System.out.println(Pattern.matches("\\D", "A"));
		System.out.println(Pattern.matches("\\D{2}", "Ad"));
		
		System.out.println("\\s -Any whitespace character------------------------");
		System.out.println(Pattern.matches("\\s", " "));
		System.out.println(Pattern.matches("\\s{2}", "  "));
		
		System.out.println("\\S -Any non-whitespace character------------------------");
		System.out.println(Pattern.matches("\\S", "z"));
		System.out.println(Pattern.matches("\\S{2}", "Ad"));
		
		System.out.println("\\w -Any word character------------------------");
		System.out.println(Pattern.matches("\\w", "a"));
		System.out.println(Pattern.matches("\\w{2}", "Ad"));
		
		System.out.println("\\W -Any non-word character------------------------");
		System.out.println(Pattern.matches("\\W", " "));
		System.out.println(Pattern.matches("\\W{2}", "  "));
	}

	static void regFinder() {
		Scanner sc = new Scanner(System.in);
		boolean found = false;
		while (true) {
			System.out.println("Enter regex pattern:");
			Pattern pattern = Pattern.compile(sc.nextLine());
			System.out.println("Enter text:");
			Matcher matcher = pattern.matcher(sc.nextLine());
			while (matcher.find()) {
				System.out.println("I found the text --" + matcher.group() + "-- starting at index " + matcher.start()
						+ " and ending at index " + matcher.end());
				found = true;
			}
			if (!found) {
				System.out.println("No match found.");
			}
		}
	}

	static void example() {
		System.out.println("Pattern to check Date: "+Pattern.matches("(\\d{2}).(\\d{2}).(\\d{4})","02/01/1999"));
		System.out.println("Pattern to check Names: "+Pattern.matches("(\\w+),\\s(Mr|Ms|Mrs|Dr).?\\s(\\w+)","Dwivedi, Mr. Aaditya"));
		System.out.println("Pattern to check Url: "+Pattern.matches("(https?)://(www)?.?(\\w+).(\\w+)/?(\\w+)?","http://www.google.com"));
		System.out.println("Pattern to check Email address: "+Pattern.matches("([a-zA-Z0-9\\_\\-\\.]+)@([a-zA-Z]+).(.+)","test123@gmail.co.in"));
		System.out.println("Pattern to check number: "+Pattern.matches("([789]{2})([0-9]{8})","7847248751"));
	}
	
	public static void main(String[] args) {
		Anchor();
		Declare();
		charClass();
		quantifiers();
		metaChar();
		regFinder();
		example();
	}
}
