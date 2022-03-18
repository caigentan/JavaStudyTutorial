/**
 * @Author tanyacheng
 * @Date 2022/3/18 23:03
 * @Version 1.0
 */
package top.ligongd.structure;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<User> priorityQueue = new PriorityQueue<>(new UserComparator());
        priorityQueue.offer(new User("V12", 12));
        priorityQueue.offer(new User("we", 13));
        priorityQueue.offer(new User("V13", 14));

        User user1 = priorityQueue.poll();
        User user2 = priorityQueue.poll();
        User user3 = priorityQueue.poll();

        System.out.println(user1.getName());
        System.out.println(user2.getName());
        System.out.println(user3.getName());


    }
}

class User{
    private String name;
    private int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
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

class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if(o1.getName().charAt(0) == o2.getName().charAt(0))
            return o1.getName().compareTo(o2.getName());
        if(o1.getName().startsWith("V"))
            return -1;
        else
            return 1;
    }
}