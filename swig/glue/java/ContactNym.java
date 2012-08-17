/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.wrapper.core.jni;

import java.util.ArrayList;
import java.util.List;

public class ContactNym extends Displayable {
  private long swigCPtr;

  protected ContactNym(long cPtr, boolean cMemoryOwn) {
    super(otapiJNI.ContactNym_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ContactNym obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_ContactNym(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }
/*@SWIG:otapi/OTAPI.i,385,OT_CAN_BE_CONTAINED_BY@*/
	// Ensure that the GC doesn't collect any OT_CONTAINER instance set from Java
	private Contact containerRefContact;
	// ----------------	
	protected void addReference(Contact theContainer) {  // This is Java code
		containerRefContact = theContainer;
	}
	// ----------------
/*@SWIG@*/
	// ------------------------
	/*@SWIG:otapi/OTAPI.i,335,OT_CONTAINER_TYPE_MEMBERS@*/
	private List elementList = new ArrayList();
/*@SWIG@*/
	/*@SWIG:otapi/OTAPI.i,416,OT_ADD_ELEMENT@*/  // THIS BLOCK CONTAINS JAVA CODE.
private long removeRefServerInfo(long lIndex) {
	// 
	// loop through the elements in the actual container, in order to find the one
	// at lIndex. Once it is found, then loop through the reference list and remove
	// the corresponding reference for that element.
	//
	ServerInfo refActualElement = GetServerInfo(lIndex);

	if (refActualElement == null)
		return lIndex; // oh well.
	
	// Loop through the reference list and remove the corresponding reference
	// for the specified element.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);
		
		if ((theObject == null) || !(theObject instanceof ServerInfo))
			continue;

		ServerInfo tempRef = (ServerInfo)(theObject);
		
		if ((ServerInfo.getCPtr(tempRef) == ServerInfo.getCPtr(refActualElement)))
		{
			elementList.remove(tempRef);
			break;
		}
	}
	
	return lIndex;
}

private long getCPtrAddRefServerInfo(ServerInfo element) {
	// Whenever adding a reference to the list, I remove it first (if already there.)
	// That way we never store more than one reference per actual contained object.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);

		if ((theObject == null) || !(theObject instanceof ServerInfo))
			continue;
		
		ServerInfo tempRef = (ServerInfo)(theObject);
		
		if ((ServerInfo.getCPtr(tempRef) == ServerInfo.getCPtr(element)))
		{
			elementList.remove(tempRef); // It was already there, so let's remove it before adding (below.)
			break;
		}
	}
	// Now we add it...
	//
	ServerInfo tempLocalRef = element;
	elementList.add(tempLocalRef);
	return ServerInfo.getCPtr(element);
}	// Hope I get away with overloading this for every type. Otherwise,
/*@SWIG@*/
  public void setGui_label(String value) {
    otapiJNI.ContactNym_gui_label_set(swigCPtr, this, value);
  }

  public String getGui_label() {
    return otapiJNI.ContactNym_gui_label_get(swigCPtr, this);
  }

  public void setNym_type(String value) {
    otapiJNI.ContactNym_nym_type_set(swigCPtr, this, value);
  }

  public String getNym_type() {
    return otapiJNI.ContactNym_nym_type_get(swigCPtr, this);
  }

  public void setNym_id(String value) {
    otapiJNI.ContactNym_nym_id_set(swigCPtr, this, value);
  }

  public String getNym_id() {
    return otapiJNI.ContactNym_nym_id_get(swigCPtr, this);
  }

  public void setPublic_key(String value) {
    otapiJNI.ContactNym_public_key_set(swigCPtr, this, value);
  }

  public String getPublic_key() {
    return otapiJNI.ContactNym_public_key_get(swigCPtr, this);
  }

  public void setMemo(String value) {
    otapiJNI.ContactNym_memo_set(swigCPtr, this, value);
  }

  public String getMemo() {
    return otapiJNI.ContactNym_memo_get(swigCPtr, this);
  }

  public long GetServerInfoCount() { return otapiJNI.ContactNym_GetServerInfoCount(swigCPtr, this); }

  public ServerInfo GetServerInfo(long nIndex) {
    long cPtr = otapiJNI.ContactNym_GetServerInfo(swigCPtr, this, nIndex);
    return (cPtr == 0) ? null : new ServerInfo(cPtr, false);
  }

  public boolean RemoveServerInfo(long nIndexServerInfo) {
    return otapiJNI.ContactNym_RemoveServerInfo(swigCPtr, this, removeRefServerInfo(nIndexServerInfo));
  }

  public boolean AddServerInfo(ServerInfo disownObject) {
    return otapiJNI.ContactNym_AddServerInfo(swigCPtr, this, ServerInfo.getCPtr(disownObject), disownObject);
  }

  public static ContactNym ot_dynamic_cast(Storable pObject) {
    long cPtr = otapiJNI.ContactNym_ot_dynamic_cast(Storable.getCPtr(pObject), pObject);
    return (cPtr == 0) ? null : new ContactNym(cPtr, false);
  }

}
