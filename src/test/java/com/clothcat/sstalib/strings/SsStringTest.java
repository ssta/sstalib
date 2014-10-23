package com.clothcat.sstalib.strings;

import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings("ConstantConditions")
public class SsStringTest {

    @Test
    public void testReverse() throws Exception {
        String s, e;

        s = "";
        e = "";
        assertEquals(e, SsString.reverse(s));

        s = "a";
        e = "a";
        assertEquals(e, SsString.reverse(s));

        s = "abc";
        e = "cba";
        assertEquals(e, SsString.reverse(s));

        s = null;
        e = null;
        assertEquals(e, SsString.reverse(s));
    }

    @Test
    public void testArrayToDelimitedString() throws Exception {
        String s, delim, e;
        Object[] array;
        // strings
        array = new String[]{"a", "b", "c"};
        e = "a,b,c";
        delim = ",";
        s = SsString.arrayToDelimitedString(array, delim);
        assertEquals(e, s);
        // autoboxing
        array = new Integer[]{1, 2, 3};
        e = "1,2,3";
        delim = ",";
        s = SsString.arrayToDelimitedString(array, delim);
        assertEquals(e, s);
        // empty arrays
        array = new Object[]{};
        e = "";
        delim = ",";
        s = SsString.arrayToDelimitedString(array, delim);
        assertEquals(e, s);
    }

    @Test
    public void testCapitalize() throws Exception {
        String s, e;
        s = "";
        e = "";
        assertEquals(e, SsString.capitalize(s));

        s = "a";
        e = "A";
        assertEquals(e, SsString.capitalize(s));

        s = "Abc";
        e = "Abc";
        assertEquals(e, SsString.capitalize(s));

        s = "123";
        e = "123";
        assertEquals(e, SsString.capitalize(s));

        s = null;
        e = null;
        assertEquals(e, SsString.capitalize(s));

        s = "abCde";
        e = "AbCde";
        assertEquals(e, SsString.capitalize(s));

    }


    @Test
    public void testUncapitalize() throws Exception {
        String s, e;
        s = "";
        e = "";
        assertEquals(e, SsString.uncapitalize(s));

        s = "a";
        e = "a";
        assertEquals(e, SsString.uncapitalize(s));

        s = "Abc";
        e = "abc";
        assertEquals(e, SsString.uncapitalize(s));

        s = "123";
        e = "123";
        assertEquals(e, SsString.uncapitalize(s));

        s = null;
        e = null;
        assertEquals(e, SsString.uncapitalize(s));

        s = "abCde";
        e = "abCde";
        assertEquals(e, SsString.uncapitalize(s));

    }

    @Test
    public void testConcatenateStringArrays() throws Exception {
        String[] a1, a2, e;
        // test null parts
        a1 = null;
        a2 = null;
        e = null;
        assertArrayEquals(SsString.concatenateStringArrays(a1, a2), e);

        a1 = null;
        a2 = new String[]{"a"};
        e = new String[]{"a"};
        assertArrayEquals(SsString.concatenateStringArrays(a1, a2), e);

        a2 = null;
        a1 = new String[]{"a"};
        e = new String[]{"a"};
        assertArrayEquals(SsString.concatenateStringArrays(a1, a2), e);

        // test empty
        a2 = new String[]{};
        a1 = new String[]{};
        e = new String[]{};
        assertArrayEquals(SsString.concatenateStringArrays(a1, a2), e);

        a2 = new String[]{"a"};
        a1 = new String[]{};
        e = new String[]{"a"};
        assertArrayEquals(SsString.concatenateStringArrays(a1, a2), e);

        a1 = new String[]{"a"};
        a2 = new String[]{};
        e = new String[]{"a"};
        assertArrayEquals(SsString.concatenateStringArrays(a1, a2), e);

        // test full
        a1 = new String[]{"a", "b", "c"};
        a2 = new String[]{"d", "e", "f"};
        e = new String[]{"a", "b", "c", "d", "e", "f"};
        assertArrayEquals(SsString.concatenateStringArrays(a1, a2), e);
    }
}