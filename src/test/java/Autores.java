import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Autores {
    @Test
    public void BuscarTodosOsAutores(){

        given()
                .log().all()
                .contentType(ContentType.JSON)
         .when()
                .get("https://fakerestapi.azurewebsites.net/api/v1/Authors")
         .then()
                .log().all()
                .statusCode(200);
    }
    @Test
    public void BuscarAutoresExistente(){

        given()
                .log().all()
                .contentType(ContentType.JSON)
        .when()
                .get("https://fakerestapi.azurewebsites.net/api/v1/Authors/authors/books/30")
        .then()
                .log().all()
                .statusCode(200);
    }
    @Test
    public void BuscarUmAutorExistente(){

        given()
                .log().all()
                .contentType(ContentType.JSON)
        .when()
                .get("https://fakerestapi.azurewebsites.net/api/v1/Authors/1")
        .then()
                .log().all()
                .statusCode(200);
    }
    @Test
    public void AdicionarAutoresExistentes(){

        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 15,\n" +
                        "  \"idBook\": 15,\n" +
                        "  \"firstName\": \"Izabel\",\n" +
                        "  \"lastName\": \"Cristina\"\n" +
                        "}")
        .when()
                .post("https://fakerestapi.azurewebsites.net/api/v1/Authors")
        .then()
                .log().all()
                .statusCode(200);
    }
    @Test
    public void AtualizarAutoresExistentes(){

        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 15,\n" +
                        "  \"idBook\": 15,\n" +
                        "  \"firstName\": \"Izabel\",\n" +
                        "  \"lastName\": \"Cristina\"\n" +
                        "}")
        .when()
                .put("https://fakerestapi.azurewebsites.net/api/v1/Authors/15")
        .then()
                .log().all()
                .statusCode(200);
    }
    @Test
    public void ExcluirAutorExistente(){

        given()
                .log().all()
                .contentType(ContentType.JSON)
        .when()
                .delete("https://fakerestapi.azurewebsites.net/api/v1/Authors/2")
        .then()
                .log().all()
                .statusCode(200);
    }


    public static class Livros {
    }
}
