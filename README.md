<!-- Improved compatibility of back to top link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->
<a name="readme-top"></a>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]



<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/othneildrew/Best-README-Template">
    <img src="https://programadoresbrasil.com.br/wp-content/uploads/2021/05/spring-framework.png" alt="Logo" width="300" height="200">
  </a>

<h2 align="center">Serviço Carteira</h2>


</div>


<!-- ABOUT THE PROJECT -->
## Sobre o projeto

Este projeto consiste em desenvolver um micro serviço que trabalhará com outros micro serviços: Ativo Financeiro, Investidor e Carteira. Cada micro serviço tem suas próprias responsabilidades e tecnologias.
O micro serviço Carteira é o núcleo do aplicativo e será responsável por gerenciar todas as operações dentro do sistema, incluindo cadastro de ativos e proventos. Ele será desenvolvido utilizando Java como tecnologia de backend e Sqlite como banco de dados.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Construido com

Nesta seção apresente as tecnologias utilizadas para a construção do projeto.

Exemplo:
* ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
* ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
* ![SQLite](https://img.shields.io/badge/sqlite-%2307405e.svg?style=for-the-badge&logo=sqlite&logoColor=white)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Iniciando o Projeto

Insira instruções de como iniciar o seu projeto localmente.
Copie e cole trechos de códigos para realizar a execução do projeto.

### Pré-requisitos

* Java 17
* Docker



### Instalação

Siga os passos para a instalação do serviço:

1.Clone o repositório
  ```sh
   git clone https://github.com/DanubiaM/carteira
   ```
2. Acesse a pasta onde se encontra o dockerfile e crie uma image
  ```sh
  docker build -t nome_da_imagem .
   ```

3. Execute o container
```sh
docker run nome_da_imagem
```


<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
## Como Usar

Com o serviço em execução, explique como utilizar o projeto, exemplo:

| Microservice | Endpoint | Method | Description |
| --- | --- | --- | --- |
| Carteira | /wallet/:id | GET | Retorna informações sobre um ativo específico no portfólio do usuário |
| Carteira | /wallet | GET | Lista de ativos da carteira do usuário. |
| Carteira | /wallet | POST | Adiciona um novo ativo para o investidor |
| Carteira | /wallet/:id | PUT | Atualiza informações específicas da carteira do usuário |
| Carteira | /wallet/:id | DELETE | Remove um ativo específico da carteira do usuário |


<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- CONTRIBUTING -->
## Autores
Adicione os autores aqui
<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- LICENÇA -->
## License

Caso exista uma licença, adicione aqui.
<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contato
Adicione aqui o contato do projeto
Your Name - [@your_twitter](https://twitter.com/your_username) - email@example.com

Project Link: [https://github.com/your_username/repo_name](https://github.com/your_username/repo_name)

<p align="right">(<a href="#readme-top">back to top</a>)</p>




<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/stars/DanubiaM/carteira?style=social
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/DanubiaM/carteira?style=social
[forks-url]:https://img.shields.io/github/stars/DanubiaM/carteira?style=social
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew
[product-screenshot]: images/screenshot.png
[Next.js]: https://img.shields.io/badge/next.js-000000?style=for-the-badge&logo=nextdotjs&logoColor=white
[Next-url]: https://nextjs.org/
[React.js]: https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB
[React-url]: https://reactjs.org/
[Vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D
[Vue-url]: https://vuejs.org/
[Angular.io]: https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white
[Angular-url]: https://angular.io/
[Svelte.dev]: https://img.shields.io/badge/Svelte-4A4A55?style=for-the-badge&logo=svelte&logoColor=FF3E00
[Svelte-url]: https://svelte.dev/
[Laravel.com]: https://img.shields.io/badge/Laravel-FF2D20?style=for-the-badge&logo=laravel&logoColor=white
[Laravel-url]: https://laravel.com
[Bootstrap.com]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white
[Bootstrap-url]: https://getbootstrap.com
[JQuery.com]: https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white
[JQuery-url]: https://jquery.com 
