public class Staticvariables {

    public static void main(String[] args) {
        InstanceCounter obj1 = new InstanceCounter();
        InstanceCounter obj2 = new InstanceCounter();
        InstanceCounter obj3 = new InstanceCounter();
        int count = InstanceCounter.getInstanceCount();
        System.out.println("Number of instances created: " + count);
    }
    
}
