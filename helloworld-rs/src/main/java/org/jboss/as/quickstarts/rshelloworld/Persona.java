package org.jboss.as.quickstarts.rshelloworld;

public class Persona {

	   private java.lang.Integer edad;
	   private java.lang.String nombre;
	   private java.lang.Integer salario;
	   private java.lang.String sexo;
	   private java.lang.String estadoCivil;
	   private java.lang.Integer montoCredito;
	   private java.lang.String cedula;
	   private boolean aptoCredito;

	   private java.lang.String segmento;

	   private java.lang.Boolean esCliente;

	   private java.lang.Boolean aprobadoAnalista;

	   private java.lang.String correoElectronico;

	   private java.lang.String direccion;

	   private java.lang.Integer telefono;

	   private java.lang.Integer cuotas;

	public java.lang.Integer getEdad() {
		return edad;
	}

	public void setEdad(java.lang.Integer edad) {
		this.edad = edad;
	}

	public java.lang.String getNombre() {
		return nombre;
	}

	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}

	public java.lang.Integer getSalario() {
		return salario;
	}

	public void setSalario(java.lang.Integer salario) {
		this.salario = salario;
	}

	public java.lang.String getSexo() {
		return sexo;
	}

	public void setSexo(java.lang.String sexo) {
		this.sexo = sexo;
	}

	public java.lang.String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(java.lang.String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public java.lang.Integer getMontoCredito() {
		return montoCredito;
	}

	public void setMontoCredito(java.lang.Integer montoCredito) {
		this.montoCredito = montoCredito;
	}

	public java.lang.String getCedula() {
		return cedula;
	}

	public void setCedula(java.lang.String cedula) {
		this.cedula = cedula;
	}

	public boolean isAptoCredito() {
		return aptoCredito;
	}

	public void setAptoCredito(boolean aptoCredito) {
		this.aptoCredito = aptoCredito;
	}

	public java.lang.String getSegmento() {
		return segmento;
	}

	public void setSegmento(java.lang.String segmento) {
		this.segmento = segmento;
	}

	public java.lang.Boolean getEsCliente() {
		return esCliente;
	}

	public void setEsCliente(java.lang.Boolean esCliente) {
		this.esCliente = esCliente;
	}

	public java.lang.Boolean getAprobadoAnalista() {
		return aprobadoAnalista;
	}

	public void setAprobadoAnalista(java.lang.Boolean aprobadoAnalista) {
		this.aprobadoAnalista = aprobadoAnalista;
	}

	public java.lang.String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(java.lang.String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public java.lang.String getDireccion() {
		return direccion;
	}

	public void setDireccion(java.lang.String direccion) {
		this.direccion = direccion;
	}

	public java.lang.Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(java.lang.Integer telefono) {
		this.telefono = telefono;
	}

	public java.lang.Integer getCuotas() {
		return cuotas;
	}

	public void setCuotas(java.lang.Integer cuotas) {
		this.cuotas = cuotas;
	}

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + ", salario=" + salario + ", sexo=" + sexo
				+ ", estadoCivil=" + estadoCivil + ", montoCredito=" + montoCredito + ", cedula=" + cedula
				+ ", aptoCredito=" + aptoCredito + ", segmento=" + segmento + ", esCliente=" + esCliente
				+ ", aprobadoAnalista=" + aprobadoAnalista + ", correoElectronico=" + correoElectronico + ", direccion="
				+ direccion + ", telefono=" + telefono + ", cuotas=" + cuotas + "]";
	}
	   
	   
}
