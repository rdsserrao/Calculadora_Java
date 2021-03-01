# Calculadora_Java

## Requisitos:
  - Docker
  - jdk 11

## Como correr a APP:
  ### 1- Fazer o clone do repositório
  
  ### 2- Criar o ficheiro .jar
    - Criar a classe java: javac ./Calculadora.java
    - Criar o .jar: jar cfe "nomejar".jar Calculadora ./Calculadora.class

  ### 3- Fazer o build da imagem usando o Dockerfile
    - docker build -t "nomedaimagem" .
  
  
  - Correr o cmd java -jar "nomejar".jar 
