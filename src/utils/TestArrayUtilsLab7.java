package utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestArrayUtilsLab7 {

	@Test
	void testgetPickinsAllZeros() {
		int array[] = {0,0,0,0};
		int total = 0;
		assertEquals(0, greedyChange.greedyPickin(array, total));
	}
	@Test
	void testAllMinCoinage() {
		int array[] = {25,10,5,1};
		int total = 53;
		assertEquals(0, greedyChange.greedyPickin(array, total));
	}
	@Test
	void testGetEmptyArray() {
		int array[] = {};
		int total = 0;
		Exception e = assertThrows(IllegalArgumentException.class, () -> {  greedyChange.greedyPickin(array, total); } );
		assertEquals("Array of size 0 is not allowed", e.getMessage());

}
}
