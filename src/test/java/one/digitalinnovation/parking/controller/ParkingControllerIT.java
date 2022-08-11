package one.digitalinnovation.parking.controller;

import io.restassured.RestAssured;
import one.digitalinnovation.parking.controller.dto.ParkingCreateDTO;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ParkingControllerIT extends AbstractContainerBase {

    @LocalServerPort
    private int randonPort;

    @BeforeEach
    public void setUpTest(){
        System.out.println(randonPort);
        RestAssured.port = randonPort;
    }

    @Test
    void whenfindAllThenCheckResult() {
        RestAssured.given()
                .auth()
                .basic("user", "Dio@123456")
                .when()
                .get("/parking")
                .then()
                .statusCode(HttpStatus.OK.value());

    }

    @Test
    void whenCreateThenCheckIsCreated() {

        var createDTO = new ParkingCreateDTO();
        createDTO.setColor("AMARELO");
        createDTO.setLicense("IJK-6262");
        createDTO.setModel("AUDI");
        createDTO.setState("RS");

        RestAssured.given()
                .auth()
                .basic("user", "Dio@123456")
                .when()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(createDTO)
                .post("/parking")
                .then()
                .statusCode(HttpStatus.CREATED.value())
                .body("license", Matchers.equalTo("IJK-6262"));

    }
}