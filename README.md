# Red Hat Jboss BPMS POC - REST SERVICE

## Resumen

Este repositorio contiene el servicio REST que es invocado en locahost por el flujo de la POC de Crédito simple en Jboss BPMS

https://github.com/RobsonWatt/POC-BPMS-CREDITO


## Compilación y despliegue

**IMPORTANTE:**
Este es un servicio dummy que recibe un objeto Persona desde el flujo de procesos, imprime el método toString() del Pojo y retorna una "url" falsa.

Una vez clonado este repositorio deberemos:

* Compilar código

`cd helloworld-rs`

`mvn clean config`

* Copiar war del servicio al directorio deployment de Jboss BPMS

`cp helloworld-rs/target/jboss-helloworld-rs.war $BPMS_HOME/standalone/deployment`

ENJOY IT!!
