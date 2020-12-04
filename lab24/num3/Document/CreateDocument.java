package ru.mirea.lab24.num3.Document;

public interface CreateDocument {
    IDocument createNew();
    IDocument createOpen(IDocument iDocument);
}
