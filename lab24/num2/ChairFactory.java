package ru.mirea.lab24.num2;

public class ChairFactory implements ChairAbstrFactory {
    @Override
    public FuncChair creatFuncChair() {
        return new FuncChair();
    }

    @Override
    public MagicChair creatMagicChair(String material) {
        return new MagicChair(material);
    }

    @Override
    public VictorianChair creatVictorianChair(String owner) {
        return new VictorianChair(owner);
    }
}
