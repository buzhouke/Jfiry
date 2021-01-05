package site.buzhou.entity;

import java.sql.Timestamp;

/**
 * @program: Jifry
 * @description: a subject should have a id to mark,and its content(Title),
 * then record the create date, and we also need to know who create this subject
 * @author: 不周
 * @create: 2020-12-09 21:24
 **/
public class Subject {
    private int Id;
    private String subjectContent;
    private Timestamp createdDate;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getSubjectContent() {
        return subjectContent;
    }

    public void setSubjectContent(String subjectContent) {
        this.subjectContent = subjectContent;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getSubjectCreatorEmail() {
        return subjectCreatorEmail;
    }

    public void setSubjectCreatorEmail(String subjectCreatorEmail) {
        this.subjectCreatorEmail = subjectCreatorEmail;
    }

    private String subjectCreatorEmail;
}
