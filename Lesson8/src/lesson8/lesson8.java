package lesson8;

public class lesson8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Switch Case Example");
		int num=2;
		switch(num+2)
		{
		case 1:
			System.out.println("Case1: Value is: "+num);
		case 2:
			System.out.println("Case2: Value is: "+num);
		case 3:
			System.out.println("Case3: Value is: "+num);
		default:
			System.out.println("Default: Value is: "+num);
		}

		System.out.println("\nSwitch Case missing Break");
		int i=2;
		switch(i)
		{
		case 1:
			System.out.println("Case1 ");
		case 2:
			System.out.println("Case2 ");
		case 3:
			System.out.println("Case3 ");
		case 4:
			System.out.println("Case4 ");
		default:
			System.out.println("Default ");
		}

		System.out.println("\nSwitch Case With Break");
		i=2;
		switch(i)
		{
		case 1:
			System.out.println("Case1 ");
			break;
		case 2:
			System.out.println("Case2 ");
			break;
		case 3:
			System.out.println("Case3 ");
			break;
		case 4:
			System.out.println("Case4 ");
			break;
		default:
			System.out.println("Default ");
		}


		System.out.println("\nSwitch Case Out of Order");
		char ch='b';
		switch(ch)
		{
		case 'd':
			System.out.println("Case1 ");
			break;
		case 'b':
			System.out.println("Case2 ");
			break;
		case 'x':
			System.out.println("Case3 ");
			break;
		case 'y':
			System.out.println("Case4 ");
			break;
		default:
			System.out.println("Default ");
		}
	}

}
