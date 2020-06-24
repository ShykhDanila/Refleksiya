
public class MyClass {

    private int number;
    private String name ;

        public MyClass() {
    }

        public MyClass(int number, String name) {
        this.number = number;
       this.name = name;
   }

   public void name (String a ){
            this.name = a;
   }

   public String name2(String a,int b){
       System.out.println(b);
       return this.name = a;
   }

    private void printData(){
        System.out.println(number + " " + name);
    }
}
