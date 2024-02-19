import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Strings
        String fName="Phani";
//        System.out.println(fName);
        String lName="Madiraju";
//        System.out.println(lName);
//        String fullName=fName+" "+lName;
        String fullName=fName.concat(" ").concat(lName);
//        System.out.println(fullName);
        String course="Java";
        int length=course.length();
//        System.out.println(length);
        char letter=course.charAt(0);
//        System.out.println(letter);
//        Scanner sc=new Scanner(System.in);
//        String word1=sc.next();
//        for(int i=0;i<word1.length();i++){
//            System.out.println(word1.charAt(i));
//        }
//        char letter1=word1.charAt(0);
//        System.out.println(letter1);
        String statement="I like Java";
        String extractedWord=statement.substring(7);
//        System.out.println(extractedWord);
        String words2=statement.substring(2);
//        System.out.println(words2);
        String word3=statement.substring(2,6);
//        System.out.println(word3);
        String word4="ITMASTAR";
//        String word5=word4.substring(2,5);
//        System.out.println(word5);
//        String word6=word4.substring(4,8);
//        System.out.println(word6);
        String word7=word4.substring(4);
//        System.out.println(word7);
//        System.out.println(word7.toLowerCase());
        String word8="phani";
//        System.out.println(word8.toUpperCase());
        char letter3=word8.charAt(0);
//        System.out.println(Character.toUpperCase(letter3));
        String word9="PhAnI";
//        System.out.println(word8.equalsIgnoreCase(word9));
        String word10="phani";
        int num1=10;
        int num2=20;
//        System.out.println(num1==num2);
        String s1=new String("Java");
        String s2=new String("Java");
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        System.out.println(s1.equals(s2));
        //Reverse a string
        String word11="ITMASTAR";
//        StringBuilder word12=new StringBuilder("ITMASTAR");
//        System.out.println(word12.reverse());
        String reveresedWord ="";
        for(int i=word11.length()-1;i>=0;i--){
//            System.out.print(word11.charAt(i));

            reveresedWord=reveresedWord+word11.charAt(i);
//            System.out.println("Reversed word :: "+reveresedWord);
        }
//        System.out.println(reveresedWord);
//check palindrome
        String palindrome="Dad";
        String reverse="";
        for(int i=palindrome.length()-1;i>=0;i--){
            reverse=reverse+palindrome.charAt(i);
        }
        if(reverse.equalsIgnoreCase(palindrome)){
            System.out.println(palindrome +" is a palindrome");
        }
    }
}