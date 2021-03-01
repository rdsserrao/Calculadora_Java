# Calculadora_Java

## Requisitos:
  - Docker
  - jdk 11

## Como correr a APP:
  ### 1- Fazer o clone do repositório
  
  ### 2- Criar o ficheiro .jar:
  O ficheiro Calculadora.java contém o código da APP, no entanto para facilitar o seu uso sem ser necessário programas adicionais, converte-se para um .jar de modo a ser possível   usar esta APP num terminal qualquer. Primeiro cria-se uma Classe, e por último, a partir desta, o ficheiro .jar.
    - Criar a classe java: javac ./Calculadora.java
    - Criar o .jar: jar cfe "nomejar".jar Calculadora ./Calculadora.class

 ### 3- Num terminal qualquer correr o seguinte comando:
    - java -jar "nomejar".jar "a operação que quer efetuar"
    Por exemplo: java -jar calc.jar som 2 3 
    Output: Soma: 2 + 3 = 5

  ### Criar uma imagem usando o Dockerfile:
  É um dockerfile muito simples que pega uma imagem que já trás o jdk, copia o ficheiro "nomejar".jar para uma pasta e define um entrypoint para correr a aplicação.
    - docker build -t "nomedaimagem" .
    Obs: Incluir o . no comando
    
  
  
 
