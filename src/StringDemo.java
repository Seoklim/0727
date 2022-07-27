
public class StringDemo {
	public static void main(String[] args) {
		
		String name = new String("한지민"); //이거랑 밑에랑똑같음
		
//		String name; 		//선언, declaration    name은 값을넣을수없고 주소만넣을수잇음
//		name = "한지민";  //할당, Assignment , 한지민의 주소를 name에 넣는다.
	//		System.out.printf("이름 = %s\n", name);
		
		Student jimin; //declaration 선언
		jimin = new Student(); //Assignment 할당
		jimin.hakbun = "2022-001";
		jimin.name = "한지민";
		jimin.age = 26;

		System.out.printf("%s, %s, %d\n", jimin.hakbun, jimin.name, jimin.age);
		
		Student younghee = new Student();
		younghee.name = "이영희";
		younghee.age = 46;
		
		System.out.println("이영희 학생정보 :");
		System.out.printf("이름 : %s, 나이 = %d\n", younghee.name, younghee.age);
	}
}
