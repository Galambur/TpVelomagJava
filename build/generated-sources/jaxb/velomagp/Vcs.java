//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2022.04.01 � 04:27:25 PM CEST 
//


package velomagp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sl">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="si" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="na" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="la" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="lg" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="av" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="fr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ver" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sl"
})
@XmlRootElement(name = "vcs")
public class Vcs {

    @XmlElement(required = true)
    protected Vcs.Sl sl;
    @XmlAttribute(name = "ver", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short ver;

    /**
     * Obtient la valeur de la propri�t� sl.
     * 
     * @return
     *     possible object is
     *     {@link Vcs.Sl }
     *     
     */
    public Vcs.Sl getSl() {
        return sl;
    }

    /**
     * D�finit la valeur de la propri�t� sl.
     * 
     * @param value
     *     allowed object is
     *     {@link Vcs.Sl }
     *     
     */
    public void setSl(Vcs.Sl value) {
        this.sl = value;
    }

    /**
     * Obtient la valeur de la propri�t� ver.
     * 
     */
    public short getVer() {
        return ver;
    }

    /**
     * D�finit la valeur de la propri�t� ver.
     * 
     */
    public void setVer(short value) {
        this.ver = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="si" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="na" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="la" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="lg" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="av" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="fr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "si"
    })
    public static class Sl {

        @XmlElement(required = true)
        protected List<Vcs.Sl.Si> si;

        /**
         * Gets the value of the si property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the si property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSi().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Vcs.Sl.Si }
         * 
         * 
         */
        public List<Vcs.Sl.Si> getSi() {
            if (si == null) {
                si = new ArrayList<Vcs.Sl.Si>();
            }
            return this.si;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="na" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="la" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="lg" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="av" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="fr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Si {

            @XmlAttribute(name = "na", required = true)
            protected String na;
            @XmlAttribute(name = "id", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short id;
            @XmlAttribute(name = "la", required = true)
            protected BigDecimal la;
            @XmlAttribute(name = "lg", required = true)
            protected BigDecimal lg;
            @XmlAttribute(name = "av", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short av;
            @XmlAttribute(name = "fr", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short fr;
            @XmlAttribute(name = "to", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short to;

            /**
             * Obtient la valeur de la propri�t� na.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNa() {
                return na;
            }

            /**
             * D�finit la valeur de la propri�t� na.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNa(String value) {
                this.na = value;
            }

            /**
             * Obtient la valeur de la propri�t� id.
             * 
             */
            public short getId() {
                return id;
            }

            /**
             * D�finit la valeur de la propri�t� id.
             * 
             */
            public void setId(short value) {
                this.id = value;
            }

            /**
             * Obtient la valeur de la propri�t� la.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLa() {
                return la;
            }

            /**
             * D�finit la valeur de la propri�t� la.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLa(BigDecimal value) {
                this.la = value;
            }

            /**
             * Obtient la valeur de la propri�t� lg.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLg() {
                return lg;
            }

            /**
             * D�finit la valeur de la propri�t� lg.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLg(BigDecimal value) {
                this.lg = value;
            }

            /**
             * Obtient la valeur de la propri�t� av.
             * 
             */
            public short getAv() {
                return av;
            }

            /**
             * D�finit la valeur de la propri�t� av.
             * 
             */
            public void setAv(short value) {
                this.av = value;
            }

            /**
             * Obtient la valeur de la propri�t� fr.
             * 
             */
            public short getFr() {
                return fr;
            }

            /**
             * D�finit la valeur de la propri�t� fr.
             * 
             */
            public void setFr(short value) {
                this.fr = value;
            }

            /**
             * Obtient la valeur de la propri�t� to.
             * 
             */
            public short getTo() {
                return to;
            }

            /**
             * D�finit la valeur de la propri�t� to.
             * 
             */
            public void setTo(short value) {
                this.to = value;
            }

        }

    }

}
