import java.util.Scanner;

public class HinhChuNhat {
	private static Scanner sc = new Scanner(System.in);
	// khai báo đối tượng scanner có từ khóa static để nhập cho toàn bộ chương trình
	private int chieuDai;
	private int chieuRong;

	public HinhChuNhat(int chieuDai, int chieuRong) {

		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public HinhChuNhat() {
		
	}

	public int getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}

	public int getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}

	public void input() {
		System.out.print("\nMời nhập vào chiều dài: ");
		chieuDai = sc.nextInt();
		System.out.print("Mời nhập chiều rộng: ");
		chieuRong = sc.nextInt();
	}

	public void output() {
		System.out.println("Chiều dài của hình chữ nhật là: " + chieuDai);
		System.out.println("Chiều rộng của hình chữ nhật là: " + chieuRong);
		System.out.println("Diện tích của hình chữ nhật là: " +chieuDai * chieuRong );
		System.out.println("Chu vi của hình chữ nhật là: " +  2 * (chieuDai + chieuRong));
	}
	public int s() {
		return chieuDai*chieuRong;
	}
}
