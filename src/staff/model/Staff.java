package staff.model;

public class Staff {
	
	private String name_department;
		
	private int id_staff ;
	private int  id_department ;
	private String name_staff ;
	private String info_staff ;
	private String avatar_staff ;
	private String position_staff;
	private String cert_staff;
	private String info_cert;
	private String multi_cert;
	
    
	private String salary_month1;
	private String salary_month2;
	private String salary_month3;
	private String salary_month4;
	private String salary_month5;
	private String salary_month6;
	private String salary_month7;
	private String salary_month8;
	private String salary_month9;
	private String salary_month10;
	private String salary_month11;
	private String salary_month12;
	
	
	
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Staff(String name_department, int id_staff, int id_department, String name_staff, String info_staff, 
			String avatar_staff,String position_staff,String cert_staff,String info_cert, String multi_cert, String salary_month1)
	{
		super();
		this.name_department = name_department;
		this.id_staff = id_staff;
		this.id_department = id_department;
		
		this.name_staff = name_staff;
		this.info_staff = info_staff;
		this.avatar_staff = avatar_staff;
		this.position_staff = position_staff;
		this.cert_staff = cert_staff;
		this.info_cert = info_cert;
		this.multi_cert = multi_cert;
		this.salary_month1= salary_month1;
	}
	
	
	public Staff(int id_department, String name_department, int id_staff, String name_staff, String info_staff,
			String avatar_staff, String position_staff, String cert_staff, String salary_month1, String salary_month2,
			String salary_month3, String salary_month4, String salary_month5, String salary_month6,
			String salary_month7, String salary_month8, String salary_month9, String salary_month10,
			String salary_month11, String salary_month12) {
		super();
		this.id_staff = id_staff;
		this.id_department = id_department;
		this.name_department = name_department;
		this.name_staff = name_staff;
		this.info_staff = info_staff;
		this.avatar_staff = avatar_staff;
		this.position_staff = position_staff;
		this.cert_staff = cert_staff;
		this.salary_month1 = salary_month1;
		this.salary_month2 = salary_month2;
		this.salary_month3 = salary_month3;
		this.salary_month4 = salary_month4;
		this.salary_month5 = salary_month5;
		this.salary_month6 = salary_month6;
		this.salary_month7 = salary_month7;
		this.salary_month8 = salary_month8;
		this.salary_month9 = salary_month9;
		this.salary_month10 = salary_month10;
		this.salary_month11 = salary_month11;
		this.salary_month12 = salary_month12;
	}
	
	public String getInfo_cert() {
		return info_cert;
	}
	public void setInfo_cert(String info_cert) {
		this.info_cert += "  -  "+info_cert + "\n";
	}
	public int getId_staff() {
		return id_staff;
	}
	public void setId_staff(int id_staff) {
		this.id_staff = id_staff;
	}
	public int getId_department() {
		return id_department;
	}
	public void setId_department(int id_department) {
		this.id_department = id_department;
	}
	public String getName_department() {
		return name_department;
	}
	public void setName_department(String name_department) {
		this.name_department = name_department;
	}
	public String getName_staff() {
		return name_staff;
	}
	public void setName_staff(String name_staff) {
		this.name_staff = name_staff;
	}
	public String getInfo_staff() {
		return info_staff;
	}
	public void setInfo_staff(String info_staff) {
		this.info_staff = info_staff;
	}
	public String getAvatar_staff() {
		return avatar_staff;
	}
	public void setAvatar_staff(String avatar_staff) {
		this.avatar_staff = avatar_staff;
	}
	public String getPosition_staff() {
		return position_staff;
	}
	public void setPosition_staff(String position_staff) {
		this.position_staff = position_staff;
	}
	public String getCert_staff() {
		return cert_staff;
	}
	public void setCert_staff(String cert_staff) {
		this.cert_staff = cert_staff;
	}
	public String getSalary_month1() {
		return salary_month1;
	}
	public void setSalary_month1(String salary_month1) {
		this.salary_month1 = salary_month1;
	}
	public String getSalary_month2() {
		return salary_month2;
	}
	public void setSalary_month2(String salary_month2) {
		this.salary_month2 = salary_month2;
	}
	public String getSalary_month3() {
		return salary_month3;
	}
	public void setSalary_month3(String salary_month3) {
		this.salary_month3 = salary_month3;
	}
	public String getSalary_month4() {
		return salary_month4;
	}
	public void setSalary_month4(String salary_month4) {
		this.salary_month4 = salary_month4;
	}
	public String getSalary_month5() {
		return salary_month5;
	}
	public void setSalary_month5(String salary_month5) {
		this.salary_month5 = salary_month5;
	}
	public String getSalary_month6() {
		return salary_month6;
	}
	public void setSalary_month6(String salary_month6) {
		this.salary_month6 = salary_month6;
	}
	public String getSalary_month7() {
		return salary_month7;
	}
	public void setSalary_month7(String salary_month7) {
		this.salary_month7 = salary_month7;
	}
	public String getSalary_month8() {
		return salary_month8;
	}
	public void setSalary_month8(String salary_month8) {
		this.salary_month8 = salary_month8;
	}
	public String getSalary_month9() {
		return salary_month9;
	}
	public void setSalary_month9(String salary_month9) {
		this.salary_month9 = salary_month9;
	}
	public String getSalary_month10() {
		return salary_month10;
	}
	public void setSalary_month10(String salary_month10) {
		this.salary_month10 = salary_month10;
	}
	public String getSalary_month11() {
		return salary_month11;
	}
	public void setSalary_month11(String salary_month11) {
		this.salary_month11 = salary_month11;
	}
	public String getSalary_month12() {
		return salary_month12;
	}
	public void setSalary_month12(String salary_month12) {
		this.salary_month12 = salary_month12;
	}

	public String getMulti_cert() {
		return multi_cert;
	}

	public void setMulti_cert(String multi_cert) {
		this.multi_cert = multi_cert;
	}
	
	
}
