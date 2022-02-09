/**
 * @Author tanyacheng
 * @Date 2022/1/30 22:53
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.prototypepattern;

public class User {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student();
        student1.setName("Bill");
        student1.setSex("Boy");
        student1.setAge(23);
        Student student2 = (Student)student1.clone();
        System.out.println(student1.toString() + " " + student1.hashCode());
        System.out.println(student2.toString() + " " + student1.hashCode());
        student2.setName("Jack");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student1.equals(student2));
    }
}
