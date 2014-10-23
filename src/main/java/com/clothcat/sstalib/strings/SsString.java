package com.clothcat.sstalib.strings;

/**
 * Helper methods for manipulating strings.
 * <p/>
 * Some of the API is stolen from Spring StringUtils, some comes from me.  All the code is mine.
 * <p/>
 * Created by ssta on 22/10/14.
 */
public class SsString {
    /**
     * Reverses a string.  If passed null it will return null.
     *
     * @param s the string to reverse
     * @return null if s is null, otherwise returns s reversed
     */
    public static String reverse(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * Convenience method to return a String array as a delimited (e.g. CSV) String.
     *
     * @param array The array to delimit
     * @param delim The character(s) to use as a delimiter
     * @return a new String representing the delimited array
     */
    public static String arrayToDelimitedString(Object[] array, String delim) {
        StringBuilder sb = new StringBuilder("");
        for (Object o : array) {
            sb.append(o.toString());
            sb.append(delim);
        }
        String s = sb.toString();

        int i = s.lastIndexOf(delim);
        // guard against empty arrays
        return (i < 0) ? s : s.substring(0, i);
    }

    /**
     * Capitalize a String, changing the first letter to upper case as per Character.toUpperCase(char). No other letters are changed.
     *
     * @param str - the String to capitalize, may be null
     * @return the capitalized String, null if null
     */
    public static String capitalize(String str) {
        if (str == null) return null;
        if (str.length() <= 1) return str.toUpperCase();

        return String.valueOf(Character.toUpperCase(str.charAt(0))) + str.substring(1);
    }

    /**
     * Uncapitalize a String, changing the first letter to upper case as per Character.toUpperCase(char). No other letters are changed.
     *
     * @param str - the String to uncapitalize, may be null
     * @return the uncapitalized String, null if null
     */
    public static String uncapitalize(String str) {
        if (str == null) return null;
        if (str.length() <= 1) return str.toLowerCase();

        return String.valueOf(Character.toLowerCase(str.charAt(0))) + str.substring(1);
    }

    /**
     * Concatenate the given String arrays into one, with overlapping array elements included twice.
     * <p/>
     * The order of elements in the original arrays is preserved.
     *
     * @param array1 the first array (can be null)
     * @param array2 the second array (can be null)
     * @return the new array (null if both given arrays were null)
     */
    public static String[] concatenateStringArrays(String[] array1, String[] array2) {
        // handle null cases first
        if (array1 == null && array2 == null) return null;
        if (array1 == null) return array2;
        if (array2 == null) return array1;

        String[] ns = new String[array1.length + array2.length];
        int i = 0;
        for (String s : array1) {
            ns[i++] = s;
        }
        for (String s : array2) {
            ns[i++] = s;
        }
        return ns;
    }
}
