package net.nolasaint.util;

/**
 * This interface allows for pseudo-functional programming techniques
 * by letting the user define the perform method, which is called whenever the
 * associated ConsoleMenuItem is selected.
 *
 * @author nolasaint
 * @version 1.1
 */
public interface ConsoleMenuAction {

    /**
     * The action that should be performed by this class.
     */
    void perform();

}
