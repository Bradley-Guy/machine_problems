package source;



public class Calculator {

	

	private String name;

	

	public float addition (Float A, Float B) {

		float addition=0;

		addition= A + B;

		return addition;

		

	}

	public float subtraction(Float A, Float B) {

		float subtraction=0;

		subtraction = A - B;

		return subtraction;

		

	}

	public float multiplication (Float A, Float B) {

		float multiplication=0;

		multiplication = A * B;

		return multiplication;

	}



	public void setname(String N) {

		this.name=N;	

	}

	

	public String getname() {

		 return name;

	}

	

	

