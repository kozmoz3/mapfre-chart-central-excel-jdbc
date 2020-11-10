//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.05 a las 06:51:41 PM CST 
//


package com.mapfre.exceljdbc.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mapfre.cm.excel.api package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MigracionDatos_QNAME = new QName("http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc", "migracionDatos");
    private final static QName _MigracionDatosResponse_QNAME = new QName("http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc", "migracionDatosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mapfre.cm.excel.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MigracionDatos }
     * 
     */
    public MigracionDatos createMigracionDatos() {
        return new MigracionDatos();
    }

    /**
     * Create an instance of {@link MigracionDatosResponse }
     * 
     */
    public MigracionDatosResponse createMigracionDatosResponse() {
        return new MigracionDatosResponse();
    }

    /**
     * Create an instance of {@link ServicioOut }
     * 
     */
    public ServicioOut createServicioOut() {
        return new ServicioOut();
    }

    /**
     * Create an instance of {@link TaskInfo }
     * 
     */
    public TaskInfo createTaskInfo() {
        return new TaskInfo();
    }

    /**
     * Create an instance of {@link TaskData }
     * 
     */
    public TaskData createTaskData() {
        return new TaskData();
    }

    /**
     * Create an instance of {@link DictamenMedico }
     * 
     */
    public DictamenMedico createDictamenMedico() {
        return new DictamenMedico();
    }

    /**
     * Create an instance of {@link RMA }
     * 
     */
    public RMA createRMA() {
        return new RMA();
    }

    /**
     * Create an instance of {@link Titular }
     * 
     */
    public Titular createTitular() {
        return new Titular();
    }

    /**
     * Create an instance of {@link GCA }
     * 
     */
    public GCA createGCA() {
        return new GCA();
    }

    /**
     * Create an instance of {@link DatosMinimos }
     * 
     */
    public DatosMinimos createDatosMinimos() {
        return new DatosMinimos();
    }

    /**
     * Create an instance of {@link Contacto }
     * 
     */
    public Contacto createContacto() {
        return new Contacto();
    }

    /**
     * Create an instance of {@link Proveedor }
     * 
     */
    public Proveedor createProveedor() {
        return new Proveedor();
    }

    /**
     * Create an instance of {@link Contratante }
     * 
     */
    public Contratante createContratante() {
        return new Contratante();
    }

    /**
     * Create an instance of {@link Poliza }
     * 
     */
    public Poliza createPoliza() {
        return new Poliza();
    }

    /**
     * Create an instance of {@link Afectado }
     * 
     */
    public Afectado createAfectado() {
        return new Afectado();
    }

    /**
     * Create an instance of {@link Diagnosticos }
     * 
     */
    public Diagnosticos createDiagnosticos() {
        return new Diagnosticos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigracionDatos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MigracionDatos }{@code >}
     */
    @XmlElementDecl(namespace = "http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc", name = "migracionDatos")
    public JAXBElement<MigracionDatos> createMigracionDatos(MigracionDatos value) {
        return new JAXBElement<MigracionDatos>(_MigracionDatos_QNAME, MigracionDatos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigracionDatosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MigracionDatosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://SMX074010-001.ltm.mapfre.net/mmxRam.CentralMedica.svc", name = "migracionDatosResponse")
    public JAXBElement<MigracionDatosResponse> createMigracionDatosResponse(MigracionDatosResponse value) {
        return new JAXBElement<MigracionDatosResponse>(_MigracionDatosResponse_QNAME, MigracionDatosResponse.class, null, value);
    }

}
