public class pdfDocumentFactory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new pdfDocument();
    }
}
