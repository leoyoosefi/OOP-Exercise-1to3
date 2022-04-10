package se.lexicon.leo;

public class Car {

  private String id1;
  private String year;
  private String model;
  private String colour;
  private String motorSize;

  public Car(){
  }

  public Car(String model, String motorSize, String id1, String year, String colour){
      this.model = model;
      this.motorSize = motorSize;
      this.id1 = id1;
      this.year = year;
      this.colour = colour;
  }

  public void drive(){
      System.out.println(model + " with motor size " + motorSize + " can drive now.");

  }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(String motorSize) {
        this.motorSize = motorSize;
    }
}
