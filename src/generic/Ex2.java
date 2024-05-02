package generic;

public class Ex2 {

	public static void main(String[] args) {
		
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		Powder p1 = new Powder(); //Powder를 재료로 선택
		
		printer.setMaterial(p1); //매개변수가 자동으로 형변환됨 (Object material = p1(주소값이 들어가 있음);)
		
		//재료를 꺼낼때는 직접 형변환을 해야함
		Powder p2 = (Powder)printer.getMaterial();
		
		p2.doPrinting();
		
	}

}

class ThreeDPrinter3 {
	
	private Object material;
	// 재료를 변경하는 함수
	public void setMaterial(Object material) {
		this.material = material;
	}
	// 재료를 꺼내는 함수
	public Object getMaterial() {
		return material;
	}
	
}