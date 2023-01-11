public class Program{

    public static void main(String[] args){
        Queue one = new Queue(5);
        System.out.println(one);
        System.out.println(one.isEmpty());
        System.out.println(one.size());
        
        one.onQueue("ONE");
        one.onQueue("TWO");
        one.onQueue("THREE");
        one.onQueue("FOUR");
        one.onQueue("FIVE");
        
        System.out.println(one);
        System.out.println(one.isEmpty());
        System.out.println(one.size());
        
        System.out.println("peek: "+one.deQueue());
        System.out.println(one);
        System.out.println(one.size());
        
        one.onQueue("SIX");
        System.out.println(one);
        System.out.println(one.size());

        System.out.println(one.deQueue());
        System.out.println(one);
        System.out.println(one.size());

        one.onQueue("SEVEN");
        System.out.println(one);
        System.out.println(one.size());
        
    }
}