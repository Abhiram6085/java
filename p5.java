class abhi
{
public static void main(String args[])
{
int s1=100,s2=80,e;
e=s1;
s1=s2;
s2=e;
System.out.println(s1);
System.out.println(s2);
s1=s1+s2;
s2=s1-s2;
s1=s1-s2;
System.out.println(s1);
System.out.println(s2);
}
}