/**************************************************************
 *    
 *  OTPassword.h
 *  
 */

/************************************************************
 -----BEGIN PGP SIGNED MESSAGE-----
 Hash: SHA256
 
 *                 OPEN TRANSACTIONS
 *
 *       Financial Cryptography and Digital Cash
 *       Library, Protocol, API, Server, and GUI 
 *    
 *    	 -- Anonymous Numbered Accounts.
 *    	 -- Untraceable Digital Cash.
 *    	 -- Triple-Signed Receipts.
 *    	 -- Cheques, Vouchers, Transfers, Inboxes.
 *    	 -- Basket Currencies, Markets, Payment Plans.
 *    	 -- Signed, XML, Ricardian-style Contracts.
 *    
 *  Copyright (C) 2010-2012 by "Fellow Traveler" (A pseudonym)
 *
 *  EMAIL:
 *  FellowTraveler@rayservers.net
 *  
 *  BITCOIN:  1NtTPVVjDsUfDWybS4BwvHpG2pdS9RnYyQ
 *
 *  KEY FINGERPRINT (PGP Key in license file):
 *  9DD5 90EB 9292 4B48 0484  7910 0308 00ED F951 BB8E
 *
 *  OFFICIAL PROJECT WIKI(s):
 *  https://github.com/FellowTraveler/Moneychanger
 *  https://github.com/FellowTraveler/Open-Transactions/wiki 
 *
 *  WEBSITE:
 *  http://www.OpenTransactions.org/
 *    
 *  Components and licensing:
 *   -- Moneychanger..A Java client GUI.....LICENSE:.....GPLv3
 *   -- OTLib.........A class library.......LICENSE:...LAGPLv3 
 *   -- OT-API........A client API..........LICENSE:...LAGPLv3
 *   -- testwallet....Command-line client...LICENSE:...LAGPLv3
 *   -- OT-Server.....Server Application....LICENSE:....AGPLv3
 *  Github.com/FellowTraveler/Open-Transactions/wiki/Components
 *
 *  All of the above OT components were designed and written by
 *  Fellow Traveler, with the exception of Moneychanger, which
 *  was contracted out to Vicky C (livewire_3001@yahoo.com).
 *
 *  -----------------------------------------------------
 *
 *   LICENSE:
 *   This program is free software: you can redistribute it
 *   and/or modify it under the terms of the GNU Affero
 *   General Public License as published by the Free Software
 *   Foundation, either version 3 of the License, or (at your
 *   option) any later version.
 *    
 *   ADDITIONAL PERMISSION under the GNU Affero GPL version 3
 *   section 7: (This paragraph applies only to the LAGPLv3
 *   components listed above.) If you modify this Program, or
 *   any covered work, by linking or combining it with other
 *   code, such other code is not for that reason alone subject
 *   to any of the requirements of the GNU Affero GPL version 3.
 *   (==> This means if you are only using the OT-API, then you
 *   don't have to open-source your code--only your changes to
 *   Open Transactions itself must be open source. Similar to
 *   LGPLv3, except it applies to software-as-a-service, not
 *   just to distributing binaries.)
 *
 *   Extra WAIVER for OpenSSL, Lucre, and all other libraries
 *   used by Open Transactions: This program is released under
 *   the AGPL with the additional exemption that compiling,
 *   linking, and/or using OpenSSL is allowed. The same is true
 *   for any other open source libraries included in this
 *   project: complete waiver from the AGPL is hereby granted to
 *   compile, link, and/or use them with Open Transactions,
 *   according to their own terms, as long as the rest of the
 *   Open Transactions terms remain respected, with regard to
 *   the Open Transactions code itself.
 *    
 *   Lucre License:
 *   This code is also "dual-license", meaning that Ben Lau-
 *   rie's license must also be included and respected, since
 *   the code for Lucre is also included with Open Transactions.
 *   See Open-Transactions/OTLib/Lucre/LUCRE_LICENSE.txt
 *   The Laurie requirements are light, but if there is any
 *   problem with his license, simply remove the Lucre code.
 *   Although there are no other blind token algorithms in Open
 *   Transactions (yet. credlib is coming), the other functions
 *   will continue to operate.
 *   -----------------------------------------------------
 *   You should have received a copy of the GNU Affero General
 *   Public License along with this program.  If not, see:
 *   http://www.gnu.org/licenses/
 *
 *   If you would like to use this software outside of the free
 *   software license, please contact FellowTraveler.
 *   (Unfortunately many will run anonymously and untraceably,
 *   so who could really stop them?)
 *   
 *   DISCLAIMER:
 *   This program is distributed in the hope that it will be
 *   useful, but WITHOUT ANY WARRANTY; without even the implied
 *   warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 *   PURPOSE.  See the GNU Affero General Public License for
 *   more details.
 -----BEGIN PGP SIGNATURE-----
 Version: GnuPG v1.4.11 (Darwin)
 
 iQIcBAEBCAAGBQJOjvvUAAoJEAMIAO35UbuOBlMP/1LX0xJ9CrTOe1G/mgc+VygT
 JPVZDAbQDL/lJXOZMbaPJ/GaLXyEnTViHp97ERrlVuBQz+9uonIKCmPqAGYGVBG1
 MGV2QcscXU2aOUT1VPf2OYEOIul0h8FX2lixfqouH9/OkVsGRLr79Zu8z3zdsO4R
 ktQtjZEU6lnL2t6cmp/cuXlQnbz1xvxd56xNDR11YP07Z4x+CuDB4EAK+P9TfCwn
 tqq5yJmxJM9HtMoi3cUU7kXodKm1n1YZt7O46DOxHqbXqErHChN1ekSK0fXad614
 Gmh+5JfvHjx5XoFWMxb46aAAcUiG8+QpFBcKtSYP2X96k1ylgxMCzrK60ec/MxKV
 BzvP00OJ6PzzrTlcUaCgJ8ZX+0scOMvW0XKioEorozKSWNFvT4Drc4Thhy8u9ET3
 ru1enNFrjdxKjw2+ZTQcKSZjSRx2kMQ2od/dkqUlhe/M1cHGhseH6ls7pItrkykE
 ufZ9GlZoxYE+FRatIBPneT9WwsvFFvH+i6cQ/MM9pbTr19g6VPzVZ4U9E65BbTDB
 czITynH+uMtJLbprtCdQlsI+vqTgYNoY8AUsmnr1qUkp020qGlvwfCJVrooisTmm
 yIh+Yp/KBzySU3inzclaAfv102/t5xi1l+GTyWHiwZxlyt5PBVglKWx/Ust9CIvN
 6h9BYZFTZrh/OwBXCdAv
 =MUfS
 -----END PGP SIGNATURE-----
 **************************************************************/

