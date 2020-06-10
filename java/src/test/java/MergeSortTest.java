import org.junit.*;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MergeSortTest
{
	@Test
	public void mergeSortTest()
	{
		List initialList = Arrays.asList(-5, 10, -15, 9090, 20000, -2000);
		MergeSort sorter = new MergeSort(initialList);
		List expectedList = Arrays.asList(-2000, -15, -5, 10, 9090, 20000);
		List actualList = sorter.getSortedList();
		assertEquals(expectedList, actualList);
	}
}