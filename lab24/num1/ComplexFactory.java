package ru.mirea.lab24.num1;

public class ComplexFactory implements ComplexAbstrFactory {

    @Override
    public Complex createComplex() {
        Complex complex = new Complex(4, 1);
        return complex;
    }

    @Override
    public Complex createComplex(int real, int image) {
        Complex complex = new Complex(real, image);
        return complex;
    }
}
