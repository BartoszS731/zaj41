import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Student {

  private String Name;
  private String Surname;
  private LocalDate BirthDate;
  public Student(String name,String surname, LocalDate birthDate)
  {
    Name = name;
    Surname = surname;
    BirthDate = birthDate;
  }

  public String GetName() {return Name;}
  public String GetSurname() {return Surname;}
  public LocalDate GetBirthDate() {return BirthDate;}

  public String ToString() {
    return Name + " " + Surname + " "+ BirthDate.format(DateTimeFormatter.ofPattern("dd MM YYYY"));
  }


  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse","Error", LocalDate.now());
    return new Student(data[0], data[1], LocalDate.of(Integer.parseInt(data[3]), Integer.parseInt(data[2]), Integer.parseInt(data[1])));
  }
}