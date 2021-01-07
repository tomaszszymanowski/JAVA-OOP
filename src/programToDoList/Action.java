package programToDoList;

public class Action {
    String title;
    String description;
    boolean status;

    Action(String activityName, String activityDescription, boolean realization){
        title = activityName;
        description = activityDescription;
        status = realization;

    }
}
