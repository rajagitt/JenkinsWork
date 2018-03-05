package struts.hibernate.poc.work.dao;

import org.hibernate.Session;

import struts.hibernate.poc.work.hibernate.HibernateUtil;
import struts.hibernate.poc.work.persistence.Employee;

public class UserDAO {

	public String createUser(String designation, Integer salary, String empname) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			Employee employee = new Employee();
			employee.setDesignation(designation);
			employee.setSalary(salary);
			employee.setEmpname(empname);
			session.save(employee);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.err.println("Error creating User :" + e.getMessage());
			session.getTransaction().rollback();
			return "failure";
		}
		return "success";
	}

}
