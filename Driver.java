public class Driver 
{
	public static void main(String[] args)
	{
		String s = "hellllooo";
		String s2 = "e1l12e123pha1nt123";
		System.out.println(removeVowels(s));
		System.out.println(removeConsonants(s));
		System.out.println(removeDigits(s2));
	}
	
	//returns a new String with all of the vowels
	//removed form the parameter String
	//"hello" -> hll
	static String removeVowels(String s)
	{
		s = s.replace("a","");
		s = s.replace("i","");
		s = s.replace("u","");
		s = s.replace("o","");
		s = s.replace("e","");
		return s;
	}
	
	//returns a new String with all of the consonants
	//removed form the parameter String
	//"hello" -> eo
	static String removeConsonants(String s)
	{
		char[] vowels = {'a','i','o','u','e'};
		for(int i = 0 ; i < s.length()-1;++i){
			boolean isVowel = false;
			for(int j = 0; j < vowels.length-1;j++){
				if(s.charAt(i) == vowels[j]){
					isVowel = true;
				}
			}
			if(!isVowel)
			{
				s = s.replace(""+s.charAt(i), "");
			}
		}
		return s;
	}
		
	//returns a new String with all of the numbers
	//removed form the parameter String
	//"he11o" -> heo
	static String removeDigits(String s)
	{
		char[] vowels = {'0','1','2','3','5','6','7','4','8','9'};
		for(int i = 0 ; i < s.length()-1;i++){
			boolean isDigit = false;
			for(int j = 0; j < vowels.length-1;j++){
				if(s.charAt(i) == vowels[j]){
					isDigit = true;
				}
			}
			if(isDigit)
				{
					s = s.replace(""+s.charAt(i), "");
					i--;
				}
		}
		return s;
	}
		
	//return the first occurence in s where c is found or -1 if 
	//it was not found - we can't use the String's indexOf
	static int indexOf(String s, char c)
	{
		for(int i = 0; i < s.length(); i = i + 1)
		{
			if(s.charAt(i) == c)
			{
				return i;
			}
		}
		//if we are still kicking....
		return -1;
	}
	
	static void displayString(String s)
	{
		//should display the contents of the String one character per line
		for(int i = 0; i < s.length(); i = i + 1)
		{
			System.out.println(s.charAt(i));
		}
	}
	
	static void displayWithSpaces(String s)
	{
		String answer = "";
		for(int i = 0; i < s.length(); i = i + 1)
		{
			answer = answer + s.charAt(i) + " ";
		}
		System.out.println(answer);
	}
	
	//this method should display on a single line the input String
	//in reverse: "hello" -> "olleh"
	static String reverseString(String s)
	{
		String answer = "";
		for(int i = s.length()-1; i >= 0; i = i - 1)
		{
			answer = answer + s.charAt(i);
		}
		return answer;
	}
}