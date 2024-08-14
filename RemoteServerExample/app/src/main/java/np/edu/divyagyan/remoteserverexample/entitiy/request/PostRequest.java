package np.edu.divyagyan.remoteserverexample.entitiy.request;

public class PostRequest {
    private String title;
    private String body;
    private int userId;

    public String getTitle() {
        return title;
    }

    public PostRequest setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public PostRequest setBody(String body) {
        this.body = body;
        return this;

    }

    public int getUserId() {
        return userId;
    }

    public PostRequest setUserId(int userId) {
        this.userId = userId;
        return this;
    }
}
