/*
Created By 21343008-Maharani Safitri
 */
package jobsheet9;

public class EqualstTest {
    public static void main(String[] args) {
         String str1, str2;
         str1 = "Free the bound periodicals";
         str2 = str1;
         System.out.println("String 1 : " + str1);
         System.out.println("String 2 : " + str2);
         System.out.println("Same object? " + (str1 == str2));
         
         str2 = new String(str1);
         System.out.println("String 1 : " + str1);
         System.out.println("String 2 : " + str2);
         System.out.println("Same object? " + (str1 == str2));
         
         System.out.println("Same value? " + str1.equals (str2));
         
     }
}
