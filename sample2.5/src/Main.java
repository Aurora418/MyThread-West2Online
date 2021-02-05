public class Main {
    public static void main(String[] args) {
        Thread t1=new Thread(new MyThread1());
        Thread t2=new Thread(new MyThread2());

        t1.start();
        t2.start();
    }
}
