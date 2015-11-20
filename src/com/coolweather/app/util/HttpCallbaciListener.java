package com.coolweather.app.util;

public interface HttpCallbaciListener {
	
	void onFinish(String response);
	
	void onError(Exception e);
	

}
