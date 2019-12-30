

public class LiteralString {
public static void main(String[] args) {
	String s="kumar";
	String s1="sathish";
	System.out.println("LiteralString");
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	String s2= new String ("kumar");
	String s3=new String ("kumar");
	System.out.println("NonLiteralString");
	System.out.println(System.identityHashCode(s2));
	System.out.println(System.identityHashCode(s3));
	String s4= new String("kumar");
	String s5=new String("kumar");
	System.out.println("immutablestring");
	System.out.println(System.identityHashCode(s4));
	System.out.println(System.identityHashCode(s5));
	String s6=s4.concat(s5);
	System.out.println(s6);
	System.out.println(System.identityHashCode(s6));
	StringBuffer s7=new  StringBuffer("kumar");
	StringBuffer s8=new StringBuffer("sathish");
	System.out.println("mutable");
	System.out.println(System.identityHashCode(s7));
	System.out.println(System.identityHashCode(s8));
	StringBuffer s9=s7.append(s8);
	System.out.println(s9);
	System.out.println(System.identityHashCode(s9));
	
}

}
