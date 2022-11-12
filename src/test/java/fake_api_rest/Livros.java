package fake_api_rest;

import io.restassured.http.ContentType;
import org.junit.Test;

import java.lang.annotation.Target;

import static io.restassured.RestAssured.given;

public class Livros {
    @Test
    public void BuscarTodosOsLivros(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
        .when()
                .get("https://fakerestapi.azurewebsites.net/api/v1/Books")
        .then()
                .log().all()
                .statusCode(200);

    }
    @Test
    public void BuscarUmLivroExistente(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
         .when()
                .get("https://fakerestapi.azurewebsites.net/api/v1/Books/3")
         .then()
                .log().all()
                .statusCode(200);
    }
    @Test
    public void AdicionarUmLivro(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 5,\n" +
                        "  \"title\": \"Q.A\",\n" +
                        "  \"description\": \"Analista\",\n" +
                        "  \"pageCount\": 150,\n" +
                        "  \"excerpt\": \"string\",\n" +
                        "  \"publishDate\": \"2022-11-12T03:21:10.529Z\"\n" +
                        "}")
        .when()
                .post("https://fakerestapi.azurewebsites.net/api/v1/Books")
        .then()
                .log().all()
                .statusCode(200);

    }
    @Test
    public void AtualizarUmLivroExistente(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "  \"id\": 20,\n" +
                        "  \"title\": \"Tecnologia\",\n" +
                        "  \"description\": \"Api.test\",\n" +
                        "  \"pageCount\": 40,\n" +
                        "  \"excerpt\": \"string\",\n" +
                        "  \"publishDate\": \"2022-11-12T03:28:11.958Z\"\n" +
                        "}")
        .when()
                .put("https://fakerestapi.azurewebsites.net/api/v1/Books/20")
        .then()
                .log().all()
                .statusCode(200);

    }
    @Test
    public void ExcluirUmLivroExistente(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
        .when()
                .delete("https://fakerestapi.azurewebsites.net/api/v1/Books/20")
        .then()
                .log().all()
                .statusCode(200);

    }


    }
