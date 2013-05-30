package com.leilove321.north.adapter;


/**
 *@Source. Assert.java
 *@Author. ZhuLei
 *@History. created on Jan 15, 2010 2:19:57 PM.
 */
public final class Assert {
    /* This class is not intended to be instantiated. */
    private Assert() {
        // not allowed
    }

    /**
     * Asserts that an argument is legal. if the given boolean is not
     * <code>true</code>, an <code>lllegalArgumentException</code> is thrown.
     *
     * @param expression
     *            the outcode of the check
     * @return <code>true</code> if the check passes (does not return if the
     *         check fails)
     * @exception IllegalArgumentException
     *                if the legality test failed
     */
    public static boolean isLegal(boolean expression) {
        return isLegal(expression, "");
    }

    /**
     * Asserts that an argument is legal. If the given boolean is not
     * <code>true</code>, an <code>IllegalArgumentException</code> is thrown.
     * The given message is included in that exception, to aid debugging.
     *
     * @param expression
     *            the outcode of the check
     * @param message
     *            the message to include in the exception
     * @return <code>true</code> if the check passes (does not return if the
     *         check fails)
     * @exception IllegalArgumentException
     *                if the legality test failed
     */
    public static boolean isLegal(boolean expression, String message) {
        if (!expression) {
            throw new IllegalArgumentException(message);
        }

        return expression;
    }

    /**
     * Asserts that the given objects is <code>null</code>.
     *
     * @param objects
     *            the value to test
     * @return true or false
     */
    public static boolean isEmpty(Object[] objects) {
        return (objects == null) || (objects.length == 0);
    }

    /**
     * Asserts that the given objects is <code>null</code>.
     *
     * @param object
     *            the value to test
     * @return true or false
     */
    public static boolean isNull(Object object) {
        return (object == null) || "".equals(object);
    }

    /**
     * @param propertyListSize
     * @return true or false
     */
    public static boolean nonZero(int value) {
        return value > 0;
    }
}
