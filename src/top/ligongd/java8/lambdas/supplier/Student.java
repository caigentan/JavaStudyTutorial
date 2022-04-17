/**
 * @Author tanyacheng
 * @Date 2022/4/17 21:01
 * @Version 1.0
 */
package top.ligongd.java8.lambdas.supplier;

public class Student {
    private String name;
    private int age;
    public Student(int age, String name){
        this.age = age;
        this.name = name;
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
}
