public class Library {


    protected String name;
    protected String city;
    protected Book books[] = new Book[20];
    int index = 0;

    public Library() {
        String name = "None";
        String city = "None";
    }

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addBook(Book book) {
        try {
            books[index] = book;
            index++;
        } catch (Exception e) {
            System.out.println("The library is full");
        }

    }

    public void printBooks() {
        for (int i = 0; i < books.length; i++) {
            try {
                String data = books[i].getData();
                System.out.println(data);
            } catch (Exception e) {
                System.out.println("The book is empty");
            }
        }

    }
}

