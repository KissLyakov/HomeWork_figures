package com.example.javafx_test;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Objects;

public class Rectangle extends Shapes {
    private double posX;
    private double posY;

    public Rectangle(Color shapeColor, int posX, int posY) {
        super(shapeColor);
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public void draw(GraphicsContext context){
        context.setFill(this.shapeColor);
        context.setStroke(this.shapeColor);
        context.strokeRect(this.posX, this.posY, 50,50);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.posX, posX) == 0 && Double.compare(rectangle.posY, posY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), posX, posY);
    }
}