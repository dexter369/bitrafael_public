/*************************************************************************************
 * Copyright (C) 2014-2016 GENERAL BYTES s.r.o. All rights reserved.
 *
 * This software may be distributed and modified under the terms of the GNU
 * General Public License version 2 (GPL2) as published by the Free Software
 * Foundation and appearing in the file GPL2.TXT included in the packaging of
 * this file. Please note that GPL2 Section 2[b] requires that all works based
 * on this software must also be made publicly available under the terms of
 * the GPL2 ("Copyleft").
 *
 * Contact information
 * -------------------
 *
 * GENERAL BYTES s.r.o.
 * Web      :  http://www.generalbytes.com
 *
 ************************************************************************************/
package com.generalbytes.colorledger;


import java.util.List;

public interface IColorLedger {
    boolean addEmitter(String color,String address);
    boolean removeEmitter(String color,String address);

    Transaction getTransaction(String txHash);
    List<Transaction> getTransactions(String address, String coinColor);

    boolean transferCoins(Transaction tx); //new coins are issued by this from emitter's address
    long getBalance(String address, String coinColor);

    Page createNewPage(Key minerKey, long timestamp);
    Page getPage(String pageHash);
    Page getGenesisPage();
    Page getPageByTransaction(String txHash);

}
