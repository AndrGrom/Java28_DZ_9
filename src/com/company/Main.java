package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws EmptySourceFileException, IOException {

       Person p1 = new Person("Jeem", "Kerry", new Address("city1","street1",1));
        System.out.println(p1.toString());
       Person p2 = new Person("Tim", "Jarami", new Address("city2", "street2", 2));
        System.out.println(p2.toString());
       Person p3 = new Person("Jon","Vick",new Address("city3", "street3", 3));
        System.out.println(p3.toString());
        System.out.println();

        String PERSON_FILE = "src\\com\\company\\data\\persons.csv";
//        Запись в файл
        List<Person> personList = new ArrayList<>(Arrays.asList(p1, p2, p3));
        PersonIOUtil.writePersons(PERSON_FILE,personList);
//        Чтение из файла
        System.out.println("Чтение из файла");
        PersonIOUtil.readPersons(PERSON_FILE);
    }

}
