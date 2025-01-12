public class multithreading{
    static class Test extends Thread{
        public void run(){
            try{

                System.out.println("thread"+Thread.currentThread().getId()+"is running");
            }catch (Exception e){
                System.out.println("not runing");
            }
        }
    }
    static class Test2 implements Runnable{
        public void run(){
            try{

                System.out.println("thread"+Thread.currentThread().getId()+"is running");
            }catch (Exception e){
                System.out.println("not runing");
            }
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            // Thread t=new Thread(new Test2()); //using runnale interface
            Thread t=new Test();//using thread class
            t.start();
        }
    }
}