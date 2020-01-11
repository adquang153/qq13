package bean;

import java.sql.Date;

public class svbean {
	private String masv;
	private String hoten;
	private String gioitinh;
	private Date ngaysinh;
	private String diachi;
	private String lop;
	private String email;
	private String sdt;
	private String ttc;
	public svbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public svbean(String masv, String hoten, String gioitinh, Date ngaysinh, String diachi, String lop, String email,
			String sdt, String ttc) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.lop = lop;
		this.email = email;
		this.sdt = sdt;
		this.ttc = ttc;
	}
	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getTtc() {
		return ttc;
	}
	public void setTtc(String ttc) {
		this.ttc = ttc;
	}
	
	
}
