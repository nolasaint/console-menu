package net.nolasaint.util;

/**
 * This abstract class allows for pseudo-functional programming techniques
 * by letting the user write a custom ConsoleMenuAction class with custom
 * perform method.
 *
 * @author nolasaint
 * @version 1.0
 */
public abstract class ConsoleMenuAction {

    /**
     * The action that should be performed by this class.
     */
    public abstract void perform();

}
