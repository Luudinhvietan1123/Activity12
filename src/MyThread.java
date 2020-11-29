public class MyThread implements Runnable{
    //Nên sử dụng implement runnable để tránh tình trạng đa kế thừa khi kế thừa thread

    public Thread t;
    public String name;

    public MyThread(String threadName, int timeSleep) throws InterruptedException {
        name = threadName;
        t = new Thread(this, name);
        t.sleep(timeSleep);
        t.start();
    }

    //How to handle interrupted exception in java thread.sleep without swallow it?

    /*
    -->
    public MyThread(String threadNAme, int timeSleep){
        name = threadName;
        t = new Thread(this, name);
        try{
            while(!Thread.currentThread().isInterrupted()){
                t1.sleep(timeSleep);
            }
        }catch(InterruptedException e){
            t1.currentThread().interrupt();
        }
    }
    */


    public void run(){
        System.out.println(name);
        while (true){
        }
    }
}
