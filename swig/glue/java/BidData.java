/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opentransactions.otapi;

import java.util.ArrayList;
import java.util.List;

public class BidData extends OfferDataMarket {
  private long swigCPtr;

  protected BidData(long cPtr, boolean cMemoryOwn) {
    super(otapiJNI.BidData_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BidData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_BidData(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }
/*@SWIG:otapi/OTAPI.i,132,OT_CAN_BE_CONTAINED_BY@*/
	// Ensure that the GC doesn't collect any OT_CONTAINER instance set from Java
	private OfferListMarket containerRefOfferListMarket;
	// ----------------	
	protected void addReference(OfferListMarket theContainer) {  // This is Java code
		containerRefOfferListMarket = theContainer;
	}
	// ----------------
/*@SWIG@*/
	// ------------------------
  public void setGui_label(String value) {
    otapiJNI.BidData_gui_label_set(swigCPtr, this, value);
  }

  public String getGui_label() {
    return otapiJNI.BidData_gui_label_get(swigCPtr, this);
  }

  public void setTransaction_id(String value) {
    otapiJNI.BidData_transaction_id_set(swigCPtr, this, value);
  }

  public String getTransaction_id() {
    return otapiJNI.BidData_transaction_id_get(swigCPtr, this);
  }

  public void setPrice_per_scale(String value) {
    otapiJNI.BidData_price_per_scale_set(swigCPtr, this, value);
  }

  public String getPrice_per_scale() {
    return otapiJNI.BidData_price_per_scale_get(swigCPtr, this);
  }

  public void setAvailable_assets(String value) {
    otapiJNI.BidData_available_assets_set(swigCPtr, this, value);
  }

  public String getAvailable_assets() {
    return otapiJNI.BidData_available_assets_get(swigCPtr, this);
  }

  public void setMinimum_increment(String value) {
    otapiJNI.BidData_minimum_increment_set(swigCPtr, this, value);
  }

  public String getMinimum_increment() {
    return otapiJNI.BidData_minimum_increment_get(swigCPtr, this);
  }

  public static BidData ot_dynamic_cast(Storable pObject) {
    long cPtr = otapiJNI.BidData_ot_dynamic_cast(Storable.getCPtr(pObject), pObject);
    return (cPtr == 0) ? null : new BidData(cPtr, false);
  }

}
