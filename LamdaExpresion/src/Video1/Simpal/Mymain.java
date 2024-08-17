package Video1.Simpal;

public class Mymain {
	public static void main(String[] args) {
		// without Lambda Expression
		MyInterface MyIn = new MyInterface() {

			@Override
			public void message(String Name, char symbols) {
				// TODO Auto-generated method stub

			}
		};

		// With Lambda Expression
		String name = "Fardeen";
		char symbol = '!';
		MyInterface MyI = (x, y) -> {
			System.out.println("Hello World!");
			System.out.println("It Is a Nice Day,No?.");
			System.out.println(x + " " + y);
		};
		MyI.message(name, symbol);
	}

}
