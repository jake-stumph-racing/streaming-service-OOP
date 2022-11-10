public abstract class DigitalContent implements Comparable<String>{
    String title;
    String publisher;
    String releaseDate;

    public DigitalContent(String title, String publisher, String releaseDate) {
        this.title = title;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "DigitalContent{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }

    public boolean match(String query){
        return this.title.contains(query) || this.publisher.contains(query);
    }

    public int compareTo(String title){
        return this.title.compareTo(title);
        //Guessing future use of Comparable interface would be to sort titles based on user desire
    }
}
