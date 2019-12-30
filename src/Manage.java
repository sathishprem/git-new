
public class Manage{

public static void main(String[] args) {
      String s="Application";
      int length = s.length();
      System.out.println(length);
      char c=s.charAt(5);
      System.out.println(c);
      String uppercase=s.toUpperCase();
      System.out.println(uppercase);
      String lowercase=s.toLowerCase();
      System.out.println(lowercase);
     
	int indexof = s.indexOf("t");
      System.out.println(indexof);
       int lastindexof=s.lastIndexOf("a");
      System.out.println(lastindexof );
     boolean contain=s.contains("application");
     System.out.println(contain);
     boolean equals =s.equals("Application");
     System.out.println(equals);
   boolean equalsignorecase = s.equalsIgnoreCase("Application");
   System.out.println(equalsignorecase);
   boolean startwith = s.startsWith("Ap");
   System.out.println(startwith);
   boolean endswith = s.endsWith("on");
   System.out.println(endswith);
   String s1="   How are you"   ;
   String trim = s1.trim();
   System.out.println(trim);
   String substring = s1.substring(4,8);
   System.out.println(substring);
      for(int i=s.length()-1;i>0;i--) {
      
	
	char charAt = s.charAt(i);
	System.out.println(charAt);
}
}
}
     
