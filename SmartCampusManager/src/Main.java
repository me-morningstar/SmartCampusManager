import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingService bookingService = new BookingService();

        User currentUser = new User("S101", "Sharique", "Student");

        boolean running = true;
        while (running) {
            System.out.println("\n=== SMART CAMPUS LOGISTICS MANAGER ===");
            System.out.println("Active User: " + currentUser.getName() + " (" + currentUser.getRole() + ")");
            System.out.println("1. List All Resources");
            System.out.println("2. Book a Resource");
            System.out.println("3. Return a Resource");
            System.out.println("4. Add New Resource");
            System.out.println("5. Exit");
            System.out.print("Select an option (1-5): ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    bookingService.listAllResources();
                    break;

                case "2":
                    System.out.print("Enter Resource ID to book: ");
                    String bookId = scanner.nextLine();
                    bookingService.bookResource(bookId, currentUser);
                    break;

                case "3":
                    System.out.print("Enter Resource ID to return: ");
                    String returnId = scanner.nextLine();
                    bookingService.returnResource(returnId, currentUser);
                    break;

                case "4":
                    System.out.print("Enter Resource ID: ");
                    String resId = scanner.nextLine();
                    System.out.print("Enter Resource Name: ");
                    String resName = scanner.nextLine();
                    System.out.print("Enter Resource Type (Lab/Equipment/Hall): ");
                    String resType = scanner.nextLine();

                    bookingService.addResource(new Resource(resId, resName, resType));
                    System.out.println("SUCCESS: Resource added successfully.");
                    break;

                case "5":
                    running = false;
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("INVALID OPTION: Please enter a number between 1 and 5.");
            }
        }
        scanner.close();
    }
}