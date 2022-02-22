package com;
import com.Vec.Vectors;
import com.Info.Info;
import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<Vectors> objectList = new ArrayList<Vectors>();
        Info inf = new Info();
        inf.getInfo();

        while(true) {
            System.out.print("\nНапишите номер действия: ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.print("\nВведите размер нового вектора: ");
                    objectList.add(new Vectors(sc.nextInt()));
                    break;
                case 2:
                    if(objectList.size()<1){
                        System.out.println("Вы не создали ни одного вектора. ");
                    }
                    else{
                        System.out.println("\nРазмеры ваших векторов: ");
                        for(int i =0; i<objectList.size(); i++){
                            System.out.println("Вектор["+ (i+1) + "] - " + objectList.get(i).getSize());
                        }
                    }
                    break;
                case 3:
                    if(objectList.size()<1){
                        System.out.println("Вы не создали ни одного вектора. ");
                        break;
                    }
                    else if(objectList.size()==1){
                        System.out.println("Впишите значения в вектор:");
                        for(int i =0; i<objectList.get(0).getSize(); i++){
                            objectList.get(0).setElement(i, sc.nextDouble());
                        }
                        break;
                    }
                    else{
                        int value;
                        System.out.println("Выберите номер вектор, который хотите заполнить:");
                        for(int i =0; i<objectList.size(); i++){
                            System.out.println("Вектор["+ (i+1) + "]");
                        }
                        System.out.print("Ваш выбор: ");
                        value = sc.nextInt();
                        System.out.println();
                        for(int i =0; i<objectList.get(value-1).getSize(); i++){
                            System.out.print("Элемент [" + (i+1) +"]: ");
                            objectList.get(value-1).setElement(i, sc.nextDouble());
                        }
                        break;
                    }
                case 4:
                    if(objectList.size()<1){
                        System.out.println("Вы не создали ни одного вектора. ");
                        break;
                    }
                    else if(objectList.size()==1){
                        System.out.print("Вектор[1] - ");
                        for(int i = 0; i<objectList.get(0).getSize(); i++){
                            System.out.print(objectList.get(0).getElement(i) + " ");
                        }
                        System.out.println();
                        break;
                    }
                    else{
                        int value;
                        System.out.println("Выберите номер вектора, элементы которого хотите вывести:");
                        value = sc.nextInt();
                        System.out.print("Вектор["+value+"] - ");
                        for(int i = 0; i<objectList.get(value-1).getSize(); i++){
                            System.out.print(objectList.get(value-1).getElement(i) + " ");
                        }
                        System.out.println();
                        break;
                    }
                case 5:
                    if(objectList.size()<1){
                        System.out.println("Вы не создали ни одного вектора. ");
                        break;
                    }
                    else if(objectList.size()==1){
                        int value;
                        System.out.print("Выберите номер элемента, который хотите вывести от 1 до " + objectList.get(0).getSize()+": ");
                        value = sc.nextInt();
                        System.out.println("Вектор[1] - Элемент["+value+"]: " + objectList.get(0).getElement(value-1));
                        break;
                    }
                    else{
                        int value;
                        int elem;
                        System.out.println("Выберите номер вектора, элементы которого хотите вывести:");
                        for(int i =0; i<objectList.size(); i++){
                            System.out.println("Вектор["+ (i+1) + "]");
                        }
                        System.out.print("Укажите ваш выбор: ");
                        value = sc.nextInt();
                        System.out.print("\nВыберите номер элемента, который хотите вывести от 1 до " + objectList.get(value-1).getSize()+": ");
                        elem = sc.nextInt();
                        System.out.print("Элемент под данным номером равен: " + objectList.get(value-1).getElement(elem));
                        break;
                    }
                case 6:
                    if(objectList.size()<1){
                        System.out.println("Вы не создали ни одного вектора. ");
                        break;
                    }
                    else if(objectList.size()==1){
                        int value;
                        System.out.print("Выберите номер элемента, который хотите изменить от 1 до " + objectList.get(0).getSize()+": ");
                        value = sc.nextInt();
                        System.out.println("Введите новое значени...");
                        System.out.print("Вектор[1] - Элемент["+value+"]: ");
                        objectList.get(0).setElement(value-1, sc.nextDouble());
                        break;
                    }
                    else {
                        int value, elem;
                        System.out.println("Выберите номер вектора, элементы которого хотите изменить:");
                        for(int i =0; i<objectList.size(); i++){
                            System.out.println("Вектор["+ (i+1) + "]");
                        }
                        System.out.print("Укажите ваш выбор: ");
                        value = sc.nextInt();
                        System.out.print("\nВыберите номер элемента, который хотите изменить от 1 до " + objectList.get(value-1).getSize()+": ");
                        elem = sc.nextInt();
                        System.out.print("Вектор["+value+"] - Элемент["+elem+"]: ");
                        objectList.get(value-1).setElement(elem, sc.nextDouble());
                        break;
                    }
                case 7:
                    if(objectList.size()<1){
                        System.out.println("Вы не создали ни одного вектора. ");
                        break;
                    }
                    else if(objectList.size()==1){
                        int value;
                        System.out.println("Минимальное значение вашего вектора: " +objectList.get(0).minElement());
                        break;
                    }
                    else {
                        int value;
                        System.out.println("Выберите номер вектора:");
                        for(int i =0; i<objectList.size(); i++){
                            System.out.println("Вектор["+ (i+1) + "]");
                        }
                        System.out.print("Укажите ваш выбор: ");
                        value = sc.nextInt();
                        System.out.println("Минимальное значение вашего вектора: " +objectList.get(value-1).minElement());
                        break;
                    }
                case 8:
                    if(objectList.size()<1){
                        System.out.println("Вы не создали ни одного вектора. ");
                        break;
                    }
                    else if(objectList.size()==1){
                        System.out.println("Максимальное значение вашего вектора: " +objectList.get(0).maxElement());
                        break;
                    }
                    else {
                        int value;
                        System.out.println("Выберите номер вектора:");
                        for(int i =0; i<objectList.size(); i++){
                            System.out.println("Вектор["+ (i+1) + "]");
                        }
                        System.out.print("Укажите ваш выбор: ");
                        value = sc.nextInt();
                        System.out.println("Максимальное значение вашего вектора: " +objectList.get(value-1).maxElement());
                        break;
                    }
                case 9:
                    if(objectList.size()<1){
                        System.out.println("Вы не создали ни одного вектора. ");
                        break;
                    }
                    else if(objectList.size()==1){
                        objectList.get(0).sortVecUp();
                        break;
                    }
                    else {
                        int value;
                        System.out.println("Выберите номер вектора:");
                        for(int i =0; i<objectList.size(); i++){
                            System.out.println("Вектор["+ (i+1) + "]");
                        }
                        System.out.print("Укажите ваш выбор: ");
                        value = sc.nextInt();
                        objectList.get(value-1).sortVecUp();
                        break;
                    }
                case 10:
                    if(objectList.size()<1){
                        System.out.println("Вы не создали ни одного вектора. ");
                        break;
                    }
                    else if(objectList.size()==1){
                        objectList.get(0).sortVecDown();
                        break;
                    }
                    else {
                        int value;
                        System.out.println("Выберите номер вектора:");
                        for(int i =0; i<objectList.size(); i++){
                            System.out.println("Вектор["+ (i+1) + "]");
                        }
                        System.out.print("Укажите ваш выбор: ");
                        value = sc.nextInt();
                        objectList.get(value-1).sortVecDown();
                        break;
                    }
                case 11:
                    if(objectList.size()<1){
                        System.out.println("Вы не создали ни одного вектора. ");
                        break;
                    }
                    else if(objectList.size()==1){
                        System.out.println("Евклидова норма вашего вектора равна: " + objectList.get(0).euclideanModule());
                        break;
                    }
                    else {
                        int value;
                        System.out.println("Выберите номер вектора:");
                        for(int i =0; i<objectList.size(); i++){
                            System.out.println("Вектор["+ (i+1) + "]");
                        }
                        System.out.print("Укажите ваш выбор: ");
                        value = sc.nextInt();
                        System.out.println("Евклидова норма вашего вектора равна: " + objectList.get(value-1).euclideanModule());
                        break;
                    }
                case 12:
                    if(objectList.size()<1){
                        System.out.println("Вы не создали ни одного вектора. ");
                        break;
                    }
                    else if(objectList.size()==1){
                        double value;
                        System.out.print("Введите множитель вектора: ");
                        value = sc.nextDouble();
                        objectList.get(0).multiVON(value);
                        break;
                    }
                    else {
                        int value;
                        double mult;
                        System.out.println("Выберите номер вектора:");
                        for(int i =0; i<objectList.size(); i++){
                            System.out.println("Вектор["+ (i+1) + "]");
                        }
                        System.out.print("Укажите ваш выбор: ");
                        value = sc.nextInt();
                        System.out.print("Введите множитель вектора: ");
                        mult = sc.nextDouble();
                        objectList.get(value-1).multiVON(mult);
                        break;
                    }
                case 13:
                    if(objectList.size()<1){
                        System.out.println("Вы не создали ни одного вектора. ");
                    }
                    else if(objectList.size()==1){
                        System.out.println("У вас есть только один вектор, необходимо два. ");
                        System.out.print("Укажите длинну второго вектора: ");
                        objectList.add(new Vectors(sc.nextInt()));
                        System.out.println("\nЗаполните вектор значениями:  ");
                        for(int i =0; i<objectList.get(1).getSize(); i++){
                            objectList.get(1).setElement(i, sc.nextDouble());
                        }
                        objectList.add(objectList.get(0).sumTwoVec(objectList.get(1)));
                        System.out.print("Вектор[3] - ");
                        for(int i = 0; i<objectList.get(2).getSize(); i++){
                            System.out.print(objectList.get(2).getElement(i) + " ");
                        }
                        System.out.println();
                        break;
                    }
                    else {
                        int first,second;
                        for(int i =0; i<objectList.size(); i++){
                            System.out.println("Вектор["+ (i+1) + "]");
                        }
                        System.out.print("Выберите номер первого вектора: ");
                        first = sc.nextInt();
                        System.out.print("Выберите номер второго вектора: ");
                        second = sc.nextInt();
                        objectList.add(objectList.get(first-1).sumTwoVec(objectList.get(second-1)));
                        System.out.println("\n\nВектор["+objectList.size()+"] - ");
                        for(int i = 0; i<objectList.get(objectList.size()).getSize(); i++){
                            System.out.print(objectList.get(objectList.size()).getElement(i) + " ");
                        }
                        System.out.println();
                        break;
                    }


            }
        }
    }
}