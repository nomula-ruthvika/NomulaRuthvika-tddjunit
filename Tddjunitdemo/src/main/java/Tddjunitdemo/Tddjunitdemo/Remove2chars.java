package Tddjunitdemo.Tddjunitdemo;

public class Remove2chars {
	public String remove(String string)
	{
	int stringLength=string.length();
	if(string.charAt(0)=='A'&&string.charAt(1)=='A')
	{
		String result=string.substring(2,stringLength);
		return result;
		}
	if(string.charAt(0)=='A'&&string.charAt(1)!='A')
	{
      String result=string.substring(1,stringLength); 
      return result;
	}
	if(string.charAt(0)!='A'&&string.charAt(1)=='A')
	{
	String result=string.charAt(0)+string.substring(2,stringLength)	;
	return result;
	}
	else
	{
		return string;
	}
	}
}
