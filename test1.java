class abhi
{
	public static void main(String args[])
	{
		char a='2';
		System.out.println(a);
		if(a>='0' && a<='9')
		{
		System.out.println("i am a number");
		switch(a)
		{
			case '1':System.out.println("roman1");
			break;
			case '2':System.out.println("roman2");
			break;
			default :System.out.println("i am not a number");
		}
		}
		else
		System.out.println("i am not a number");
		

	}
}