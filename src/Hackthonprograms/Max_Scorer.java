package Hackthonprograms;
import java.util.*;
/*
 * public class Max_Scorer {
 * 
 * 
 * public static void display(ArrayList<String> alist) {
 * 
 * 
 * String name = Collections.max(alist);
 * System.out.println("Maximum element is: "+name);
 * 
 * 
 * 
 * }
 * 
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * Scanner sc=new Scanner(System.in); int n=sc.nextInt(); ArrayList<String>
 * alist=new ArrayList<String>();
 * 
 * for(int i=0;i<n;i++) { alist.add(sc.next()); } display(alist);
 * 
 * } }
 */


public class Max_Scorer
{
	public static void main(String[]args){

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String k="",s1="";
	int sum=0,max=0;
	ArrayList<String> al=new ArrayList<String>();
	for(int i=0;i<n;i++)
	{
		al.add(sc.next());
		
	}
     for(int i = 0; i < al.size(); i++) {
	k = al.get(i);
	StringTokenizer st = new StringTokenizer(k, "-");
	while(st.hasMoreTokens()) {
		String s = st.nextToken();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		sum = a + b + c;
		if(sum > max)
		{
			max = sum;
			s1 = s;
		}
		}
	}
System.out.println(s1);
}

}


