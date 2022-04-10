package HocJava;

public class HinhChuNhat {
	double ChieuDai;
	double ChieuRong;
	
	public HinhChuNhat(double chieuDai, double chieuRong) {
		super();
		ChieuDai = chieuDai;
		ChieuRong = chieuRong;
	}
	
	public double getChieuDai() {
		return ChieuDai;
	}
	
	public void setChieuDai(double chieuDai) {
		ChieuDai = chieuDai;
	}
	
	public double getChieuRong() {
		return ChieuRong;
	}
	
	public void setChieuRong(double chieuRong) {
		ChieuRong = chieuRong;
	}
	
	public double tinhChuVi ()
	{
		return ((ChieuDai+ChieuRong)*2);
	}
	
	public double tinhDienTich ()
	{
		return (ChieuDai*ChieuRong);
	}
	
}
