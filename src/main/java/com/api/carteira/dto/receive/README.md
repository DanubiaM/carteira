# Folder DTO Receive

DTO (Data Transfer Object) é um padrão de projeto que tem como objetivo transferir dados entre as camadas de uma 
aplicação. O pacote dto/receive é responsável por receber os dados da camada de apresentação e converter em um objeto 
para ser utilizado nas camadas seguintes.

Exemplo de classe DTO Receive:


    public class ProdutoReceiveDTO {
    
    private String nome;
    private String descricao;
    private BigDecimal preco;
    
        // getters e setters
    }