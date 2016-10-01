import java.util.Scanner;

public class Test2 {
	
	public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String code = s.nextLine();
        while (s.hasNextLine()) {
            code = code + "\n" + s.nextLine();
        }

        System.out.println(code.length());

        // Write detection code here

        // System.out.println("java");

    }

}
