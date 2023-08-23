package encapsulation;

public class Student {
    private String name;
    private int age;

    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public int getAge(){
        return age;
    }

    public static void main (String[]args){
        Student student = new Student();
        student.setName("Suzie");
        System.out.println(student.name);
        System.out.println(student.getName());
        student.age = 25;
        System.out.println(student.getAge());
//        student.name = "Tommy";
//        student.age = 43;
//        System.out.println(student.age);
//        System.out.println(student.name);
    }

}