#ifndef __OT_PASSWORD_H__
#define __OT_PASSWORD_H__

/*
 To use:
 
 OTPassword thePass;
 (Or...)
 OTPassword thePass(strPassword, strPassword.length());
 
 const char * szPassword	= thePass.getPassword();
 const int    nPassLength	= thePass.getPasswordSize();
 
 If the instance of OTPassword is not going to be destroyed immediately
 after the password is used, then make sure to call zeroMemory() after
 using the password. (Otherwise the destructor will handle this anyway.)
 
 (The primary purpose of this class is that it zeros its memory out when
 it is destructed.)
 
 This class gives me a safe way to hand-off a password, and off-load the
 handling risk to the user.  This class will be included as part of the
 OT-API SWIG interface so that it's available inside other languages.
 
 */


#define OTPASSWORD_BLOCKSIZE    128		// (128 bytes max length for a password.)
#define OTPASSWORD_MEMSIZE		129		// +1 for null terminator.

// UPDATE: Increasing the size here, so we can accommodate private keys (in addition to passphrases.)
//
#define OT_LARGE_BLOCKSIZE	32767		// (32767 bytes max length for a password.)
#define OT_LARGE_MEMSIZE	32768		// +1 for null terminator.
// -------------------------------------------------------

// Default is the smaller size.

#define OT_DEFAULT_BLOCKSIZE  128
#define OT_DEFAULT_MEMSIZE    129

// -------------------------------------------


// TODO:  Although we have good memory ZEROING code (for destruction)
// we don't have code yet that will keep the contents SECURE while they
// are in memory. For example, that will prevent them from being paged 
// to the hard drive during swapping. Such code would make OTPassword much
// more appropriate for use cases such as storing passphrases and private
// keys, and would even allow timeout procedures...
//
// NOTE: For Windows, use VirtualLock instead of mlock.
//
/*
 #include <sys/mman.h>
 
 void *locking_alloc(size_t numbytes) 
 {
    static short have_warned = 0;
 
    void *mem = malloc(numbytes);
 
    if (mlock(mem, numbytes) && !have_warned)
    {
 
        // We probably do not have permission.
        // Sometimes, it might not be possible to lock enough memory.
 
        fprintf(stderr, "Warning: Using insecure memory!\n");

        have_warned = 1;

    }     

    return mem;
 }

The mlock() call generally locks more memory than you want. Locking is done on a per-page basis. All of the pages the memory spans will be locked in RAM, and will not be swapped out under any circumstances, until the process unlocks something in the same page by using mlock().

There are some potentially negative consequences here. First, If your process locks two buffers that happen to live on the same page, then unlocking either one will unlock the entire page, causing both buffers to unlock. Second, when locking lots of data, it is easy to lock more pages than necessary (the operating system doesn't move data around once it has been allocated), which can slow down machine performance significantly.

Unlocking a chunk of memory looks exactly the same as locking it, except that you call munlock():
        munlock(mem, numbytes);

 */

