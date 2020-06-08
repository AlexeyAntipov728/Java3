package lesson4;

public class HW_lesson4 {
    static volatile char c = 'A';
    static Object test = new Object();

    static class WaitNotifyClass implements Runnable {
        private char letter;
        private char nextLetter;

        public WaitNotifyClass(char currentLetter, char nextLetter) {
            this.letter = currentLetter;
            this.nextLetter = nextLetter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (test) {
                    try {
                        while (c != letter)
                            test.wait();
                        System.out.print(letter);
                        c = nextLetter;
                        test.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        new Thread(new WaitNotifyClass('A', 'B')).start();
        new Thread(new WaitNotifyClass('B', 'C')).start();
        new Thread(new WaitNotifyClass('C', 'A')).start();
    }
}
