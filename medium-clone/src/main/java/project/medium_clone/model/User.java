package project.medium_clone.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;


@Document(collection="user")
public class User {
    @Id
    private Integer userId;
    private String name;
    private String email;
    private String provider;
    private String providerId;
    private String token;
    private String providerPic;
    private List<Integer> followers;
    private List<Integer> following;

    public User() {
        this.name = "";
        this.email = "";
        this.provider = "";
        this.providerId = "";
        this.token = "";
        this.providerPic = "";
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
    }

    public User(Integer userId, String name, String email, String provider, String providerId, String token, String providerPic, List<Integer> followers, List<Integer> following) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.provider = provider;
        this.providerId = providerId;
        this.token = token;
        this.providerPic = providerPic;
        this.followers = followers;
        this.following = following;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getProviderPic() {
        return providerPic;
    }

    public void setProviderPic(String providerPic) {
        this.providerPic = providerPic;
    }

    public List<Integer> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Integer> followers) {
        this.followers = followers;
    }

    public List<Integer> getFollowing() {
        return following;
    }

    public void setFollowing(List<Integer> following) {
        this.following = following;
    }

    
}
