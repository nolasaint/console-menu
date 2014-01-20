package net.nolasaint.util;

/**
 * This class allows for easy and customizable console-based menus.
 *
 * @author Evan
 * @version 1.0
 */
public class ConsoleMenu {

    private String title;
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
     * 
     * @return
     */
    public String getTitle() {
        return title;

    }

    /**
     * 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;

    }

}
