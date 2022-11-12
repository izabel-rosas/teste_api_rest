# fake_api-rest_test
## Automacao-java-Rest assured:: 
### Automação de testes funcionais

Documentação:

Este projeto de automação de testes foi desenvolvido na linguagem de programação Java, structure for api testing using Java and Rest-Assured, para rodar esse projeto e necessario seguir as instruções deste documento, os requisitos minimo será abordado adiante.

Dependências utilizadas;
* Rest-Assured
* Junit4

### Pré-Requisito:

* Ter o java jdk 8 instalado e configurado na máquina
    * Para verificar se está instalado execute o seguinte comando no cmd:
    * javac -version

### Prepraração do ambiente:

* Faça a importação das dependências utilizando o gerenciador de dependências maven

### Execução do projeto:

IDE intellij:
* Para executar os testes você deverá rodar as classes dentro da pasta 
steps
 ou execute o comando 
mvn test
 na raiz do projeto.
***

IDE Visual Code:
* Execute o comando na raiz do projeto: 
mvn test
***

#### Organização do projeto:

Arquitetura do projeto.

* src
  fake_api-res_test/
    * Atividades (Class com os teste de endPoint Activities)
    * Autor (Class com os  testes de endPoint Authors)
    * FotosDeCapa (Class com os teste de endpoit CoverPhotos)
    * livros (Class com os teste de endPoint books)
    * usuarios (Class com os teste de endPoint user)


###### Autor:
Izabel Rosas
