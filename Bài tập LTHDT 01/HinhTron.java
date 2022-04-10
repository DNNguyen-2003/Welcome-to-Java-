package HocJava;

public class HinhTron {
	double BanKinh;

	public HinhTron(double banKinh) {
		super();
		BanKinh = banKinh;
	}

	public double getBanKinh() {
		return BanKinh;
	}

	public void setBanKinh(double banKinh) {
		BanKinh = banKinh;
	}
	
	public double tinhChuVi ()
	{
		return(2*BanKinh*3.14);
	}
	
	public double tinhDienTinh ()
	{
		return(BanKinh*BanKinh*3.14);
	}
}
