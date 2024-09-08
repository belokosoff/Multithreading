package lab1;

public class ThreadExtend extends Thread{
    public void run() {
        try {
            for (int i = 0; i <= 100; i++) {
                if (i % 10 == 0){
                    System.out.println(i);
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException exc) {
            System.out.println("Поток прерван.");
        }
        System.out.println("Поток завершен.");
    }
}
