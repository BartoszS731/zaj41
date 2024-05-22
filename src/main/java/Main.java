/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scanner=new Scanner(System.in);
      boolean addingStudent=true;
      while(addingStudent)
        {
          System.out.println("wybierz opcje:");
          System.out.println("1. dodaj studenta");
          System.out.println("2. zakoncz dodawanie");
          int option=scanner.nextInt();
          switch(option)
           {
              case 1:
                System.out.println("Podaj imie studenta");
                String name=scanner.next();
               System.out.println("Podaj nazwisko studenta");
                String surname=scanner.next();
                System.out.println("Podaj wiek studenta");
                int age=scanner.nextInt();
                s.addStudent(new Student(name, surname, age));
                break;
              case 2:
                addingStudent=false;
                break;
              default:
                System.out.println("Niepoprawna opcja. Wybierz ponownie");
                break;
           }
        }
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e){
      e.printStackTrace();
    }
  }
}