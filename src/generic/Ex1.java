package generic;

// 파우더 클래스 만들기

class Powder {
	
	public void doPrinting() {
		System.out.println("Power 재료로 출력합니다.");
	}
	
	public String toString() {
		return "재료는 Power 입니다.";
	}
	
}


// 플라스틱 클래스 만들기

class Plastic {
	
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}
	
	public String toString() {
		return "재료는 Plastic 입니다.";
	}
	
} 

// 파우더를 재료로 사용하는 프린터 만들기

class ThreeDPrinter1 {
	// 재료를 담는 변수는 private로 생성
	private Powder material; 
	// 외부에서 전달 받은 내용을 전달하는 함수
	public void setMaterial(Powder powder) {
		this.material = powder;
	}
	// 전달 받은 내용을 내부로 전달하는 함수
	public Powder getMaterial() {
		return material;
	}
	
}

// 플라스틱을 재료로 사용하는 프린터 만들기

class ThreeDPrinter2 {
	
	private Plastic material;

	public void setMaterial(Plastic plastic) {
		this.material = plastic;
	}
	
	public Plastic getMaterial() {
		return material;
	}
	
}









