package ru.netology.domain;

public class PostRepliesInfo {
    private String replyAuthorImageUrl;
    private String replyAuthorName;
    private String replyText;
    private String replyBannerUrl;

    public String getReplyAuthorImageUrl() {
        return replyAuthorImageUrl;
    }

    public void setReplyAuthorImageUrl(String replyAuthorImageUrl) {
        this.replyAuthorImageUrl = replyAuthorImageUrl;
    }

    public String getReplyAuthorName() {
        return replyAuthorName;
    }

    public void setReplyAuthorName(String replyAuthorName) {
        this.replyAuthorName = replyAuthorName;
    }

    public String getReplyText() {
        return replyText;
    }

    public void setReplyText(String replyText) {
        this.replyText = replyText;
    }

    public String getReplyBannerUrl() {
        return replyBannerUrl;
    }

    public void setReplyBannerUrl(String replyBannerUrl) {
        this.replyBannerUrl = replyBannerUrl;
    }
}
