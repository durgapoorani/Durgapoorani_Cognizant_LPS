import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testMultipleReturns() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("First Call", "Second Call", "Third Call");

        MyService service = new MyService(mockApi);

        String first = service.fetchData();
        String second = service.fetchData();
        String third = service.fetchData();

        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("Third: " + third);

        assertEquals("First Call", first);
        assertEquals("Second Call", second);
        assertEquals("Third Call", third);
    }
}
