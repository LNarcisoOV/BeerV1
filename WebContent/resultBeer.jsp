<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="index.jsp"/>
	<br/><br/>
	<c:if test="${not empty resultadoCervejas}">
			
			<label>Resultado:</label>
			<c:forEach var="cerv" items="${resultadoCervejas }">
			<br/><label>${cerv}</label>
			</c:forEach>
	</c:if>
	<c:if test="${empty resultadoCervejas}">
			<label>Nenhum resultado encontrado.</label>
	</c:if>