/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thani.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
 *
 * @author tarde
 */
public class Calculator {
    //Esto para cuando le den al boton Ans, para guardar el último valor calculado
    private double ans = 0;

    public double getAns() {
        return ans;
    }
    
    //Para cuando el usuario le de al boton C
    public void reset(){
        ans = 0;
    }
    
    //Seteamos la prioridad de cada operador
    private int prioridad(String op){
        switch(op){
            //Tiene más prioridad que los otros operadores
            case "%":
                return 3;
            //La multiplicación, el dividir y la operación módulo tienen la misma prioridad
            case "x": 
            case "÷":
            case "Mod":
                return 2;
            //Por último suma y restra que tienen menos prioridad
            case "+":
            case "-":
                return 1;
            //Esto es cualquier otra cosa que no sea operador, puede ser un número, el Ans...
            default:
                return 0;
        }
    }
    
    private double operar(double a, String op, double b) {
        switch (op) {
            case "+":   
                return a + b;
            case "-":   
                return a - b;
            case "x":   
                return a * b;
            case "÷":   
                return a / b;
            case "Mod": 
                return a % b;
            default:    
                return 0;
        }
    }
    
    //Shunting yard
    private List<String> aPosfija(String texto) {
        //Se guardará aquí el resultado en postfija
        List<String> salida = new ArrayList<>();
        Stack<String> pila = new Stack<>();

        //Un for each donde se quita los espacios y también se corta el texto por los espacios
        for (String t : texto.trim().split("\\s+")) {
            if (t.equals("Ans")) {
                //Si se encuentra Ans, añade en la salida el valor de ans en tipo String
                salida.add(String.valueOf(ans));
            } else if (t.equals("%")) {
                salida.add(t);
            } else if (prioridad(t) > 0) {//Si es un operador binario
                
                //Mientras que en la pila haya algo y el último operador tenga la misma o más prioridad que el nuevo
                while (!pila.isEmpty() && prioridad(pila.peek()) >= prioridad(t)) {
                    //se añade en la salida y luego se quitaría de la pila
                    salida.add(pila.pop());
                }
                //Y mete el operador nuevo en la pila
                pila.push(t);
            } else {
                //Si no es el caso anterior es que es un número, y si hay una coma se cambiaría por un .
                salida.add(t.replace(',', '.'));
            }
        }
        //Aquí mientras que haya algo en la pila, lo vacía y añade en la salida los operadores que quedaban
        while (!pila.isEmpty()) {
            salida.add(pila.pop());
        }
        return salida;
    }
    
    private double evaluar(List<String> posfija) {
        //Donde se iŕa calculando
        Stack<Double> pila = new Stack<>();
        //De la lista postfija recorre cada trozo
        for (String t : posfija) {
            if (t.equals("%")) {
                //Saca el último número y luego lo divide, y luego se mete (si es 5%, se pasa a 0.05)
                pila.push(pila.pop() / 100);
            } else if (prioridad(t) > 0) {//si es un op binario
                double b = pila.pop();
                double a = pila.pop();
                pila.push(operar(a, t, b));
            } else {
                //Si es un número lo pasa a double
                pila.push(Double.parseDouble(t));
            }
        }
        return pila.pop();
    }
    
    //Este recibirá el texto de la pantala y devolverá el resultado
    public double calcular(String pantalla) {
        //Convierte el texto a notacion postfija y se guarda en una lista
        List<String> posfija = aPosfija(pantalla);
        //Y aqui se calcula el resultado de esa lista, y lo guardaríamos en el ans
        ans = evaluar(posfija);
        return ans;
    }
    
}
    
