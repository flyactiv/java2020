package ru.mirea.lab24.num2;

public interface ChairAbstrFactory {
    public FuncChair creatFuncChair();
    public MagicChair creatMagicChair(String material);
    public VictorianChair creatVictorianChair(String owner);

}