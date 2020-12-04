package ru.mirea.lab24.num3.Document;

public class CreateTextDocument implements CreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen(IDocument iDocument) {
        iDocument.open();
        return iDocument;
    }
}
