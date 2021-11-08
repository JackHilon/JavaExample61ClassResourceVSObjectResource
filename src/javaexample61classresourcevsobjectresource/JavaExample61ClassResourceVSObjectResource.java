
package javaexample61classresourcevsobjectresource;


public class JavaExample61ClassResourceVSObjectResource {

    
    public static void main(String[] args) {
       
        // ==== String Class ===================================================
        
        String str1 =new String("Abcde");
        String str2 = new String("AAAAAAAAAAAA");
        
        // object resource
        System.out.println("First string is ("+str1+"). Its length ("+str1.length()+")");
        System.out.println("Second string is ("+str2+"). Its length ("+str2.length()+")");
        System.out.println("First and second string are same ? "+str1.equals(str2));
        
        System.out.println();
        
        // class resource
        int a =str1.length();
        String b=String.valueOf(a);
        System.out.println("The number is: "+a);
        System.out.println("The string value of this number is: "+b);
        
        System.out.println();
        System.out.println();
        
        // ==== Integer Class ==================================================
        
        Integer num1 = new Integer(5);
        Integer num2 =new Integer("11");
        
        try{
            Integer num3 = new Integer("jhgf");
        }catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
        System.out.println("First number: "+num1);
        System.out.println("Second number: "+num2);
        System.out.println("----");
        
        // object resource
        int n1=num1.intValue();
        int n2=num2.intValue();
        
        System.out.println("First number: "+n1);
        System.out.println("Second number: "+n2);
        System.out.println("First and second numbers are same ? "+num1.equals(num2));
        
        System.out.println();
        System.out.println();
        
        // class resource
        int n=23;
        String s = "112";
        
        System.out.println("Number: "+n);
        System.out.println("String: "+s);
        System.out.println("String value of this number: "+Integer.toString(n));
        System.out.println("Convert String to int: "+Integer.parseInt(s));
    }
    
}
