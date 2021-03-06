package model.db;
// Generated 18/01/2017 03:23:27 PM by Hibernate Tools 3.2.2.GA



/**
 * WmbEventFields generated by hbm2java
 */
public class WmbEventFields  implements java.io.Serializable {


     private int eventTypeId;
     private int keyFldId;
     private String keyFldName;
     private String keyFldDesc;
     private String keyFldPath;

    public WmbEventFields() {
    }

	
    public WmbEventFields(int eventTypeId, int keyFldId) {
        this.eventTypeId = eventTypeId;
        this.keyFldId = keyFldId;
    }
    public WmbEventFields(int eventTypeId, int keyFldId, String keyFldName, String keyFldDesc, String keyFldPath) {
       this.eventTypeId = eventTypeId;
       this.keyFldId = keyFldId;
       this.keyFldName = keyFldName;
       this.keyFldDesc = keyFldDesc;
       this.keyFldPath = keyFldPath;
    }
   
    public int getEventTypeId() {
        return this.eventTypeId;
    }
    
    public void setEventTypeId(int eventTypeId) {
        this.eventTypeId = eventTypeId;
    }
    public int getKeyFldId() {
        return this.keyFldId;
    }
    
    public void setKeyFldId(int keyFldId) {
        this.keyFldId = keyFldId;
    }
    public String getKeyFldName() {
        return this.keyFldName;
    }
    
    public void setKeyFldName(String keyFldName) {
        this.keyFldName = keyFldName;
    }
    public String getKeyFldDesc() {
        return this.keyFldDesc;
    }
    
    public void setKeyFldDesc(String keyFldDesc) {
        this.keyFldDesc = keyFldDesc;
    }
    public String getKeyFldPath() {
        return this.keyFldPath;
    }
    
    public void setKeyFldPath(String keyFldPath) {
        this.keyFldPath = keyFldPath;
    }




}


