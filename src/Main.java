public class Main {
    public static void main(String[] args) {
        // Press ⌥⏎ with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press ⌃R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 31; i++) {

            // Press ⌃D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing ⌘F8.
            System.out.println("i = " + i);
        }

        Bar.bar();
    }
}

class Bar {
    @Deprecated(forRemoval=true)
    public static void bar() {

    }
}