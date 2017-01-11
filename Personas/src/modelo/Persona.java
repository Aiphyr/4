
package modelo;

/**
 * Clase que representa a una persona.
 * @author Ana Leiba - cada uno que escriba su nombre.
 * @version 1.0
 *
 */
public class Persona {
	/**
	 * Nombre completo de la persona.
	 */
	String nombre;
	/**
	 * Edad de la persona.
	 */
	int edad;
	/**
	 * Sexo de la persona. <b>M</b> si es hombre o <b>F</b> si es mujer.
	 */
	char sexo;
	/**
	 * Origen de la persona. Valores posibles:< b>N</b> norte, <b>S</b> sur, <b>E</b> este, <b>O</b> oeste.
	 */
	char origen;
	/**
	 * Peso de la persona en kilogramos.
	 */
	float peso;
	/**
	 * Altura de la persona en cent�metros.
	 */
	int altura;
	
	/**
	 * Pareja de la persona. Si no tiene pareja su valor ser� <i>null</i>.
	 */
	Persona pareja;
	
	/**
	 * Constructor sin argumentos.
	 */
	public Persona() {
		
	}

	/**
	 * Constructor con argumentos.
	 * @param nombre Nombre de la persona.
	 * @param edad Edad de la persona.
	 * @param sexo Sexo de la persona. <b>M</b> si es hombre o <b>F</b> si es mujer.
	 * @param origen Origen de la persona. Valores posibles: <b>N</b> norte, <b>S</b> sur, <b>E</b> este, <b>O</b> oeste.
	 * @param peso Peso en kilogramos de la persona.
	 * @param altura Altura en cent�metros de la persona.
	 * @param pareja Pareja de la persona. En caso de no tener pareja, este campo toma valor <i>null</i>.
	 */
	public Persona(String nombre, int edad, char sexo, char origen, Persona pareja, float peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.origen = origen;
		this.pareja = pareja;
		this.peso = peso;
		this.altura = altura;		
	}

	/**
	 * M�todo getter para el atributo nombre.
	 * @return Retorna el nombre de la persona.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * M�todo setter para el atributo nombre.
	 * @param nombre Nombre de la persona.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo getter para el atributo edad.
	 * @return Retorna la edad de la persona.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * M�todo setter para el atributo edad.
	 * @param edad Edad de la persona.
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * M�todo getter para el atributo sexo.
	 * @return Retorna el sexo de la persona, <b>M</b> si es hombre, <b>F</b> si es mujer.
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * M�todo setter para el atributo sexo.
	 * @param sexo Sexo de la persona.
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * M�todo getter para el atributo origen.
	 * @return Retorna el origen de la persona, <b>N</b> norte, <b>S</b> sur, <b>E</b> este, <b>O</b> oeste.
	 */
	public char getOrigen() {
		return origen;
	}

	/**
	 * M�todo setter para el atributo origen.
	 * @param origen Origen de la persona. <b>N</b> norte, <b>S</b> sur, <b>E</b> este, <b>O</b> oeste.
	 */
	public void setOrigen(char origen) {
		this.origen = origen;
	}
	
	/**
	 * M�todo getter para el atributo pareja.
	 * @return Retorna la pareja de la persona .
	 */
	public Persona getPareja() {
		return pareja;
	}

	/**
	 * M�todo setter para el atributo pareja.
	 * @param pareja Pareja de la persona.
	 */
	public void setPareja(Persona pareja) {
		this.pareja = pareja;
	}
		
	/**
	 * M�todo getter para el atributo peso.
	 * @return Retorna el peso de la persona.
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * M�todo setter para el atributo peso.
	 * @param peso Peso de la persona.
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}

	/**
	 * M�todo getter para el atributo altura.
	 * @return Retorna la altura de la persona .
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * M�todo setter para el atributo altura.
	 * @param altura Altura de la persona.
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * M�todo que compara si la persona es m�s joven que la persona que se pasa con argumento.
	 * @param p Persona con la que comparar.
	 * @return Retorna verdadero si es m�s joven, falso en caso contrario.
	 */
	public boolean esMasJovenQue(Persona p) {
		if(edad < p.getEdad())
			return true;
		else return false;
	}
	
	/**
	 * M�todo que compara si la persona es m�s joven que su pareja.
	 * @return Retorna verdadero si es m�s joven, falso en caso contrario.
	 */
	public boolean esMasJovenQueSuPareja() {
		if(edad < pareja.getEdad())
			return true;
		else return false;
	}
	
	/**
	 * M�todo que devuelve el origen de la persona en formato largo.
	 * @return Atributo origen en fomato largo (norte/sur/este/oeste)
	 */
	public String getOrigenFormatoLargo() {
		String origenLargo = new String();
		switch (origen){
		case 'N': origenLargo = "norte"; break;
		case 'S': origenLargo = "sur"; break;
		case 'E': origenLargo = "este"; break;
		case 'O': origenLargo = "oeste"; break;
		}
		return origenLargo;		
	}
	
	/**
	 * Muestra el nombre, edad y sexo de la persona por consola.
	 */
	public void mostrarDatos(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " +  edad);
		if (sexo == 'M')
			System.out.println("Sexo: hombre");
		else
			System.out.println("Sexo: mujer");
	}
	
	/**
	 * M�todo que devuelve el �ndice de Masa Corporal de la persona bas�ndose en su peso y altura.
	 * @return Retorna el �ndice de Masa Corporal de la persona.
	 */
	public float calcularIMC(){
		float alturaMetros = altura / 100;
		return peso/((alturaMetros*alturaMetros));
	}
	
	/**
	 * M�todo que devuelve si la persona tiene sobrepeso o no bas�ndose en su IMC. Si es mayor que 25 tiene sobrepeso.
	 * @return Retorna verdadero si la eprsona tiene sobreperso, falso en caso contrario. 
	 */
	public boolean tieneSobrepeso(){
		float imc = calcularIMC();
		if(imc > 25)
			return true;
		else 
			return false;
	}	
}
