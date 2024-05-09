import java.util.Scanner;
 
public class Demo {
 
  public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Book books[] = new Book[100];
	int c=0;
    boolean flag=true;
    while(true)
{
System.out.println("1...add book ");
System.out.println("2   search book");
System.out.println("3   remove book ");
System.out.println("4   update book price");
System.out.println("5 show all books ");

System.out.println("enter ur choice");
int ch=sc.nextInt();
if(ch==1)
{
books[c]=new Book();
System.out.println("enter book number");
int bn=sc.nextInt();
books[c].setBno(bn);

System.out.println("enter book name");
sc.nextLine();
String bnm=sc.nextLine();
books[c].setName(bnm);

System.out.println("enter book price");
double pr=sc.nextInt();
books[c].setPrice(pr);
c++;

}
else if(ch==2)
{
flag=false;
System.out.println("enter book number");
int bn=sc.nextInt();
for(int i=0;i<c;i++)
{
if(books[i].getBno()==bn)
{
flag =true;
System.out.println(books[i].toString());
break;
}
}
if(flag==false){
System.out.println("Not Found");}
}
else if(ch==3)
{
flag=false;
System.out.println("enter book number");
int bn=sc.nextInt();
for(int i=0;i<c;i++)
{
if(books[i].getBno()==bn)
{
flag =true;
books[i]=null;
System.out.println("book removed");
c--;
break;
}
}
if(flag==false){
System.out.println("Not Found");}
}
else if(ch==4)
{
flag=false;
System.out.println("enter book number");
int bn=sc.nextInt();
for(int i=0;i<c;i++)
{
if(books[i].getBno()==bn)
{
flag =true;
System.out.println("enter the price difference");
double pr=sc.nextDouble();
books[i].setPrice(books[i].getPrice()+pr);
System.out.println("price updated");
break;
}
}
}
else if(ch==5)
{
for(int i=0;i<c;i++)
{
System.out.println(books[i].toString());
}
}
else
{
break;
}
}
}
}
 
 

 
 