public <?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
         version="3.1">

  <servlet>
    <servlet-name>RegistrationServlet</servlet-name>
    <servlet-class>RegistrationServlet</servlet-class>
  </servlet>

  <servlet-mapping>
    <servlet-name>RegistrationServlet</servlet-name>
    <url-pattern>/RegistrationServlet</url-pattern>
  </servlet-mapping>

</web-app> configure {
    
}
