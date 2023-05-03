import java.util.List;

public class User {


    private String name;
    private int age;
    private String gender;
    private String location;
    private List<String> interests;
    private String profilePicture;
    public User(String name, int age, String gender, String location, List<String> interests, String profilePicture) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.interests = interests;
        this.profilePicture = profilePicture;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }





}