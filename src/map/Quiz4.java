package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Quiz4 {

	public static void main(String[] args) {
		
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		
		map.put(1001, new Student(1001, "둘리", 90, 80, 70));
		map.put(1002, new Student(1002, "도우너", 55, 65, 75));
		map.put(1003, new Student(1003, "또치", 80, 50, 50));
		
//		Collection<Student> values = map.values();
//		
//		System.out.print("둘리의 총점" + (map.get(1001).korScore + map.get(1001).mathScore + map.get(1001).engScore));
//		System.out.println("둘리의 평균" + (map.get(1001).korScore + map.get(1001).mathScore + map.get(1001).engScore)/3);
//		System.out.println(map.get(1001).korScore + map.get(1002).korScore + map.get(1003).korScore);
//		System.out.println((map.get(1001).korScore + map.get(1002).korScore + map.get(1003).korScore)/3);
		
		Set<Integer> keys = map.keySet();
		
		for (Integer key : keys) {
			
			Student student = map.get(key);
			
			int sum = student.korScore + student.mathScore + student.engScore;
			double avg = sum / 3.0;
			
			//for 문 안에서 출력해야함
			System.out.println(student.studentName + "의 총점 " + sum + ", 평균: " + avg);
		}
		
		int korSum = 0;
		int mathSum = 0;
		int engSum = 0;
		
		for (int key : keys) {
			Student student = map.get(key);
			korSum += student.korScore;
			mathSum += student.mathScore;
			engSum += student.engScore;
		}
		
		System.out.println("국어의 총점: " + korSum + ", 평균: " + (korSum / 3.0));
		System.out.println("수학의 총점: " + mathSum + ", 평균: " + (mathSum / 3.0));
		System.out.println("영어의 총점: " + engSum + ", 평균: " + (engSum / 3.0));
	}

}

class Student {
	
	int studentId;
	String studentName;
	int korScore;
	int mathScore;
	int engScore;
	
	public Student(int studentId, String studentName, int korScore, int mathScore, int engScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", korScore=" + korScore
				+ ", mathScore=" + mathScore + ", engScore=" + engScore + "]";
	}
	
}