package com.example.http;

import java.io.InputStream;

public abstract class onResult<T> {
	
    public abstract void onSuccess(T result);
    
    public abstract void onError();
    
    public abstract T parseResult(InputStream is);
}
