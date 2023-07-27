package DATA;

public enum ProjectData {
    PROJECT_DATA("API_Project", "API_Project Description" );
    private final String name;
    private final String description;


    ProjectData(String name, String description) {
        this.name = name;
        this.description = description;
        }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


}
