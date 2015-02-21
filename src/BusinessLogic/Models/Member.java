
package BusinessLogic.Models;

/**
 */
public class Member extends BusinessLogic.Models.User {

/**
 */
    private final int numMember;
/**
 */
    public java.util.Collection year = new java.util.TreeSet();
/**
 */
    public java.util.Collection inscription = new java.util.TreeSet();
/**
 */
    public BusinessLogic.Models.Product product;

/**
 * @return 
 */
    public int getNumMember() {        
        return numMember;
    } 
 }
