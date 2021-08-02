package CH06_2_field;

public class Car {
//	String company = "현대자동차";
//	String model = "그랜저";
//	String color = "검정";
//	int maxSpeed = 350;
//	int speed;
	
		String company = "";
		String model = "";
		String color = "";
		String engine = "";
		int maxSpeed;
		int speed;
		
		Car(String company, String model, String color){
//			this.+ctrl+space bar 
			this.company = company; //입력받은 정보
			this.model = model;
			this.color = color;
			
		}
		Car(String model){
//			this.color = "파랑"; !오류!
			this(model, "은색", 250);
			
		}
			Car(String company, String model, String color, String engine){
//				this.+ctrl+space bar 
				this.company = company; //입력받은 정보
				this.model = model;
				this.color = color;
				this.engine = engine;		
			}
			int add(int x) {
				
				return 0;
			}
			int add(int x, int y) {
				
				return 0;
			}
			int add(int x, int y, int z) {
				
				return 0;
			}
		
	}


