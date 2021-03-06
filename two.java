/*Each new term in the Fibonacci sequence is generated by
  adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
  By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
  find the sum of the even-valued terms.*/


public class two 
{

	public static void main(String[] args) 
	{
		int a=2,b=8,c=0;
		int sum=10;	//sum=a+b=2+8(first two terms)
		
		System.out.print(a+" "+b+" ");	//1st and 2nd even terms of fibonacci series
		while(c<4000000)
		{
			c=b*4+a;
			if(c>=4000000)
			{
				break;
			}
			System.out.print(c+" ");	//next even terms of fibonacci series
			a=b;
			b=c;
			sum+=c;
		}
		System.out.print("\nAns "+sum);	//final sum of even valued terms of fibonacci series
	}

}
