import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {
    @Test
    public void testVoidMethodThrowsException() throws Exception {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        doThrow(new Exception("Mock Exception")).when(mockApi).sendData("fail");

        MyService service = new MyService(mockApi);

        try {
            service.pushData("fail");
        } catch (Exception e) {
            assert e.getMessage().equals("Mock Exception");
        }

        verify(mockApi).sendData("fail");
    }
}
