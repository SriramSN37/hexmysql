import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String users[]=new String [100];
        String Passds[]=new String [100];
        int c=0;
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while(true)
        {
            System.out.println("1....sign up");
            System.out.println("	2.....sign in ");
            System.out.println("3    update password ");
            System.out.println("	4    remove user");
            System.out.println("	5   show all the users ");
            System.out.println("	6  exit");

            System.out.println("enter ur choice");
            int ch=sc.nextInt();
            if(ch==1)
            {
                System.out.println("enter new user id");
                sc.nextLine();

                String u=sc.nextLine();

                System.out.println("enter new user Password");
                String p=sc.nextLine();
                boolean password = false;
                for(int i=0; i<c; i++){
                    if (Passds[i].equals(p)){
                        password = true;
                        break;
                    }
                }
                if (password == true){
                    System.out.println("already exists");
                }
                else {
                    users[c] = u;
                    Passds[c] = p;
                    c++;
                }

            }
            else if(ch==2)
            {
                System.out.println("enter new user id");
                sc.nextLine();

                String u=sc.nextLine();

                System.out.println("enter new user Password");
                String p=sc.nextLine();
                boolean exist = false;
                boolean valid_pass = false;
                for(int i=0;i<c;i++) {
                    if (users[i].equals(u)) {
                        exist = true;
                        if (Passds[i].equals(p)) {
                            valid_pass = true;
                            break;
                        }
                    }
                }
                if (exist ==true){
                     if(valid_pass==true){
                        System.out.println("Valid User");
                    }
                    else{
                        System.out.println("incorrect Password");
                    }
                   
                }
                else{
                    System.out.println("User does not exist");
                    
                }

            }
            else if(ch==3)
            {

            }
            else if(ch==4)
            {
                System.out.println("Enter the username: ");
                sc.nextLine();
                String u = sc.nextLine();

                System.out.println("Enter the password: ");
                String p = sc.nextLine();
                int pos = -1;
                for(int i=0;i<c;i++){
                    if(users[i].equals(u)&&Passds[i].equals(p)){
                        pos=i;
                        for(int j=pos;j<c;j++){
                            users[j]=users[j+1];
                            Passds[j] = Passds[j+1];
                        }
                        System.out.println("user does not exist");
                        c--;
                    }
                }

            }
            else if(ch==5)
            {

                for(int i=0;i<c;i++)
                {
                    System.out.println(users[i] + "  "+ Passds[i]);
                }

            }
            else
            {
                break;
            }}

    }

}