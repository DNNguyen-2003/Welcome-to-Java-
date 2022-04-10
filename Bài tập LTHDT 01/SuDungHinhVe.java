package HocJava;

public class SuDungHinhVe {
	public static void main(String[] args) {
		HinhTron a= new HinhTron(12);
		HinhChuNhat b=new HinhChuNhat(12,5);
		System.out.println(a.tinhChuVi());
		System.out.println(a.tinhDienTinh());
		System.out.println(b.tinhChuVi());
		System.out.println(b.tinhDienTich());
}
}