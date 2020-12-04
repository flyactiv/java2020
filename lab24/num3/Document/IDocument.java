package ru.mirea.lab24.num3.Document;

public abstract class IDocument {

    public IDocument() {
    }

    public abstract String getType();
    public abstract void open();
    public abstract void new_file();

}
