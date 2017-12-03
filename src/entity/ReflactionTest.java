package entity;

public class ReflactionTest {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Reflaction print() test...");
    }

    public String testParam(String test) {
        System.out.println("test() ："+ test);
        return test;
    }

    private void pTestParam(Integer integer) {
        System.out.println("private method ,param is :" + integer);
    }
}
