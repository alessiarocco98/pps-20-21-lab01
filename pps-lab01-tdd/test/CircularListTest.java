import lab01.tdd.AbstractFactoryStrategy;
import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    private CircularList circularList;
    private List<Integer> expextedList;

    @BeforeEach
    void beforeEach() {
        circularList = new CircularListImpl();
        expextedList = new LinkedList<>(Arrays.asList(1,2,3));
    }

    @Test
    void testAdd() {
        circularList.add(1);
        assertEquals(1, circularList.size());
    }

    @Test
    void testEmpty(){
        assertTrue(circularList.isEmpty());
        circularList.add(1);
        assertFalse(circularList.isEmpty());
    }

    @Test
    void testSize() {
        creatingList();
        assertEquals(3, circularList.size());
    }

    private void creatingList() {
        for (Integer element: expextedList) {
            circularList.add(element);
        }
    }

    @Test
    void testNext(){
        creatingList();
        assertEquals(Optional.of(expextedList.get(0)), circularList.next());
        assertEquals(Optional.of(expextedList.get(1)), circularList.next());
        assertEquals(Optional.of(expextedList.get(2)), circularList.next());
        assertEquals(Optional.of(expextedList.get(0)), circularList.next());
    }

    @Test
    void testPrev(){
        creatingList();
        assertEquals(Optional.of(expextedList.get(2)), circularList.previous());
        assertEquals(Optional.of(expextedList.get(1)), circularList.previous());
        assertEquals(Optional.of(expextedList.get(0)), circularList.previous());
        assertEquals(Optional.of(expextedList.get(2)), circularList.previous());
    }
    @Test
    void testReset() {
        creatingList();
        circularList.next();
        circularList.next();
        circularList.previous();
        circularList.previous();
        circularList.reset();
        assertEquals(Optional.of(2), circularList.next());
    }

    @Test
    void testNextWithStrategy() {
        creatingList();
        AbstractFactoryStrategy factoryStrategy = new AbstractFactoryStrategy();

        assertEquals(Optional.of(expextedList.get(1)), circularList.next(factoryStrategy.createEvenStrategy()));
        assertEquals(Optional.of(expextedList.get(2)), circularList.next(factoryStrategy.createMultipleOfStrategy(3)));
        assertEquals(Optional.of(expextedList.get(0)), circularList.next(factoryStrategy.creatEequalsStrategy(1)));
    }

    @Disabled
    @Test public void testTodo(){
        Assertions.fail();
    }

}
