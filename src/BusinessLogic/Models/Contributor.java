
package BusinessLogic.Models;

/**
 */
public class Contributor extends BusinessLogic.Models.User {

/**
 */
    private final int numContrib;

/**
 */
    private String adressContrib;

/**
 */
    private String telContrib;

/**
 */
    private String descriptifContrib;

/**
 * @return 
 */
    public String getAdressContrib() {        
        return adressContrib;
    } 

/**
 * @param _adressContrib 
 */
    public void setAdressContrib(String _adressContrib) {        
        adressContrib = _adressContrib;
    } 

/**
 * @return 
 */
    public int getNumContrib() {        
        return numContrib;
    } 

/**
 * @return 
 */
    public String getTelContrib() {        
        return telContrib;
    } 

/**
 * @param _telContrib 
 */
    public void setTelContrib(String _telContrib) {        
        telContrib = _telContrib;
    } 

/**
 * @return 
 */
    public String getDescriptifContrib() {        
        return descriptifContrib;
    } 

/**
 * @param _descriptifContrib 
 */
    public void setDescriptifContrib(String _descriptifContrib) {        
        descriptifContrib = _descriptifContrib;
    } 
 }
