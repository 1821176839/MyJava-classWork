package NO3;

import java.util.Scanner;

public class TestShape {
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		double TotalPerimeter = 0;					//TotalPerimeter = ���е��ܳ����
		double TotalArea = 0;						//TotalArea = ���е�������
		
		double radius = input.nextDouble();
		Circle circle1 = new Circle(radius);
		double sidelength1 = input.nextDouble();
		Rectangle rectangle1 = new Rectangle(sidelength1);
		double sidelength2 = input.nextDouble();
		Triangle triangle1 = new Triangle(sidelength2);					//���Ͻ��е��ǵ�һ������
		
		TotalPerimeter = circle1.getPerimeter(radius) + rectangle1.getPerimeter(sidelength1)+triangle1.getPerimeter(sidelength2);
		TotalArea = circle1.getArea(radius) + rectangle1.getArea(sidelength1) + triangle1.getArea(sidelength2);
							//���Ͻ��е��ǵ�һ�μ���
		
		radius = input.nextDouble();
		Circle circle2 = new Circle(radius);
		sidelength1 = input.nextDouble();
		Rectangle rectangle2 = new Rectangle(sidelength1);
		sidelength2 = input.nextDouble();
		Triangle triangle2 = new Triangle(sidelength2);					//���Ͻ��е��ǵڶ�������
		
		TotalPerimeter = TotalPerimeter + circle1.getPerimeter(radius) + rectangle1.getPerimeter(sidelength1)+triangle1.getPerimeter(sidelength2);
		TotalArea = TotalArea + circle1.getArea(radius) + rectangle1.getArea(sidelength1) + triangle1.getArea(sidelength2);
							//���Ͻ��е��ǵڶ��μ���
		
		System.out.printf("Total Perimeter is %.3f : ",TotalPerimeter);
		System.out.printf("Total Area is %.3f : ", TotalArea);
							//������λС��������λ����ʵ������ȡ��
	}
}
