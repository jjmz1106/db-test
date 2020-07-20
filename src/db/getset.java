package db;

public class getset {
	private String name;
	private int num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String toString() {
		return "getset [name=" + name + ", num=" + num + "]";
	}

}
