public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator("Son");
        Thread thread1 = new Thread(numberGenerator1);
        NumberGenerator numberGenerator2 = new NumberGenerator("Nam");
        Thread thread2 = new Thread(numberGenerator2);

    }
}
