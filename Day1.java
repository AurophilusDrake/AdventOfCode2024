/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Day1
{ //  39687   54930
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		ArrayList<Long> list1 = new ArrayList<Long>();
		ArrayList<Long> list2 = new ArrayList<Long>();
		do{
		    list1.add(sc.nextLong());
		    list2.add(sc.nextLong());
		    
		}while(sc.hasNextLong());
		Collections.sort(list1);
		Collections.sort(list2);

    System.out.println(sum(list1, list2));         // part 1
		System.out.println(similarity(list1, list2));  // part 2
	}
    public static long similarity(ArrayList<Long> list1, ArrayList<Long> list2)
    {
        long similarity = 0;
        for(long n : list1)
        {   
            int count=0,first=0,last =0;
            first = list2.indexOf(n);
            if(first > -1)
            {
                last = list2.lastIndexOf(n);
                count = last - first +1;
            }
            similarity += n*count;
        }
        return similarity;
    }
    
    public static long sum(ArrayList<Long> list1, ArrayList<Long> list2)
    {

    	long sum =0;
    	for (int i = list1.size()-1; i>=0; i--)
		{
		    sum += Math.abs((list1.get(i)) - (list2.get(i)));
		}


		return sum;
	}
}
