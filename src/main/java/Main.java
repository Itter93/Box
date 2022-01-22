public class Main {
    private static int gameTime = 10000;

    public static void main(String[] args) {
        Box box = new Box();

        new Thread(null, box::openTheBox, "Пользователь").start();
        new Thread(null, box::closeTheBox, "Игрушка").start();

        try {
            Thread.sleep(gameTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        box.interrupt();
    }
}
