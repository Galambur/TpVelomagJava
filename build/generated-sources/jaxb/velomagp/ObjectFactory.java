//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2022.04.01 � 04:27:25 PM CEST 
//


package velomagp;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the velomagp package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: velomagp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Vcs }
     * 
     */
    public Vcs createVcs() {
        return new Vcs();
    }

    /**
     * Create an instance of {@link Vcs.Sl }
     * 
     */
    public Vcs.Sl createVcsSl() {
        return new Vcs.Sl();
    }

    /**
     * Create an instance of {@link Vcs.Sl.Si }
     * 
     */
    public Vcs.Sl.Si createVcsSlSi() {
        return new Vcs.Sl.Si();
    }

}
