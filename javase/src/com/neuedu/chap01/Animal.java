package com.neuedu.chap01;

public class Animal {
	//本地修改
	// 名字
	protected String name;
	// 性别
	protected String sex;
	// 颜色
	protected String color;

	public void show() {
		System.out.println("名字: " + name + "性别: " + sex + "颜色: " + color);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {

		Cat cat = new Cat();
		cat.setName("旺旺");
		cat.setColor("粉色");
		cat.setSex("公");
		cat.setHeigth(123);
		cat.show();

		Dog dog = new Dog();
		dog.setName("喵喵");
		dog.setColor("蓝色");
		dog.setSex("母");
		dog.setPrices(50);
		dog.show();

	}

}
