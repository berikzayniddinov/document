public class DocumentMain {
    public static void main(String[] args) {
        DocumentFactory documentFactory = createDocumentBySpecialty("Word");
        Document pdfDocument = documentFactory.createDocument();
        pdfDocument.create();;


    }
    static DocumentFactory createDocumentBySpecialty(String specialty){
        if(specialty.equalsIgnoreCase("PDF")){
            return new pdfDocumentFactory();
        }
        else if(specialty.equalsIgnoreCase("Word")){
            return new wordDocumentFactory();
        }
        else {
            throw new RuntimeException(specialty + " is unknown document");
        }

    }
}
