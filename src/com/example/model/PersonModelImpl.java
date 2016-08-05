package com.example.model;

import java.io.InputStream;
import com.example.bean.Person;
import com.example.http.onResult;
import com.example.http.onStringResult;

/**
 * M层：Model
 * @author Administrator
 *
 */
public class PersonModelImpl implements PersonModel{

	@Override
	public void getPerson(final int pId, final onPersonCompleteListener listener) {
		// 可放网络请求，处理业务逻辑
		get(new onStringResult() {
			
			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub
				// 解析返回数据
				Person person = new Person();
				person.setPid(pId);
				person.setName("abc");
				listener.onSuccess(person);
			}
			
			@Override
			public void onError() {
				// TODO Auto-generated method stub
				listener.onError();
			}
		});
	}
	
	private void get(onResult result){
		InputStream is = null;
		result.onSuccess(result.parseResult(is));
	}
}
