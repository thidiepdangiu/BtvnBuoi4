
public class NhanVien {
	private static int maNv = 0;
	private String tenNv;
	private int tuoiNv;
	private String diaChi;
	private String boPhan;

	public NhanVien(String tenNv, int tuoiNv, String diaChi, String boPhan) {

		this.tenNv = tenNv;
		this.tuoiNv = tuoiNv;
		this.diaChi = diaChi;
		this.boPhan = boPhan;
	}

	public void output() {
		maNv++;
		System.out.println(maNv + "\t" + tenNv + "\t" + tuoiNv + "\t" + diaChi + "\t" + boPhan);
	}

}
