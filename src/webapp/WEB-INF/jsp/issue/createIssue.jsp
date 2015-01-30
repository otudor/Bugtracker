<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h1><fmt:message key="issue.form.title"/></h1>

<c:if test="${not empty statusMessageKey}">
    <p><fmt:message key="${statusMessageKey}"/></p>
</c:if>

<form:form action="${url}" commandName="issue">
    <form:hidden path="id" />

    <fieldset>
        <div class="form-row">
            <label for="title"><fmt:message key="issue.title"/>:</label>
            <span class="input"><form:input path="category" /></span>
        </div>       
        <div class="form-row">
            <label for="project"><fmt:message key="issue.project"/>:</label>
            <span class="input"><form:input path="project" /></span>
        </div>
        <div class="form-buttons">
            <div class="button"><input name="submit" type="submit" value="<fmt:message key="button.save"/>" /></div>
        </div>
    </fieldset>
</form:form>