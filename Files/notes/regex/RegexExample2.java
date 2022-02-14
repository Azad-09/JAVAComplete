import java.util.regex.*;


class RegexExample2{

	public static void main(String input[])
	{
	//	String content="parrot is a lovely pet";
	//	String pattern="^parrot.*pet$";	
		
	/*	String content="parrot is a lovely pet. parrot is in green color. parrot can also be in different color";
		String pattern=".*?parrot";
		Pattern pt=Pattern.compile(pattern); //converts a string into a searchable pattern
		Matcher m=pt.matcher(content);
		//System.out.println();
		System.out.println(m.find(31)? m.start()+" "+m.group() +" end index "+m.end(): "not found");
	*/

	/*	String pattern="a{2}";
		String content="In the context of this Regular expression, aa few are typical and in patterns in expressions and in matcher there are many methods";
		Pattern pt=Pattern.compile(pattern); //converts a string into a searchable pattern
		Matcher m=pt.matcher(content);
		
		int count=0;
		while(m.find()){
			count++;	
		}
		System.out.println(count);	

	*/
	String pattern="(.*)dog(.*)";
	String content="dog is a pet animal";
	System.out.println(content.matches(pattern));
		
	}

}