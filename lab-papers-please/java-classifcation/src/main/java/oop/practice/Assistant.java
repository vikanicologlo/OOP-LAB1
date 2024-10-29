package oop.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Assistant {
    private String assistantName;
    private List<Display> assignedDisplays;


    public Assistant(String assistantName) {
        this.assistantName = assistantName;
        this.assignedDisplays = new ArrayList<>();
    }

    //assign assistant
    public void assignDisplay(Display d) {
        assignedDisplays.add(d);
        System.out.println("Display " + d.getModel() + " assigned to assistant " + assistantName + ".");
    }

    // comparing each display with others
    public void assist() {

        for (int i = 0; i < assignedDisplays.size(); i++) {
            Display display1 = assignedDisplays.get(i);
            for (int j = i + 1; j < assignedDisplays.size(); j++) {
                Display display2 = assignedDisplays.get(j);
                System.out.println("\nComparing " + display1.getModel() + " with " + display2.getModel() + ":");
                display1.compareWithMonitor(display2);
            }
        }
    }

    // when display is bought, it is removed
    public Display buyDisplay(Display d) {
        if (assignedDisplays.remove(d)) {
            System.out.println("\nDisplay " + d.getModel() + " purchased and removed from the assistant's list.");
            return d;
        }
        System.out.println("Display " + d.getModel() + " not found in the assistant's list.");
        return null;
    }
    //random function to choose display
    public Display buyRandomDisplay() {
        if (assignedDisplays.isEmpty()) {
            System.out.println("No displays to buy.");
            return null;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(assignedDisplays.size());
        Display selectedDisplay = assignedDisplays.remove(randomIndex);
        System.out.println("\nDisplay " + selectedDisplay.getModel() + " purchased and removed from the assistant's list.");
        return selectedDisplay;
    }
}
