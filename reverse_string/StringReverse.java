package reverse_string;

import java.lang.StringBuffer;

public class StringReverse {
	//reverses the particular string, this is a naive implementation.
	public static void ReverseString(String arg){
		int strLength = arg.length();
		char[] reversedChars = new char[strLength];
		StringBuffer outStringBuffer = new StringBuffer(strLength);
		//boolean odd = (strLength % 2 == 0) ? false : true ;
		//this might deal with uneven strings automatically, figure out how java handles integer division
		for(int i = 0; i <= (strLength/2); i++){
			reversedChars[(strLength-1)-i] = arg.charAt(i);
			reversedChars[i]=arg.charAt((strLength-1)-i);
		}
		System.out.println(reversedChars);
	}

}
