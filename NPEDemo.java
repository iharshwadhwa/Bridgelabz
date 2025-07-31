public class NPEDemo {
    static void crash() {
        String text = null;
        System.out.println(text.length());
    }

    static void handle() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {
        // crash(); // Uncomment to crash
        handle();
    }
}
