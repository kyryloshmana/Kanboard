package DATA;

import API.models.CreateTask.CreateTaskRequest;

public enum TaskData {
    TASK_DATA("API_TASK", "API_DESCRIPTION", "green", 54, 1);
    private final String title;
    private final String desc;
    private final String color_id;
    private final int column_id;
    private final int priority;

    TaskData(String title, String desc, String color_id, int column_id, int priority) {
        this.title = title;
        this.desc = desc;
        this.color_id = color_id;
        this.column_id = column_id;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getColor_id() {
        return color_id;
    }



    public int getColumn_id() {
        return column_id;
    }

    public int getPriority() {
        return priority;
    }


}
