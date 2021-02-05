public class MyThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 999999998; i++) {
            System.out.println("新年快乐，孤寡孤寡");
        }
    }
}
