import java.util.Scanner;

public class EMS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EventManager eventManager = new EventManager();

        // Sample Events
        eventManager.addEvent(new Event(1, "Tech Conference", "2024-12-10", "New York", 100));
        eventManager.addEvent(new Event(2, "Music Festival", "2024-11-15", "Los Angeles", 200));
        eventManager.addEvent(new Event(3, "Art Exhibition", "2024-10-30", "San Francisco", 50));

        boolean exit = false;
        while (!exit) {
            System.out.println("\nEvent Management System:");
            System.out.println("1. Display Events");
            System.out.println("2. Register for Event");
            System.out.println("3. Cancel Registration");
            System.out.println("4. View Participants for Event");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    eventManager.displayEvents();
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String participantName = scanner.nextLine();
                    System.out.print("Enter event ID to register for: ");
                    int eventId = scanner.nextInt();
                    eventManager.registerParticipant(participantName, eventId);
                    break;
                case 3:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter event ID to cancel registration: ");
                    int cancelEventId = scanner.nextInt();
                    eventManager.cancelRegistration(name, cancelEventId);
                    break;
                case 4:
                    System.out.print("Enter event ID to view participants: ");
                    int viewEventId = scanner.nextInt();
                    eventManager.displayParticipantsForEvent(viewEventId);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
