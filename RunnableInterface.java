class ThreadZ implements Runnable{
//	@Override;
	public void run() {
		Thread t = Thread.currentThread();
		t.setName("MyThreadZ :");
		for(int i=1;i<=10;i++) {
			System.out.println(t.getName()+i);
		}
	}
}
class ThreadW implements Runnable{
//	@Override;
	public void run() {
		Thread t = Thread.currentThread();
		t.setName("MyThreadW :");
		for(int i=1;i<=10;i++) {
			System.out.println(t.getName()+i);
		}
	}
}


public class RunnableInterface {

	public static void main(String[] args) {
		ThreadZ t1 = new ThreadZ();
//		t1.start();//there is no start method in Runnable interface;
		Thread t = new Thread(t1);
		t.start();
		ThreadW t2 = new ThreadW();
		Thread t3 = new Thread(t2);
		t3.start();
	}

}
