package com.javaex.problem04;

public class BirdApp {

    public static void main(String[] args) {
        Bird bird01 = new Duck(); //new 찍히는 문장에서 Duck(); 괄호 속의 형태를 필드 생성자의 형태와 맞춰준다고 생각하라.
        bird01.setName("꽥꽥이");
        bird01.fly();
        bird01.sing();
        bird01.showName();

        Bird bird02 = new Sparrow();
        bird02.setName("짹짹이");
        bird02.fly();
        bird02.sing();
        bird02.showName();
    }

}
