
package BusinessLogic.Models;

/**
 * 
 * 
 * @poseidon-object-id [I1f0ad7acm14b7d148c3cmm78d4]
 */
public class User {

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [Im7ddd0dam14b7d2676e5mm7805]
 */
    private final int numUser;

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I1f0ad7acm14b7d148c3cmm78aa]
 */
    private String idUser;

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I1f0ad7acm14b7d148c3cmm7815]
 */
    private String mailUser;

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I1f0ad7acm14b7d148c3cmm78bb]
 */
    private String nameUser;

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I1f0ad7acm14b7d148c3cmm7899]
 */
    private String firsNameUser;

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I1f0ad7acm14b7d148c3cmm77c4]
 */
    private String telUser;

/**
 */
    private String passwordUser;

/**
 */
    private final String prefixUser;

/**
 */
    private final String sufixUser;
/**
 */
    public BusinessLogic.Models.Order order;
/**
 */
    public java.util.Collection shoppingCart = new java.util.TreeSet();
/**
 */
    public BusinessLogic.Models.NotificationCenter notificationCenter;
/**
 */
    public java.util.Collection activite = new java.util.TreeSet();

/**
 * @return 
 */
    public Boolean store() {        
        // your code here
        return null;
    } 

/**
 * @return 
 */
    public int getNumUser() {        
        return numUser;
    } 

/**
 * @return 
 */
    public String getIdUser() {        
        return idUser;
    } 

/**
 * @param _idUser 
 */
    public void setIdUser(String _idUser) {        
        idUser = _idUser;
    } 

/**
 * @return 
 */
    public String getMailUser() {        
        return mailUser;
    } 

/**
 * @param _mailUser 
 */
    public void setMailUser(String _mailUser) {        
        mailUser = _mailUser;
    } 

/**
 * @return 
 */
    public String getNameUser() {        
        return nameUser;
    } 

/**
 * @param _nameUser 
 */
    public void setNameUser(String _nameUser) {        
        nameUser = _nameUser;
    } 

/**
 * @return 
 */
    public String getFirsNameUser() {        
        return firsNameUser;
    } 

/**
 * @param _firsNameUser 
 */
    public void setFirsNameUser(String _firsNameUser) {        
        firsNameUser = _firsNameUser;
    } 

/**
 * @return 
 */
    public String getTelUser() {        
        return telUser;
    } 

/**
 * @param _telUser 
 */
    public void setTelUser(String _telUser) {        
        telUser = _telUser;
    } 

/**
 * @return 
 */
    public String getPasswordUser() {        
        return passwordUser;
    } 

/**
 * @param _passwordUser 
 */
    public void setPasswordUser(String _passwordUser) {        
        passwordUser = _passwordUser;
    } 

/**
 * @return 
 */
    public String getPrefixUser() {        
        return prefixUser;
    } 

/**
 * @return 
 */
    public String getSufixUser() {        
        return sufixUser;
    } 
 }
