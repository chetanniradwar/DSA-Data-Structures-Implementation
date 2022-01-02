import java.util.ArrayList;
import java.util.Collections;

public class ActivitySelection {
    public static void main(String[] args) {
        
        Activity a1 = new Activity("A1",0,6);
        Activity a2 = new Activity("A2",3,4);
        Activity a3 = new Activity("A3",1,2);
        Activity a4 = new Activity("A4",5,8);
        Activity a5 = new Activity("A5",5,7);
        Activity a6 = new Activity("A6",8,9);

        ArrayList<Activity> a = new ArrayList<Activity>();

        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);
        a.add(a5);
        a.add(a6);
Collections.sort(a);
        System.out.println("The prefered sequence of doing activities to perform maximum activities are :");
        Activity previous=null;
        for(Activity activity : a)
        {
            if(activity == a.get(0))
            {
                System.out.println(activity);
                previous = activity;
            }
            else{
                if(activity.getStartTime()>=previous.getFinishTime())
                {
                    System.out.println(activity);
                    previous = activity;
                }
            }
        }


    }
}
