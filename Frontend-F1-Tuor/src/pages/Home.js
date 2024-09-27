import '../App.css';
import '../home.css';

function Home() {
    return (
        <>  

                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous"/>
            <div class="container">
                <div class="row">
                    <div class="col">
                    <h1>Seja Bem-vindo!</h1>
                    <img src="assets/Logo.svg" alt="" width="400px"/>

                    </div>

                    <div class="col">
                    <form class="singin">
                        <div class="form-group">
                        <label for="exampleInputEmail1">Endereço de email</label>
                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Seu email"/>
                        <small id="emailHelp" class="form-text text-muted">Entre com seu email cadastrado.</small>
                        </div>
                        <div class="form-group">
                        <label for="exampleInputPassword1">Senha</label>
                        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Senha"/>
                        </div>
                        <button type="submit" class="btn btn-primary">Entrar</button>
                        
                        <p>Não possui cadastro? <a data-toggle="modal" data-target="#exampleModal" href="#">Clique aqui</a></p> 

                        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Realizar Cadastro</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
                                <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                <form>
                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                    <label for="inputEmail4">Nome</label>
                                    <input type="email" class="form-control" id="inputEmail4" placeholder="Digite seu Nome"/>
                                    </div>
                                    <div class="form-group">
                                    <label for="inputAddress2">Telefone</label>
                                    <input type="text" class="form-control" id="inputAddress2" placeholder="(ddd) 99999-9999"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputAddress">Email</label>
                                    <input type="text" class="form-control" id="inputAddress" placeholder="exemplo@gmail.com"/>
                                </div>
                                <div class="form-inline ">
                                    <label id="senha-padding" for="inputPassword6">Senha</label>
                                    <div id="senha" class="form-group">
                                    <input type="password" id="inputPassword6" class="form-control mx-sm-3" aria-describedby="passwordHelpInline"/>
                                    <small id="passwordHelpInline" class="text-muted">
                                        Deve ter entre 8 e 20 caracteres.
                                    </small>
                                    </div>
                                </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-primary">Pronto</button>
                            </div>
                            </div>
                        </div>
                        </div>
                    </form>
                    </div>
                </div>
                </div>

                <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
                <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>


        </>
    );
}

export default Home;