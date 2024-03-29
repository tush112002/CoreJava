package twitter;

import java.sql.SQLException;
import java.util.Scanner;

public class TestUsers {

    public static void main(String[] args) {
        UsersDAOImpl us = new UsersDAOImpl();
        TweetsDAOImpl td = new TweetsDAOImpl();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("------Menu Screen-------");
            System.out.println("Enter 1 For SignUp");
            System.out.println("Enter 2 For SignIn");
            System.out.println("Enter 3 For ViewProfile");
            System.out.println("Enter 4 For UpdateProfile");
            System.out.println("Enter 5 For Tweet");
            System.out.println("Enter 6 For View My Tweet");
            System.out.println("Choose From Menu:");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    signUp(sc, us);
                    break;
                case 2:
                    signIn(sc, us);
                    break;
                case 3:
                    viewProfile(sc, us);
                    break;
                case 4:
                    updateProfile(sc, us);
                    break;
//                case 5:
//                	td.addNewTweet(new Tweets(1,"", choice, choice));
                default:
                    System.out.println("Choose a valid option!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void signUp(Scanner sc, UsersDAOImpl us) throws SQLException {
        System.out.println("Enter user ID:");
        int u_id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("Enter user name:");
        String u_name = sc.nextLine();

        System.out.println("Enter user email:");
        String u_email = sc.nextLine();

        System.out.println("Enter password:");
        String u_password = sc.nextLine();

        System.out.println("Enter user bio:");
        String u_bio = sc.nextLine();

        System.out.println("Enter user avatar:");
        String u_avatar = sc.nextLine();

        Users newUser = new Users(u_id, u_name, u_email, u_password, u_bio, u_avatar);
        us.signUp(newUser);
    }

    private static void signIn(Scanner sc, UsersDAOImpl us) {
        System.out.println("Enter your email:");
        String email = sc.nextLine();
        try {
            us.signIn(email);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void viewProfile(Scanner sc, UsersDAOImpl us) throws SQLException {
        System.out.println("Enter user ID:");
        int u_id = sc.nextInt();
        us.viewProfile(u_id);
    }

    private static void updateProfile(Scanner sc, UsersDAOImpl us) throws SQLException {
        System.out.println("Enter user ID:");
        int u_id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("Enter user name:");
        String u_name = sc.nextLine();

        System.out.println("Enter user email:");
        String u_email = sc.nextLine();

        System.out.println("Enter password:");
        String u_password = sc.nextLine();

        System.out.println("Enter user bio:");
        String u_bio = sc.nextLine();

        System.out.println("Enter user avatar:");
        String u_avatar = sc.nextLine();

        Users updatedUser = new Users(u_id, u_name, u_email, u_password, u_bio, u_avatar);
        us.updateProfile(updatedUser);
    }
}
