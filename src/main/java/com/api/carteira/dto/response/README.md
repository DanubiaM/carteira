# Folder DTO Response
DTO (Data Transfer Object) é um padrão de design utilizado para transferir dados entre subsistemas de um software. O DTO Response é um tipo de DTO que é utilizado para enviar respostas de requisições HTTP.
Exemplo de DTO Response para uma API de usuários:
    public class UserResponseDTO {
    
        private Long id;
        private String name;
        private String email;
        
        // Construtor
        public UserResponseDTO(Long id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }
        
        // Getters e Setters
        public Long getId() {
            return id;
        }
        
        public void setId(Long id) {
            this.id = id;
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public String getEmail() {
            return email;
        }
        
        public void setEmail(String email) {
            this.email = email;
        }
    }
