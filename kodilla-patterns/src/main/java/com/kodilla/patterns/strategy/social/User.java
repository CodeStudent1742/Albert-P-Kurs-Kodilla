package com.kodilla.patterns.strategy.social;

public class User {

    private String name;
    protected SocialPublisher socialPublisher;

    public String getName() {
        return name;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    String sharePost() {
      return  socialPublisher.share();
    }

    public User(String name) {
        this.name = name;
    }
}
