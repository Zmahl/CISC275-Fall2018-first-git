public class Animal implements Comparable<Animal>
{
   int legs = 0;
   String name = "";
   
   public Animal(String s, int l)
   {
      this.legs = l;
      this.name = s;
   }
   
   public int getLegs()
   {
      return this.legs;
   }
   
   public int compareTo(Animal a)
   {
      return a.legs;
   }
}