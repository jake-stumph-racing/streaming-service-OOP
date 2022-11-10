public class Client {

    private StreamingService stream;
    private DigitalContent currentlyStreamed;

    public Client(StreamingService stream, DigitalContent currentlyStreamed) {
        this.stream = stream;
        this.currentlyStreamed = currentlyStreamed;
    }

    public StreamingService getStream() {
        return stream;
    }


}
