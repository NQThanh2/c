package Task2;

public abstract class AnPham {
	private String TieuDe;
	private int SoTrang;
	private int NamXB;
	private String TacGia;
	private double GiaTien;
	public AnPham(String tieuDe, int soTrang, int namXB, String tacGia, double giaTien) {
		super();
		TieuDe = tieuDe;
		SoTrang = soTrang;
		NamXB = namXB;
		TacGia = tacGia;
		GiaTien = giaTien;
	}
	public String getTieuDe() {
		return TieuDe;
	}
	public void setTieuDe(String tieuDe) {
		TieuDe = tieuDe;
	}
	public int getSoTrang() {
		return SoTrang;
	}
	public void setSoTrang(int soTrang) {
		SoTrang = soTrang;
	}
	public int getNamXB() {
		return NamXB;
	}
	public void setNamXB(int namXB) {
		NamXB = namXB;
	}
	public String getTacGia() {
		return TacGia;
	}
	public void setTacGia(String tacGia) {
		TacGia = tacGia;
	}
	public double getGiaTien() {
		return GiaTien;
	}
	public void setGiaTien(double giaTien) {
		GiaTien = giaTien;
	}
	//// 3
	public abstract String LoaiAnPham();
	
	//// 4
	 public boolean laTapChiCachDay10Nam(int namHienTai) {
	        return this.LoaiAnPham().equals("Tạp Chí") && (namHienTai - this.NamXB >= 10);
	 }
	 //// 5
	 public boolean cungLoaiVaTacGia(AnPham other) {
	        return this.LoaiAnPham().equals(other.LoaiAnPham()) && this.TacGia.equals(other.TacGia);
	 }
}
