package cn.baiing.Utils;

import org.apache.poi.ss.formula.functions.T;

public class AjaxResponseModel<T> {
	private boolean success = true;
	private String message;
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AjaxResponseModel [success=");
		builder.append(success);
		builder.append(", message=");
		builder.append(message);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}
}
