package homework;

public class Controller extends classwork.Controller {

    private StreamService streamService;

    public Controller(StreamService streamService) {
        super();
        this.streamService = streamService;
    }

    public Controller() {
        streamService = new StreamService();
    }

    public void setStreamService(StreamService service) {
        this.streamService = service;
    }
    public void sortStream () {
        streamService.sortStreams(streamService.getStreamList());
    }
}
