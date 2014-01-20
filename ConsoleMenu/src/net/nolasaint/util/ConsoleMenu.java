package net.nolasaint.util;

/**
 * This class allows for easy and customizable console-based menus.
 *
 * @author Evan
 * @version 1.1
 */
public class ConsoleMenu {

    private String title;
    private ConsoleMenuItem[] menuItems;
    /*
     * index % maxindex and leftover decides number of times print letter ?
     */

    /**
     * The generic constructor which provides the default title.
     */
    public ConsoleMenu() {
        this("Please make a selection:");

    }

    /**
     * A parameterized constructor which allows a custom menu title.
     *
     * @param   title   - the desired title for this ConsoleMenu
     */
    public ConsoleMenu(String title) {
        this.title = title;

    }

    /**
     * Returns the title of this ConsoleMenu.
     *
     * @return  the title of this ConsoleMenu
     */
    public String getTitle() {
        return title;

    }

    /**
     * Sets this ConsoleMenu's title.
     *
     * @param   title   - the title for this ConsoleMenu
     */
    public void setTitle(String title) {
        this.title = title;

    }

}
