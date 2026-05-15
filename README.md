# IAP - Simulador de TV em Java

Projeto desenvolvido em Java como estudo prático de Introdução à Programação e Programação Orientada a Objetos.

O objetivo do projeto é simular o funcionamento básico de uma televisão, utilizando classes, métodos, atributos e interação pelo terminal. O projeto também possui documentação gerada com Javadoc.

---

## Tecnologias utilizadas

- Java
- Programação Orientada a Objetos
- Terminal/Console
- Javadoc

---

## Funcionalidades

- Criação de uma classe para representar uma TV
- Simulação de funcionalidades básicas de uma televisão
- Controle de estado da TV
- Execução do programa através da classe principal
- Organização do código em classes
- Documentação gerada com Javadoc
- Arquivos `.java` com o código-fonte
- Arquivos `.txt` com versão textual do código

---

## Estrutura principal do projeto

```txt
IAP/
├── Main.java
├── Main.txt
├── TV.java
├── TV.txt
│
├── teste/
│   ├── module-summary.html
│   └── TPC/
│       ├── Main.html
│       ├── TV.html
│       ├── package-summary.html
│       ├── package-tree.html
│       └── package-use.html
│
├── index.html
├── allclasses-index.html
├── allpackages-index.html
├── overview-tree.html
├── element-list
├── stylesheet.css
├── script.js
├── search.html
└── resources/
```

---

## Objetivo do projeto

Este projeto foi criado com o objetivo de praticar conceitos básicos de Java e Programação Orientada a Objetos.

Durante o desenvolvimento, foram trabalhados conceitos como:

- Classes
- Objetos
- Atributos
- Métodos
- Encapsulamento
- Criação de instâncias
- Execução de métodos
- Separação entre classe principal e classe de modelo
- Documentação com Javadoc

---

## Como funciona

O projeto possui duas classes principais:

```txt
Main.java
TV.java
```

A classe `TV` representa o objeto principal do projeto, ou seja, uma televisão.

A classe `Main` é responsável por executar o programa e testar o funcionamento da classe `TV`.

O fluxo básico do projeto é:

1. O programa é iniciado pela classe `Main`.
2. Um objeto da classe `TV` é criado.
3. Métodos da classe `TV` são chamados.
4. O estado da TV é alterado ou exibido no terminal.
5. O comportamento da televisão é testado durante a execução.

---

## Arquivos principais

### Main.java

Arquivo principal do projeto.

Responsável por iniciar a execução do programa e testar os métodos criados na classe `TV`.

---

### TV.java

Classe responsável por representar uma televisão.

Ela contém a lógica principal do projeto, incluindo atributos e métodos relacionados ao funcionamento da TV.

---

### Main.txt

Arquivo de texto contendo uma versão do código da classe `Main`.

---

### TV.txt

Arquivo de texto contendo uma versão do código da classe `TV`.

---

## Pré-requisitos

Antes de rodar o projeto, instale:

- Java JDK

Verifique se o Java está instalado:

```bash
java --version
```

Verifique se o compilador Java está instalado:

```bash
javac --version
```

---

## Como rodar pelo terminal

Entre na pasta do projeto:

```bash
cd IAP
```

Compile os arquivos Java:

```bash
javac Main.java TV.java
```

Execute o programa:

```bash
java Main
```

Caso as classes estejam usando package, execute conforme o nome do package definido no código.

Exemplo:

```bash
javac -d . Main.java TV.java
java TPC.Main
```

---

## Como abrir a documentação

Para visualizar a documentação gerada pelo Javadoc, abra no navegador:

```txt
index.html
```

ou:

```txt
teste/TPC/TV.html
```

A documentação mostra informações sobre as classes do projeto, seus métodos e sua estrutura.

---

## Conceitos praticados

Este projeto trabalha conceitos importantes de Java, como:

- Criação de classes
- Instanciação de objetos
- Métodos
- Atributos
- Organização de código
- Uso de uma classe principal
- Testes simples via terminal
- Documentação com Javadoc
- Estrutura básica de um projeto Java

---

## Comandos úteis

Compilar o projeto:

```bash
javac Main.java TV.java
```

Executar o projeto:

```bash
java Main
```

Compilar usando package:

```bash
javac -d . Main.java TV.java
```

Executar usando package:

```bash
java TPC.Main
```

Gerar documentação Javadoc:

```bash
javadoc -d docs Main.java TV.java
```

---

## Status

Projeto desenvolvido como trabalho de faculdade em Java.

Já foram implementados:

- Classe principal
- Classe TV
- Testes básicos de execução
- Organização em arquivos Java
- Documentação Javadoc
- Arquivos auxiliares em formato `.txt`
