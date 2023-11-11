record User(int id, String name) {
}

public class UserBuilder {
    private static User build(int id, String name) {
        return new User(id, name);
    }

    public static void main(String[] args) {
        var id = 100;
        String name = "Test";
        var user = build(id, name);
        System.out.println(user);
    }
}
