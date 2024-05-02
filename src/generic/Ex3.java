package generic;

public class Ex3 {

	public static void main(String[] args) {
		
		//파우더를 사용하는 프린터기 생성
		//<T>의 자료형을 Powder로 지정해줌 T -> Powder로 자동 컴파일 되므로 다운캐스팅이 필요없음 (제네릭을 사용하는 이유)
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<>();
		printer1.setMaterial(new Powder());
		Powder powder = printer1.getMaterial();
		powder.doPrinting();
		
		//플라스틱을 사용하는 프린터기 생성 
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<>();
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial();
		plastic.doPrinting();
	}

}

// Object를 제네릭으로 T를 입력하면 어떤 자료형을 받을껀지 정하지 않은 상태
class ThreeDPrinter<T> {
	
	private T material;
	// 재료를 변경하는 함수
	public void setMaterial(T material) {
		this.material = material;
	}
	// 재료를 꺼내는 함수
	public T getMaterial() {
		return material;
	}
	
}







