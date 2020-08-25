import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "all")
public class CatFact {

    private String id;
    private String text;
    private String type;
    private User user;
    private Integer upvotes;
    private Integer userUpvotes;

    public CatFact(@JsonProperty("_id") String id,
                   @JsonProperty("text") String text,
                   @JsonProperty("type") String type,
                   @JsonProperty("user") User user,
                   @JsonProperty("upvotes") Integer upvotes,
                   @JsonProperty("userUpvotes") Integer userUpvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
        this.userUpvotes = userUpvotes;
    }

    public CatFact() {
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public User getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    public Integer getUserUpvotes() {
        return userUpvotes;
    }

    @Override
    public String toString() {
        return "CatFact{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user=" + user +
                ", upvotes=" + upvotes +
                ", userUpvotes=" + userUpvotes +
                '}';
    }
}
