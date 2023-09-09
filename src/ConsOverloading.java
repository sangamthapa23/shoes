public class ConsOverloading {
    String name;
    int age;
    int PhoneNumber;
    String address;

    public ConsOverloading(String name, int age)
    {
        this.name= name;
        this.age= age;
    }
    public ConsOverloading(int PhoneNumber, String address){
        this.PhoneNumber = PhoneNumber;
        this.address = address;
    }
    public ConsOverloading(){
        String name= "Sangam";
        int age=25;
        int PhoneNumber = 9575467;
        String address = "Mhow";
    }
    public static void main(String[] args) {
        ConsOverloading n = new ConsOverloading();
        System.out.println(n.name);
        System.out.println(n.age);
        System.out.println(n.PhoneNumber);
        System.out.println(n.address);

        ConsOverloading s = new ConsOverloading("sangam",25);
        System.out.println(s.name);
        System.out.println(s.age);
           System.out.println(s.PhoneNumber);
        System.out.println(s.address);


        ConsOverloading ns = new ConsOverloading(233333,"sudama nagar");
        System.out.println(ns.name);
        System.out.println(ns.age);
        System.out.println(ns.PhoneNumber);
        System.out.println(ns.address);

    }
}
