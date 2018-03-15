package com.javaex.problem03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
    	if("앱".equals(str)) {
    		playApp();
    	}
    	else {
    		super.execute(str);
    	}
    }

    
    
    public void playApp() {
    	System.out.println("앱 실행");
    }
    
    
    
    //super가 이중으로 되어있을때는 가까운 부모부터 올라간다.
    
    
    
}
