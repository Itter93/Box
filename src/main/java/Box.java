public class Box extends Thread {
    private volatile boolean boxIsOpen;
    private int timeout = 2000;


    public void openTheBox() {
        while (!isInterrupted()) {
            if (!boxIsOpen) {
                System.out.println(Thread.currentThread().getName() + " открывает коробку");
                boxIsOpen = true;
                try {
                    Thread.sleep(timeout);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void closeTheBox() {
        while (!isInterrupted()) {
            if (boxIsOpen) {
                System.out.println(Thread.currentThread().getName() + " закрывает коробку");
                boxIsOpen = false;
            }
        }
    }

}
