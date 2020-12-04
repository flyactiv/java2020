package ru.mirea.lab24.num3.Document;

public class CreateImageDocument implements CreateDocument {

    @Override
    public IDocument createNew() {
        return new ImageDocument();
    }

    @Override
    public IDocument createOpen(IDocument iDocument) {
        iDocument.open();
        return iDocument;
    }
}