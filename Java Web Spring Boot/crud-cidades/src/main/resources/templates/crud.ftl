<!DOCTYPE html>
<html>
    <head>
        <title>CRUD Cidades</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <!-- Adicionado CSS Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container-fluid">
            <div class="jumbotron mt-5">
                <h1>GERENCIAMENTO DE CIDADES</h1>
                <p>PROJETO EXEMPLO DE CRUD COM SPRING BOOT</p>
            </div>

            <#if cidadeAtual??>
                <form action="/alterar" method="POST">
                    <input type="hidden" name="nomeAtual" value="${(cidadeAtual.nome)!}"/>
                    <input type="hidden" name="estadoAtual" value="${(cidadeAtual.estado)!}"/>
            <#else>            
                <form action="/criar" method="POST">
            </#if>
                    <div class="form-group">
                        <label for="nome">Cidade:</label>
                        <input name="nome" type="text" class="form-control" id="nome" 
                            placeholder="Informe o nome da Cidade" value="${(cidadeAtual.nome)!}">
                    </div>
                    <div class="form-group">
                        <label for="estado">Estado:</label>
                        <input name="estado" type="text" class="form-control" id="estado"
                            placeholder="Informe o Estado ao qual pertence a Cidade"
                            value="${(cidadeAtual.estado)!}">
                    </div>

                    <#if cidadeAtual??>
                        <button type="submit" class="btn btn-warning">ALTERAR</button>
                    <#else> 
                        <button type="submit" class="btn btn-primary">CRIAR</button> 
                    </#if>                    
                </form>
            <table class="table table-striped table-hover mt-5">
                <thead class="thead-dark">
                    <tr>
                        <th>Nome</th>
                        <th>Estado</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody>
                    <#list listaCidades as cidade>
                        <tr>
                            <td>${cidade.nome}</td>
                            <td>${cidade.estado}</td>
                            <td>
                                <div class="d-flex d-justify-content-center">
                                    <a href="/preparaAlterar?nome=${cidade.nome}&estado=${cidade.estado}" 
                                    class="btn btn-warning mr-3">ALTERAR</a>
                                    <a href="/excluir?nome=${cidade.nome}&estado=${cidade.estado}" 
                                    class="btn btn-danger">EXCLUIR</a>
                                </div>
                            </td>
                        </tr>
                    </#list>                    
                </tbody>
            </table>
        </div>
    </body>
</html>
