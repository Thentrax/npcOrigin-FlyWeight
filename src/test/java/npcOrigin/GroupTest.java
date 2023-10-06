package npcOrigin;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupTest {
    @Test
    void mustReturnGroup(){
        Group group = new Group();
        group.join("Argit", "Alien", "Can talk with other aliens");
        group.join("Kevin", "Technician", "Can fix things");
        group.join("Savitar", "Alien", "Can talk with other aliens");

        List<String> output = Arrays.asList(
                "Name: Argit Origin Name: Alien Origin Feature: Can talk with other aliens",
                "Name: Kevin Origin Name: Technician Origin Feature: Can fix things",
                "Name: Savitar Origin Name: Alien Origin Feature: Can talk with other aliens"
        );
        assertEquals(output, group.getMembers());
    }

    @Test
    void mustReturnGroupLength(){
        Group group = new Group();
        group.join("Argit", "Alien", "Can talk with other aliens");
        group.join("Kevin", "Technician", "Can fix things");
        group.join("Savitar", "Alien", "Can talk with other aliens");

        assertEquals(2, OriginFactory.getOriginsLength());
    }
}