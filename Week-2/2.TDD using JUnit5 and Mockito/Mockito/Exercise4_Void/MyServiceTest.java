import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {
    @Test
    public void testHandleVoidMethod() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        doNothing().when(mockApi).sendData(anyString());

        MyService service = new MyService(mockApi);
        service.pushData("Send this");

        verify(mockApi).sendData(eq("Send this"));
    }
}
