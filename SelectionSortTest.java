import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SelectionSortTest {

	@Test
	public void test() {
		testPositive();
		testNegatives();
		testMixed();
	}

	public void selectionSortTest() {}

	public void testPositive() {
		int[] list = new int[5];
		list[0] = 7;
		list[1] = 8;
		list[2] = 1;
		list[3] = 4;
		list[4] = 4;

		int[] sortedlist = new int[5];
		sortedlist[0] = 1;
		sortedlist[1] = 4;
		sortedlist[2] = 4;
		sortedlist[3] = 7;
		sortedlist[4] = 8;

        SelectionSort temp = new SelectionSort();
        list = temp.sort(list);

        int i;
        for (i = 0; i < list.length; ++i) {
        	assertEquals("wrong answer", list[i], sortedlist[i]);
        }
	}

	public void testNegatives() {
		int[] list = new int[5];
		list[0] = -1;
		list[1] = -7;
		list[2] = -7;
		list[3] = -4;
		list[4] = -9;

		int[] sortedlist = new int[5];
		sortedlist[0] = -9;
		sortedlist[1] = -7;
		sortedlist[2] = -7;
		sortedlist[3] = -4;
		sortedlist[4] = -1;

        SelectionSort temp = new SelectionSort();
        list = temp.sort(list);

        int i;
        for (i = 0; i < list.length; ++i) {
        	assertEquals("wrong answer", list[i], sortedlist[i]);
        }
	}

	public void testMixed() {
		int[] list = new int[5];
		list[0] = -1;
		list[1] = 0;
		list[2] = -7;
		list[3] = 2;
		list[4] = 20;

		int[] sortedlist = new int[5];
		sortedlist[0] = -7;
		sortedlist[1] = -1;
		sortedlist[2] = 0;
		sortedlist[3] = 2;
		sortedlist[4] = 20;

        SelectionSort temp = new SelectionSort();
        list = temp.sort(list);

        int i;
        for (i = 0; i < list.length; ++i) {
        	assertEquals("wrong answer", list[i], sortedlist[i]);
        }
	}

}
