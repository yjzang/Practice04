package com.javaex.problem01;

public class MyBase extends Base{

    
	
	public void service(String state) {
		  
		
		if (state.equals("낮")) {
	            day();
	        }
		else if(state.equals("밤")) {
	            night();
	        }
		
		else if (state.equals("오후")) {
				afternoon();
		}
		
	}
    
	public void afternoon() {
			System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}
}
