💰 Projeto Conta Bancária - Java (Study Case)
Este repositório contém um projeto de simulação de sistema bancário desenvolvido em Java, focado em consolidar
fundamentos de POO e Estruturas de Dados.

## 🚀 Evolução Técnica (Refatoração v3.0)

Originalmente criado com arrays fixos (vetores), o projeto foi refatorado para utilizar as melhores práticas do Java
moderno:

- **Collections Framework:** Implementação de `ArrayList` para gerenciar contas de forma dinâmica, eliminando limitações
  de tamanho fixo.
- **Java Stream API:** Utilização de `stream()`, `filter()` e predicados para busca inteligente de contas, substituindo
  loops `for` manuais por um código mais limpo e funcional.
- **Gestão de Identidade:** Sistema de IDs (Número da Conta) baseado no estado da coleção, preparando a lógica para
  futura integração com Bancos de Dados.

## 🛠️ Funcionalidades

- [x] Cadastro de titular com depósito inicial opcional.
- [x] Validação de existência de conta (Null Safety).
- [x] Operações de depósito e saque com atualização de saldo em tempo real.
- [x] Extrato detalhado utilizando sobrescrita de método `toString()`.

## 💻 Tecnologias e Conceitos

- **Linguagem:** Java 21
- **Paradigma:** Orientação a Objetos (Encapsulamento, Construtores, Sobrecarga)
- **Estruturas de Dados:** `List`, `ArrayList`
- **Processamento:** Lambdas e Stream API
- **Formatação:** `printf` com localização (Locale.US) para padrões monetários.

Projeto inspirado nos desafios práticos do Prof. Nélio Alves e expandido com lógica autoral.
