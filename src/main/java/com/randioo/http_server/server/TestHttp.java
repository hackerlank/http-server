package com.randioo.http_server.server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.randioo.http_server.utils.HttpUtils;

public class TestHttp {
	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<>();
		map.put("test", new ArrayList<String>(1));
		map.get("test").add("wcy");
		map.get("test").add("wcy");
		map.get("test").add("wcy");
        map.clear();
		try {
			String resp = HttpUtils.get("http://localhost:20006/majiang", map);
			System.out.println(resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
