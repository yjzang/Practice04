package com.javaex.problem04;

public class Duck extends Bird {

	//setName으로 변수가 들어가고 있기 때문에 생성자(필드) 노필요
	
	public void sing() {
    
    	System.out.println("오리("+getName()+")가 소리내어 웁니다.");	
    }

    public void fly() {
    
    	System.out.println("오리("+getName()+")가 날지 않습니다.");
    }
    
    public void showName() {
    
    	System.out.println("오리의 이름은 "+getName()+"입니다.");
    }
    
    

}
