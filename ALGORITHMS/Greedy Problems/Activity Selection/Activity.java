public class Activity implements Comparable<Activity>{
  private String name;
  private int startTime;
  private int finishTime;

  public Activity(String name, int startTime, int finishTime) {
    this.name = name;
    this.startTime = startTime;
    this.finishTime = finishTime;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStartTime() {
    return startTime;
  }

  public void setStartTime(int startTime) {
    this.startTime = startTime;
  }

   public int getFinishTime() {
    return finishTime;
  }

  public void setFinishTime(int finishTime) {
    this.finishTime = finishTime;
  }
@Override
public int compareTo(Activity a)
{
     int ftime = a.getFinishTime();
     return this.finishTime - ftime;
}
  @Override
  public String toString() {
    return "Activity :" + name + " , startTime= " +startTime+ "  finishTime= "+ finishTime;
  }


}
