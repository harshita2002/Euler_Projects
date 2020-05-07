/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.*/


public class one
{

public static void main(String[] args)
{
// TODO Auto-generated method stub
System.out.println("The sum of all the multiples of 3 or 5 below 1000");
int a=(333*(6+332*3))/2; //AP with d=3
int b=(199*(10+198*5))/2;   //AP with d=5
int c=(66*(30+65*15))/2; //AP with d=15
int sum=a+b-c; //final calculation
System.out.print(sum);
}
} 
