package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonIOUtil {

public static void writePersons(String PERSON_FILE, List<Person> personList) {

       try(ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(PERSON_FILE))){
           obj.writeObject(personList);
       } catch (IOException e) {
           e.printStackTrace();
       }
    System.out.println("Запись в файл произведена в файл 'persons.csv'");
    }

    public static void readPersons(String PERSON_FILE) throws EmptySourceFileException, IOException {

        if (isFileEmpty(PERSON_FILE)) {
            throw new EmptySourceFileException("Файл отсутствует либо пустой!");
        }
        ArrayList<Person> personNew= new ArrayList<Person>();
        try(ObjectInputStream objI = new ObjectInputStream(new FileInputStream(PERSON_FILE))){
            personNew = (ArrayList<Person>)objI.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for(Person i : personNew)
            System.out.println(i.toString());
    }

    private static boolean isFileEmpty(String PERSON_FILE) throws IOException {
        File  fileName = new File(PERSON_FILE);
        return fileName.length() == 0;
    }
}