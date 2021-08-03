package ch06_5_instance_static;

//public class testTest {
//	class A{
//		double pi = 3.141592;
//		String name;
//	}
//	class B{
//		double pi = 3.141592;
//		String name;
//	}
//	class C{
//		double pi = 3.141592;
//		String name;
//	}

//	________________________
	 class D { 
		static double pi =3.141592;
		String name;
	}
	class E {
		double r = D.pi;
	}
	class F {
		double reults = 10*10*D.pi;
	}


