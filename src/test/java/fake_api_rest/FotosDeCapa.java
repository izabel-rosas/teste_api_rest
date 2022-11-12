package fake_api_rest;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class FotosDeCapa {
    @Test
    public void BuscarTodasAsFotos(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
                .when()
                .get("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos")
                .then()
                .log().all()
                .statusCode(200);
    }
    @Test
    public void BuscarUmaFotoExistente(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
                .when()
                .get("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos/books/covers/10")
                .then()
                .log().all()
                .statusCode(200);
    }
    @Test
    public void BuscarFoto(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
        .when()
                .get("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos/1")
        .then()
                .log().all()
                .statusCode(200);
    }
    @Test
    public void AdicionarUmaFoto(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 1,\n" +
                        "  \"idBook\": 1,\n" +
                        "  \"url\": \"string\"\n" +
                        "}")
        .when()
                .post("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos")
        .then()
                .log().all()
                .statusCode(200);
    }
    @Test
    public void AtualizarUmaFoto(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 40,\n" +
                        "  \"idBook\": 40,\n" +
                        "  \"url\": \"string\"\n" +
                        "}")
        .when()
                .put("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos/40")
        .then()
                .log().all()
                .statusCode(200);
    }
    @Test
    public void ExcluirUmaFoto(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
        .when()
                .delete("https://fakerestapi.azurewebsites.net/api/v1/CoverPhotos/1")
        .then()
                .log().all()
                .statusCode(200);
    }

}
