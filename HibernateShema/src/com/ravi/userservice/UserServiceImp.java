package com.ravi.userservice;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.HibernateUtil.HibernateUtil;
import com.ravi.pojo.Register;

public class UserServiceImp implements UserService {
String status="";
	@Override
	public String register(String uname, String pwd, String umob) {
		try {
			SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
			Session session=sessionfactory.openSession();
		    Register register=(Register)session.get(Register.class, uname);	
		if(register==null)
		{
			Transaction ts=session.beginTransaction();
			register=new Register();
			register.setUname(uname);
			register.setPwd(pwd);
			register.setUmob(umob);
			String pk_val=(String)session.save(register);
			ts.commit();
			if(pk_val.equals(uname))
			{
				status="success";
			}
			else
			{
				status="failure";
			}
		}else
		{
			status="existed";
		}
		
		} catch (Exception e) {
			e.printStackTrace();;
		}
		
		return status;
	}

}
