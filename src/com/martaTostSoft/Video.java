package com.martaTostSoft;

import java.util.List;

public class Video {

    private String url;
    private String title;
    private List<String> tags;


    public Video(String url, String title, List<String> tags) {
        this.url = url;
        this.title = title;
        this.tags = tags;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
