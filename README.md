# Calculadora_Java

## Requisitos:
  - git
  - jdk 11

## Como correr a APP:
  ### 1- Fazer o clone do repositório

    - git clone https://github.com/rdsserrao/Calculadora_Java.git
  
  ### 2- Criar o ficheiro .jar:
  O ficheiro Calculadora.java contém o código da APP, no entanto para facilitar o seu uso sem ser necessário programas adicionais, converte-se para um .jar de modo a ser possível usar esta APP num terminal qualquer. Primeiro cria-se uma Classe, e por último, a partir desta, o ficheiro .jar, onde a Classe vai ficar guardada.
  
    - Criar a classe java: javac Calculadora.java
    - Criar o .jar: jar cfe "nomejar".jar Calculadora Calculadora.class

    Obs: Atenção, se o nome for diferente de calc.jar é também preciso alterar no Dockerfile.

 ### 3- Num terminal qualquer correr o seguinte comando:

    - java -jar "nomejar".jar "a operação que quer efetuar"

    Obs: É preciso que a sintaxe a usar no comando respeite estas condições:
    Operação: Somar (som), Subtrair (sub), Multiplicar (mul) e Dividir (div).
    Números: Podem ser inteiros ou decimais.
    Por últmo, separar os 3 argumentos por espaços.

    Por exemplo: java -jar calc.jar som 2 3 
    Output: Soma: 2 + 3 = 5

  ### Criar uma imagem usando o Dockerfile:
  É um dockerfile muito simples que pega uma imagem que já trás o jdk, copia o ficheiro .jar para uma pasta e define um entrypoint para correr a aplicação. Este entrypoint está apenas a indicar que a APP ficaria logo a funcionar no arranque de um contentor, se ele existisse.
  
    - docker build -t "nomedaimagem" .

    Obs: Incluir o . no comando
    
  
  
 
