package br.com.rogon.bethrobson.templatemetho.barista;

public class Coffee extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Dripping Coffe through filter");
    }

    @Override
    void addCodiments() {
        System.out.println("Adding Sugar and Milk");
    }
    
}
