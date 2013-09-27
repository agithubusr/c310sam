package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface StockServiceAsync {
	void addStock(String symbol, AsyncCallback<Void> callback);
	void getStocks(AsyncCallback<String[]> callback);
	void removeStock(String symbol, AsyncCallback<Void> callback);
}
