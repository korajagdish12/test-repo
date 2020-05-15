import java.util.Scanner
public class Calculator
{
public static void main(string[] args)
Scanner reader=new Scanner(System.in);
System.out.print("enter two numbers:");
double first=reader.nextDouble();
double second=reader.nextDouble();
System.out.print("enter an operator(+,-,*,/):");
char operator=reader.next().charAt(0);
double result;
switch(operator)
{
case '+':
result=first+second;
break;
case'-':
result=first-second;
break;
case '*':
result=first*second;
break;
case '/':
result=first/second;
break;
default:
System.out.print("error! operator is not correct");
return;
}
System.out.print("%.1f %c %.1f=%.1f",first,operator,second,result);
}
}
