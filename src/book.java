public class book {
    String title;
    String author;
    int year;

    book (String title,String author,int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }


    public static void main(String[] args) {
        book x=new book("SamandNoorie","Sangam",2023);
        System.out.println("title-" +x.title);
        System.out.println("author-" +x.author);
        System.out.println("year-" +x.year);
    }

    }

