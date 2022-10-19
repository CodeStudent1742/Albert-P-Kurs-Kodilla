package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class shapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Shape functions tests")
    class theShape {
        @Test
        @DisplayName("Test ShapeName")
        void testGetShapeName() {
            //Given
//            Shape theShape = new Shape("Triangle",3,4,5);
            Shape theShape = new Triangle(3,4,5);

            //When
            String retrievedName;
            retrievedName = theShape.getShapeName();

            //Then
            Assertions.assertEquals("Triangle", retrievedName);
        }

        @Test
        @DisplayName("Test Triangle Field ")
        void testGetField1() {
            //Given
//            Shape theShape = new Shape("Triangle",3,4,5);
            Shape theShape = new Triangle(3,4,5);
            //When
            Double retrievedField;
            retrievedField = theShape.getField();

            //Then
            Assertions.assertEquals(6, retrievedField);
        }
        @Test
        @DisplayName("Test Circle Field ")
        void testGetField2() {
            //Given
//            Shape theShape = new Shape("Circle",1);
            Shape theShape = new Circle(1);
            //When
            Double retrievedField;
            retrievedField = theShape.getField();

            //Then
            Assertions.assertEquals(3.14, retrievedField);
        }
        @Test
        @DisplayName("Test Square Field ")
        void testGetField3() {
            //Given
//            Shape theShape = new Shape("Square",3);
            Shape theShape = new Square(3);
            //When
            Double retrievedField;
            retrievedField = theShape.getField();

            //Then
            Assertions.assertEquals(9, retrievedField);
        }
    }
    @Nested
    @DisplayName("ShapeCollector functions tests")
    class theShapeCollector {
        @Test
        @DisplayName("Adding Figure check")
        void testAddFigure() {
            //Given
            ShapeCollector theShapes = new ShapeCollector();

            //When
            theShapes.addFigure(new Triangle(3,4,5));

            //Then
            Assertions.assertEquals(1, theShapes.size());
        }
        @Test
        @DisplayName("Removal Figure when contain check")
        void testRemoveFigure1() {
            //Given
            ShapeCollector theShapes = new ShapeCollector();
            Shape toRemoveShape = new Triangle(3,4,5);
            theShapes.addFigure(toRemoveShape);

            //When
            boolean result = theShapes.removeFigure(toRemoveShape);

            //Then
            Assertions.assertTrue(result);
        }
        @Test
        @DisplayName("Removal Figure if empty check")
        void testRemoveFigure2() {
            //Given
            ShapeCollector theShapes = new ShapeCollector();
            Shape toRemoveShape = new Triangle(3,4,5);
            //When
            boolean result = theShapes.removeFigure(toRemoveShape);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        @DisplayName("Get Figure check")
        void testGetFigure() {
            //Given
            ShapeCollector theShapes = new ShapeCollector();
            Shape toCheckShape = new Triangle(3,4,5);
            theShapes.addFigure(toCheckShape);

            //When
            Shape retrievedShape = theShapes.getFigure(0);

            //Then
            Assertions.assertEquals(toCheckShape, retrievedShape);
        }

        @Test
        @DisplayName("Show Figures check")
        void testShowFigures() {
            //Given
            ShapeCollector theShapes = new ShapeCollector();
            Shape shape0 = new Triangle(3,4,5);
            Shape shape1 = new Circle(2);
            theShapes.addFigure(shape0);
            theShapes.addFigure(shape1);
            //When
            String expectedShapes = "Triangle Circle ";
            String retrievedShapes = theShapes.showFigures();
            //Then
            Assertions.assertEquals(expectedShapes, retrievedShapes);
        }
    }
}
