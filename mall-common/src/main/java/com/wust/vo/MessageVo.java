package com.wust.vo;

public class MessageVo {
	private String code;
	private String info;
	private String debug;
	private Object data;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getDebug() {
		return debug;
	}

	public void setDebug(String debug) {
		this.debug = debug;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "MessageVo{" +
				"code='" + code + '\'' +
				", info='" + info + '\'' +
				", debug='" + debug + '\'' +
				", data=" + data +
				'}';
	}
}
