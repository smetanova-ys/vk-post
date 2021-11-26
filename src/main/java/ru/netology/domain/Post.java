package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId; // ID of the author - поле из документации
    private int createdBy; // ID of the administrator who posted the post (for communities only, returns for the requests with administrator's access token) - поле из документации
    private int date; // Date (in Unixtime) the post has been added - поле из документации
    private String postText;
    private int replyOwnerId; // Replied post's owner id - поле из документации
    private int replyPostId; // Replied post's id - поле из документации
    private int friendsOnly; // 1 if a post is marked "Friends only" - поле из документации
    private String postType; // Type of the post, can be: post, copy, reply, postpone, suggest - поле из документации
    private int signerId; // author ID (if the post has been published by the community name with the author sign) - поле из документации
    private int canPin; // поле из документации
    private int canDelete; // поле из докуметации
    private int canEdit; // поле из документации
    //private boolean postIsPinned;
    private int isPinned; // поле из документации
    private int markedAsAds; // поле из документации
    private boolean isFavorite; // поле из документации

    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private PostShare postShare;
    private Geo geo;
    //private PostViewsInfo postViewsInfo;

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
