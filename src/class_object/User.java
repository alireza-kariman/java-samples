package class_object;

public class User {
    private String nationalCode;
    private String name;
    private int age;

    private static String GENDER = "Male";

    public User (String nationalCode,String name){
        if (nationalCode.length()!=10){
            throw new IllegalStateException("kod meli dah raghamie");
        }
        this.nationalCode=nationalCode;
        this.name=name;
    }

    public User() {
    }

    public String getNationalCode() {
        return nationalCode;
    }
    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
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


    public static String getGender(){
        return GENDER;
    }

}
