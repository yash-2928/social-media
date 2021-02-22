package demo.login.payload.request;

import java.util.Date;

public class CommentRequest {
    
    private Long enrollmentNo;
    private String commentContent;
    private String subComment;
    private Date commentDate;

    public CommentRequest(Long enrollmentNo, String commentContent, String subComment, Date commentDate) {
        this.enrollmentNo = enrollmentNo;
        this.commentContent = commentContent;
        this.subComment = subComment;
        this.commentDate = commentDate;
    }

    public Long getEnrollmentNo() {
        return enrollmentNo;
    }

    public void setEnrollmentNo(Long enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getSubComment() {
        return subComment;
    }

    public void setSubComment(String subComment) {
        this.subComment = subComment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }
    
}
