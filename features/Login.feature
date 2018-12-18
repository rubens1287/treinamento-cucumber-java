#language: pt
Funcionalidade: Login
  Eu como usuario quero poder logar na aplicacao

  Cenario: : CT001 - Executar login com usuario e senha invalida
    Dado eu estou na pagina de login
    Quando eu executar o login com usario "00000000999999" e senha "88484848484"
    Entao sera apresnetado um mensagem de erro "Você não digitou os dados corretamente ou a sua conta está temporariamente"



