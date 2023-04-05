# Folder Model
A pasta model é geralmente usada para armazenar as classes que representam os objetos de domínio do seu aplicativo, como entidades, DTOs (objetos de transferência de dados), enums e outras classes de modelo. Essas classes são usadas para definir a estrutura dos dados do aplicativo e fornecer uma interface para acessá-los.

Exemplo de classe de entidade na pasta model:

    @Entity
    @Table(name = "customers")
    public class Customer {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    
        @Column(name = "name")
        private String name;
    
        @Column(name = "email")
        private String email;
    
        // getters e setters
    }



