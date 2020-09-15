import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int count=1;
     while(n!=1){
         if(n%2==0){
         n=n/2;
         count++;
     }else{
         n=(n*3)+1;
         count++;
     }
         
     }
        
    System.out.println(count);
    
    }
}
