public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void pushData(String data) throws Exception {
        api.sendData(data);
    }
}
