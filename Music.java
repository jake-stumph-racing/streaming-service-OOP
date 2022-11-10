public class Music extends DigitalContent {

    String artistName;

    public Music(String title, String publisher, String releaseDate, String artistName) {
        super(title, publisher, releaseDate);
        this.artistName = artistName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.artistName;
    }

//    @Override
//    public String toString() {
//        return "Music{" +
//                "artistName='" + artistName + '\'' +
//                ", title='" + title + '\'' +
//                ", publisher='" + publisher + '\'' +
//                ", releaseDate='" + releaseDate + '\'' +
//                '}';
//    }

    @Override
    public boolean match(String query) {
        return super.match(query) || this.artistName.contains(query);
    }



}
