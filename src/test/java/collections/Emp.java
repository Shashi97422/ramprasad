package collections;

import java.util.ArrayList;

public class Emp {
@Override
	public String toString() {
		return "[name=" + name + ", sal=" + sal + "]";
	}
String name;
int sal;
public Emp(String name, int sal) {
	this.name=name;
	this.sal=sal;
}

}
