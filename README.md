# Desafios Alura

Este repositório reúne soluções para diversos desafios propostos nos cursos da plataforma Alura, com foco no desenvolvimento backend utilizando Java.

## 📚 Descrição

O objetivo deste projeto é consolidar o aprendizado adquirido durante a formação em Java da Alura, abordando conceitos como:

* Programação orientada a objetos
* Manipulação de listas e coleções
* Tratamento de exceções
* Criação de classes e métodos
* Boas práticas de codificação

Cada desafio é implementado em uma classe separada, facilitando a compreensão e reutilização do código.

## 🛠️ Tecnologias Utilizadas

* Java 17
* Maven

## 📁 Estrutura do Projeto

O projeto está organizado da seguinte forma:

```


desafios_alura/
├── .idea/
├── src/
│   └── main/
│       └── java/
│           └── [pacote_principal]/
│               ├── Desafio1.java
│               ├── Desafio2.java
│               └── ...
├── .gitignore
└── pom.xml
```



* Cada arquivo `DesafioX.java` representa a solução de um desafio específico.

## 🚀 Como Executar

1. Certifique-se de ter o Java 17 e o Maven instalados em sua máquina.
2. Clone este repositório:

   ```bash
   git clone https://github.com/abdieldeathayde/desafios_alura.git
   ```



3. Navegue até o diretório do projeto:

   ```bash
   cd desafios_alura
   ```



4. Compile o projeto utilizando o Maven:

   ```bash
   mvn clean install
   ```



5. Execute a classe desejada:

   ```bash
   mvn exec:java -Dexec.mainClass="[pacote_principal].DesafioX"
   ```


## 📄 Licença

Este projeto é de uso educacional e foi desenvolvido como parte dos cursos da Alura.

