package week7;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("主线程开始运行...");

        // 作业 1：传统写法
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是线程1 (传统写法)，当前时间: " + System.currentTimeMillis());
            }
        });

        // 作业 2：Lambda 写法
        Thread t2 = new Thread(() -> {
            System.out.println("我是线程2 (Lambda写法)，当前时间: " + System.currentTimeMillis());
        });

        Thread t3 = new Thread(() -> {
            System.out.println("我是线程3 (Lambda写法)，当前时间: " + System.currentTimeMillis());
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("三个子线程都已经执行完毕，主线程继续往下走，程序结束！");
    }
}