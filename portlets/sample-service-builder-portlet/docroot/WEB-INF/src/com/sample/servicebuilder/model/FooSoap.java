/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.sample.servicebuilder.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <a href="FooSoap.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This class is used by
 * <code>com.sample.servicebuilder.service.http.FooServiceSoap</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 *
 * @see com.sample.servicebuilder.service.http.FooServiceSoap
 *
 */
public class FooSoap implements Serializable {
	public static FooSoap toSoapModel(Foo model) {
		FooSoap soapModel = new FooSoap();

		soapModel.setFooId(model.getFooId());
		soapModel.setField1(model.getField1());
		soapModel.setField2(model.getField2());
		soapModel.setField3(model.getField3());
		soapModel.setField4(model.getField4());
		soapModel.setField5(model.getField5());

		return soapModel;
	}

	public static FooSoap[] toSoapModels(List models) {
		List soapModels = new ArrayList(models.size());

		for (int i = 0; i < models.size(); i++) {
			Foo model = (Foo)models.get(i);

			soapModels.add(toSoapModel(model));
		}

		return (FooSoap[])soapModels.toArray(new FooSoap[0]);
	}

	public FooSoap() {
	}

	public long getPrimaryKey() {
		return _fooId;
	}

	public void setPrimaryKey(long pk) {
		setFooId(pk);
	}

	public long getFooId() {
		return _fooId;
	}

	public void setFooId(long fooId) {
		_fooId = fooId;
	}

	public String getField1() {
		return _field1;
	}

	public void setField1(String field1) {
		_field1 = field1;
	}

	public boolean getField2() {
		return _field2;
	}

	public boolean isField2() {
		return _field2;
	}

	public void setField2(boolean field2) {
		_field2 = field2;
	}

	public int getField3() {
		return _field3;
	}

	public void setField3(int field3) {
		_field3 = field3;
	}

	public Date getField4() {
		return _field4;
	}

	public void setField4(Date field4) {
		_field4 = field4;
	}

	public String getField5() {
		return _field5;
	}

	public void setField5(String field5) {
		_field5 = field5;
	}

	private long _fooId;
	private String _field1;
	private boolean _field2;
	private int _field3;
	private Date _field4;
	private String _field5;
}