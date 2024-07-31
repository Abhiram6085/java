class abhi
{
public static void main(String args[])
{
int num1=18,num2=19,num3=44;
String a=(num1>num2)?((num1>num3)?("num1 is greater"):("num3 is greater")):((num2>num3)?("num2 is greater"):("num3 is greater"));
System.out.println(a);
}
}