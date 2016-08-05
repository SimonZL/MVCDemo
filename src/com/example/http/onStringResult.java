package com.example.http;

import java.io.IOException;
import java.io.InputStream;

public abstract class onStringResult extends onResult<String> {

	@Override
	public String parseResult(InputStream is) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		if (is != null) {
			byte[] by = new byte[1024];
			try {
				int n;
				while ((n = is.read(by)) != -1) {
					sb.append(new String(by, 0, n));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				is = null;
			}
		}
		return sb.toString();
	}
}
