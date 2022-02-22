package com.Vec;
import static java.lang.Math.sqrt;

public class Vectors {
    private final double[] Vector;
    private final int Size;

    public Vectors(int size) {
        this.Vector = new double[size];
        this.Size = size;
    } /// Конструктор создания вектора.
    public int getSize() { return Size;} /// Выведение вместимости вектора.
    public double getElement(int i){
        return Vector[i];
    } /// Получение определённого элемента вектора.
    public void setElement(int i, double value){
        Vector[i]=value;
    } /// Изменение элементов вектора.
    public double minElement(){
        double value= Vector[0];
        for (int i = 0; i < Size; i++){
            if (Vector[i]<value){
                value = Vector[i];
            }
        }
        return value;
    } /// Минимальное значение элемента вектора.
    public double maxElement(){
        double value = Vector[0];
        for(int i = 0; i<Size; i++){
            if(Vector[i]>value){
                value = Vector[i];
            }
        }
        return value;
    } /// Максимальное значение элементов вектора.
    public void sortVecUp(){
        double valueX;
        for (int i = 0; i<Size; i++) {
            valueX = Vector[i];
            for (int j = i+1; j < Size; j++){
                if (Vector[j]<valueX){
                    valueX= Vector[j];
                    Vector[j]= Vector[i];
                    Vector[i]=valueX;
                }
            }
        }
    }/// Сортировка вектора по убыванию.
    public void sortVecDown(){
        double valueX;
        for(int i =0; i<Size; i++) {
            valueX = Vector[i];
            for (int j = i+1; j < Size; j++){
                if (Vector[j]>valueX){
                    valueX= Vector[j];
                    Vector[j]= Vector[i];
                    Vector[i]=valueX;
                }
            }
        }
    }/// Сортировка вектора по возрастанию.
    public double euclideanModule(){
        double x=0;
        for (int i = 0; i<Size; i++){
            x += (Vector[i]* Vector[i]);
        }
        return sqrt(x);
    }/// Поиск Евклидовой нормы.
    public void multiVON(double x){
        for (int i = 0; i<Size; i++){
            Vector[i] *= x;
        }

    }/// Умножение вектора на число.
    public Vectors sumTwoVec(Vectors vec){
        Vectors Vector2 = new Vectors(Size);
        for (int i = 0; i<Size; i++){
            Vector2.setElement(i, Vector[i]+vec.Vector[i]);
        }
        return Vector2;
    }/// Сумма двух векторов.
    public Vectors multTwoVec(Vectors vec){
        Vectors Vector2 = new Vectors(Size);
        for (int i = 0; i<Size; i++){
            Vector2.setElement(i, Vector[i]*vec.Vector[i]);
        }
        return Vector2;
    }/// Умножение двух векторов.
}
