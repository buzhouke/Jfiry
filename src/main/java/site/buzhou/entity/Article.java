package site.buzhou.entity;

import java.net.InetAddress;
import java.sql.Timestamp;

/**
 * @program: Jifry
 * @description: article
 * @author: 不周
 * @create: 2020-12-09 21:22
 **/
public class Article {
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getHighlights() {
        return highlights;
    }

    public void setHighlights(String highlights) {
        this.highlights = highlights;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    private String subject;
    private String title, author, highlights, abstracts;
    private String user;

    public String getIP() {
        return IP;
    }




    public void setIP(String IP) {
        this.IP = IP;
    }

    private String IP;
    //IP 类型应为InetAddress，但是和数据库连接时需考虑类型转换，
    // MyBaits是另外定义TypeHandler，这里留坑
    private Timestamp time;
    private String fileName;
    private String filePath;
    private int articleId, subjectId;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }
//时间有限，不实现评论功能,点赞/反对功能
}
