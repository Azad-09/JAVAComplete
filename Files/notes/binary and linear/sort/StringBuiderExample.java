/*
	String is immutable

		String s="hello";
		s=s.concat(" world");
		sop(s); // hello world
	StringBuffer  or StringBuilder are mutable

where is memory of any string craeted ?

	heap memory space - string pool
	temp mem space - stack


String Builder is not thread safe
String Buffer is  thread safe - slower than builder and performance is less comparitviely
	
*/
class StringBuiderExample{

	public static void main(String input[])
	{
		//StringBuilder sb=new StringBuilder("hello");
		StringBuilder sb=new StringBuilder();
		//sb="hello";
		sb.append("hello");
		System.out.println(sb);
		System.out.println("length of sb "+sb.length());
		System.out.println("capcity of sb "+sb.capacity()); ///def capacity of SBuildeer is 16
		sb.append(" world is sample demo");
		System.out.println("after append - length of sb "+sb.length());
		System.out.println("after append - capcity of sb "+sb.capacity());
		//since content exceeds capacity it applies this formula which increases the capacity
		//cap=(old*2)+2
		//sb.reverse();
		//System.out.println(sb);
		sb.delete(4,8);
		System.out.println("after delete "+sb);	
		sb.insert(4,"inserted");	
		System.out.println("after inserting "+sb);

		sb.replace(4,8,"data is");

		System.out.println("after replacing "+sb);
	}

}