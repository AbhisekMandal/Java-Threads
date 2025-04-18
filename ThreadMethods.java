
public class ThreadMethods {

	public static void main(String[] args) {
		Mythread t = new Mythread();
		t.start();
		System.out.println(Thread.currentThread());
		System.out.println(t);
		t.setName("Mythread");
		System.out.println(t);
		System.out.println(t.getName());
		t.setPriority(8); //Priority should be between 1-10
		t.setPriority(18);
		System.out.println(t.getPriority());
	}

}
class Mythread extends Thread{
	public void run() {
		System.out.println("I a thread");

	}
}