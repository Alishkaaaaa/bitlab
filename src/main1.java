public class main1 {



    public static void main(java.lang.String[] args) {

        Book b19 = new Book(13, "Kira", "Putin");
        Book b20 = null;
        Book b21 = new Book(14, "Lion", "Sell");
        Library l1 = new Library("Nazar", "Akmola");
        for (int i = 1; i <= 19; i++) {
            l1.addBook(new Book(13, "Kira", "Putin"));
        }
        l1.addBook(b20);
        l1.printBooks();
        l1.addBook(b21);

}
}

