<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>BeerV1 Welcome!</title>
</head>
<body>
	<h1>P&aacute;gina de sele&ccedil;&atilde;o de cerveja</h1>
	<form method="post" action="SelectBeer" enctype="multipart/form-data">
		Selecione a cerveja pela cor:<br/>
		Cores:
		<select id="idColors" name="nameCervejas" size="1">
			<option value="green">verde</option>
			<option value="red">vermelho</option>
			<option value="yellow">amarelo</option>
			<option value="white">branco</option>
		</select>
		<br /><br />
		<input type="file" name="uploadArquivo" />
		<br /><br />		
		<input type="submit" value="Enviar"/>
 		
	</form>
</body>
</html>