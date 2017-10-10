<!DOCTYPE HTML>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
	<head>
		<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta http-equiv="Pragma" content="no-cache"> 
	    <meta http-equiv="Cache-Control" content="no-cache"> 
	    <meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
	    
	    <!-- Tag responsavel por melhorar a renderizacao do bootstrap nos dispositivos moveis -->
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    
	    <title>Gestão do Futebol | Jogadores</title>
	    
	    <link href="/static/css/bootstrap.min.css" rel="stylesheet">
	    <link href="/static/css/style.css" rel="stylesheet">
	    
	    <!--[if lt IE 9]>
			<script src="/static/js/html5shiv.min.js"></script>
			<script src="/static/js/respond.min.js"></script>
		<![endif]-->
	</head>
	<body>

		<div role="navigation">
			<div class="navbar navbar-inverse">
				<a href="/" class="navbar-brand">Gestão do futebol da Homero</a>
				<div class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li><a href="novo">Novo Jogador</a></li>
						<li><a href="listar">Todos os Jogadores</a></li>
					</ul>
				</div>
			</div>
		</div>
		<c:choose>
			<c:when test="${mode == 'Listar'}">
			
				<c:choose>
					<c:when test="${mensagem != null}">
			    		<div class="alert alert-success" role="alert"><c:out value="${mensagem}"/></div>
			    	</c:when>	
				</c:choose>
				<div class="container text-center" id="jogadoresDiv">
					<h3>Lista de Jogadores</h3>
					<hr>
					<div class="table-responsive">
						<table class="table table-striped table-bordered">
							<thead>
								<tr>
									<th>Id</th>
									<th>Nome</th>
									<th>Tipo</th>
									<th></th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="jogador" items="${jogadores}">
									<tr>
										<td>${jogador.id}</td>
										<td>${jogador.nome}</td>
										<td>${jogador.tipo}</td>
										<td><a href="atualizar?id=${jogador.id}"><span class="glyphicon glyphicon-pencil"></span></a></td>
										<td><a href="deletar?id=${jogador.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</c:when>
			<c:when test="${ mode == 'Novo' || mode == 'Atualizar' }">
				<div class="container text-center">
					<h3><c:out value="${mode}"/> Jogador</h3>
					<hr>
					<form class="form-horizontal" method="POST" action="salvar">
						<input type="hidden" name="id" value="${jogador.id}"/>
						<div class="form-group">
							<label class="control-label col-md-3">Nome</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="nome" value="${jogador.nome}"/>
							</div>				
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">Tipo</label>
							<div class="col-md-7">
								<input type="radio" name="tipo" value="Avulso"/> Avulso <br>
								<input type="radio" name="tipo" value="Mensalista"/> Mensalista
							</div>				
						</div>		
						<div class="form-group">
							<input type="submit" class="btn btn-primary" value="Salvar"/>
						</div>
					</form>
				</div>
			</c:when>
		</c:choose>
		
		<script src="/static/js/jquery-3.2.1.min.js"></script>  
    	<script src="/static/js/bootstrap.min.js"></script>
	</body>
</html>