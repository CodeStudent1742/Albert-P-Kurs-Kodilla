package com.kodilla.patterns2.observer.homework;


import com.kodilla.patterns2.observer.forum.Observer;

public class Mentor implements ObserverHomework {
    private final String MentorName;

    private int updateCount;

    public Mentor(String mentorName) {
        MentorName = mentorName;
    }
    @Override
    public void update(HomeworkQue homeworkQue) {
        System.out.println( "New homework from " + homeworkQue.getStudentName() + "\n" +
                " (total: " + homeworkQue.getHomeworks().size() + " homeworks)");
        updateCount++;
    }

    public String getMentorName() {
        return MentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
