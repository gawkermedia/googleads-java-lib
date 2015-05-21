// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.dfp.axis.utils.v201403;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.google.api.ads.dfp.axis.v201403.BooleanValue;
import com.google.api.ads.dfp.axis.v201403.ColumnType;
import com.google.api.ads.dfp.axis.v201403.Date;
import com.google.api.ads.dfp.axis.v201403.DateTime;
import com.google.api.ads.dfp.axis.v201403.DateTimeValue;
import com.google.api.ads.dfp.axis.v201403.DateValue;
import com.google.api.ads.dfp.axis.v201403.NumberValue;
import com.google.api.ads.dfp.axis.v201403.ResultSet;
import com.google.api.ads.dfp.axis.v201403.Row;
import com.google.api.ads.dfp.axis.v201403.TextValue;
import com.google.api.ads.dfp.axis.v201403.Value;
import com.google.common.collect.Lists;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Test for {@link Pql}.
 *
 * @author Adam Rogal
 */
@RunWith(JUnit4.class)
public class PqlTest {

  private static final String TIME_ZONE_ID1 = "Asia/Shanghai";

  private ColumnType column1;
  private ColumnType column2;
  private ColumnType column3;

  private TextValue textValue1;
  private TextValue textValue2;
  private TextValue textValue3;
  private BooleanValue booleanValue1;
  private BooleanValue booleanValue2;
  private BooleanValue booleanValue3;
  private NumberValue numberValue1;
  private NumberValue numberValue2;
  private NumberValue numberValue3;
  private NumberValue numberValue4;
  private NumberValue numberValue5;
  private DateValue dateValue1;
  private DateTimeValue dateTimeValue1;

  private DateTime dateTime1;
  private Date date1;

  @Rule
  public ExpectedException thrown = ExpectedException.none();
  
  public PqlTest() {}

  @Before
  public void setUp() throws Exception {
    column1 = new ColumnType();
    column1.setLabelName("column1");

    column2 = new ColumnType();
    column2.setLabelName("column2");

    column3 = new ColumnType();
    column3.setLabelName("column3");

    textValue1 = new TextValue();
    textValue1.setValue("value1");

    textValue2 = new TextValue();
    textValue2.setValue("value2");

    textValue3 = new TextValue();
    textValue3.setValue("value3");

    booleanValue1 = new BooleanValue();
    booleanValue1.setValue(false);

    booleanValue2 = new BooleanValue();
    booleanValue2.setValue(true);

    booleanValue3 = new BooleanValue();
    booleanValue3.setValue(false);

    numberValue1 = new NumberValue();
    numberValue1.setValue("1");

    numberValue2 = new NumberValue();
    numberValue2.setValue("1.02");

    numberValue3 = new NumberValue();
    numberValue3.setValue("-1");
    
    numberValue4 = new NumberValue();
    numberValue4.setValue("");
    
    numberValue5 = new NumberValue();
    numberValue5.setValue(null);

    dateTime1 = new DateTime();
    date1 = new Date();
    date1.setYear(2012);
    date1.setMonth(12);
    date1.setDay(2);
    dateTime1.setDate(date1);
    dateTime1.setHour(12);
    dateTime1.setMinute(45);
    dateTime1.setSecond(0);
    dateTime1.setTimeZoneID(TIME_ZONE_ID1);

    dateTimeValue1 = new DateTimeValue();
    dateTimeValue1.setValue(dateTime1);

    dateValue1 = new DateValue();
    dateValue1.setValue(date1);
  }

  @Test
  public void testToString() {
    assertEquals("value1", Pql.toString(textValue1));
    assertEquals("false", Pql.toString(booleanValue1));
    assertEquals("1", Pql.toString(numberValue1));
    assertEquals("2012-12-02T12:45:00+08:00", Pql.toString(dateTimeValue1));
    assertEquals("2012-12-02", Pql.toString(dateValue1));
  }
  
  @Test
  public void testToString_null() {
    assertEquals("", Pql.toString(new TextValue()));
    assertEquals("", Pql.toString(new BooleanValue()));
    assertEquals("", Pql.toString(new NumberValue()));
    assertEquals("", Pql.toString(new DateTimeValue()));
    assertEquals("", Pql.toString(new DateValue()));
  }

  @Test
  public void testToString_invalidValue() {
    thrown.expect(IllegalArgumentException.class);
    Pql.toString(new MyValue());
  }
  
  @Test
  public void testGetApiValue() {
    assertEquals("value1", Pql.getApiValue(textValue1));
    assertEquals(false, Pql.getApiValue(booleanValue1));
    assertEquals(1L, Pql.getApiValue(numberValue1));
    assertEquals(1.02, Pql.getApiValue(numberValue2));
    assertEquals(-1L, Pql.getApiValue(numberValue3));
    assertEquals(null, Pql.getApiValue(numberValue4));
    assertEquals(null, Pql.getApiValue(numberValue5));
    assertEquals(dateTime1, Pql.getApiValue(dateTimeValue1));
    assertEquals(date1, Pql.getApiValue(dateValue1));
    assertNull(Pql.getApiValue(new TextValue()));
  }
  
