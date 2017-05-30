package reverse_string;

public class StringReverse {
	//reverses the particular string, this is a naive implementation.
	public static void ReverseString(String arg){
		int strLength = arg.length();
		//boolean odd = (strLength % 2 == 0) ? false : true ;
		//this might deal with uneven strings automatically, figure out how java handles integer division
		for(int i = 0; i <= (strLength/2)-1; i++){
			//requires string builder, but I don't have access to the docs
			//char swap = arg[i];
			//arg[i]=arg[(strLength-1)-i];
		}
	}

}
