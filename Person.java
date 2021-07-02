/**
 * @Daniel Judd
 * @Github - https://github.com/danieljudd
 */
public class Person
{
   private String firstName;
   private String secondName;
   private String storeThis;
   public Person(String firstName, String secondName)
   {
      this.firstName = firstName;
      this.secondName = secondName;
   }
   public void justLast(String secondName)
   {
      Person person = new Person("", secondName);
   }
   public String getInitials()
   {
      String initialFirst = this.firstName.substring(0, 1);
      char initialSecond = this.secondName.charAt(0);
      
      String myarray[] = new String[2];
      myarray[0] = initialFirst;
      myarray[1] = String.valueOf(initialSecond);
      
      return (myarray[0] + myarray[1]);
   }
   public String getName()
   {
      return this.firstName + " " + this.secondName;
   }
   public void printReverse()
   {
      String fullName = getName();
      int count = fullName.length();
      for (int i=0; i<count; i++)
      {
         char anotherArray[] = new char[count];
         // this below reads count minus i minus ONE
         char storeMe = fullName.charAt(count-i-1);
         
         anotherArray[i] = storeMe;
         this.storeThis = this.storeThis + String.valueOf(anotherArray);
         
      }
      System.out.println(this.storeThis);
   }
   public boolean equals(Person other)
   {
      return getName().equals(other);
   }
}
