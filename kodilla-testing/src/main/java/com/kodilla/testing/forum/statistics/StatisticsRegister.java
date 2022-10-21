package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticsRegister  {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    Statistics statistics;


    public void calculateAdvStatistics(Statistics statistics){
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
        if (statistics.usersNames().size() == 0){
            this.averageNumberOfPostsPerUser = 0;
            this.averageNumberOfCommentsPerUser = 0;
        }else {
            this.averageNumberOfCommentsPerUser = (double)numberOfComments / (double)numberOfUsers;
            this.averageNumberOfPostsPerUser = (double)numberOfPosts / (double)numberOfUsers;
        }
        if(statistics.postsCount()==0){
            this.averageNumberOfCommentsPerPost =0;
        }else{
            this.averageNumberOfCommentsPerPost = (double)numberOfComments / (double)numberOfPosts;
        }
    }

    public int getNumberOfUsers(){
        return numberOfUsers;
    }
    public int getNumberOfPosts(){
        return numberOfPosts;
    }
    public int getNumberOfComments(){
        return numberOfComments;
    }

    public double getAverageNumberOfCommentsPerUser(){
        return averageNumberOfCommentsPerUser;
    }
    public double getAverageNumberOfCommentsPerPost(){
        return averageNumberOfCommentsPerPost;
    }
    public double getAverageNumberOfPostsPerUser(){
        return averageNumberOfPostsPerUser;
    }
}
