import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Atividade {

    @Test
    public void BuscarTodasAsAtividades() {

        given()
                .log().all()
                .contentType(ContentType.JSON)
        .when()
                .get("https://fakerestapi.azurewebsites.net/api/v1/Activities")
        .then()
                .log().all()
                .statusCode(200);

    }

    @Test
    public void BuscarUmaAtividade() {

        given()
                .log().all()
                .contentType(ContentType.JSON)
        .when()
                .get("https://fakerestapi.azurewebsites.net/api/v1/Activities/6")
        .then()
                .log().all()
                .statusCode(200);


    }

    @Test
    public void AdicionarNovaAtividade() {

        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 20,\n" +
                        "  \"title\": \"Qualidade de software\",\n" +
                        "  \"dueDate\": \"2022-11-11T13:01:16.248Z\",\n" +
                        "  \"completed\": true\n" +
                        "}")
        .when()
                .post("https://fakerestapi.azurewebsites.net/api/v1/Activities")
        .then()
                .log().all()
                .statusCode(200);

    }

    @Test
    public void ModificarAtividade() {

        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 15,\n" +
                        "  \"title\": \"Q.A\",\n" +
                        "  \"dueDate\": \"2022-11-11T13:06:52.441Z\",\n" +
                        "  \"completed\": true\n" +
                        "}")
        .when()
                .put("https://fakerestapi.azurewebsites.net/api/v1/Activities/15")
        .then()
                .log().all()
                .statusCode(200);


    }

    @Test
    public void ExcluirUmaAtividade() {

        given()
                .log().all()
                .contentType(ContentType.JSON)
        .when()
                .delete("https://fakerestapi.azurewebsites.net/api/v1/Activities/15")
        .then()
                .log().all()
                .statusCode(200);


    }
}