class OTPassword
{
public:
	enum BlockSize
		{
            DEFAULT_SIZE = OT_DEFAULT_BLOCKSIZE,  // (128 bytes max length for a password.)
            LARGER_SIZE  = OT_LARGE_BLOCKSIZE     // Update: now 32767 bytes if you use this size.
        }; 	

private:
	int		m_nPasswordSize; // [ 0..128 ]  Update: [ 0..9000 ]
//	char	m_szPassword[OT_DEFAULT_MEMSIZE]; // a 129-byte block of char. (128 + 1 for null terminator)
	char	m_szPassword[OT_LARGE_MEMSIZE];   // Update: now 32767 bytes. (32768 + 1 for null terminator) todo: in optimization phase, revisit this array size.

public:
	const
	BlockSize	blockSize;		
    // -----------------
	const
	char *	getPassword() const;
	int		setPassword(const char * szInput, int nInputSize); // (FYI, truncates if nInputSize larger than getBlockSize.)
    // -----------------
	int		getBlockSize()    const;
	int		getPasswordSize() const;
    // -----------------
	void	zeroMemory();
    // -----------------
	OTPassword(BlockSize theBlockSize=DEFAULT_SIZE);
	OTPassword(const char * szInput, int nInputSize, BlockSize theBlockSize=DEFAULT_SIZE);
    // -----------------
	~OTPassword();
};

#undef OTPASSWORD_BLOCKSIZE
#undef OTPASSWORD_MEMSIZE

#undef OT_LARGE_BLOCKSIZE
#undef OT_LARGE_MEMSIZE

#undef OT_DEFAULT_BLOCKSIZE
#undef OT_DEFAULT_MEMSIZE


// ---------------------------------------------------------
// Used for the password callback...

class OTCallback 
{
public:
	OTCallback() {}
	virtual ~OTCallback();
	virtual void runOne(const char * szDisplay, OTPassword & theOutput); // Asks for password once. (For authentication when using nym.)
	virtual void runTwo(const char * szDisplay, OTPassword & theOutput); // Asks for password twice. (For confirmation when changing password or creating nym.)
};

// ------------------------------------------------

class OTCaller 
{
protected:
	OTPassword	m_Password;	// The password will be stored here by the Java dialog, so that the C callback can retrieve it and pass it to OpenSSL
	OTPassword	m_Display;	// A display string is set here before the Java dialog is shown. (OTPassword used here only for convenience.)
	
	OTCallback * _callback;
	
public:
	OTCaller() : _callback(NULL) { }
	~OTCaller();
	
	bool	GetPassword(OTPassword & theOutput) const;	// Grab the password when it is needed.
	void	ZeroOutPassword();	// Then ZERO IT OUT so copies aren't floating around...
	
	const char * GetDisplay() const;
	void SetDisplay(const char * szDisplay, int nLength);
	
	void delCallback();
	void setCallback(OTCallback *cb);
	bool isCallbackSet() const;
	
	void callOne(); // Asks for password once. (For authentication when using the Nym's private key.)
	void callTwo(); // Asks for password twice. (For confirmation during nym creation and password change.)
};



// ------------------------------------------------







/*
 
 
 HOW TO PREVENT MEMORY FROM GOING INTO CORE DUMPS
 
 
#include <sys/time.h>

#include <sys/resource.h>

#include <unistd.h>



int  main(int argc, char **argv){

  struct rlimit rlim;



  getrlimit(RLIMIT_CORE, &rlim);

  rlim.rlim_max = rlim.rlim_cur = 0;

  if(setrlimit(RLIMIT_CORE, &rlim)) {

    exit(-1);

  }

  ...

  return 0;

}

 
 
 http://www.drdobbs.com/cpp/184401646
 
 
 
 
 MORE CODE FOR MEMLOCK:
 
 namespace Botan
 {
 
    bool has_mlock();
 
    bool lock_mem(void* addr, size_t length);
 
    void unlock_mem(void* addr, size_t length);
 }
 
 
//
// Memory Locking Functions
// (C) 1999-2007 Jack Lloyd
//
// Distributed under the terms of the Botan license
//

#include <botan/internal/mlock.h>

#if defined(BOTAN_TARGET_OS_HAS_POSIX_MLOCK)
  #include <sys/types.h>
  #include <sys/mman.h>
#elif defined(BOTAN_TARGET_OS_HAS_WIN32_VIRTUAL_LOCK)
  #include <windows.h>
#endif

namespace Botan {

bool has_mlock()
   {
   byte buf[4096];
   if(!lock_mem(&buf, sizeof(buf)))
      return false;
   unlock_mem(&buf, sizeof(buf));
   return true;
   }

//
// Lock an area of memory into RAM
//
bool lock_mem(void* ptr, size_t bytes)
   {
#if defined(BOTAN_TARGET_OS_HAS_POSIX_MLOCK)
   return (::mlock(static_cast<char*>(ptr), bytes) == 0);
#elif defined(BOTAN_TARGET_OS_HAS_WIN32_VIRTUAL_LOCK)
   return (::VirtualLock(ptr, bytes) != 0);
#else
   return false;
#endif
   }

//
// Unlock a previously locked region of memory
//
void unlock_mem(void* ptr, size_t bytes)
   {
#if defined(BOTAN_TARGET_OS_HAS_POSIX_MLOCK)
   ::munlock(static_cast<char*>(ptr), bytes);
#elif defined(BOTAN_TARGET_OS_HAS_WIN32_VIRTUAL_LOCK)
   ::VirtualUnlock(ptr, bytes);
#endif
   }

}
 
 */





















































// _____________________________________________________________

#endif //__OT_PASSWORD_H__







