package net.nolasaint.util;

/**
 * This class represents an option in a ConsoleMenu.
 *
 * @author nolasaint
 * @version 1.1
 */
public class ConsoleMenuItem {

    private final String text;
    private final ConsoleMenuAction action;

    /**
     * Constructs a new ConsoleMenuItem with the specified text and
     * ConsoleMenuAction.
     *
     * @param   text    - the text of this ConsoleMenuItem
     * @param   action  - the ConsoleMenuAction this ConsoleMenuItem will
     *                    use
     */
    public ConsoleMenuItem(String text, ConsoleMenuAction action) {
        this.text = text;
        this.action = action;

    }

    /**
     * Performs this ConsoleMenuItem's ConsoleMenuAction.
     */
    public void performAction() {
        action.perform();

    }

    @Override
    public int hashCode() {
        return text.hashCode() + action.hashCode();

    }

    @Override
    public boolean equals(Object other) {
        if (null == other) return false;
        if (this == other) return true;
        if (!(other instanceof ConsoleMenuItem)) return false;

        return text.equals(((ConsoleMenuItem) other).text)
                && action == ((ConsoleMenuItem) other).action;

    }

    @Override
    public String toString() {
        return text;

    }

}
