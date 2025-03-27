# Desafio - Conta

Este desafio consiste em criar um programa que solicita informações do usuário sobre sua conta bancária e exibe uma mensagem personalizada com os detalhes fornecidos.

## Descrição

O objetivo é criar um sistema simples que:

1. Solicite ao usuário o número da agência, o nome da agência, o nome do cliente e o saldo da conta.
2. Imprima uma mensagem de boas-vindas com essas informações.

A classe `ContaTerminal` possui um método que imprime os dados coletados e é executado no método `main`.

## Funcionalidades

- **Solicitação de dados**: O programa solicita ao usuário as informações da conta (número da agência, nome da agência, nome do cliente e saldo da conta).
- **Impressão personalizada**: Após coletar os dados, o programa imprime uma mensagem de boas-vindas, incluindo as informações fornecidas.

## Estrutura do Código

A classe `ContaTerminal` possui os seguintes atributos e métodos:

### Atributos
- `numero` (int): Número da conta.
- `agencia` (String): Nome da agência bancária.
- `nomeCliente` (String): Nome do cliente.
- `saldo` (double): Saldo da conta do cliente.

### Método
- `imprimir()`: Este método exibe uma mensagem personalizada com os dados fornecidos pelo cliente, como número da conta, agência, nome do cliente e saldo.

### Fluxo do Programa
1. O programa solicita os dados necessários do cliente via `Scanner`.
2. Os dados são armazenados nos atributos da classe `ContaTerminal`.
3. O método `imprimir()` é chamado para exibir a mensagem com as informações da conta.

## Exemplo de Saída

```txt
Por favor, digite o número da Agência: 
1021
Por favor, digite a agência: 
064-8
Por favor, digite o nome do cliente: 
MARIO ANDRADE
Por favor, digite o saldo: 
237.48
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
