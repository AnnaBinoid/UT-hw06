package test;

import main.Controller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;


class ControllerTest {

    int[] array;
    double firstAverageArray;
    double secondAverageArray1;
    Controller mockController;

    @BeforeEach
    void setUp() {
        array = new int[]{1, 2, 3, 4, 5};
        firstAverageArray = 3.0;
        secondAverageArray1 = 4.0;
        mockController = mock(Controller.class);
    }

    /**
     * 1 (mock-тест) - корректность значения averageArray при вызове метода
     * сравнения средних значений
     */
    @Test
    void averageArray() {
        when(mockController.averageArray(array)).thenReturn(firstAverageArray);
    }

    /**
     * 2. (mock-тест) - корректность сравнения 2х массивов
     */
    @Test
    void compareArray() {
        mockController.compareArray(firstAverageArray, secondAverageArray1);
        verify(mockController, times(1)).compareArray(firstAverageArray, secondAverageArray1);
    }

    /**
     * 3. (mock-тест) - действительно ли создается массив с заданными значениями
     */
    @Test
    void createArray() {
        when(mockController.createArray()).thenReturn(array);
    }

}