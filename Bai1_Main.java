import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HinhChuNhat a = new HinhChuNhat();
		HinhChuNhat b = new HinhChuNhat();
		int x;
		System.out.println("Nhập vào thông tin của hình chữ nhật bằng 2 cách:\n"
				+ "Cách 1: Nhập trong phương thức input.\n"
				+ "Cách 2: Sử dụng getter,setter.");
		do {
		System.out.print("Chọn cách nhập thông tin: ");
		x = sc.nextInt();
		}while(x!=1 && x!=2);
		switch(x) {
		case 1:
			System.out.print("\nHình chữ nhật a: ");
			a.input();
			System.out.print("\nHình chữ nhật b: ");
			b.input();
			break;
		case 2:
			System.out.print("\nHình chữ nhật a: ");
			System.out.print("\nNhập vào chiều dài: ");
			a.setChieuDai(sc.nextInt());
			System.out.print("Nhập vào chiều rộng: ");
			a.setChieuRong(sc.nextInt());
			
			
			System.out.print("\nHình chữ nhật b: ");
			System.out.print("\nNhập vào chiều dài: ");
			b.setChieuDai(sc.nextInt());
			System.out.print("Nhập vào chiều rộng: ");
			b.setChieuRong(sc.nextInt());
			break;
		}
		System.out.println("\nHình chữ nhật a: ");
		a.output();		
		System.out.println("\nHình chữ nhật b: ");
		b.output();
		
		
		if(a.s()>b.s()) {
			System.out.println("\nDiện tích của hình chữ nhật a lớn hơn b");
		}else if(a.s()==b.s()) {
			System.out.println("\nDiện tích của hình chữ nhật a bằng b");
		}else System.out.println("\nDiện tích của hình chữ nhật a nhỏ hơn b");
	}

}
