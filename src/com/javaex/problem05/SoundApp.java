package com.javaex.problem05;

public class SoundApp {

    public static void main(String[] args) {
        printSound( new Cat() );
        printSound( new Dog() );
        printSound( new Sparrow() );
        printSound( new Duck() );
        
    }

    							//  (지금 Cat,Dog,Sparrow,Duck이 Soundable 인터페이스로 묶여있기 때문에 입력변수 일치,입장가능)  
    							//( (들어갈 수 있는 형태)  (입력값을 받는 변수)) 
    public static void printSound( Soundable soundable ) {
        System.out.println(soundable.sound());
        					//(입력값).(입력값이 Soundable 조건을 만족하는 것만 들어올 수 있으므로 Soundable 함수 모두 사용가능)
    }
    
}
