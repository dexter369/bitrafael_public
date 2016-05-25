Bitrafael Public Repository
===========

This repository contains public part of Bitrafael related code used in GENERAL BYTES products.
More information about the products can be found here: http://www.generalbytes.com

All source code here is released under GPL2.

Overview
========
Every commercial-grade bitcoin project needs a way how to retreive and send information from blockchain as quickly as possible.

Bitrafael is a server-side bitcoin blockchain information silo provider that provides JAVA or JSON API to communicate with blockchain.


Content
=======
* **client** - contains client code and examples that can be used to communicate with Bitrafael server.
* **common** - contains data transfer and API objects shared by server and client

Notes
==========
* Example use of <a href="https://github.com/GENERALBYTESCOM/bitrafael_public/blob/master/bitrafael_client/src/com/generalbytes/bitrafael/api/client/BitRafaelBTCClient.java">BitRafaelBTCClient</a> is in <a href="https://github.com/GENERALBYTESCOM/bitrafael_public/blob/master/bitrafael_client/src/com/generalbytes/bitrafael/api/client/ClientExample.java">ClientExample.java</a>.
* The easiest way how to interface with API is to use <a href="https://github.com/GENERALBYTESCOM/bitrafael_public/blob/master/bitrafael_client/src/com/generalbytes/bitrafael/api/client/BitRafaelBTCClient.java">BitRafaelBTCClient</a>.
* Which API functions Bitrafael Server exposes can be read in <a href="https://github.com/GENERALBYTESCOM/bitrafael_public/blob/master/bitrafael_common/src/com/generalbytes/bitrafael/api/IBitRafaelBitcoinAPI.java">IBitRafaelBitcoinAPI</a> interface.
* There is also BIP32,29,44 compatible WalletTools utility class that simplifies work with deterministic wallets <a href="https://github.com/GENERALBYTESCOM/bitrafael_public/blob/master/bitrafael_client/src/com/generalbytes/bitrafael/api/wallet/BitRafaelWalletTools.java">BitRafaelWalletTools</a>.




Android
=======
If you want to use this project on Android OS mare sure you:
* 1. Use in your Android project <a href="https://github.com/GENERALBYTESCOM/bitrafael_public/tree/master/bitrafael_client/libs_android">different</a> bitcoinj libraries.
* 2. Add <a href="https://github.com/GENERALBYTESCOM/bitrafael_public/tree/master/bitrafael_common/src_android">following</a> sources to your Android project.

Build information
=================
Just run the following command:
```bash
ant
```
