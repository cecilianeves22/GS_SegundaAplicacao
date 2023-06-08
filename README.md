
# GS_SegundaAplicacao - QuickSaving

Esse projeto tem como iniciativa de diminuir o número de alimentos que são descartados por terem passado da data de validade, utilizando um sistema de gestão inteligente. 

### Vídeo da Aplicação: 
https://youtu.be/7r6FNspOd4Q

### Procedimento para instalação da e execução da API
- Dar um clone na url 
- Clicar com o botão direito na libe e dar um Run as no Java Application
- Subir aplicação da classe Application.java 


### Aplicação com Realização do Mapeamento Objeto Relacional JPA e Hibernate:
 https://github.com/GuiColettoO/Global_Solution_Main.git

### Endpoints com o Body (Realização do Mapeamento Objeto Relacional JPA e Hibernate) 
http://localhost:8080/compradores { "razaoSocial": "Ajuda", "nomeEmpresa": "Pesso", "cnpj":"111131111-00011", "telefone": "1511111111", "email": "juda@pesoas.com", "status": true }

http://localhost:8080/vendedores { "razaoSocial": "Ajuda", "nomeEmpresa": "Pesso", "cnpj":"111131111-00011", "telefone": "1511111111", "email": "juda@pesoas.com", "status": true }

http://localhost:8080/estoque { "Criação": "202337", "status": true, }

http://localhost:8080/notificacoes { "notificacao": "2023418", "visualizacoes": 4, }

http://localhost:8080/produtos { "nomeProduto": "Melancia", "nomeMarca": "Hortinha", "tipo":"fruta", "lote": "1", "dataValidade": 202578, "precoUnidade": 2.3, "quantidade": 9 }

http://localhost:8080/produtos { "dataRerserva": "2023418", "nomeProduto": "Melancia", "preco": 8.98, "quantidade": 9 "valorTotal": 208.23 }

### Endpoints do projeto (Segunda aplicação conectada com o FRONT - nesse repositório)
- localhost:8089/getUsuario (GET) --> pegar os usuários cadastrados
- localhost: 8089/usuario (POST) --> enviar os dados do usuário, sendo eles (nomeEmpresa, cnpj, senha)
- localhost: 8089/cadastroProduto (POST) --> enviar os dados dos produtos, sendo (nomeProduto, nomeMarca, descTipo, descLote, dataValidade, precoUnidade)
- localhost: 8089/produto (GET) --> pegar os produtos cadastrados

