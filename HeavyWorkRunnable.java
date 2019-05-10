
public class HeavyWorkRunnable implements Runnable {
    public void run(){
        System.out.println("Doing Heavy Process - Start" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            //Get database connection, delete unused data from DB
            doDBProcessing();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Doing Heavy Process - End" + Thread.currentThread().getName());
    }
    private void doDBProcessing ()throws InterruptedException{
        Thread.sleep(5000);
    }

//    public static void main(String[] args) {
//        HeavyWorkRunnable hr = new HeavyWorkRunnable();
//        hr.run();
//    }
}
