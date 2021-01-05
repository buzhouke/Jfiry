package site.buzhou.entity;

/**
 * @program: Jifry
 * @description: the index page for subject title and the lastest article title
 * @author: 不周
 * @create: 2020-12-11 19:54
 **/
public class ShowSubject {
    private String subjectTitle;
    private String articleTitle;
    private int subjectId;
    private int articleId;

    public String getSubjectTitle() {
        return subjectTitle;
    }

    public void setSubjectTitle(String subjectTitle) {
        this.subjectTitle = subjectTitle;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }
}
