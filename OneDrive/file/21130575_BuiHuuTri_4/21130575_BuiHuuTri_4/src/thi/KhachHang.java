package thi;
import java.util.ArrayList;
public class KhachHang {
	String maKH;
	String tenKH;
	ArrayList<MatHang> Danhsachmathang= new ArrayList<MatHang>();
	public KhachHang(String maKH, String tenKH, ArrayList<MatHang> danhsachmathang) {
		this.maKH = maKH;
		this.tenKH = tenKH;
		Danhsachmathang = danhsachmathang;
	}
	public String getMaKH(String MaKH) {
		return MaKH;
	}
	public String getTenKH(String TenKH) {
		return TenKH;
	}
	}
	 
