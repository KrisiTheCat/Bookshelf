package bg.smg;

public class ChildrenBook extends Book{
    private int age;

    @Override
    public double getPrice() {
        return super.getPrice()*0.7;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
