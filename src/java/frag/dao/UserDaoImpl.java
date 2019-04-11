/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frag.dao;

import frag.model.Answer_CLASS;
import frag.model.Questions_CLASS;
import frag.model.UserMain;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author sonu
 */
public class UserDaoImpl implements UserDao {
    
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

@Autowired
private SessionFactory sessionFactory;

public SessionFactory getSessionFactory() {
return sessionFactory;
}
public void setSessionFactory(SessionFactory sessionFactory) {
this.sessionFactory = sessionFactory;
}

   @SuppressWarnings("unchecked")
    @Override
    public List<UserMain> getAllUser() {
        
        
       /*Session session = this.sessionFactory.getCurrentSession();
        
		List<UserMain> userList = session.createQuery("from usermain").list();
		for(UserMain p : userList){
			System.out.println("Person List::"+p);
		}
		return userList;
        */
        List<UserMain> userList;
        
        userList = (List<UserMain>)getSessionFactory().openSession().createCriteria(UserMain.class).list();
        System.out.println(userList+"print");
        
        for(UserMain p : userList){
			System.out.println("Person List::"+p);
		}
        return userList;
    }
    @Override
    public void insertUser(UserMain usermain){
        Session session = getSessionFactory().openSession();
        session.save(usermain);
    }
    
    @Override
    public List<UserMain> CheckValidate(String username,String password){
        Session session = getSessionFactory().openSession();
       
         Query query= session.createQuery("from UserMain where Username=:username AND Password=:password");
         query.setString("username", username);
         query.setString("password",password);
         List<UserMain> flag = (List<UserMain>)query.list();
        return flag;
    }
    @Override
    public List getuserid(int userid){
        Session session = getSessionFactory().openSession();
        //Query query =session.createQuery("select U.Uid From Usermain U where Username=:username");
        //query.setString("username",username);
       List id = null;
        return id;
    }
    
    @Override
    public List<Questions_CLASS> getquestion(int userid){
        Session session = getSessionFactory().openSession();
        Query query2 =session.createQuery("FROM Questions_CLASS where Uid=:userid");
        query2.setParameter("userid",userid);
        List<Questions_CLASS> id = query2.list();        
        return id;
    }
    
    @Override
    public void insertQuestion(Questions_CLASS question,int id){
    Session session = getSessionFactory().openSession();
    Query query =session.createQuery("FROM UserMain where Uid=:id");
    query.setParameter("id", id);
    List<UserMain> userobject = query.list();
    UserMain usermain =userobject.get(0);
    question.setUsermain(usermain);
    long millis =System.currentTimeMillis();
    java.sql.Date date = new java.sql.Date(millis);
    question.setDate_Time(date);
    
    session.save(question);
    }
    
    @Override
    public List<Questions_CLASS> getAllQuestion(){
    Session session = getSessionFactory().openSession();
        Query query = session.createQuery("FROM Questions_CLASS");
        List<Questions_CLASS> qs = query.list();
        System.out.println("pppp---"+qs);
        return qs;
    }

    @Override
    public List<Answer_CLASS> getAnswer() {
        Session session = getSessionFactory().openSession();
        Query query = session.createQuery("From Answer_CLASS");
        List<Answer_CLASS> ans = query.list();
        return ans;
    }
  
}
    

