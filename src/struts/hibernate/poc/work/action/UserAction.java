package struts.hibernate.poc.work.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import struts.hibernate.poc.work.dao.UserDAO;
import struts.hibernate.poc.work.form.UserForm;

public class UserAction extends DispatchAction {

	
	
	public ActionForward goToAddPage(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return mapping.findForward("add");
	}
	

	
	public ActionForward addUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		UserForm userForm = (UserForm) form;
		String result = new UserDAO().createUser(userForm.getDesignation(), userForm.getSalary(),userForm.getEmpname());
		if(result.equals("success")){
			request.setAttribute("success", true);
			
		}else{
			request.setAttribute("failure", true);
		}
		return mapping.findForward("add");
	}

}
