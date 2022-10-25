package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
   private final Integer indentifier;
   private final  String userName;
   private final char sex;
   private final LocalDate birthDate;
   private final int numberOfPosts;

    public ForumUser(Integer indentifier, String userName, char sex, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth, int numberOfPosts) {
        this.indentifier = indentifier;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public Integer getIndentifier() {
        return indentifier;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "indentifier=" + indentifier +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }

}

