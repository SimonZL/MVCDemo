package com.example.model;

import com.example.bean.Person;

public interface onPersonCompleteListener {
	
      public void onSuccess(Person person);
      
      public void onError();
}
