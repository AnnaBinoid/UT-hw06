package test;

import main.ModelList;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OurListTest {
    int[] arr1;
    int[] arr2;
    int[] arr3;
    ModelList ourList;
    ModelList ourMockList;
    double firstAverageArray;
    double secondAverageArray;

    @BeforeEach
    void setUp() {
        ourList = new ModelList();
        ourMockList = mock(ModelList.class);
        arr1 = new int[]{1,2,3,4,5};
        arr2 = new int[]{1,2,3,4,5};
        arr3 = new int[]{2,4,7,3,4};
        firstAverageArray = 3.0;
        secondAverageArray = 4.0;
    }

    /**
     * 1. (mock-тест) - проверка compareAverage при равных значениях average.
     */
    @Test
    void compareArray() {
        double average1 = ourList.getArrayAverage(arr1);
        double average2 = ourList.getArrayAverage(arr2);
        ourList.compareArray(average1, average2);
    }

    /**
     * 2. (unit-тест и mock-тест) на корректность вычисления среднего значения
     */
    @Test
    void averageArray() {
        assertThat(ourList.getArrayAverage(arr3)).isEqualTo(4.0);
        //проверка с помощью Mock
        when(ourMockList.getArrayAverage(arr3)).thenReturn(secondAverageArray);
    }

    /**
     *  2. (unit-тест и mock-тест) на корректность создания списка
     */
    @Test
    void createOurArray() {
        //проверяем длину
        assertThat(ourList.createOurArray().length).isEqualTo(5     );
        //и mock
        when(ourMockList.createOurArray()).thenReturn(arr3);
    }
}
