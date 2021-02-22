package demo.login.payload.request;

public class PostRequest {

    private Long enrollmentNo;

    private String photos;
    private String postTitle;
    private String postType;
    private String content;

    public Long getEnrollmentNo() {
        return enrollmentNo;
    }

    public void setEnrollmentNo(Long enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public PostRequest(Long enrollmentNo, String postTitle, String postType, String content, String photos) {
        this.enrollmentNo = enrollmentNo;
        this.postTitle = postTitle;
        this.postType = postType;
        this.content = content;
        this.photos = photos;
    }
}