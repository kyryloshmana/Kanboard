package DATA;

public enum AdminValue {
    ADMIN_VALUE("admin", "admin");
    private final String username;
    private final String password;

    AdminValue(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
