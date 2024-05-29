package Animals;

 class Dog extends Animal{
     private String breed;
     public Dog(String name, int age,String breed) {
         super(name, age);
         this.breed=breed;
     }

     @Override
     public void makeSound() {
         System.out.println("Woof Woof!");
     }
     public void bark() {
         System.out.print("The dog says:") ;
         makeSound();
     }
 }
