# Banco
A aplicação tem o objetivo de simular as principais operações bancárias feitas em um banco de forma simples.

Classe Abstrata Pessoa: Representa os atributos e métodos de uma pessoa enquanto a classe Usuário é quem herda todos os comportamentos de Pessoa para construir um usuário para o sistema. Contém métodos de ações básicas realizadas por um usuário como se cadastrar e logar.
Classe Interface: Como o próprio nome já sugere, é uma interface que contém os métodos abstratos de transações bancárias que serão implementadas na classe Transacoes.
Classe Transações: Será a classe responsável pela implementação dos métodos definidos na Interface.
Classe Conta: Por fim, a classe conta tem o objetivo de realizar a agregação entre as classes Transações e Usuário.

