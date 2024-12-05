# Sistema para a Olimpíada Brasileira de Informática (OBI)  

Bem-vindo ao repositório do **Sistema para a Olimpíada Brasileira de Informática (OBI)**! Este é um software desktop desenvolvido como parte de um projeto acadêmico, com funcionalidades de gerenciamento de alunos participantes.  

---

## 📋 Funcionalidades  
- **Cadastro de Alunos:** Insira informações de alunos participantes da OBI.  
- **Edição de Alunos:** Atualize dados previamente cadastrados.  
- **Exclusão de Alunos:** Remova registros de alunos do sistema.  
- **Listagem de Dados:** Visualize todas as informações cadastradas.  

---

## 🚀 Como executar o projeto  

1. **Baixe o repositório:**  
   Clone ou baixe o código deste repositório para sua máquina local.  

2. **Compile e execute:**  
   Você pode compilar e rodar o projeto diretamente para explorar as telas e o funcionamento básico do sistema.  

3. **Observação:**  
   Por padrão, o programa está configurado para se conectar a um banco de dados PostgreSQL. **Se o banco de dados não estiver configurado na sua máquina, isso gerará erros relacionados à conexão.** No entanto, esses erros **não impedem a execução e visualização das telas** do sistema.  

---

## 🗂️ Configuração do Banco de Dados  

Caso deseje conectar o sistema a um banco de dados funcional, siga estas etapas:  

1. **Instale o PostgreSQL** em sua máquina, se ainda não o tiver.  

2. **Configure as credenciais:**  
   Edite o arquivo de configuração do projeto com suas credenciais do banco de dados. Utilize as seguintes informações como referência:  
   ```plaintext
   host: localhost  
   port: 5432  
   database: obi_database  
   username: seu_usuario  
   password: sua_senha  

## 🗂️ Configuração do Banco de Dados  

1. **Crie o banco de dados:**  
   Utilize os scripts SQL fornecidos no projeto para criar as tabelas necessárias.  

2. **Teste a conexão:**  
   Certifique-se de que a conexão com o banco de dados está funcionando antes de executar operações como cadastro, edição ou exclusão.  

---

## 💡 Observações  

- Este projeto foi desenvolvido com fins acadêmicos e pode não incluir todos os tratamentos de erro ou padrões de segurança.  
- Fique à vontade para explorar o código, fazer melhorias e enviar sugestões.  

---

## 📬 Contato  

Se tiver dúvidas ou encontrar problemas, entre em contato:  
[GitHub: phedrohenrick](https://github.com/phedrohenrick)  

Divirta-se explorando o sistema! 😊
