package Hackthonprograms;


class Punctuation{
	public void countypunctuation(String str) {
		int count=0;
	    char ch[]=str.toCharArray();
	    for(int i=0;i<str.length();i++)
	    {
	    if(ch[i]=='.'|| ch[i]=='?' || ch[i]=='!' || ch[i]==','|| ch[i]==';') {
	    	count++;
	    	
	    }
	    }
	    System.out.print(count); 
		
	}
	
}
public class Doselect_CountPunctu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Punctuation p=new Punctuation();
		 p.countypunctuation("?hii!ankita,how are you?");
		 
   
	}

}
