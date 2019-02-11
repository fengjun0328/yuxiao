package GC;

public class KFC {
   public  static  Foot getFoot(String name){
       if(name.equals("鸡肉")){
           return  new Chicken();
       }
       if(name.equals("汉堡")){
           return  new Hamburger();
       }
       return  null;
      }

   }

