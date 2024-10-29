package oop.practice;

public class Display {
    private int width;
    private int height;
    private float ppi;
    private String model;

    public Display(int width, int height, float ppi, String model) {
        this.width = width;
        this.height = height;
        this.ppi = ppi;
        this.model = model;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public float getPpi() {
        return ppi;
    }

    public String getModel() {
        return model;
    }

    //compare size of the screen by area
    public void compareSize(Display m) {
        int area1 = this.width * this.height;
        int area2 = m.getWidth() * m.getHeight();

        System.out.println(" ");
        if (area1 > area2) {
            System.out.println(this.model + " is bigger than " + m.getModel());
        } else if (area1 < area2) {
            System.out.println(m.getModel() + " is bigger than " + this.model);
        } else {
            System.out.println(this.model + " and " + m.getModel() + " have the same size.");
        }
    }

    //compare sharpness
    public void compareSharpness(Display m) {
        if (this.ppi > m.getPpi()) {
            System.out.println(this.model + " is sharper than " + m.getModel());
        } else if (this.ppi < m.getPpi()) {
            System.out.println(m.getModel() + " is sharper than " + this.model);
        } else {
            System.out.println(this.model + " and " + m.getModel() + " have the same screen sharpness.");
        }
    }
    //compare size and sharpness
    public void compareWithMonitor(Display m) {
        compareSize(m);
        compareSharpness(m);
    }
}