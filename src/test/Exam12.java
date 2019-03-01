package test;

class Hello {
	World world;

	public Hello(World world) {
		this.world = world;
	}

	public void say() {
		System.out.println(world.message);
	}

}

class World {
	String message = "æ»≥Á«œººø‰";

	public void doSomething() {
		Hello hello = new Hello(this);
		hello.say();
	}
}

public class Exam12 {

	public static void main(String[] args) {
		World world = new World();
		world.doSomething();
	}
}
