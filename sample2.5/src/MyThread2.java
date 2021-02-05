public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 999999998; i++) {
            System.out.println("新年新对象，年年不一样");
        }
    }
}
