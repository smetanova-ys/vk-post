package ru.netology.domain;

public class PostShare {
    private int shareCounter;
    int userReposted; // поле из документации

    public int getShareCounter() {
        return shareCounter;
    }

    public void setShareCounter(int shareCounter) {
        this.shareCounter = shareCounter;
    }

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }
}
