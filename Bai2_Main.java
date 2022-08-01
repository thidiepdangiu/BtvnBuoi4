
public class Main {
	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("A", 23, "TH", "CNTT");
		NhanVien nv2 = new NhanVien("B", 21, "HN", "QLI");
		NhanVien nv3 = new NhanVien("C", 21, "HP", "CNTT");
		NhanVien nv4 = new NhanVien("D", 24, "QLI", "CNTT");
		NhanVien nv5 = new NhanVien("E", 25, "HN", "QLI");

		System.out.printf("Manv\tTennv\tTuoi\tDiaChi\tBoPhan\n");

		nv1.output();

		nv2.output();

		nv3.output();

		nv4.output();

		nv5.output();
	}

}
