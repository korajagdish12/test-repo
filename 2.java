import java.util.Scanner
class input
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=1;
for(intj=1;j<n;j++)
{
for(int i=1;i<=j;i++)
{
System.out.print(a);
a++;
}
System.out.println();
}
}
}
