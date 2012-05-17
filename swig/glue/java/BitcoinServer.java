/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.wrapper.core.jni;

public class BitcoinServer extends Server {
  private long swigCPtr;

  protected BitcoinServer(long cPtr, boolean cMemoryOwn) {
    super(otapiJNI.BitcoinServer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BitcoinServer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_BitcoinServer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }
/*@SWIG:otapi\otapi.i,379,OT_CAN_BE_CONTAINED_BY@*/
	// Ensure that the GC doesn't collect any OT_CONTAINER instance set from Java
	private WalletData containerRefWalletData;
	// ----------------	
	protected void addReference(WalletData theContainer) {  // This is Java code
		containerRefWalletData = theContainer;
	}
	// ----------------
/*@SWIG@*/
	// ------------------------
  public void setGui_label(String value) {
    otapiJNI.BitcoinServer_gui_label_set(swigCPtr, this, value);
  }

  public String getGui_label() {
    return otapiJNI.BitcoinServer_gui_label_get(swigCPtr, this);
  }

  public void setServer_id(String value) {
    otapiJNI.BitcoinServer_server_id_set(swigCPtr, this, value);
  }

  public String getServer_id() {
    return otapiJNI.BitcoinServer_server_id_get(swigCPtr, this);
  }

  public void setServer_type(String value) {
    otapiJNI.BitcoinServer_server_type_set(swigCPtr, this, value);
  }

  public String getServer_type() {
    return otapiJNI.BitcoinServer_server_type_get(swigCPtr, this);
  }

  public void setServer_host(String value) {
    otapiJNI.BitcoinServer_server_host_set(swigCPtr, this, value);
  }

  public String getServer_host() {
    return otapiJNI.BitcoinServer_server_host_get(swigCPtr, this);
  }

  public void setServer_port(String value) {
    otapiJNI.BitcoinServer_server_port_set(swigCPtr, this, value);
  }

  public String getServer_port() {
    return otapiJNI.BitcoinServer_server_port_get(swigCPtr, this);
  }

  public void setBitcoin_username(String value) {
    otapiJNI.BitcoinServer_bitcoin_username_set(swigCPtr, this, value);
  }

  public String getBitcoin_username() {
    return otapiJNI.BitcoinServer_bitcoin_username_get(swigCPtr, this);
  }

  public void setBitcoin_password(String value) {
    otapiJNI.BitcoinServer_bitcoin_password_set(swigCPtr, this, value);
  }

  public String getBitcoin_password() {
    return otapiJNI.BitcoinServer_bitcoin_password_get(swigCPtr, this);
  }

  public static BitcoinServer ot_dynamic_cast(Storable pObject) {
    long cPtr = otapiJNI.BitcoinServer_ot_dynamic_cast(Storable.getCPtr(pObject), pObject);
    return (cPtr == 0) ? null : new BitcoinServer(cPtr, false);
  }

}
