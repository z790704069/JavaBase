package com.kooola.java.base.serialization;

import java.io.*;

/**
 * Created by march on 2018/7/3.
 */
public class SimpleSerial {
    public static void main(String[] args) throws Exception{
        File file = new File("person.out");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        Person person = new Person("Tom", 27, Gender.MALE);
        objectOutputStream.writeObject(person);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Object newPerson = objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newPerson);
    }
}
