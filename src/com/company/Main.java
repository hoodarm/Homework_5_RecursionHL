package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] a = {3, 5, 7, 6, 7, 5, 3};
        System.out.println(recursivePalindromeCheck(a,0,a.length));
    }

    static boolean recursivePalindromeCheck(int[] arr, int initial, int last)
    {
        if (last==0 || last==1)
            return true;

        if (arr[initial]==arr[last-1])
            return recursivePalindromeCheck(arr,initial+1,last-1);
        return false;
    }
}
