package Day06;

public class Main extends Thread {
	public void run() {
		System.out.println("hii threads...!");
	}
class Execute{
	public static void main(String[] args) {
		Main m =new Main();
		m.run();
	}

}}
