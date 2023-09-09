public class jhk {
    Double length;  //instance variable
        Double width;


        Double getArea(){

            //Method
        Double Area= 2*(length+width);
        return Area;               //returning area

   }
    jhk(Double l, Double w){     //constructor
        length = l;                    //assigning values to class variables
        width = w;
    }


    public static void main(String[] args){

        jhk b = new jhk(12.3, 12.3);    //object
        Double  area =  b.getArea();                         //Method calling
        System.out.println(area);

    }


}
