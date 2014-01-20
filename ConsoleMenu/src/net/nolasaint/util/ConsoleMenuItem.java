package net.nolasaint.util;

/**
 * This class represents an option in a ConsoleMenu.
 *
 * @author Evan
 * @version 1.0
 */
public class ConsoleMenuItem {

    private final String text;

    /**
     * Constructs a new ConsoleMenuItem with the specified text.
     *
     * @param   text    - the text of this ConsoleMenuItem
     */
    public ConsoleMenuItem(String text) {
        this.text = text;

    }

    @Override
    public int hashCode() {
        return text.hashCode();

    }

    @Override
    public boolean equals(Object other) {
        if (null == other) return false;
        if (this == other) return true;
        if (!(other instanceof ConsoleMenuItem)) return false;

        return text.equals(((ConsoleMenuItem) other).text);

    }

    @Override
    public String toString() {
        return text;

    }

}
