package com.lits.automation.hw6;

public class News implements Comparable<News> {
    private String topic;
    private String date;

    public News(String topic, String date) {
        this.topic = topic;
        this.date = date;
    }

    @Override
    public String toString() {
        return "News{" +
                "topic = " + topic +
                ", date = " + date +
                '}';
    }


    @Override
    public int compareTo(News news) {
        return news.topic.compareTo(this.topic) -
                news.date.compareTo(this.date);
    }
}
