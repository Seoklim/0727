import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner(System.in);
		
		Employee em = new Employee();

		System.out.print("사원번호 : ");
		em.empno  = sc.nextInt();
		sc.nextLine(); //enter날리자
		
		System.out.print("사원이름 : ");
		em.ename = sc.nextLine();
		
		System.out.print("사원출생년도 : ");
		em.birthYear = sc.nextInt();
		
		System.out.print("사원월급 : ");
		em.salary = sc.nextInt();
		sc.nextLine(); //enter날리자
		
		System.out.print("사원이메일 : ");
		em.email = sc.nextLine();
		
		
		System.out.print("사원전화번호 : ");
		em.tel = sc.nextLine();
		
		System.out.print("정규직여부 : ");
		em.flag = sc.nextBoolean();
		
		System.out.printf("사원번호 : " + em.empno);
		System.out.printf("사원이름 : ", + em.ename);
		System.out.printf("사원출생년도 : %d\\n", em.birthYear);
		System.out.printf("사원월급 : %d\\n", em.salary);
		System.out.printf("사원이메일 : %s\\n", em.email);
		System.out.printf("사원전화번호 : %s\\n", em.tel);
		System.out.printf("정규직여부 : %b\\n", em.flag);
		
	}
}
