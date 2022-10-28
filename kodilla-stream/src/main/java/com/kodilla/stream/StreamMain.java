package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args){

        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUser = forum.getUserList().stream()
                .filter(fUser -> fUser.getSex()=='M')
                .filter(fUser -> fUser.getBirthDate().getYear()<2002)
                .filter(fUser -> fUser.getNumberOfPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getIndentifier,fUser->fUser));

        theResultMapOfUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);



    }
}

