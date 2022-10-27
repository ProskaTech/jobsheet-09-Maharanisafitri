/*
Created By 21343008-Maharani Safitri
 */
package jobsheet9;

public class TestPastByReference {
    public static void main(String[] args) {
    int[] ages = {10,11,12};
    for (int i = 0; i < ages.length; i++) {
        System.out.println(ages[i]);
        
    }
    test (ages);
    
    for (int i = 0; i<ages.length; i++){
        System.out.println(ages[i]);
    }
           
}
    public static void test(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 50;
            
        }
        
    }
}
