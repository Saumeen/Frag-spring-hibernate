
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.Table;
/*
@Entity
@Table(name="Questions")
public class Questions_CLASS {
    
    @Id @GeneratedValue
    private int QID;
    private String Question;
    private int Upvote;
    private int DownVote;
    private Date Date_Time;

    public Questions_CLASS(int QID, String Question) {
        this.QID = QID;
        this.Question = Question;
    }

    public Questions_CLASS() {
        }
    
    @Column(name="QID")
    public int getQID() {
        return QID;
    }

    public void setQID(int QID) {
        this.QID = QID;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public int getUpvote() {
        return Upvote;
    }

    public void setUpvote(int Upvote) {
        this.Upvote = Upvote;
    }

    public int getDownVote() {
        return DownVote;
    }

    public void setDownVote(int DownVote) {
        this.DownVote = DownVote;
    }

    public Date getDate_Time() {
        return Date_Time;
    }

    public void setDate_Time(Date Date_Time) {
        this.Date_Time = Date_Time;
    }
    
    
    /*--------------------------------------------------------------------------*/
  /*  
   @ManyToOne(cascade=CascadeType.ALL)
   @JoinColumn(name="Uid")
   private UserMain usermain;

    public UserMain getUsermain() {
        return usermain;
    }

    public void setUsermain(UserMain usermain) {
        this.usermain = usermain;
    }


   
    
    
    /*---------------------------ONE TO MANY WITH ANSWER CLASS--------------------*/
    
 /*   @OneToMany(cascade=CascadeType.ALL)
    private Set<Answer_CLASS> answer_class = new HashSet<Answer_CLASS>(0);

    public Set<Answer_CLASS> getAnswer_class() {
        return answer_class;
    }

    public void setAnswer_class(Set<Answer_CLASS> answer_class) {
        this.answer_class = answer_class;
    }
   
    
}

package com.frag.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.Table;
*/
@Entity
@Table(name="Questions")
public class Questions_CLASS {
    
    @Id @GeneratedValue
    private int QID;
    private String Question;
    private int Upvote;
    private int DownVote;
    private Date Date_Time;

    public Questions_CLASS(int QID, String Question) {
        this.QID = QID;
        this.Question = Question;
    }

    public Questions_CLASS() {
        }

    public int getQID() {
        return QID;
    }

    public void setQID(int QID) {
        this.QID = QID;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public int getUpvote() {
        return Upvote;
    }

    public void setUpvote(int Upvote) {
        this.Upvote = Upvote;
    }

    public int getDownVote() {
        return DownVote;
    }

    public void setDownVote(int DownVote) {
        this.DownVote = DownVote;
    }

    public Date getDate_Time() {
        return Date_Time;
    }

    public void setDate_Time(Date Date_Time) {
        this.Date_Time = Date_Time;
    }
    
      
   @ManyToOne(cascade=CascadeType.ALL)
   @JoinColumn(name="Uid")
   private UserMain usermain;

    public UserMain getUsermain() {
        return usermain;
    }

    public void setUsermain(UserMain usermain) {
        this.usermain = usermain;
    }


    /*---------------------------ONE TO MANY WITH ANSWER CLASS--------------------*/
    
    @OneToMany(cascade=CascadeType.ALL)
    private Set<Answer_CLASS> answer_class = new HashSet<Answer_CLASS>(0);

    public Set<Answer_CLASS> getAnswer_class() {
        return answer_class;
    }

    public void setAnswer_class(Set<Answer_CLASS> answer_class) {
        this.answer_class = answer_class;
    }
    
    
    
    
    
    
}

