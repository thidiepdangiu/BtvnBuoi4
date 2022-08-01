import java.util.Scanner;

public class PtBac2 {
	private static Scanner sc = new Scanner(System.in);
	private int a, b, c;

	public PtBac2() {
		super();
	}

	public void input() {
		System.out.print("Nhập a= ");
		a = sc.nextInt();
		System.out.print("Nhập b= ");
		b = sc.nextInt();
		System.out.print("Nhập c= ");
		c = sc.nextInt();
	}

	public void output() {
		System.out.println("Phương trình: " + a + "x^2 + " + b + "x + " + c + " = 0");
	}

	public void tinhNghiem() {
		if (a == 0) {
			System.out.println("Nghiệm của phương trình là: " + (double)-c / b);
		} else {
			double delta, x, x1, x2;
			delta = (Math.pow(b, 2) - 4 * a * c) / (2 * a);
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm.");
			} else if (delta == 0) {
				x = (double) -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép x= " + x);
			} else {
				x1 = (double) (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (double) (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có hai nghiệm phân biệt:\nx1= " + x1 + ",\nx2= " + x2);
			}
		}
	}

}
