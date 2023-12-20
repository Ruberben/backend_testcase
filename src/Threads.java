class Threads implements Runnable{
    public  void run(){
        System.out.println("Thread sedang Berjalan...");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Threads());
        thread.start();

    }
}
