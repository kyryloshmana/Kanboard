package DATA;

public enum UsersData {
    USER("kyryloAPITestLogin", "kyryloAPITestPassword"
            , "kyrylo", "kyryloAPITest@mail.com"
            , "app-manager");
    private final String username;
    private final String password;
    private final String name;
    private final String email;
    private final String role;

    UsersData(String username, String password, String name, String email, String role) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }
}
