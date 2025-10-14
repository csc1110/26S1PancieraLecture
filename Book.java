public class Book {
    //Write necessary instance variables.
    //Use the most appropriate type
    private String title;
    private String author;
    private int pages;
    private String genre;
    private boolean inStock;

    //Write the constructor for the Book class.
    //The Library class will send all needed variables.
    //Remember that all instance variables MUST
    //have a value by the time the constructor finishes.
    public Book(String title, String author, int pages, String genre,
                boolean inStock){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
        this.inStock = inStock;
    }

    //Write the getTitle method which returns the title of the Book
    public String getTitle(){
        return this.title;
    }

    //Write the isFantasy method that will return true if the Book
    // is fantasy
    public boolean isFantasy(){
        if(this.genre.equals("Fantasy")){
            return true;
        } else {
            return false;
        }
        // return this.genre.equals("Fantasy");
    }

    //Write the over500 method that will return true if the Book
    //is over 500 pages
    public boolean over500(){
        return this.pages > 500;
        /*
        if(this.pages > 500) {
            return true;
        } else {
            return false;
        }
         */
    }
    public boolean equals(Book book2){
        if(this.title.equals(book2.title)
                && this.author.equals(book2.author)
                && this.pages == book2.pages
                && this.genre.equals(book2.genre)
                && this.inStock == book2.inStock) {
            return true;
        } else {
            return false;
        }
     }

     public String toString(){
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nPages: " + Integer.toString(this.pages) + " " + this.genre +
                this.inStock;
     }



}
