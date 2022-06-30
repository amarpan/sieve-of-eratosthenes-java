/*
File Name: main.java
Name: Amar Panjwani
Description: This program calculates the prime numbers in an integer set up to a specified perfect square n.
Date: 05/25/21
Email: panjwania@student.vvc.edu
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;


public class Main {
  /*
    Fills an empty set with numbers in between 2 and the specified perfect square.
    @param - nums - empty set of integers to fill
    @param - perfSquare - the perfect square and last number to fill the set with
  */
  public static void fillSet(Set<Integer> nums, int perfSquare)
  {
    int i = 2;
    while (i <= perfSquare)
    {
      nums.add(i);
      i++;
    }
    System.out.println(nums);
    System.out.println("");
  }

  /*
    Calculates the prime numbers from a given set.
    @param - nums - the full set of integers to analyze
    @perfSquare - the specified perfect square and last number in the set
  */
  public static void primeCalc(Set<Integer> nums, int perfSquare)
  {
    double sqrtpf = Math.sqrt(perfSquare);
    for(int j = 2; j<= sqrtpf; j++)
    {
      Iterator<Integer> iter = nums.iterator();
      while(iter.hasNext())
      {
        int temp = iter.next();
        if(temp % j == 0 && temp != j)
        {
          iter.remove();
        }
      }
    }
   System.out.println("Prime Numbers: " + nums);
  }

  public static void main(String[] args)
  {
    Set<Integer> nums = new TreeSet<Integer>();
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a perfect square: ex. 64,81,100,121,144,169,etc: ");
    int perfSquare = in.nextInt();
    fillSet(nums,perfSquare);
    primeCalc(nums,perfSquare);
  }
}