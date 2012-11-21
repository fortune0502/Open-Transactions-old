/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


using System;
using System.Runtime.InteropServices;

public class WalletData : Storable {
  private HandleRef swigCPtr;

  internal WalletData(IntPtr cPtr, bool cMemoryOwn) : base(otapiPINVOKE.WalletData_SWIGUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(WalletData obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~WalletData() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          otapiPINVOKE.delete_WalletData(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public uint GetBitcoinServerCount() {
    uint ret = otapiPINVOKE.WalletData_GetBitcoinServerCount(swigCPtr);
    return ret;
  }

  public BitcoinServer GetBitcoinServer(uint nIndex) {
    IntPtr cPtr = otapiPINVOKE.WalletData_GetBitcoinServer(swigCPtr, nIndex);
    BitcoinServer ret = (cPtr == IntPtr.Zero) ? null : new BitcoinServer(cPtr, false);
    return ret;
  }

  public bool RemoveBitcoinServer(uint nIndexBitcoinServer) {
    bool ret = otapiPINVOKE.WalletData_RemoveBitcoinServer(swigCPtr, nIndexBitcoinServer);
    return ret;
  }

  public bool AddBitcoinServer(BitcoinServer disownObject) {
    bool ret = otapiPINVOKE.WalletData_AddBitcoinServer(swigCPtr, BitcoinServer.getCPtr(disownObject));
    if (otapiPINVOKE.SWIGPendingException.Pending) throw otapiPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public uint GetBitcoinAcctCount() {
    uint ret = otapiPINVOKE.WalletData_GetBitcoinAcctCount(swigCPtr);
    return ret;
  }

  public BitcoinAcct GetBitcoinAcct(uint nIndex) {
    IntPtr cPtr = otapiPINVOKE.WalletData_GetBitcoinAcct(swigCPtr, nIndex);
    BitcoinAcct ret = (cPtr == IntPtr.Zero) ? null : new BitcoinAcct(cPtr, false);
    return ret;
  }

  public bool RemoveBitcoinAcct(uint nIndexBitcoinAcct) {
    bool ret = otapiPINVOKE.WalletData_RemoveBitcoinAcct(swigCPtr, nIndexBitcoinAcct);
    return ret;
  }

  public bool AddBitcoinAcct(BitcoinAcct disownObject) {
    bool ret = otapiPINVOKE.WalletData_AddBitcoinAcct(swigCPtr, BitcoinAcct.getCPtr(disownObject));
    if (otapiPINVOKE.SWIGPendingException.Pending) throw otapiPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public uint GetRippleServerCount() {
    uint ret = otapiPINVOKE.WalletData_GetRippleServerCount(swigCPtr);
    return ret;
  }

  public RippleServer GetRippleServer(uint nIndex) {
    IntPtr cPtr = otapiPINVOKE.WalletData_GetRippleServer(swigCPtr, nIndex);
    RippleServer ret = (cPtr == IntPtr.Zero) ? null : new RippleServer(cPtr, false);
    return ret;
  }

  public bool RemoveRippleServer(uint nIndexRippleServer) {
    bool ret = otapiPINVOKE.WalletData_RemoveRippleServer(swigCPtr, nIndexRippleServer);
    return ret;
  }

  public bool AddRippleServer(RippleServer disownObject) {
    bool ret = otapiPINVOKE.WalletData_AddRippleServer(swigCPtr, RippleServer.getCPtr(disownObject));
    if (otapiPINVOKE.SWIGPendingException.Pending) throw otapiPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public uint GetLoomServerCount() {
    uint ret = otapiPINVOKE.WalletData_GetLoomServerCount(swigCPtr);
    return ret;
  }

  public LoomServer GetLoomServer(uint nIndex) {
    IntPtr cPtr = otapiPINVOKE.WalletData_GetLoomServer(swigCPtr, nIndex);
    LoomServer ret = (cPtr == IntPtr.Zero) ? null : new LoomServer(cPtr, false);
    return ret;
  }

  public bool RemoveLoomServer(uint nIndexLoomServer) {
    bool ret = otapiPINVOKE.WalletData_RemoveLoomServer(swigCPtr, nIndexLoomServer);
    return ret;
  }

  public bool AddLoomServer(LoomServer disownObject) {
    bool ret = otapiPINVOKE.WalletData_AddLoomServer(swigCPtr, LoomServer.getCPtr(disownObject));
    if (otapiPINVOKE.SWIGPendingException.Pending) throw otapiPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public new static WalletData ot_dynamic_cast(Storable pObject) {
    IntPtr cPtr = otapiPINVOKE.WalletData_ot_dynamic_cast(Storable.getCPtr(pObject));
    WalletData ret = (cPtr == IntPtr.Zero) ? null : new WalletData(cPtr, false);
    return ret;
  }

}
