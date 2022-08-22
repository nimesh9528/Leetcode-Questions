/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
public class reverseString {
    public static void main(String[] v)
    {
        char [] ch={'a','b','v','h'};
        char[] c=rev(ch);
        System.out.print(c);
    }
    public static char[] rev(char[] arr) 
    {
    char[] ch=new char[arr.length];
    int j=0;
    for(int i=arr.length-1;i>=0;i--)
    {
        ch[j]=arr[i];
        j++;
    }
    return ch;
    }
    
}

