package oop.practice;

public class Display{
  private int width;
  private int height;
  private float ppi;
  private String model;

  public Display(int width, int height, float ppi, String model){
    this.width = width;
    this.height = height;
    this.ppi = ppi;
    this.model = model;
  }
  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public float getPpi() {
    return ppi;
  }

  public void setPpi(float ppi) {
    this.ppi = ppi;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
  public void compareSize(Display m){
    int area1 = this.width * this.height;
    int area2 = m.getWidth() * m.getHeight();

    if (area1 > area2) {
      System.out.println(this.model + " is bigger than " + m.getModel());
    } else if (area1 < area2) {
      System.out.println(m.getModel() + " is bigger than " + this.model);
    } else {
      System.out.println(this.model + " and " + m.getModel() + " have the same size.");
    }
  }

  public void compareSharpness(Display m){
    if (this.ppi > m.getPpi()) {
      System.out.println(this.model + " is sharper than " + m.getModel());
    } else if (this.ppi < m.getPpi()) {
      System.out.println(m.getModel() + " is sharper than " + this.model);
    } else {
      System.out.println(this.model + " and " + m.getModel() + " have the same screen sharpness.");
    }
  }
  public void compareWithMonitor(Display m){
    compareSize(m);
    compareSharpness(m);
  }

  public static void main(String[] args) {
    Display display1 = new Display(1920, 1080, 96, "Dell U2720Q");
    Display display2 = new Display(2560, 1440, 109, "ASUS ROG Swift");
    Display display3 = new Display(2560, 1440, 109, "LG UltraFine");

    display1.compareSize(display2);
    display1.compareSharpness(display2);
    display2.compareSize(display3);
    display2.compareSharpness(display3);
    display1.compareWithMonitor(display3);
  }
}