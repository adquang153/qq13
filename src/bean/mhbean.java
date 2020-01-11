package bean;

import java.sql.Date;

public class mhbean {
	private String mamh;
	private String tenmh;
	private int sotc;
	private int sob;
	private int sosvtt;
	private int sosvtd;
	private int sosvdk;
	private Date ngaynh;
	private Date ngayhh;
	public mhbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public mhbean(String mamh, String tenmh, int sotc, int sob, int sosvtt, int sosvtd, int sosvdk, Date ngaynh,
			Date ngayhh) {
		super();
		this.mamh = mamh;
		this.tenmh = tenmh;
		this.sotc = sotc;
		this.sob = sob;
		this.sosvtt = sosvtt;
		this.sosvtd = sosvtd;
		this.sosvdk = sosvdk;
		this.ngaynh = ngaynh;
		this.ngayhh = ngayhh;
	}
	public String getMamh() {
		return mamh;
	}
	public void setMamh(String mamh) {
		this.mamh = mamh;
	}
	public String getTenmh() {
		return tenmh;
	}
	public void setTenmh(String tenmh) {
		this.tenmh = tenmh;
	}
	public int getSotc() {
		return sotc;
	}
	public void setSotc(int sotc) {
		this.sotc = sotc;
	}
	public int getSob() {
		return sob;
	}
	public void setSob(int sob) {
		this.sob = sob;
	}
	public int getSosvtt() {
		return sosvtt;
	}
	public void setSosvtt(int sosvtt) {
		this.sosvtt = sosvtt;
	}
	public int getSosvtd() {
		return sosvtd;
	}
	public void setSosvtd(int sosvtd) {
		this.sosvtd = sosvtd;
	}
	public int getSosvdk() {
		return sosvdk;
	}
	public void setSosvdk(int sosvdk) {
		this.sosvdk = sosvdk;
	}
	public Date getNgaynh() {
		return ngaynh;
	}
	public void setNgaynh(Date ngaynh) {
		this.ngaynh = ngaynh;
	}
	public Date getNgayhh() {
		return ngayhh;
	}
	public void setNgayhh(Date ngayhh) {
		this.ngayhh = ngayhh;
	}
}
