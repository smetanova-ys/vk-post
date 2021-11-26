package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private String ownerLogoUrl;
    private String postTitle;
    private boolean postIsPinned;
    private String postText;
    private String postBanner;

    private DateTime dateTime;
    private LikesInfo likesInfo;
    private PostShare postShare;
    private PostViewsInfo postViewsInfo;
    private PostRepliesInfo postRepliesInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerLogoUrl() {
        return ownerLogoUrl;
    }

    public void setOwnerLogoUrl(String ownerLogoUrl) {
        this.ownerLogoUrl = ownerLogoUrl;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public boolean isPostIsPinned() {
        return postIsPinned;
    }

    public void setPostIsPinned(boolean postIsPinned) {
        this.postIsPinned = postIsPinned;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getPostBanner() {
        return postBanner;
    }

    public void setPostBanner(String postBanner) {
        this.postBanner = postBanner;
    }
}
