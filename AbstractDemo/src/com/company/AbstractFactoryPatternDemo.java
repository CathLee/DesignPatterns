package com.company;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
	// write your code here
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //获取形状为 Circle 的对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //获取形状为 Square 的对象
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //获取颜色为 Green 的对象
        Color color1 = colorFactory.getColor("Green");
        color1.fill();

        //获取颜色为 Blue 的对象
        Color color2 = colorFactory.getColor("BLUE");
        color2.fill();
    }
}
