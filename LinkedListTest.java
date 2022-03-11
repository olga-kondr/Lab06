import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @org.junit.jupiter.api.Test
    void addStr01() {
        ListNode_starter<String> lst = new ListNode_starter<>();
        assertTrue(lst.add("test"));
        assertEquals("test", lst.get(0));
    }
    
    @org.junit.jupiter.api.Test
    void addInt02() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        assertTrue(lst.add(13));
        assertEquals(13, lst.get(0));
    }

    @org.junit.jupiter.api.Test
    void addPosStr03() {
        ListNode_starter<String> lst = new ListNode_starter<>();
        lst.add("test");
        lst.add("text");
        lst.add(0,"I");
        assertEquals("I", lst.get(0));
    }

    @org.junit.jupiter.api.Test
    void addPosInt04() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add(3);
        lst.add(5);
        lst.add(7);
        lst.add(0, 1);
        assertEquals(1, lst.get(0));
    }

    @org.junit.jupiter.api.Test
    void addItemString05() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add("test");
        assertEquals("test", lst.get(0));
    }

    @org.junit.jupiter.api.Test
    void addItemString06() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add("a");
        lst.add("b");
        lst.add("c");
        assertEquals("c", lst.get(2));
    }

    @org.junit.jupiter.api.Test
    void addItemInt07() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add(5);
        assertEquals(5, lst.get(0));
    }

    @org.junit.jupiter.api.Test
    void addItemInt08() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(-10);
        assertEquals(-10, lst.get(3));
    }

    @org.junit.jupiter.api.Test
    void containsString09() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add("a");
        lst.add("b");
        lst.add("c");
        lst.add("d");
        assertTrue(lst.contains("a"));
    }

    @org.junit.jupiter.api.Test
    void containsString10() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add("b");
        lst.add("c");
        lst.add("a");
        lst.add("a");
        lst.add("d");
        assertTrue(lst.contains("d"));
    }

    @org.junit.jupiter.api.Test
    void containsString11() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add("a");
        assertTrue( lst.contains("a"));
    }

    @org.junit.jupiter.api.Test
    void containsString12() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add("a");
        assertFalse(lst.contains("g"));
    }

    @org.junit.jupiter.api.Test
    void containsString13() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add("b");
        lst.add("c");
        lst.add("a");
        lst.add("a");
        lst.add("d");
        assertFalse(lst.contains("aa"));
    }

    @org.junit.jupiter.api.Test
    void containsInt14() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(-10);
        assertTrue(lst.contains(-10));
    }

    @org.junit.jupiter.api.Test
    void containsInt15() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(-10);
        assertTrue(lst.contains(1));
    }

    @org.junit.jupiter.api.Test
    void containsInt16() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add(1);
        assertTrue(lst.contains(1));
    }

    @org.junit.jupiter.api.Test
    void containsInt17() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add(2);
        lst.add(3);
        lst.add(-10);
        assertFalse(lst.contains(1));
    }

    @org.junit.jupiter.api.Test
    void containsInt18() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add(2);
        assertFalse(lst.contains(1));
    }

    @org.junit.jupiter.api.Test
    void getString19() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add("Hello");
        assertEquals("Hello", lst.get(0));
    }

    @org.junit.jupiter.api.Test
    void getString20() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add("hello");
        assertNotEquals("Hello", lst.get(0));
    }

    @org.junit.jupiter.api.Test
    void getString21() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add("");
        assertEquals("", lst.get(0));
    }

    @org.junit.jupiter.api.Test
    void getInt22() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add(2);
        assertEquals(2, lst.get(0));
    }

    @org.junit.jupiter.api.Test
    void getInt23() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(-10);
        assertEquals(2, lst.get(1));
    }

    @org.junit.jupiter.api.Test
    void getInt24() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(-10);
        assertEquals(-10, lst.get(3));
    }

    @org.junit.jupiter.api.Test
    void removeString25() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add("aa");
        lst.add("ab");
        lst.add("aa");
        lst.add("bc");
        assertEquals("aa", lst.remove("aa"));
    }

    @org.junit.jupiter.api.Test
    void removeString25_() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add("aa");
        lst.add("ab");
        lst.add("aa");
        lst.add("bc");
        assertFalse(lst.remove("abc"));
    }

    @org.junit.jupiter.api.Test
    void removeString26() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add("aa");
        lst.add("ab");
        lst.add("aa");
        lst.add("bc");
        assertEquals("bc", lst.removeLast());
    }

    @org.junit.jupiter.api.Test
    void removeDouble27() {
        ListNode_starter<Double> lst = new ListNode_starter<>();
        lst.add(-1.1);
        lst.add(2.0);
        lst.add(10.3);
        lst.add(-0.4);
        assertEquals(-0.4, lst.removeLast());
    }

    @org.junit.jupiter.api.Test
    void removeDouble28() {
        ListNode_starter<Double> lst = new ListNode_starter<>();
        lst.add(-1.2);
        lst.add(2.5);
        lst.add(0.1);
        lst.add(4.13);
        assertEquals(4.13, lst.removeLast());
    }

    @org.junit.jupiter.api.Test
    void removeDouble29() {
        ListNode_starter<Double> lst = new ListNode_starter<>();
        lst.add(-100.1);
        lst.add(0.112);
        lst.add(0.4332);
        lst.add(400.4);
        assertEquals(400.4, lst.removeLast());
    }

    @org.junit.jupiter.api.Test
    void removePassedString30() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add("aa");
        lst.add("ab");
        lst.add("aa");
        lst.add("bc");
        assertTrue(lst.remove("aa"));
    }

    @org.junit.jupiter.api.Test
    void removePassedString31() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add("aa");
        lst.add("ab");
        lst.add("aa");
        lst.add("bc");
        assertTrue(lst.remove("aa"));
        assertTrue(lst.remove("aa"));
        assertFalse(lst.remove("aa"));
    }

    @org.junit.jupiter.api.Test
    void removePassedString32() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add("aa");
        lst.add("ab");
        lst.add("aa");
        lst.add("bc");
        assertTrue(lst.remove("ab"));
    }

    @org.junit.jupiter.api.Test
    void removePassedString33() {
        ListNode_starter<Integer> lst = new ListNode_starter<>();
        lst.add("aa");
        lst.add("ab");
        lst.add("aa");
        lst.add("bc");
        assertFalse(lst.remove("AA"));
    }

    @org.junit.jupiter.api.Test
    void removePassedDouble34() {
        ListNode_starter<Double> lst = new ListNode_starter<>();
        lst.add(-100.1);
        lst.add(0.112);
        lst.add(0.4332);
        lst.add(400.4);
        lst.toString();
        lst.remove(400.4);
        assertTrue(lst.remove(400.4));
    }

    @org.junit.jupiter.api.Test
    void removePassedDouble35() {
        ListNode_starter<Double> lst = new ListNode_starter<>();
        lst.add(-100.1);
        lst.add(0.112);
        lst.add(0.4332);
        lst.add(400.4);
        assertFalse(lst.remove(0.12));
    }

    @org.junit.jupiter.api.Test
    void removePassedDouble36() {
        ListNode_starter<Double> lst = new ListNode_starter<>();
        lst.add(-100.1);
        lst.add(0.112);
        lst.add(0.4332);
        lst.add(-100.1);
        lst.add(400.4);
        assertTrue(lst.remove(-100.1));
        assertTrue(lst.remove(-100.1));
        assertFalse(lst.remove(-100.1));
    }

    @org.junit.jupiter.api.Test
    void removeFromEnd37() {
        ListNode_starter<Double> lst = new ListNode_starter<>();
        lst.add(-100.1);
        lst.add(0.112);
        lst.add(0.4332);
        lst.add(-100.1);
        lst.add(400.4);
        ListNode_starter<Double> lst1 = new ListNode_starter<>();
        lst1.add(-100.1);
        lst1.add(0.112);
        lst1.add(0.4332);
        lst1.add(400.4);
        assertEquals(lst1.toString(), lst.removeFromEnd(1).toString());
    }

    @org.junit.jupiter.api.Test
    void toString38() {
        ListNode_starter<Double> lst = new ListNode_starter<>();
        lst.add(-100.1);
        lst.add(0.112);
        lst.add(400.4);
        ListNode_starter<Double> lst1 = new ListNode_starter<>();
        lst1.add(-100.1);
        lst1.add(0.112);
        lst1.add(400.4);
        assertEquals(lst1.toString(), lst.toString());
    }

    @org.junit.jupiter.api.Test
    public void testIncorrectPosition39() {
        int position = -1;
        ListNode_starter<Double> lst = new ListNode_starter<>();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> lst.add(position, "aa"));
    }
    @org.junit.jupiter.api.Test
    public void testCast40() {
        ListNode_starter<Double> lst = new ListNode_starter<>();
        lst.add(-100.1);
        lst.add(0.112);
        lst.add("aa");
        lst.toString();
        assertEquals(lst.toString(), "test");
        Throwable exception = assertThrows(ClassCastException.class, () -> lst.add("aa"));
    }

}
