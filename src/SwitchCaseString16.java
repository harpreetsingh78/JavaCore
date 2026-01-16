public class SwitchCaseString16 {
    public static void main(String[] args) {
        String var="CAST";
        switch(var.toLowerCase())
        {
            case "editor" -> System.out.println("This is editor");
            case "cast" -> System.out.println("This is cast");
            case "actor" -> System.out.println("This is actor");
            case "team" -> System.out.println("This is team");
            default -> System.out.println("Invalid Entry");
        }
    }
}
