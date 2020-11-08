import java.util.Scanner;
class prog1
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int  n=sc.nextInt();
int flag=0;

for(int i=0;i<=n+4;i++)
{
i=i+1;
if(i%2==0)
{
continue;
}
for(int j=1;j<=i;j++)
{
if(flag==0)
{
System.out.print("*");
flag=1;
}
else
{
System.out.print("#");
flag=0;
}



}

System.out.println();
}


}


}

