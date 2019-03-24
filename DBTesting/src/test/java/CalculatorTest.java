import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    List mockList = mock(List.class);
    LinkedList mockLinkedList = mock(LinkedList.class);

    @Mock
    private Calculator calc;

    @Before
    public void before(){
        MockitoAnnotations.initMocks(calc);
    }

    @Test
    public void test5_mocking() {
//        when(mock(mockLinkedList.add(1))).thenReturn()

    }

    @Test
    public void test4_mocking() {
        when(calc.add(2, 2)).thenReturn(4);
        Assert.assertEquals(4, calc.add(2, 2));
    }

    @Test
    public void test3_mocking() {
        when(mockLinkedList.get(0)).thenReturn("ieeee");
//        when(mockLinkedList.get(1)).thenThrow(new RuntimeException());

        System.out.println(mockLinkedList.get(-1));
        System.out.println(mockLinkedList.get(0));
        System.out.println(mockLinkedList.get(1));
    }

    @Test
    public void test2_mocking() {
        mockList.add(new Integer(1));
        mockList.clear();

        verify(mockList).add(new Integer(1));
        verify(mockList).clear();
    }

    @Test
    public void test1_real() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(1, 1), 2);
    }
}
