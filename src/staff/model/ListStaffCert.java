package staff.model;

public class ListStaffCert {
	private int id_staff;
	private String cert_staff;
	private String info_cert;
	private String multi_cert;
	
	
	
	public ListStaffCert(int id_staff, String cert_staff,String info_cert, String multi_cert) {
		super();
		this.id_staff = id_staff;
		this.cert_staff = cert_staff;
		this.info_cert = info_cert;
		this.multi_cert = multi_cert;
	}
	public int getId_staff() {
		return id_staff;
	}
	public void setId_staff(int id_staff) {
		this.id_staff = id_staff;
	}
	public String getInfo_cert() {
		return info_cert;
	}
	public void setInfo_cert(String info_cert) {
		this.info_cert = info_cert;
	}
	public String getMulti_cert() {
		return multi_cert;
	}
	public void setMulti_cert(String multi_cert) {
		this.multi_cert = multi_cert;
	}
	public String getCert_staff() {
		return cert_staff;
	}
	public void setCert_staff(String cert_staff) {
		this.cert_staff = cert_staff;
	}
	
}
