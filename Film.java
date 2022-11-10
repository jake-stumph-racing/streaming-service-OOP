public class Film extends DigitalContent {
    String castMembers; //a list would surely be better implementation

    public Film(String title, String publisher, String releaseDate, String castMembers) {
        super(title, publisher, releaseDate);
        this.castMembers = castMembers;
    }

    public String getCastMembers() {
        return castMembers;
    }

    public void setCastMembers(String castMembers) {
        this.castMembers = castMembers;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.castMembers;
    }
//    @Override
//    public String toString() {
//        return "Film{" +
//                "castMembers='" + castMembers + '\'' +
//                ", title='" + title + '\'' +
//                ", publisher='" + publisher + '\'' +
//                ", releaseDate='" + releaseDate + '\'' +
//                '}';
//    }

    @Override
    public boolean match(String query) {
        return super.match(query) || this.castMembers.contains(query);
    }
}
