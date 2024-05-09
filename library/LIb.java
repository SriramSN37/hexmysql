package library;
import java.util.*;
public class LIb {
 
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
ArrayList<Member> members = new ArrayList<Member>();
ArrayList<book> books = new ArrayList<book>();
while(true) {
System.out.println("1.member");
System.out.println("2.admin");
System.out.println("3.exit");
System.out.println("your choice: ");
int ch=sc.nextInt();
if(ch==2) {
    System.out.println("Admin");
    System.out.println("1.add book");
    System.out.println("2.remove book");
    System.out.println("3.update price");
    System.out.println("4.search book");
    System.out.println("5.Add member");
    System.out.println("6.exit");
    System.out.println("your choice: ");
    int ch1=sc.nextInt();
    if(ch1==1) {
        book b = new book();
        System.out.println("enter book code");
        b.setCode(sc.nextInt());
        books.add(b); 
    }
    else if(ch1==2) {
        System.out.println("enter book code");
        int b=sc.nextInt();
        boolean flag=false;
        for(book i : books) {
        if(i.getCode()==b) {
        flag=true;
        books.remove(i);
        break;
        }
        }
        if(flag==false) {
        System.out.println("Book not found");
        }
        
        
    }
    else if(ch1==3) {
        System.out.println("enter book code");
        int b=sc.nextInt();
        boolean flag=false;
        for(book i : books) {
        if(i.getCode()==b) {
        flag=true;
        System.out.println("enter new price");
        i.setPrice(sc.nextDouble());
        break;
        }
        }
        if(flag==false) {
        System.out.println("Book not found");
        }

    }
    else if(ch1==4) {
         System.out.println("Enter book number");
        int b=sc.nextInt();
        boolean flag=false;
        for(book i : books) {
        if(i.getCode()==b) {
        flag=true;
        System.out.println(i.toString());
        break;
        }
        }
        if(flag==false) {
        System.out.println("Book not found");
        }
        }
        else if(ch1==5) {
        Member m = new Member();
        System.out.println("enter member id");
        m.setM_id(sc.nextInt());
        System.out.println("enter member name");
        sc.nextLine();
        m.setName(sc.nextLine());
        System.out.println("enter member email");
        m.setEmail(sc.nextLine());
        System.out.println("member added successfully");
        members.add(m);
        }
        else if(ch1==6) {
        break;
        }
       
        }
       
    
    
else if(ch==2) {
    System.out.println("Member");
    System.out.println("1.issue book");
    System.out.println("2.return book");
    System.out.println("3.exit");
    System.out.println("your choice: ");
    int ch1=sc.nextInt();
    if(ch1==1) {
        System.out.println("enter member id");
        int m=sc.nextInt();
        boolean flag=false;
        for(Member i : members) {
        if(i.getM_id()==m) {
        flag=true;
        System.out.println("enter book code");
        int b=sc.nextInt();
        boolean flag1=false;
        for(book j : books) {
        if(j.getCode()==b) {
        flag1=true;
        if(j.getQuantity()==0) {
        System.out.println("book not available");
        }
        else {
        j.setQuantity(j.getQuantity()-1);
        System.out.println("book issued successfully");
        }
        break;
    }
    }
    if(flag1==false) {
    System.out.println("book not found");
    }
    break;
    }
    }
    if(flag==false) {
    System.out.println("member not found");
    }
    }
    else if(ch1==2) {
    System.out.println("enter member id");
    int m=sc.nextInt();
    boolean flag=false;
    for(Member i : members) {
    if(i.getM_id()==m) {
    flag=true;
    System.out.println("enter book code");
    int b=sc.nextInt();
    boolean flag1=false;
    for(book j : books) {
    if(j.getCode()==b) {
    flag1=true;
    j.setQuantity(j.getQuantity()+1);
    System.out.println("book returned successfully");
    break;
    }
    }
    if(flag1==false) {
    System.out.println("book not found");
    }
    break;
    }
    }
    if(flag==false) {
    System.out.println("member not found");
    }
    }
    else if(ch1==3) {
    break;
    }
    }
    else if(ch==3) {
    break;
    }
    }
    }
    }
 

