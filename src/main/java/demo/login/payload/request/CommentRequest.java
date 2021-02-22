package demo.login.payload.request;

import java.util.Date;

public class CommentRequest {

    private Long userId;
    private Long postId;
    private String commentContent;
    private String subComment;

    public CommentRequest(Long userId, Long postId, String commentContent, String subComment, Date commentDate) {
        this.userId = userId;
        this.postId = postId;
        this.commentContent = commentContent;
        this.subComment = subComment;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

}
