package ru.mirea.lab22;

public class Client {
    private final String name;
    private final String inn;

    public Client(String name, String INN) throws InnException {
        this.name = name;
        if (INN.length() != 11) throw new InnException();
        this.inn = INN;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", INN=" + inn +
                '}';
    }
}
