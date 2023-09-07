package work;

public class ThreadDemo {
    public static void main(String[] args) {


        Runnable r1=()->{
            for (int i=0;i<10;i++){
                System.out.println(i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };
        Thread t1=new Thread(r1);
        t1.setName("John");
        t1.start();
    }
}
