/*class Hierarical{
    public static void main(String[] args){
      B r=new B();
      C r2=new C();

      r.input();  r.Show();
      r2.input();  r2.Disp();
    }
 }

 class A{
    void input(){
        System.out.println("Enter Your Name: ");
    }
}
   class B extends A{
    void Show(){
        System.out.println("My Name is Raju");
    }
   }
     class C extends A{
        void Disp(){
            System.out.println("My Name is Aru");
        }
     }*/


     class Hierarical{
        public static void main(String[] args){
            Cat c=new Cat();
            Dog d=new Dog();

            c.eat();  c.Meow();
            d.eat();  d.Bark();
        }
     }
      
     class I{
        void eat(){
            System.out.println("Eating");
        }
     } 
       class Cat extends I{
        void Meow(){
            System.out.println("Meowing");
        }
       }
        class Dog extends I{
            void Bark(){
                System.out.println("Barking");
            }
        }