package net.nolasaint.util;

import java.util.Scanner;

/**
 * This class allows for easy and customizable console-based menus.
 *
 * @author Evan
 * @version 1.1
 */
public class ConsoleMenu {

    private String title;
    private ConsoleMenuItem[] menuItems; 

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
        menuItems = new ConsoleMenuItem[10];

    }

    private int getFreeIndex() {
        boolean found = false;
        int freeIndex = 0;
        ConsoleMenuItem[] menuItemsCopy;

        for (int i = 0; i < menuItems.length && !found; i++) {
            if (null == menuItems[i]) {
                freeIndex = i;
                found = true;

            }

        }

        // No space, resize array
        if (!found) {
            freeIndex = menuItems.length;
            menuItemsCopy = menuItems;
            menuItems = new ConsoleMenuItem[menuItems.length * 2];

            for (int i = 0; i < menuItemsCopy.length; i++) {
                menuItems[i] = menuItemsCopy[i];

            }

        }

        return freeIndex;

    }

    private void parseInput(String input) {
        try {
           menuItems[Integer.parseInt(input)].performAction();

        } catch (Exception ex) {
            System.out.println("Invalid input, please make another "
                    + "selection...");

        }

    }

    /**
     * Returns whether the specified ConsoleMenuItem is contained in this
     * ConsoleMenu.
     *
     * @param   menuItem    - the ConsoleMenuItem to be checked for
     * @return  true if the ConsoleMenuItem exists in this ConsoleMenu
     */
    public boolean contains(ConsoleMenuItem menuItem) {
        boolean contained = false;

        if (null != menuItem) {
            for (int i = 0; i < menuItems.length && !contained; i++) {
                if (menuItems[i].equals(menuItem)) {
                    contained = true;

                }

            }

        }

        return contained;

    }

    /**
     * Attempts to add the specified ConsoleMenuItem to this ConsoleMenu.
     *
     * @param   menuItem    - the ConsoleMenuItem to be added
     * @return  true if menuItem is not null
     */
    public boolean add(ConsoleMenuItem menuItem) {
        boolean added = false;

        if (null != menuItem) {
            menuItems[getFreeIndex()] = menuItem;
            added = true;

        }

        return added;

    }

    /**
     * Attempts to remove the specified ConsoleMenuItem from this ConsoleMenu.
     *
     * @param   menuItem    - the ConsoleMenuItem to be removed
     * @return  true if the ConsoleMenuItem was removed from this ConsoleMenu
     */
    public boolean remove(ConsoleMenuItem menuItem) {
        boolean removed = false;
        int index = 0;
        ConsoleMenuItem[] menuItemsCopy;

        if (null != menuItem) {
            for (int i = 0; i < menuItems.length && !removed; i++) {
                if (menuItems[i].equals(menuItem)) {
                    index = i;
                    removed = true;

                }

            }

        }

        if (removed) {
            menuItemsCopy = menuItems;

            for (int i = index; i < menuItems.length; i++) {
                if (i == menuItems.length - 1) {
                    menuItems[i] = null;

                } else {
                    menuItems[i] = menuItemsCopy[i + 1];

                }

            }

        }

        return removed;

    }

    /**
     * Displays the ConsoleMenu and parses input.
     */
    public void run() {
        Scanner input = new Scanner(System.in);
        String inputString;

        do {
            System.out.print(this);
            System.out.print("Please make a selection: ");
            inputString = input.nextLine();

            parseInput(inputString);

        } while (!inputString.equals("0"));

        input.close();

        // TODO 0 -> Quit
        // TODO Or, getInput: ConsoleMenuItem

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

    @Override
    public String toString() {
        String asString = title + "\n";

        for (int i = 0; i < menuItems.length; i++) {
            asString = asString.concat((i + 1) + ": " + menuItems[i] + "\n");

        }

        asString = asString.concat("0: Quit\n");

        return asString;

    }

//    // For debugging purposes
//    protected void printDebug() {
//        System.out.println("menuItems[]:");
//
//        for (int i = 0; i < menuItems.length; i++) {
//            System.out.println("[" + i + "]" + menuItems[i]);
//
//        }
//
//    }

}
