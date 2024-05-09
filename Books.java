import java.util.Scanner;
public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String books[]=new String[50];
        double price[]=new double[50];
        int qty[]=new int[50];
        int c=0; 
        while(true)
            {
                System.out.println("enter your choice");
                System.out.println("1. add book");
                System.out.println("2. search book");
                System.out.println("3. remove book");
                System.out.println("4. Update book price");
                System.out.println("5. Show all books");
                System.out.println("6. exit");
                int ch=sc.nextInt();
                if(ch==1)
                {
                    System.out.println("enter book name");
                    sc.nextLine();
                    String name=sc.nextLine();
                    System.out.println("enter book price");
                    double p=sc.nextDouble();
                    System.out.println("enter book quantity");
                    int q=sc.nextInt();
                    for(int i=0;i<=c;i++)
                    {
                        if(books[i]==null)
                        {
                            books[i]=name;
                            price[i]=p;
                            qty[i]=q;
                            c++;
                            break;
                        }
                    }
                }
                else if(ch==2)
                {
                    System.out.println("enter book name");
                    sc.nextLine();
                    String name=sc.nextLine();
                    for(int i=0;i<=c;i++)
                    {
                        if(name.equals(books[i]))
                        {
                            System.out.println("book found");
                            System.out.println("book name:"+books[i]);
                            System.out.println("book price:"+price[i]);
                            System.out.println("book quantity:"+qty[i]);
                            break;
                        }
                    }
                }
                else if(ch==3)
                {
                    System.out.println("enter book name");
                    sc.nextLine();
                    String name=sc.nextLine();
                    for(int i=0;i<=c;i++)
                    {
                        if(name.equals(books[i]))
                        {
                            books[i]=null;
                            price[i]=0;
                            qty[i]=0;
                            break;
                        }
                    }
                }
                else if(ch==4)
                {
                    System.out.println("enter book name");
                    sc.nextLine();
                    String name=sc.nextLine();
                    System.out.println("enter new price");
                    double p=sc.nextDouble();
                    for(int i=0;i<=c;i++)
                    {
                        if(name.equals(books[i]))
                        {
                            price[i]=p;
                            break;
                        }
                    }
                }
                else if(ch==5)
                {
                    for(int i=0;i<=c;i++)
                    {
                        if(books[i]!=null)
                        {
                            System.out.println("book name:"+books[i]);
                            System.out.println("book price:"+price[i]);
                            System.out.println("book quantity:"+qty[i]);
                        }
                    }
                }
                else if(ch==6)
                {
                    break;
                }
                else
                {
                   System.out.println("invalid choice");
                }
            }
    }
}
