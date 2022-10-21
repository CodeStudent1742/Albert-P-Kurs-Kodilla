package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.library.Book;
import com.kodilla.testing.library.LibraryDatabase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    @Mock
    private Statistics statisticsMock;

    private static int testCounter = 0;

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case #" + testCounter + " end");
    }
    private List<String> generateListOfNUsers(int userQuantity) {
        List<String> userList = new ArrayList<>();
        for (int n = 1; n <= userQuantity; n++) {
            String theUsers = new String("UserName "+n);
            userList.add(theUsers);
        }
        return userList;
    }

    @Test
    void testAveragefor0Posts() {
        //Given
        StatisticsRegister register = new StatisticsRegister();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> resultUsers = generateListOfNUsers(0);
        int Comments = 0;
        int Posts = 0;

        when(statisticsMock.usersNames())
                .thenReturn(resultUsers);
        when(statisticsMock.commentsCount())
                .thenReturn(Comments);
        when(statisticsMock.postsCount())
                .thenReturn(Posts);
        register.calculateAdvStatistics(statisticsMock);
        //When
        double averageForPostsPerUser = register.getAverageNumberOfPostsPerUser();
        double averageForCommentsPerUser = register.getAverageNumberOfCommentsPerUser();
        double averageForCommentsPerPost = register.getAverageNumberOfCommentsPerPost();
        //Then
        Assertions.assertEquals(0, averageForPostsPerUser);
        Assertions.assertEquals(0, averageForCommentsPerUser);
        Assertions.assertEquals(0, averageForCommentsPerPost);
    }
    @Test
    void testAveragefor1000Posts() {
        //Given
        StatisticsRegister register = new StatisticsRegister();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> resultUsers = generateListOfNUsers(100);
        int Comments = 500;
        int Posts = 1000;

        when(statisticsMock.usersNames())
                .thenReturn(resultUsers);
        when(statisticsMock.commentsCount())
                .thenReturn(Comments);
        when(statisticsMock.postsCount())
                .thenReturn(Posts);
        register.calculateAdvStatistics(statisticsMock);
        //When
        double averageForPostsPerUser = register.getAverageNumberOfPostsPerUser();
        double averageForCommentsPerUser = register.getAverageNumberOfCommentsPerUser();
        double averageForCommentsPerPost = register.getAverageNumberOfCommentsPerPost();
        //Then
        Assertions.assertEquals(10, averageForPostsPerUser);
        Assertions.assertEquals(5, averageForCommentsPerUser);
        Assertions.assertEquals(0.5, averageForCommentsPerPost);
    }
    @Test
    void testAveragefor0Comments() {
        //Given
        StatisticsRegister register = new StatisticsRegister();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> resultUsers = generateListOfNUsers(10);
        int Comments = 0;
        int Posts = 1;

        when(statisticsMock.usersNames())
                .thenReturn(resultUsers);
        when(statisticsMock.commentsCount())
                .thenReturn(Comments);
        when(statisticsMock.postsCount())
                .thenReturn(Posts);
        register.calculateAdvStatistics(statisticsMock);
        //When
        double averageForPostsPerUser = register.getAverageNumberOfPostsPerUser();
        double averageForCommentsPerUser = register.getAverageNumberOfCommentsPerUser();
        double averageForCommentsPerPost = register.getAverageNumberOfCommentsPerPost();
        //Then
        Assertions.assertEquals(0.1, averageForPostsPerUser);
        Assertions.assertEquals(0, averageForCommentsPerUser);
        Assertions.assertEquals(0, averageForCommentsPerPost);
    }
    @Test
    void testAverageforMoreCommentsThanPosts() {
        //Given
        StatisticsRegister register = new StatisticsRegister();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> resultUsers = generateListOfNUsers(10);
        int Comments = 100;
        int Posts = 10;

        when(statisticsMock.usersNames())
                .thenReturn(resultUsers);
        when(statisticsMock.commentsCount())
                .thenReturn(Comments);
        when(statisticsMock.postsCount())
                .thenReturn(Posts);
        register.calculateAdvStatistics(statisticsMock);
        //When
        double averageForPostsPerUser = register.getAverageNumberOfPostsPerUser();
        double averageForCommentsPerUser = register.getAverageNumberOfCommentsPerUser();
        double averageForCommentsPerPost = register.getAverageNumberOfCommentsPerPost();
        //Then
        Assertions.assertEquals(1, averageForPostsPerUser);
        Assertions.assertEquals(10, averageForCommentsPerUser);
        Assertions.assertEquals(10, averageForCommentsPerPost);
    }
    @Test
    void testAverageforMorePostsThanComments() {
        //Given
        StatisticsRegister register = new StatisticsRegister();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> resultUsers = generateListOfNUsers(10);
        int Comments = 10;
        int Posts = 100;

        when(statisticsMock.usersNames())
                .thenReturn(resultUsers);
        when(statisticsMock.commentsCount())
                .thenReturn(Comments);
        when(statisticsMock.postsCount())
                .thenReturn(Posts);
        register.calculateAdvStatistics(statisticsMock);
        //When
        double averageForPostsPerUser = register.getAverageNumberOfPostsPerUser();
        double averageForCommentsPerUser = register.getAverageNumberOfCommentsPerUser();
        double averageForCommentsPerPost = register.getAverageNumberOfCommentsPerPost();
        //Then
        Assertions.assertEquals(10, averageForPostsPerUser);
        Assertions.assertEquals(1, averageForCommentsPerUser);
        Assertions.assertEquals(0.1, averageForCommentsPerPost);
    }
    @Test
    void testAveragefor0Users() {
        //Given
        StatisticsRegister register = new StatisticsRegister();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> resultUsers = generateListOfNUsers(0);
        int Comments = 0;
        int Posts = 0;

        when(statisticsMock.usersNames())
                .thenReturn(resultUsers);
        when(statisticsMock.commentsCount())
                .thenReturn(Comments);
        when(statisticsMock.postsCount())
                .thenReturn(Posts);
        register.calculateAdvStatistics(statisticsMock);
        //When
        double averageForPostsPerUser = register.getAverageNumberOfPostsPerUser();
        double averageForCommentsPerUser = register.getAverageNumberOfCommentsPerUser();
        double averageForCommentsPerPost = register.getAverageNumberOfCommentsPerPost();
        //Then
        Assertions.assertEquals(0, averageForPostsPerUser);
        Assertions.assertEquals(0, averageForCommentsPerUser);
        Assertions.assertEquals(0, averageForCommentsPerPost);
    }
    @Test
    void testAveragefor100Users() {
        //Given
        StatisticsRegister register = new StatisticsRegister();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> resultUsers = generateListOfNUsers(100);
        int Comments = 0;
        int Posts = 0;

        when(statisticsMock.usersNames())
                .thenReturn(resultUsers);
        when(statisticsMock.commentsCount())
                .thenReturn(Comments);
        when(statisticsMock.postsCount())
                .thenReturn(Posts);
        register.calculateAdvStatistics(statisticsMock);
        //When
        double averageForPostsPerUser = register.getAverageNumberOfPostsPerUser();
        double averageForCommentsPerUser = register.getAverageNumberOfCommentsPerUser();
        double averageForCommentsPerPost = register.getAverageNumberOfCommentsPerPost();
        //Then
        Assertions.assertEquals(0, averageForPostsPerUser);
        Assertions.assertEquals(0, averageForCommentsPerUser);
        Assertions.assertEquals(0, averageForCommentsPerPost);
    }
}
