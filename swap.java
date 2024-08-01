class abhi
{
public static void main(String args[])
{
String pname="abhi";
int p_id=1;
int t1=800,t2=1500,t3=1900,t4=1700;
double total=t1+t2+t3+t4;
double dis=0.03*total;
int dc=500;
System.out.println(total);
if(total>5000)
{
dis=0.10*total;
dc=0;
}
total=total-dis+dc;
System.out.println(total+100);
System.out.println(dis);
}
}

