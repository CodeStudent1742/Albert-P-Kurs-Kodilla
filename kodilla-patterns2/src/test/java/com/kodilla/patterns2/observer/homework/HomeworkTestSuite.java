package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.ForumTopic;
import com.kodilla.patterns2.observer.forum.ForumUser;
import com.kodilla.patterns2.observer.forum.JavaHelpForumTopic;
import com.kodilla.patterns2.observer.forum.JavaToolsForumTopic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testUpdate() {
        // Given
        HomeworkQue StudentOne = new StudentOneQue();
        HomeworkQue StudentTwo =  new StudentTwoQue();
        HomeworkQue StudentThree =  new StudentTwoQue();
        Mentor johnSmith = new Mentor("John Smith");
        Mentor ivoneEscobar= new Mentor("Ivone Escobar");

        StudentOne.registerObserver(johnSmith);
        StudentTwo.registerObserver(ivoneEscobar);
        StudentThree.registerObserver(ivoneEscobar);

        // When
        StudentOne.addHomework("24.1");
        StudentTwo.addHomework("24.1");
        StudentTwo.addHomework("24.2");
        StudentThree.addHomework("24.2");

        // Then
        assertEquals(1, johnSmith.getUpdateCount());
        assertEquals(3, ivoneEscobar.getUpdateCount());

    }
}

