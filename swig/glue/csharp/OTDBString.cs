/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

namespace OpenTransactions.OTAPI {

using System;
using System.Runtime.InteropServices;

public class OTDBString : Storable {
  private HandleRef swigCPtr;

  internal OTDBString(IntPtr cPtr, bool cMemoryOwn) : base(otapiPINVOKE.OTDBString_SWIGUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(OTDBString obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~OTDBString() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          otapiPINVOKE.delete_OTDBString(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public string m_string {
    set {
      otapiPINVOKE.OTDBString_m_string_set(swigCPtr, value);
      if (otapiPINVOKE.SWIGPendingException.Pending) throw otapiPINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      string ret = otapiPINVOKE.OTDBString_m_string_get(swigCPtr);
      if (otapiPINVOKE.SWIGPendingException.Pending) throw otapiPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public new static OTDBString ot_dynamic_cast(Storable pObject) {
    IntPtr cPtr = otapiPINVOKE.OTDBString_ot_dynamic_cast(Storable.getCPtr(pObject));
    OTDBString ret = (cPtr == IntPtr.Zero) ? null : new OTDBString(cPtr, false);
    return ret;
  }

}

}
