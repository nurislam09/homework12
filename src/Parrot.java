public class Parrot {
    private String name;
    private  int age;
    private   int weight;
    private  String color;

    public Parrot (int a,String b,String c ,int d ) {
        this.age = a;
        this.weight=d;
        this.color=c;
        this.name=b;
    }
    public  Parrot (){

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
