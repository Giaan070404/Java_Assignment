import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        News news = null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    news = new News();
                    System.out.print("Enter Title: ");
                    news.setTitle(scanner.next());
                    System.out.print("Enter Publish Date: ");
                    news.setPublishDate(scanner.next());
                    System.out.print("Enter Author: ");
                    news.setAuthor(scanner.next());
                    System.out.print("Enter Content: ");
                    news.setContent(scanner.next());
                    news.Calculate(); // Calculate and store average rate
                    break;
                case 2:
                    if (news != null) {
                        news.Display();
                    } else {
                        System.out.println("No news available. Please insert news first.");
                    }
                    break;
                case 3:
                    if (news != null) {
                        float averageRate = news.Calculate();
                        System.out.println("Average Rate: " + averageRate);
                        news.Display();
                    } else {
                        System.out.println("No news available. Please insert news first.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}

