<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		
		<style>
			input {width:auto !important;}
		</style>
		
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
		<title>Taller 6</title>
		
		<script type="text/javascript">
		
			function validar()
			{
				if(ErrorAceptable.value != "" && P.value != "" && Dof.value != "")				
				{
					return true;
				}
				else
				{
					alert("Faltan campos por diliganciar");
					return false;
				}
			}
		
		</script>
		
	</head>
	<body>
		
		<div class="container">
			<h1 class="text-center">Taller 6</h1>
			<form action="calculo.jsp" method="POST" onsubmit="return validar()">
				<p>
					<input type="text" id="Dof" name="Dof" class="form-control" placeholder="Grados de Libertad">
				</p>
				<p>
					<input type="text" id="p" name="p" class="form-control"  placeholder="P">
				</p>
				<p>
					<input type="text" id="ErrorAceptable" name="ErrorAceptable" class="form-control" placeholder="Error Aceptable">
				</p>
				<p>
					<input type="submit" value="Calcular" class="btn btn-default">	
				</p>
			</form>
		</div>
		
	</body>
</html>