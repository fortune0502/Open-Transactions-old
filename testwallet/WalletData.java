/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.wrapper.core.jni;

public class WalletData extends Storable {
  private long swigCPtr;

  public WalletData(long cPtr, boolean cMemoryOwn) {
    super(otapiJNI.WalletData_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WalletData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_WalletData(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }
// ------------------------
	/*@SWIG:OTAPI.i,352,OT_CONTAINER_TYPE_MEMBERS@*/
	private List elementList = new ArrayList();
/*@SWIG@*/
	/*@SWIG:OTAPI.i,433,OT_ADD_ELEMENT@*/  // THIS BLOCK CONTAINS JAVA CODE.
private long removeRefBitcoinServer(long lIndex) {
	// 
	// loop through the elements in the actual container, in order to find the one
	// at lIndex. Once it is found, then loop through the reference list and remove
	// the corresponding reference for that element.
	//
	BitcoinServer refActualElement = GetBitcoinServer(lIndex);

	if (refActualElement == null)
		return lIndex; // oh well.
	
	// Loop through the reference list and remove the corresponding reference
	// for the specified element.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);
		
		if ((theObject == null) || !(theObject instanceof BitcoinServer))
			continue;

		BitcoinServer tempRef = (BitcoinServer)(theObject);
		
		if ((BitcoinServer.getCPtr(tempRef) == BitcoinServer.getCPtr(refActualElement)))
		{
			elementList.remove(tempRef);
			break;
		}
	}
	
	return lIndex;
}

private long getCPtrAddRefBitcoinServer(BitcoinServer element) {
	// Whenever adding a reference to the list, I remove it first (if already there.)
	// That way we never store more than one reference per actual contained object.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);

		if ((theObject == null) || !(theObject instanceof BitcoinServer))
			continue;
		
		BitcoinServer tempRef = (BitcoinServer)(theObject);
		
		if ((BitcoinServer.getCPtr(tempRef) == BitcoinServer.getCPtr(element)))
		{
			elementList.remove(tempRef); // It was already there, so let's remove it before adding (below.)
			break;
		}
	}
	// Now we add it...
	//
	BitcoinServer tempLocalRef = element;
	elementList.add(tempLocalRef);
	return BitcoinServer.getCPtr(element);
}	// Hope I get away with overloading this for every type. Otherwise,
/*@SWIG@*/
	/*@SWIG:OTAPI.i,433,OT_ADD_ELEMENT@*/  // THIS BLOCK CONTAINS JAVA CODE.
private long removeRefBitcoinAcct(long lIndex) {
	// 
	// loop through the elements in the actual container, in order to find the one
	// at lIndex. Once it is found, then loop through the reference list and remove
	// the corresponding reference for that element.
	//
	BitcoinAcct refActualElement = GetBitcoinAcct(lIndex);

	if (refActualElement == null)
		return lIndex; // oh well.
	
	// Loop through the reference list and remove the corresponding reference
	// for the specified element.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);
		
		if ((theObject == null) || !(theObject instanceof BitcoinAcct))
			continue;

		BitcoinAcct tempRef = (BitcoinAcct)(theObject);
		
		if ((BitcoinAcct.getCPtr(tempRef) == BitcoinAcct.getCPtr(refActualElement)))
		{
			elementList.remove(tempRef);
			break;
		}
	}
	
	return lIndex;
}

private long getCPtrAddRefBitcoinAcct(BitcoinAcct element) {
	// Whenever adding a reference to the list, I remove it first (if already there.)
	// That way we never store more than one reference per actual contained object.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);

		if ((theObject == null) || !(theObject instanceof BitcoinAcct))
			continue;
		
		BitcoinAcct tempRef = (BitcoinAcct)(theObject);
		
		if ((BitcoinAcct.getCPtr(tempRef) == BitcoinAcct.getCPtr(element)))
		{
			elementList.remove(tempRef); // It was already there, so let's remove it before adding (below.)
			break;
		}
	}
	// Now we add it...
	//
	BitcoinAcct tempLocalRef = element;
	elementList.add(tempLocalRef);
	return BitcoinAcct.getCPtr(element);
}	// Hope I get away with overloading this for every type. Otherwise,
/*@SWIG@*/
	/*@SWIG:OTAPI.i,433,OT_ADD_ELEMENT@*/  // THIS BLOCK CONTAINS JAVA CODE.
private long removeRefRippleServer(long lIndex) {
	// 
	// loop through the elements in the actual container, in order to find the one
	// at lIndex. Once it is found, then loop through the reference list and remove
	// the corresponding reference for that element.
	//
	RippleServer refActualElement = GetRippleServer(lIndex);

	if (refActualElement == null)
		return lIndex; // oh well.
	
	// Loop through the reference list and remove the corresponding reference
	// for the specified element.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);
		
		if ((theObject == null) || !(theObject instanceof RippleServer))
			continue;

		RippleServer tempRef = (RippleServer)(theObject);
		
		if ((RippleServer.getCPtr(tempRef) == RippleServer.getCPtr(refActualElement)))
		{
			elementList.remove(tempRef);
			break;
		}
	}
	
	return lIndex;
}

private long getCPtrAddRefRippleServer(RippleServer element) {
	// Whenever adding a reference to the list, I remove it first (if already there.)
	// That way we never store more than one reference per actual contained object.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);

		if ((theObject == null) || !(theObject instanceof RippleServer))
			continue;
		
		RippleServer tempRef = (RippleServer)(theObject);
		
		if ((RippleServer.getCPtr(tempRef) == RippleServer.getCPtr(element)))
		{
			elementList.remove(tempRef); // It was already there, so let's remove it before adding (below.)
			break;
		}
	}
	// Now we add it...
	//
	RippleServer tempLocalRef = element;
	elementList.add(tempLocalRef);
	return RippleServer.getCPtr(element);
}	// Hope I get away with overloading this for every type. Otherwise,
/*@SWIG@*/
	/*@SWIG:OTAPI.i,433,OT_ADD_ELEMENT@*/  // THIS BLOCK CONTAINS JAVA CODE.
