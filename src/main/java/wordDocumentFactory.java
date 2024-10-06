public class wordDocumentFactory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new wordDocument();
    }
}
