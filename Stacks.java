import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<>();

        System.out.println("Is Stack Empty: " + stack.empty());

        stack.push("Minecraft");
        stack.push("Hitman 3");
        stack.push("Doom Eternal");
        stack.push("Red Dead Redemption 2");
        stack.push("Resident Evil 4");
        stack.push("No Man's Sky");

        String favoriteGame = stack.pop();

        System.out.println(stack);

        System.out.println("One of my favorite games is: " + favoriteGame);

        System.out.println(stack.peek());

        System.out.println(stack.search("Minecraft"));
        
        System.out.println("Is Stack Empty: " + stack.empty()); 
    }
}