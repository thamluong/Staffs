package staff.controller;


import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import staff.dao.CertDAO;
import staff.dao.DepartmentDAO;
import staff.dao.PositionDAO;
import staff.dao.SalaryDAO;
import staff.dao.StaffDAO;
import staff.model.Cert;
import staff.model.Department;
import staff.model.Position;
import staff.model.Salary;
import staff.model.Staff;

@Controller
public class MainController {

	@Autowired
	private DepartmentDAO departmentDAO;
	@Autowired
	private StaffDAO staffDAO;
	@Autowired
	private PositionDAO positionDAO;
	@Autowired
	private CertDAO certDAO;
	@Autowired
	private SalaryDAO salaryDAO;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String listStaff(ModelMap model) {
		List<Staff> listStaffs = staffDAO.list();
		model.put("listStaff", listStaffs);

		List<Department> listDepartments = departmentDAO.list();
		model.put("listDepartment", listDepartments);

		List<Position> listPositions = positionDAO.list();
		model.put("listPosition", listPositions);

		List<Cert> listCerts = certDAO.list();
		model.put("listCert", listCerts);

		List<Salary> listSalaries = salaryDAO.list();
		model.put("listSalary", listSalaries);

		model.put("listMonth",salaryDAO.listMonth());

		return "index";
	}

	@RequestMapping(value = { "/staffs_byselect" }, method = RequestMethod.GET)
	public String listStaff_aDepartment(ModelMap mmap, HttpServletRequest request) throws ParseException,SQLException {
		String id1 = request.getParameter("id_department");
		String id2 = request.getParameter("position_staff");
		String id3 = request.getParameter("cert_staff");
		String id4 = request.getParameter("month");

		if(id1.equals("0")) id1="";
		if(id2.equals("All")) id2="";		
		if(id3.equals("All")) id3="";
		if (id4.equals("0")) id4 = "January";

		mmap.put("listStaff", staffDAO.listObject(id1,id2,id3,id4));
		return "index";
	}

	@RequestMapping(value={"/detail"},method=RequestMethod.GET)
	public String detail(@RequestParam("id") String id, ModelMap model) throws SQLException, ParseException{
		Staff staff = staffDAO.detail(id);
		model.put("detail_staff", staff);

		return "detail";		
	}

}