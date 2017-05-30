package reverse_string;

import java.lang.StringBuffer;

public class StringReverse {
	//reverses the particular string, this is a naive implementation.
	public static String ReverseString(String arg){
		int strLength = arg.length();
		char[] reversedChars = new char[strLength];
		StringBuffer outStringBuffer = new StringBuffer(strLength);//use this to build a new string to return


		for(int i = 0; i <= (strLength/2); i++){
			reversedChars[(strLength-1)-i] = arg.charAt(i);
			reversedChars[i]=arg.charAt((strLength-1)-i);
		}
		outStringBuffer.append(reversedChars);
		return outStringBuffer.toString();
	}

}
