
package frag.model;

import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="answers")
public class Answer_CLASS {
    
    @Id @GeneratedValue
    private int Aid;
    private String Answer;
    private Date dateandtime;
    private int Upvote,Downvote;

    public int getAid() {
        return Aid;
    }

    public void setAid(int Aid) {
        this.Aid = Aid;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    public Date getDateandtime() {
        return dateandtime;
    }

    public void setDateandtime(Date dateandtime) {
        this.dateandtime = dateandtime;
    }

    public int getUpvote() {
        return Upvote;
    }

    public void setUpvote(int Upvote) {
        this.Upvote = Upvote;
    }

    public int getDownvote() {
        return Downvote;
    }

    public void setDownvote(int Downvote) {
        this.Downvote = Downvote;
    }
 /*------------------------------ONE TO ONE WITH ANSWER AND USERID-------------------*/   
    @OneToOne(cascade = CascadeType.ALL)
    private UserMain usermain;

    public UserMain getUsermain() {
        return usermain;
    }
    public void setUsermain(UserMain usermain) {
        this.usermain = usermain;
    }
    
}
