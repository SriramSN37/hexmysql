package JAVA.Abs.Collections;
import java.util.*;

public class PassportDatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> users = new HashSet<>(); 
        Map<String, Integer> userPassports = new HashMap<>(); 
        PriorityQueue<String> sortedUsers = new PriorityQueue<>(Comparator.naturalOrder()); 

        while (true) {
            System.out.println("1...Add user");
            System.out.println("2...Remove user");
            System.out.println("3...Update user");
            System.out.println("4...Search users");
            System.out.println("5...Show all users");
            System.out.println("6...Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the user name:");
                    sc.nextLine();
                    String userName = sc.nextLine();
                    if (users.contains(userName)) {
                        System.out.println("User already exists.");
                    } else {
                        System.out.println("Enter the passport number:");
                        int passportNumber = sc.nextInt();
                        users.add(userName);
                        userPassports.put(userName, passportNumber);
                        sortedUsers.add(userName);
                        System.out.println("User added successfully.");
                    }
                    break;

                case 2:
                    System.out.println("Enter the user to remove:");
                    sc.nextLine();
                    String userToRemove = sc.nextLine();
                    if (users.contains(userToRemove)) {
                        users.remove(userToRemove);
                        userPassports.remove(userToRemove);
                        sortedUsers.remove(userToRemove);
                        System.out.println("User removed successfully.");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;

                case 3:
                    System.out.println("Enter the user name to update passport number:");
                    sc.nextLine();
                    String userToUpdate = sc.nextLine();
                    if (users.contains(userToUpdate)) {
                        System.out.println("Enter new passport number:");
                        int newPassportNumber = sc.nextInt();
                        userPassports.put(userToUpdate, newPassportNumber);
                        System.out.println("Passport number updated successfully.");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter the user to search:");
                    sc.nextLine();
                    String userToSearch = sc.nextLine();
                    if (users.contains(userToSearch)) {
                        System.out.println("User found:");
                        System.out.println("Name: " + userToSearch + ", Passport Number: " + userPassports.get(userToSearch));
                    } else {
                        System.out.println("User not found.");
                    }
                    break;

                case 5:
                    System.out.println("All users in the database:");
                    while (!sortedUsers.isEmpty()) {
                        String user = sortedUsers.poll();
                        System.out.println("Name: " + user + ", Passport Number: " + userPassports.get(user));
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}
