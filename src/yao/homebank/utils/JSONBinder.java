package yao.homebank.utils;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.codehaus.jackson.type.TypeReference;

/**
 * JSON工具
 * @author zhengzhongcheng
 *
 */
public class JSONBinder {

	private static Log log = LogFactory.getLog(JSONBinder.class);
	private ObjectMapper mapper;
	
	@SuppressWarnings("deprecation")
	public JSONBinder(Inclusion inclusion) {
		mapper = new ObjectMapper();
		//设置输出包含的属性
		mapper.getSerializationConfig().setSerializationInclusion(inclusion);
		//设置输入时忽略Json字符串中存在而Java对象实际没有的属性
		mapper.getDeserializationConfig()
		.set(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,
				false);
	}
	
	/**
	 * 创建输出全部属性到Json字符串的Binder
	 */
	public static JSONBinder buildNormalBinder() {
		return new JSONBinder(Inclusion.ALWAYS);
	}
	
	/**
	 * 创建只输出非空属性到Json字符串的Binder.
	 */
	public static JSONBinder buildNonNullBinder() {
		return new JSONBinder(Inclusion.NON_NULL);
	}

	/**
	 * 创建只输出初始�?被改变的属�?到Json字符串的Binder.
	 */
	public static JSONBinder buildNonDefaultBinder() {
		return new JSONBinder(Inclusion.NON_DEFAULT);
	}


	public <T> T fromJson(String jsonString, Class<T> clazz) {
		if (StringUtil.isEmpty(jsonString)) {
			return null;
		}

		try {
			return mapper.readValue(jsonString, clazz);
		} catch (IOException e) {

			e.printStackTrace();
			return null;
		}
	}

	public <T, K> Map<T, K> fromJson(String jsonString) {
		if (StringUtil.isEmpty(jsonString)) {
			return null;
		}

		try {
			return mapper.readValue(jsonString, new TypeReference<Map<T, K>>() {
			});
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}


	

	public List<Map<String, String>> fromJsonListMap(String jsonString) {
		if (StringUtil.isEmpty(jsonString)) {
			return null;
		}

		try {
			return mapper.readValue(jsonString,
					new TypeReference<List<Map<String, String>>>() {
					});
			// return mapper.readValue(jsonString, clazz);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}



	public <T> List<T> fromJsonList(String jsonString) {
		if (StringUtil.isEmpty(jsonString)) {
			return null;
		}
		try {
			return mapper.readValue(jsonString, new TypeReference<List<T>>() {
			});
			// return mapper.readValue(jsonString, clazz);
		} catch (IOException e) {
			// LOG.warn("parse json string error:" + jsonString, e);
			return null;
		}
	}

	/**
	 * 如果对象为Null,返回"null". 如果集合为空集合,返回"[]".
	 */
	public String toJson(Object object) {

		try {
			return mapper.writeValueAsString(object);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 设置转换日期类型的format pattern,如果不设置默认打印Timestamp毫秒
	 */
	@SuppressWarnings("deprecation")
	public void setDateFormat(String pattern) {

		DateFormat df = new SimpleDateFormat(pattern);
		mapper.getSerializationConfig().setDateFormat(df);
		mapper.getDeserializationConfig().setDateFormat(df);

	}

	public ObjectMapper getMapper() {
		return mapper;
	}
}














