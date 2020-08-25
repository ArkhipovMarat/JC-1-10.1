import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private String id;
    private Name name;

    public User(@JsonProperty("_id") String id,
                @JsonProperty("name") Name name
    ) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name=" + name +
                '}';
    }
}