private long removeRefLoomServer(long lIndex) {
	// 
	// loop through the elements in the actual container, in order to find the one
	// at lIndex. Once it is found, then loop through the reference list and remove
	// the corresponding reference for that element.
	//
	LoomServer refActualElement = GetLoomServer(lIndex);

	if (refActualElement == null)
		return lIndex; // oh well.
	
	// Loop through the reference list and remove the corresponding reference
	// for the specified element.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);
		
		if ((theObject == null) || !(theObject instanceof LoomServer))
			continue;

		LoomServer tempRef = (LoomServer)(theObject);
		
		if ((LoomServer.getCPtr(tempRef) == LoomServer.getCPtr(refActualElement)))
		{
			elementList.remove(tempRef);
			break;
		}
	}
	
	return lIndex;
}

private long getCPtrAddRefLoomServer(LoomServer element) {
	// Whenever adding a reference to the list, I remove it first (if already there.)
	// That way we never store more than one reference per actual contained object.
	//
	for(int intIndex = 0; intIndex < elementList.size(); intIndex++)
	{
		Object theObject = elementList.get(intIndex);

		if ((theObject == null) || !(theObject instanceof LoomServer))
			continue;
		
		LoomServer tempRef = (LoomServer)(theObject);
		
		if ((LoomServer.getCPtr(tempRef) == LoomServer.getCPtr(element)))
		{
			elementList.remove(tempRef); // It was already there, so let's remove it before adding (below.)
			break;
		}
	}
	// Now we add it...
	//
	LoomServer tempLocalRef = element;
	elementList.add(tempLocalRef);
	return LoomServer.getCPtr(element);
}	// Hope I get away with overloading this for every type. Otherwise,
/*@SWIG@*/
  public long GetBitcoinServerCount() { return otapiJNI.WalletData_GetBitcoinServerCount(swigCPtr, this); }

  public BitcoinServer GetBitcoinServer(long nIndex) {
    long cPtr = otapiJNI.WalletData_GetBitcoinServer(swigCPtr, this, nIndex);
    return (cPtr == 0) ? null : new BitcoinServer(cPtr, false);
  }

  public boolean RemoveBitcoinServer(long nIndexBitcoinServer) {
    return otapiJNI.WalletData_RemoveBitcoinServer(swigCPtr, this, removeRefBitcoinServer(nIndexBitcoinServer));
  }

  public boolean AddBitcoinServer(BitcoinServer disownObject) {
    return otapiJNI.WalletData_AddBitcoinServer(swigCPtr, this, BitcoinServer.getCPtr(disownObject), disownObject);
  }

  public long GetBitcoinAcctCount() { return otapiJNI.WalletData_GetBitcoinAcctCount(swigCPtr, this); }

  public BitcoinAcct GetBitcoinAcct(long nIndex) {
    long cPtr = otapiJNI.WalletData_GetBitcoinAcct(swigCPtr, this, nIndex);
    return (cPtr == 0) ? null : new BitcoinAcct(cPtr, false);
  }

  public boolean RemoveBitcoinAcct(long nIndexBitcoinAcct) {
    return otapiJNI.WalletData_RemoveBitcoinAcct(swigCPtr, this, removeRefBitcoinAcct(nIndexBitcoinAcct));
  }

  public boolean AddBitcoinAcct(BitcoinAcct disownObject) {
    return otapiJNI.WalletData_AddBitcoinAcct(swigCPtr, this, BitcoinAcct.getCPtr(disownObject), disownObject);
  }

  public long GetRippleServerCount() { return otapiJNI.WalletData_GetRippleServerCount(swigCPtr, this); }

  public RippleServer GetRippleServer(long nIndex) {
    long cPtr = otapiJNI.WalletData_GetRippleServer(swigCPtr, this, nIndex);
    return (cPtr == 0) ? null : new RippleServer(cPtr, false);
  }

  public boolean RemoveRippleServer(long nIndexRippleServer) {
    return otapiJNI.WalletData_RemoveRippleServer(swigCPtr, this, removeRefRippleServer(nIndexRippleServer));
  }

  public boolean AddRippleServer(RippleServer disownObject) {
    return otapiJNI.WalletData_AddRippleServer(swigCPtr, this, RippleServer.getCPtr(disownObject), disownObject);
  }

  public long GetLoomServerCount() { return otapiJNI.WalletData_GetLoomServerCount(swigCPtr, this); }

  public LoomServer GetLoomServer(long nIndex) {
    long cPtr = otapiJNI.WalletData_GetLoomServer(swigCPtr, this, nIndex);
    return (cPtr == 0) ? null : new LoomServer(cPtr, false);
  }

  public boolean RemoveLoomServer(long nIndexLoomServer) {
    return otapiJNI.WalletData_RemoveLoomServer(swigCPtr, this, removeRefLoomServer(nIndexLoomServer));
  }

  public boolean AddLoomServer(LoomServer disownObject) {
    return otapiJNI.WalletData_AddLoomServer(swigCPtr, this, LoomServer.getCPtr(disownObject), disownObject);
  }

  public static WalletData ot_dynamic_cast(Storable pObject) {
    long cPtr = otapiJNI.WalletData_ot_dynamic_cast(Storable.getCPtr(pObject), pObject);
    return (cPtr == 0) ? null : new WalletData(cPtr, false);
  }

}
