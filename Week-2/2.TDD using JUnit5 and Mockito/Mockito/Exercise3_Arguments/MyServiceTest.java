import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {
    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData(anyString())).thenReturn("Matched Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchData("abc123");

        assert result.equals("Matched Data");
        verify(mockApi).getData(eq("abc123"));
    }
}
