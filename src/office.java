//public class office {
//    String Employee[] = {"Sangam", "Sam", "Nidz"};
//    int Salary[] = {24, 50, 41};
//    String Supervisior[] = {"param", "surbhi", "vivyan"};
//    String department[] = {"TF", "Non TF", "Payment"};
//
//    String[] getEmployeeSupervisior() {
//
//        for (int i = 0; i < 3; i++) {                     //For loop method k andar lagta hai;
//           System.out.println(" "+Supervisior[i]+" - "+Employee[i]);
//        }
//        return Supervisior;
//
//    }
//
//    int[] getEmployeeSalary() {
//        for (int i= 0; i < 3; i++)
//        {
//            System.out.println(Employee[i]+" - "+Salary[i]);
//        }
//        return Salary;
//    }
//
//    String[] getEmployeedepartment() {
//        for (int i = 0; i < 3; i++)
//        {
//            System.out.println(Employee[i]+" - "+department[i]);
//        }
//        return department;
//    }
//
//}
//class bmo{
//
//    public static void main(String[] args) {
//        office x=new office();
//        String A = "Salary";
//        switch (A) {
//            case "salary":
//                x.getEmployeeSalary();
//            case "supervisior":
//                x.getEmployeeSupervisior();
//
//            case "department":
//                x.getEmployeedepartment();
//
//
//        }
//
//
//
//    }
//}
//
//public class office {
//    String Name[] = {"A", "B", "C"};
//    String Address[] = {"yooo", "yupp", "hann"};
//    int phoneNo[] = {12, 34, 32};
//
//    String[] getDataName() {
//        for (int i = 0; i < 3; i++) {
//            System.out.println(Name[i] + "  -  " + Address[i]);
//        }
//        return Name;
//    }
//
//    String[] getDataAddress() {
//        for (int i = 0; i < 3; i++) {
//            System.out.println(Address[i] + "  -  " + phoneNo[i]);
//        }
//        return Address;
//    }
//
//    int[] getDataphoneNo() {
//        for (int i = 0; i < 3; i++) {
//            System.out.println(+phoneNo[i] + "  -  " + Name[i]);
//        }
//        return phoneNo;
//    }
//}
//    class chapri{
//        public static void main(String[] args) {
//            office x=new office();
//
//            int A=1;
//            switch (A){
//                case 1:
//                   x.getDataName();
//                   System.out.println(" ");
//                   break;
//                case 2:
//                    x.getDataphoneNo();
//                    System.out.println(" ");
//                    break;
//                case 3:
//                    x.getDataAddress();
//                    System.out.println(" ");
//                    break;
//            }
//
//
//        }
//    }
public class office {
    String Name[] = {"sangam", "parvinder", "bobin"};
    String Job[] = {"Tcs", "Airforce", "Army"};
    int Class[] = {12, 12, 12};

    String[] getName() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Name-" + Name[i]);

        }
        return Name;
    }

    String[] getJob() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Job-" + Job[i]);
        }
        return Job;
    }

    int[] getClass1() {
        for (int i = 0; i < 3; i++) {
            System.out.println("class-" + Job[i]);
        }
        return Class;

    }

}
class capri{
    public static void main(String[] args) {
        office x= new office();
        int A=1;
        switch (A){
            case 1:
                x.getName();
                System.out.println(" ");
                break;
            case 2:
                x.getJob();
                System.out.println(" ");
                break;
            case 3:
                x.getClass();
                System.out.println(" ");
                break;
        }
    }
}




