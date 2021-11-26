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

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
