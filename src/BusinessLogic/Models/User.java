
package BusinessLogic.Models;

import java.util.Collection;
import java.util.TreeSet;


public class User {

    private final int numUser;
    
    private String idUser;

    private String mailUser;

    private String nameUser;

    private String firstNameUser;

    private String telUser;

    private String passwordUser;

    private final String prefixUser;

    private final String sufixUser;

    public BusinessLogic.Models.Order order;

    public Collection shoppingCart = new TreeSet();

    public BusinessLogic.Models.NotificationCenter notificationCenter;

    public Collection activite = new TreeSet();

    public User(int num,String id, String lastName, String firstName, String mail, String tel, String password, String sufix, String prefix){
    	nameUser = lastName;
    	firstNameUser = firstName;
    	mailUser=mail;
    	telUser = tel;
    	passwordUser=password;
    	prefixUser = prefix;
    	sufixUser = sufix;
    	idUser = id;
    	numUser = num;
    }
    
/**
 * @return 
 */
    public Boolean store() {        
    	
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
