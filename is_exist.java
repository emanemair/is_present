import java.io.*;
import java.util.*;
public class MyClass {
    public static Boolean isExist(int arr [] , int value )
    {
        int n = arr.length ; 
        for (int i = 0 ; i < n ; i++ )
        {
            if (arr[i] == value)
            {
                return true ; 
            }
        }
        return false ; 
    }
    
    public static Boolean isExist2(int arr [] , int value )
    {
        int n = arr.length ; 
        Arrays.sort(arr) ; 
        
        for (int i = 0 ; i< n ; i ++ )
        {
            if (arr[i] > value )
            {
                return false; 
            }
            else 
            {
                if (arr[i] == value)
                {
                    return true; 
                }
            }
        }
        return false ; 
    }
    
   public static void main(String args[]) 
   {
       int arr [] = {5,4,2,1,8} ; 
       int value = 0;  
       
       if (isExist2(arr , value))
       {
           System.out.println("Yes") ; 
       }
       else {
           System.out.println("No"); 
       }
   }
}