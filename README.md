### Relatório Técnico - Projeto Desafio Btg Pactual

---

#### Plano de Trabalho

**Previsto vs Realizado:**
Este documento apresenta uma análise comparativa entre o plano inicial e o que efetivamente ocorreu durante o projeto.
Descreve quais metas foram cumpridas integralmente e onde foram identificados desvios.

- **Metas Cumpridas:**
    - [ ] Meta 1: [Descrição]
    - [ ] Meta 2: [Descrição]

- **Desvios Identificados:**
    - **Natureza dos Desvios:** [Explicação sucinta dos desvios encontrados]
    - **Causas dos Desvios:** [Fatores que contribuíram para os desvios]
    - **Medidas Corretivas:** [Ações tomadas para corrigir os desvios]

- **Alinhamento sem Desvios:**
    - Comentário sobre processos ou práticas que contribuíram para a execução sem desvios.

#### Tecnologias Utilizadas

- **Linguagens & Versões:**
    - Java 17
    - Spring Boot:
        - **Parent**: `spring-boot-starter-parent` com a versão `3.3.1`
        - **Dependências**:
            - `spring-boot-starter-data-mongodb`: Starter para utilizar o MongoDB com o Spring Data MongoDB.
            - `spring-boot-starter-web`: Starter para construir aplicações web usando Spring MVC.
            - `spring-boot-devtools`: Fornece melhorias durante o desenvolvimento, como reinícios automáticos e
              tratamento de erros aprimorado.
            - `spring-boot-configuration-processor`: Suporta a geração de metadados para arquivos de configuração.
            - `spring-boot-starter-test`: Starter para testar aplicações Spring Boot com JUnit, Mockito, entre outros.
            -

- **Sistemas Operacionais (SO's):**
    - Windows 11 e WSL Ubuntu 20.04 LTS

#### Diagramas

- **Arquitetura**
- **Modelagem da Base de Dados**

  ![Diagrama ER da Base de Dados](https://i.imgur.com/0X2bOlx.png)

    ```json
    {
      "clientId": "65387b14-c662-4bc6-9dac-209e48845828",
      "orderId": "b84b467d-74f7-40b0-82dd-7900a2d02657",
      "itens": [
        {
          "product": "processador amd ryzen 7 5700U",
          "quantity": 1,
          "price": "1085.99"
        },
        {
          "product": "ssd seagate barracuda",
          "quantity": 1,
          "price": "369.00"
        }
      ]
    }
    ``` 

- **Implantação da Solução**
- **Infraestrutura Cloud**

#### Evidência de Testes Funcionais

- Documentação das verificações realizadas para cada funcionalidade do sistema.

#### Códigos e Documentação no GitHub

- **Meu perfil GitHub:** [SeuPerfilGitHub]
- **URLs dos códigos gerados:**
    - [URL do Repositório 1]
    - [URL do Repositório 2]
- **Instruções para inicializar o projeto na sua máquina:**
    - VM options: 
      - -Dspring.profiles.active=local
      - Comando do docker-compose para criar uma base e inserir alguns dados
      - 

#### Referências

- Citação de todas as fontes de pesquisa, documentações e referências técnicas consultadas.
- https://hub.docker.com/_/mongo
- https://x-team.com/blog/set-up-rabbitmq-with-docker-compose

#### Outros Itens Relevantes

- Metodologias, frameworks, técnicas de teste ou outros elementos relevantes para o projeto.

#### Docker

- **Perfil DockerHub:** [SeuPerfilDockerHub]
- **URL das imagens Docker geradas:**
    - [URL da Imagem Docker 1]
    - [URL da Imagem Docker 2]

---

#### Orientação para Criação do Relatório

Para um relatório bem estruturado e profissional, utilize as seguintes ferramentas e recursos:

- **Ferramentas:**
    - Google Docs ou Microsoft Word para redação.
    - Lucidchart ou Draw.io para criação de diagramas.
    - Git e GitHub para versionamento e publicação de código.
    - DockerHub para registro de containers.

- **Exemplos de Modelos:**
    - IEEE report template para estrutura e formatação.
    - Repositórios open-source no GitHub para referências adicionais.

- **Revisão Final:**
    - Certifique-se de revisar e validar todas as informações antes da publicação final.
