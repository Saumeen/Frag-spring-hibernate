package frag.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Usermain")
public class UserMain {
    
    @Id @GeneratedValue
    private int Uid;
    private String Username;
    private String Password;
    private String EmailId;
    private String BadgeType;
    private Date Dob;

    public UserMain(int Uid, String Username, String Password, String EmailId, String BadgeType, Date Dob) {
        this.Uid = Uid;
        this.Username = Username;
        this.Password = Password;
        this.EmailId = EmailId;
        this.BadgeType = BadgeType;
        this.Dob = Dob;
    }

    public UserMain() {
        }

    
    @Column(name="Uid")
    public int getUid() {
        return Uid;
    }

    public void setUid(int Uid) {
        this.Uid = Uid;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String EmailId) {
        this.EmailId = EmailId;
    }

    public String getBadgeType() {
        return BadgeType;
    }

    public void setBadgeType(String BadgeType) {
        this.BadgeType = BadgeType;
    }

    public Date getDob() {
        return Dob;
    }

    public void setDob(Date Dob) {
        this.Dob = Dob;
    }
    
    
    
    //---------------------------MAPPING ONE TO MANY WITH QUESTION CLASS-------------------------
    @OneToMany(cascade= CascadeType.ALL,mappedBy="usermain")
    private Set<Questions_CLASS> questions_class =new HashSet<Questions_CLASS>(0);

    public Set<Questions_CLASS> getQuestions_class() {
        return questions_class;
    }

    public void setQuestions_class(Set<Questions_CLASS> questions_class) {
        this.questions_class = questions_class;
    }
    
}