  @Test
  public void testGetNativeValue() {
    assertEquals("value1", Pql.getNativeValue(textValue1));
    assertEquals(false, Pql.getNativeValue(booleanValue1));
    assertEquals(1L, Pql.getNativeValue(numberValue1));
    assertEquals(1.02, Pql.getNativeValue(numberValue2));
    assertEquals(-1L, Pql.getNativeValue(numberValue3));
    assertEquals(null, Pql.getNativeValue(numberValue4));
    assertEquals(null, Pql.getNativeValue(numberValue5));
    assertEquals(DateTimes.toDateTime(dateTimeValue1.getValue()),
        Pql.getNativeValue(dateTimeValue1));
    assertEquals("2012-12-02", Pql.getNativeValue(dateValue1));
  }

  @Test
  public void testCreateValue() {
    assertEquals("value1", ((TextValue) Pql.createValue("value1")).getValue());
    assertEquals(false, ((BooleanValue) Pql.createValue(false)).getValue());
    assertEquals("1", ((NumberValue) Pql.createValue(1)).getValue());
    assertEquals("1", ((NumberValue) Pql.createValue(1L)).getValue());
    assertEquals("1.02", ((NumberValue) Pql.createValue(1.02)).getValue());
    assertEquals("2012-12-02T12:45:00+08:00",
        DateTimes.toStringWithTimeZone(((DateTimeValue) Pql.createValue(dateTime1)).getValue()));
    assertEquals("2012-12-02",
        DateTimes.toString(((DateValue) Pql.createValue(dateTime1.getDate())).getValue()));
  }

  @Test
  public void testCreateValue_invalidType() {
    thrown.expect(IllegalArgumentException.class);
    Pql.createValue(new MyObject());
  }

  @Test
  public void testCreateValue_null() {
    assertEquals(null, ((TextValue) Pql.createValue(null)).getValue());
  }

  @Test
  public void testGetColumnLabels() {
    ResultSet resultSet = new ResultSet();
    resultSet.setColumnTypes(new ColumnType[] {column1, column2, column3});
    assertEquals(Lists.newArrayList(new String[] {"column1", "column2", "column3"}),
        Pql.getColumnLabels(resultSet));
  }

  @Test
  public void testGetRowStringValues() {
    Row row = new Row();
    row.setValues(new Value[] {textValue1, booleanValue1, numberValue2});
    assertEquals(
        Lists.newArrayList(new String[] {"value1", "false", "1.02"}), Pql.getRowStringValues(row));
  }

  @Test
  public void testCombineResultSet() {
    Row row1 = new Row();
    row1.setValues(new Value[] {textValue1, booleanValue1, numberValue1});

    Row row2 = new Row();
    row2.setValues(new Value[] {textValue2, booleanValue2, numberValue2});

    Row row3 = new Row();
    row3.setValues(new Value[] {textValue3, booleanValue3, numberValue3});

    ResultSet resultSet1 = new ResultSet();
    resultSet1.setColumnTypes(new ColumnType[] {column1, column2, column3});
    resultSet1.setRows(new Row[] {row1, row2});

    ResultSet resultSet2 = new ResultSet();
    resultSet2.setColumnTypes(new ColumnType[] {column1, column2, column3});
    resultSet2.setRows(new Row[] {row3});

    ResultSet combinedResultSet = Pql.combineResultSets(resultSet1, resultSet2);

    assertEquals(3, combinedResultSet.getRows().length);
    assertArrayEquals(
        new ColumnType[] {column1, column2, column3}, combinedResultSet.getColumnTypes());
    assertArrayEquals(new Value[] {textValue1, booleanValue1, numberValue1},
        combinedResultSet.getRows()[0].getValues());
    assertArrayEquals(new Value[] {textValue2, booleanValue2, numberValue2},
        combinedResultSet.getRows()[1].getValues());
    assertArrayEquals(new Value[] {textValue3, booleanValue3, numberValue3},
        combinedResultSet.getRows()[2].getValues());
  }

  @Test
  public void testCombineResultSet_badColumns() {
    Row row1 = new Row();
    row1.setValues(new Value[] {textValue1, booleanValue1, numberValue1});

    Row row2 = new Row();
    row2.setValues(new Value[] {textValue2, booleanValue2, numberValue2});

    Row row3 = new Row();
    row3.setValues(new Value[] {textValue3, booleanValue3});

    ResultSet resultSet1 = new ResultSet();
    resultSet1.setColumnTypes(new ColumnType[] {column1, column2, column3});
    resultSet1.setRows(new Row[] {row1, row2});

    ResultSet resultSet2 = new ResultSet();
    resultSet2.setColumnTypes(new ColumnType[] {column1, column2});
    resultSet2.setRows(new Row[] {row3});

    thrown.expect(IllegalArgumentException.class);
    Pql.combineResultSets(resultSet1, resultSet2);
  }

  private static class MyValue extends Value {}
  private static class MyObject extends Object {}
}
