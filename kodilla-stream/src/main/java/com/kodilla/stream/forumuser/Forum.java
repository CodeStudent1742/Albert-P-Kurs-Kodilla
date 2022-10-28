package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Forum {

   private final List<ForumUser> forum = new ArrayList<>();

   public Forum(){
       forum.add(new ForumUser(1,"Johny",'M',1999,8,8,5));
       forum.add(new ForumUser(2,"Joe",'M',2005,8,8,1));
       forum.add(new ForumUser(3,"Jimmy",'M',1992,1,1,0));
       forum.add(new ForumUser(4,"Sam",'M',1993,2,2,2));
       forum.add(new ForumUser(5,"Jeremmy",'M',1989,3,8,0));
       forum.add(new ForumUser(6,"Julia",'F',1999,8,8,2));
       forum.add(new ForumUser(7,"Anna",'F',1999,9,8,5));
       forum.add(new ForumUser(8,"Grace",'F',1999,8,9,2));
       forum.add(new ForumUser(9,"Bob",'M',1994,8,8,0));
   }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(forum);
    }
}
