import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("🤖 Chatbot: Hello! I am your Java Chatbot. How can I help you today?");

        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            // Exit condition
            if (input.contains("bye")) {
                System.out.println("🤖 Chatbot: Goodbye! Have a great day!");
                break;
            }

            // Basic responses
            if (input.contains("hello") || input.contains("hi")) {
                System.out.println("🤖 Chatbot: Hello! Nice to meet you.");
            } 
            else if (input.contains("how are you")) {
                System.out.println("🤖 Chatbot: I am fine! What about you?");
            } 
            else if (input.contains("your name")) {
                System.out.println("🤖 Chatbot: I am your Java Chatbot, created by Anuj!");
            } 
            else if (input.contains("help")) {
                System.out.println("🤖 Chatbot: I can talk to you! Ask me anything.");
            } 
            else if (input.contains("who are you")) {
                System.out.println("🤖 Chatbot: I am a simple chatbot built using Java.");
            } 
            else if (input.contains("code alpha") || input.contains("codealpha")) {
                System.out.println("🤖 Chatbot: CodeAlpha is a great platform for learning and internships!");
            }
            else {
                System.out.println("🤖 Chatbot: Sorry, I didn't understand that. Try asking something else!");
            }
        }

        sc.close();
    }
              }
