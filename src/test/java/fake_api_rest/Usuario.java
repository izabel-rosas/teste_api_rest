package fake_api_rest;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Usuario {
    @Test
    public void BuscarUsuario(){
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
    public void BuscaUmUsuarioExistente(){
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
    public void AdicionarUmUsuarioExistente(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 50,\n" +
                        "  \"userName\": \"joão Miguel\",\n" +
                        "  \"password\": \"012345\"\n" +
                        "}")
        .when()
                .post("https://fakerestapi.azurewebsites.net/api/v1/Users")
        .then()
                .log().all()
                .statusCode(200);
    }
    @Test
    public void AtualizarUmUsuarioExistente(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 60,\n" +
                        "  \"userName\": \"Analista\",\n" +
                        "  \"password\": \"123456\"\n" +
                        "}")
        .when()
                .put("https://fakerestapi.azurewebsites.net/api/v1/Users/60")
        .then()
                .log().all()
                .statusCode(200);
    }
    @Test
    public void ExcluirUsuarioExistente(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
        .when()
                .delete("https://fakerestapi.azurewebsites.net/api/v1/Users/5")
        .then()
                .log().all()
                .statusCode(200);
    }

}
