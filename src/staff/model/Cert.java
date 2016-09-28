package staff.model;

public class Cert {
	private int id_cert;
	private String cert_staff;
	private String info_cert;
	
	
	public Cert(int id_cert, String cert_staff, String info_cert) {
		super();
		this.id_cert = id_cert;
		this.cert_staff = cert_staff;
		this.info_cert = info_cert;
	}
	public int getId_cert() {
		return id_cert;
	}
	public void setId_cert(int id_cert) {
		this.id_cert = id_cert;
	}
	public String getCert_staff() {
		return cert_staff;
	}
	public void setCert_staff(String cert_staff) {
		this.cert_staff = cert_staff;
	}
	public String getInfo_cert() {
		return info_cert;
	}
	public void setInfo_cert(String info_cert) {
		this.info_cert = info_cert;
	}
	
	
}
