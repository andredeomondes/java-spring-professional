# Framework
Tradução ao pé da letra: estrutura, armação, estrutura de trabalho
É um conjunto de ferramentas que oferece uma infraestrutura
para se desenvolver sistemas de forma produtiva

---

## Um framework gerencia:

- Injeção de dependências
- Transações (back end)
- Ciclo de vida, escopo e reaproveitamento de componentes
- Configurações
- Integrações
- Outros
---
## Dois passos para trabalhar com injeção de
Dependência em frameworks
  1) Registrar os componentes
  2) Indicar quais componentes dependem de quais
     Uma vez feito isso, o próprio framework se encarregará de:
     1. Instanciar componentes
     2. Resolver dependências
     3. Reaproveitar componentes
     4. Gerenciar escopo e ciclo de vida dos componentes

---

- @Autowired injeção automática
- @Service marcação de serviços