import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DigitalContent one = new DigitalContent("One", "111", "1901");
        DigitalContent two = new DigitalContent("Two", "222", "1902");
        DigitalContent three = new DigitalContent("Three", "333", "1903");
        DigitalContent four = new DigitalContent("Four", "444", "1904");
        DigitalContent five = new DigitalContent("Five", "555", "1905");

        ArrayList<DigitalContent> Video = new ArrayList<>();
        Video.add(one);
        Video.add(two);
        Video.add(three);
        Video.add(four);
        Video.add(five);

        StreamingService Netflix = new StreamingService(Video);

        Client client = new Client(Netflix, null);

//        clientMenu();

        System.out.println(
                """
                        A. Display Digital Content Library
                        B. Display Currently Streaming Digital Content
                        C. Match Digital Content to Stream
                        D. Stop Streaming
                        E. Quit Client Application""" + "\n" +
                        "Please make a selection"
        );

        Scanner scanner = new Scanner(System.in);
        String selection = scanner.nextLine().toUpperCase();

        if(selection.equals("A")){
            System.out.println("Displaying content library:");
            System.out.println(Netflix.toString());
        }
        if(selection.equals("B")) {
            System.out.println("Currently streaming:");
            if (client.getCurrentlyStreamed() != null) {
                System.out.println(client.getCurrentlyStreamed().toString());
            } else {
                System.out.println("Not currently streaming");
            }
        }
        if(selection.equals("C")){
            if (client.getCurrentlyStreamed() != null) {
                System.out.println(client.getCurrentlyStreamed().toString());
            }
            System.out.println("Input selection");
            System.out.println(Video.toString());
            String query = scanner.nextLine();
            if(Video.contains(query)) {
                client.stream(query);
                System.out.println(client.getCurrentlyStreamed());
            } else {
                System.out.println("Film not found.");
                clientMenu();
            }
        }
        if(selection.equals("D")){
            client.stop();
            System.out.println("Stream stopped");
        }

        if(selection.equals("E")){
            System.out.println("System shutting down");
        }
    }

    public static void clientMenu(){
        System.out.println(
                """
                        A. Display Digital Content Library
                        B. Display Currently Streaming Digital Content
                        C. Match Digital Content to Stream
                        D. Stop Streaming
                        E. Quit Client Application""" + "\n" +
                        "Please make a selection"
        );
    }
}