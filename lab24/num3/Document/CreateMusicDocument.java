package ru.mirea.lab24.num3.Document;

public class CreateMusicDocument implements CreateDocument {
    @Override
    public IDocument createNew() {
        return new MusicDocument();
    }

    @Override
    public IDocument createOpen(IDocument iDocument) {
        iDocument.open();
        return iDocument;
    }
}
