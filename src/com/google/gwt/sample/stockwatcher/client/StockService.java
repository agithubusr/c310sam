package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("stock")
public interface StockService extends RemoteService {
  public void addStock(String symbol) throws NotLoggedInException;
  public void removeStock(String symbol) throws NotLoggedInException;
  public String[] getStocks() throws NotLoggedInException;
}
