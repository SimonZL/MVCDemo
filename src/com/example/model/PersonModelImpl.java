package com.example.model;

import java.io.InputStream;
import com.example.bean.Person;
import com.example.http.onResult;
import com.example.http.onStringResult;

/**
 * M�㣺Model
 * @author Administrator
 *
 */
public class PersonModelImpl implements PersonModel{

	@Override
	public void getPerson(final int pId, final onPersonCompleteListener listener) {
		// �ɷ��������󣬴���ҵ���߼�
		get(new onStringResult() {
			
			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub
				// ������������
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
