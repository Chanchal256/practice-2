public class Author (

//declaring instance vortaples

String firstName;
String lastName;
String bookName ;

//constructor to initialize variables

public Author ()
{
firstName="Chanchal";
lastName="Kumar";
bookName="The Last Ride";
}
public Author(String firstName, String lastName)
 {

this.firstName=firstName; 
this.lastName=lastName;
}
public Author (String firstName, String lastName, String bookName)
{
   this.firstName=firstName; 
this.lastName=lastName;
this.bookName=bookName;
}

//setter methods to set firstName and LastName public void setFirstlane(String firstName)
 {
this.firstName = firstName; 
}
public void setlastName(String lastName)
{
 this.lastName lastName;
}
public void setBookName(String bookName)
{
this.bookName=bookName;
}
//getter methods to get firstone and Lastone
public String getfirstName() 
{
return firstName;
}
public String getlastName() 
{
 return lastName;
}
public String getBookName()
{
return bookName;
}

public String toString()
 { 
return firstName+" "+lastName+" "+bookName;
}

}
public class TestAuthor()
 {
    public static void main (String args[])
     {
      Author a1 = new Author();
      Author a2= new Author("Chanchal","Kumar");
Author a3= new Author("Chanchal","Kumar","The Last Ride ");
//the values of second object by using getters 
  System.out.println(a2.getfirstName());
System.out.println(a2.getlastName());
//the values of the third object by using the toString() method.
System.out.println(a3.toString());
//the values of first object by using getters 
System.out.println(a1.getfirstName());
System.out.println(a1.getlastName());

System.out.println(a1.getbookName()):
}
}