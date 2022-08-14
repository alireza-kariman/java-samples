package class_object;

public class UserApplication {
    public static void main(String[] args) {
        User alireza=new User("0022798722","alireza");
        System.out.println(alireza.getName());
        System.out.println(alireza.getNationalCode());
        System.out.println(User.getGender());
    }

}
