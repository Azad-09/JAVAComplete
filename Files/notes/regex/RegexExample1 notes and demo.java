import java.util.regex.*;


class RegexExample1{

	public static void main(String input[])
	{
		//String content="there is a river nearby and people use it for drinking purpose. but in recent days.....";

		//String pattern="use";//just a string
		//String pattern="r[ie]";//just a string
		//String pattern="r[ie]*r";//just a string

		//String content="abel is my name";
//		String pattern="a[abc][^abcdlkmn]l";//just a string
	
//		String pattern="a[a-d][^a-df-o]l";//just a string

//		String content="Rs.9399";
//		String pattern="[0-9][0-5][0-9][0-9]";
//		String pattern="\\d[\\d&&[0-5]]\\d\\d";
//		String pattern="[0-9]";

//		String content=" anandkumar";
//		String pattern="a.{3}d";	
//		String pattern="\\s";	
//		String pattern="\\S";	

//		String content="RS. 9399";
//		String pattern="RS.\\s\\d{4}";	

		Pattern pt=Pattern.compile(pattern); //converts a string into a searchable pattern
		Matcher m=pt.matcher(content);

		if(m.find())
			System.out.println("match found!!! "+m.group());
		else
			System.out.println("match not found!!!");

	}
}


//String content="welcOMe"  pattern= "[A-Z][A-Z]"
/*pattern = "a"  - only one occurance
Pattern = "a*"  - prev char can occur zero or n number of times

Pattern = "a+" -  prev char can occur atleast once or any number of times

Pattern = a{4} - prev char can occur 4 times 
Pattern = a{4,} - prev char can occur minimum - 4 times  maximum - many times
Pattern = a{4,8} - prev char can occur minimum - 4 times  maximum - 8 times


	.{2,4} -  
	.* - 

*/

mobile number - > 10 digit

		"[9876]\\d{9}"

400012 - "4\\d{5}"

all qn , get input from user 

write a program to check whether a given string is a valid email id or not

write a program to check if its a valid date format or not (29/03/2012)

when user enters the input check whether name starts with capital and should not contain any spaces
Anandkumar - valid
anand kumar - invalid
anandkumar- invalid


NOTE : if any of the criteria is not matching print respective error messages











