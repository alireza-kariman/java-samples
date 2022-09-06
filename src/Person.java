public class Person {
    public String firstName;
    public String lastName;
    public String nationalCode;
    public Integer age;

    public Person(String firstName, String lastName, String nationalCode){
        this.firstName=firstName;
        this.lastName=lastName;
        this.nationalCode=nationalCode;
        this.age=age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
