package cтруктурные.template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// реализуем абстрактный метод
public class CoffeeWithHook extends CaffeineBeverage {

    public void brew() {
        System.out.println("Завариваем кофе");
    }

    public void addCondiments() {
        System.out.println("Добовляем сахар и молоко");
    }
// переопределяем перехватчик и захаем нужную функциональность
    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.print("Вы хотите молоко и сахар с кофе?(y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
