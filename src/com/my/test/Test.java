package com.my.test;

import java.util.Objects;

public class Test {
	private String field1;
	private String field2;
	private String field3;
	private String field4;
	private String field5;
	private String field6;
	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public Test(String field1, String field2, String field3, String field4, String field5, String field6) {
		super();
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
		this.field4 = field4;
		this.field5 = field5;
		this.field6 = field6;
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public String getField4() {
		return field4;
	}

	public void setField4(String field4) {
		this.field4 = field4;
	}

	public String getField5() {
		return field5;
	}

	public void setField5(String field5) {
		this.field5 = field5;
	}

	public String getField6() {
		return field6;
	}

	public void setField6(String field6) {
		this.field6 = field6;
	}

	@Override
	public int hashCode() {
		return Objects.hash(field1, field2, field3, field4, field5, field6);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		return Objects.equals(field1, other.field1) && Objects.equals(field2, other.field2)
				&& Objects.equals(field3, other.field3) && Objects.equals(field4, other.field4)
				&& Objects.equals(field5, other.field5) && Objects.equals(field6, other.field6);
	}
	
	
}
