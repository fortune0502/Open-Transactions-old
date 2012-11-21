/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


using System;
using System.Runtime.InteropServices;

public class TradeListMarket : Storable {
  private HandleRef swigCPtr;

  internal TradeListMarket(IntPtr cPtr, bool cMemoryOwn) : base(otapiPINVOKE.TradeListMarket_SWIGUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(TradeListMarket obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~TradeListMarket() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          otapiPINVOKE.delete_TradeListMarket(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public uint GetTradeDataMarketCount() {
    uint ret = otapiPINVOKE.TradeListMarket_GetTradeDataMarketCount(swigCPtr);
    return ret;
  }

  public TradeDataMarket GetTradeDataMarket(uint nIndex) {
    IntPtr cPtr = otapiPINVOKE.TradeListMarket_GetTradeDataMarket(swigCPtr, nIndex);
    TradeDataMarket ret = (cPtr == IntPtr.Zero) ? null : new TradeDataMarket(cPtr, false);
    return ret;
  }

  public bool RemoveTradeDataMarket(uint nIndexTradeDataMarket) {
    bool ret = otapiPINVOKE.TradeListMarket_RemoveTradeDataMarket(swigCPtr, nIndexTradeDataMarket);
    return ret;
  }

  public bool AddTradeDataMarket(TradeDataMarket disownObject) {
    bool ret = otapiPINVOKE.TradeListMarket_AddTradeDataMarket(swigCPtr, TradeDataMarket.getCPtr(disownObject));
    if (otapiPINVOKE.SWIGPendingException.Pending) throw otapiPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public new static TradeListMarket ot_dynamic_cast(Storable pObject) {
    IntPtr cPtr = otapiPINVOKE.TradeListMarket_ot_dynamic_cast(Storable.getCPtr(pObject));
    TradeListMarket ret = (cPtr == IntPtr.Zero) ? null : new TradeListMarket(cPtr, false);
    return ret;
  }

}
