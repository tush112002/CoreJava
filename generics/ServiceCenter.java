package generics;

public class ServiceCenter<T extends Vehicle> {
	T v;

	public ServiceCenter(T v) {
		super();
		this.v = v;
	}

	public T getV() {
		return v;
	}

	public void setV(T v) {
		this.v = v;
	}

	void vehicalDetails() {
		System.out.println("Vehicle:" + v + " Type:" + v.getClass().getSimpleName());
	}
}
