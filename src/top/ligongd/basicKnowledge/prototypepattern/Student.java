/**
 * @Author tanyacheng
 * @Date 2022/1/30 22:49
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.prototypepattern;

public class Student implements Cloneable{
    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = new Student();
        student.setName(this.name);
        student.setSex(this.sex);
        student.setAge(this.age);
        return student;
    }
}
