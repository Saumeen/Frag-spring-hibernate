/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frag.dao;

import frag.model.Answer_CLASS;
import frag.model.Questions_CLASS;
import frag.model.UserMain;
import java.util.List;
import org.hibernate.Query;

public interface UserDao {
     List<UserMain> getAllUser();
     public void insertUser(UserMain usermain);
     public List<UserMain> CheckValidate(String username,String password);
     public List<Questions_CLASS> getquestion(int userid);
     public void insertQuestion(Questions_CLASS question,int um);
     public List getuserid(int userid);
     public List<Questions_CLASS> getAllQuestion();
     public List<Answer_CLASS> getAnswer();
}
