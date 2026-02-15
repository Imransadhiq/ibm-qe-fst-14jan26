import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class UserTest {

    @Test
    void testValidUsername() {
        User user = new User();
        user.setUsername("Imran");
        assertEquals("Imran", user.getUsername());
    }

    @Test
    void testUsernameIsNull() {
        User user = new User();

        assertThrows(IllegalArgumentException.class, () -> {
            user.setUsername(null);
        });
    }

    @Test
    void testUsernameIsEmpty() {
        User user = new User();

        assertThrows(IllegalArgumentException.class, () -> {
            user.setUsername("");
        });
    }
}
