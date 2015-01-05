<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>
<f:view>
    <html xmlns:h="http://xmlns.jcp.org/jsf/html" xmlns:f="http://xmlns.jcp.org/jsf/core">
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
            <h1><h:outputText value="JavaServer Faces"/></h1>
            <h:form>
                <h:dataTable value="#{StudentData.students}" var="student" style="border-collapse:collapse;border:1px solid black;background-color:#789;">
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Students" style="border:2px solid black;"/>
                        </f:facet>
                        <h:outputText value="#{student.name}"></h:outputText>
                    </h:column>
                </h:dataTable>
                <h:commandButton value="Move" action="#{StudentData.move()}"></h:commandButton>
            </h:form>

        </body>
    </html>
</f:view>
