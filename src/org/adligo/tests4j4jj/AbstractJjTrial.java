package org.adligo.tests4j4jj;

import org.adligo.i.tests4j.shared.I_LegacyAsserts;
import org.adligo.i.tests4j.shared.I_ShortAsserts;
import org.adligo.mockito_ext.DefaultMockitoCtx;
import org.junit.jupiter.api.Assertions;

/**
 * This is the root Adaptor for a migration path from JUnit to Tests4j,
 * in addition it provides pre imported assertion methods, 
 * and shortened assertion methods.  In addition it standardizes the order
 * of the assertion parameters to;<br/><br/>
 * Assertion Message<br/>
 * Expected Value<br/>
 * Actual Value<br/>
 * <br/>
 * Eventually it may provide SOME of the Tests4j features like assertion counts,
 * however I doubt it will ever provide dependency graph assertions like Tests4j's
 * SoucreFileTrials do or isolated assertion of concurrent of code coverage;
 * {@link <a href="https://github.com/adligo/tests4j.adligo.org">tests4j.adligo.org</a>}
 * In addition Tests4j MAY have many other interesting and useful features.
 * 
 * @author scott
 *
 * <pre><code>
 *         ---------------- Apache ICENSE-2.0 --------------------------
 *
 *         Copyright 2022 Adligo Inc
 * 
 *         Licensed under the Apache License, Version 2.0 (the "License"); you
 *         may not use this file except in compliance with the License. You may
 *         obtain a copy of the License at
 * 
 *         http://www.apache.org/licenses/LICENSE-2.0
 * 
 *         Unless required by applicable law or agreed to in writing, software
 *         distributed under the License is distributed on an "AS IS" BASIS,
 *         WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *         implied. See the License for the specific language governing
 *         permissions and limitations under the License.
 *         </code></pre>
 */
public class AbstractJjTrial implements DefaultMockitoCtx, I_LegacyAsserts, I_ShortAsserts {

  @Override
  public void assertEquals(Object expected, Object actual) {
    Assertions.assertEquals(expected, actual);
  }

  @Override
  public void assertEquals(String message, Object expected, Object actual) {
    Assertions.assertEquals(expected, actual, message);
  }

  @Override
  public void assertEquals(Object expected, Object actual, String message) {
    Assertions.assertEquals(expected, actual, message);
  }

  @Override
  public void assertEquals(String expected, String actual) {
    Assertions.assertEquals(expected, actual);
  }

  @Override
  public void assertEquals(String message, String expected, String actual) {
    Assertions.assertEquals(expected, actual, message);
  }

  @Override
  public void assertFalse(boolean actual) {
    Assertions.assertFalse(actual);
  }

  @Override
  public void assertFalse(String message, boolean actual) {
    Assertions.assertFalse(actual, message);
  }

  @Override
  public void assertFalse(boolean actual, String message) {
    Assertions.assertFalse(actual, message);
  }

  @Override
  public void assertNull(Object actual) {
    Assertions.assertNull(actual);
  }

  @Override
  public void assertNull(Object actual, String message) {
    Assertions.assertNull(actual, message);
  }
  
  @Override
  public void assertNotNull(Object actual) {
    Assertions.assertNotNull(actual);
  }

  @Override
  public void assertNotNull(Object actual, String message) {
    Assertions.assertNotNull(actual, message);
  }
  
  @Override
  public void assertNotEquals(Object expected, Object actual) {
    Assertions.assertNotEquals(expected, actual);
  }

  @Override
  public void assertNotEquals(Object expected, Object actual, String message) {
    Assertions.assertNotEquals(expected, actual, message);
  }
  
  @Override
  public void assertNotEquals(String message, Object expected, Object actual) {
    Assertions.assertNotEquals(expected, actual, message);
  }

  @Override
  public void assertNotEquals(String expected, String actual) {
    Assertions.assertNotEquals(expected, actual);
  }

  @Override
  public void assertNotEquals(String message, String expected, String actual) {
    Assertions.assertNotEquals(message, expected, actual);
  }

  @Override
  public void assertNotSame(Object expected, Object actual) {
    Assertions.assertNotSame(expected, actual);
  }

  @Override
  public void assertNotSame(String message, Object expected, Object actual) {
    Assertions.assertNotSame(expected, actual, message);
  }

  @Override
  public void assertNotSame(Object expected, Object actual, String message) {
    Assertions.assertNotSame(expected, actual, message);
  }
  
  @Override
  public void assertSame(Object expected, Object actual) {
    Assertions.assertSame(expected, actual);
  }

  @Override
  public void assertSame(Object expected, Object actual, String message) {
    Assertions.assertSame(expected, actual, message);
  }

  @Override
  public void assertSame(String message, Object expected, Object actual) {
    Assertions.assertSame(expected, actual, message);
  }

  @Override
  public void assertTrue(boolean actual) {
    Assertions.assertTrue(actual);
  }

  @Override
  public void assertTrue(String message, boolean actual) {
    Assertions.assertTrue(actual, message);
  }

  @Override
  public void assertTrue(boolean actual, String message) {
    Assertions.assertTrue(actual, message);
  }

  @Override
  public Object equals(Object expected, Object actual) {
    assertEquals(expected, actual);
    return actual;
  }

  @Override
  public Object equals(String message, Object expected, Object actual) {
    assertEquals(message, expected, actual);
    return actual;
  }

  @Override
  public Object equals(String expected, String actual) {
    assertEquals(expected, actual);
    return actual;
  }

  @Override
  public Object equals(String message, String expected, String actual) {
    assertEquals(message, expected, actual);
    return actual;
  }

  @Override
  public void isFalse(boolean actual) {
    assertFalse(actual);
  }

  @Override
  public void isFalse(String message, boolean actual) {
    assertFalse(message, actual);
  }

  @Override
  public void isNull(Object actual) {
    assertNull(actual);
  }

  @Override
  public void isNull(String message, Object actual) {
    assertNull(actual, message);
  }

  @Override
  public void isTrue(boolean actual) {
    assertTrue( actual);
  }

  @Override
  public void isTrue(String message, boolean actual) {
    assertTrue(message, actual);
  }

  @Override
  public Object notNull(Object actual) {
    assertNotNull(actual);
    return actual;
  }

  @Override
  public Object notNull(String message, Object actual) {
    assertNotNull(actual, message);
    return actual;
  }

  @Override
  public Object notEquals(Object expected, Object actual) {
    assertNotEquals( expected, actual);
    return actual;
  }

  @Override
  public Object notEquals(String message, Object expected, Object actual) {
    assertNotEquals(message, expected, actual);
    return actual;
  }

  @Override
  public Object notEquals(String expected, String actual) {
    assertNotEquals( expected, actual);
    return actual;
  }

  @Override
  public Object notEquals(String message, String expected, String actual) {
    assertNotEquals(message,  expected, actual);
    return actual;
  }

  @Override
  public void notSame(Object expected, Object actual) {
    assertNotSame( expected, actual);
  }

  @Override
  public Object notSame(String message, Object expected, Object actual) {
    assertNotSame(message,  expected, actual);
    return actual;
  }

  @Override
  public Object same(Object expected, Object actual) {
    assertSame( expected, actual);
    return actual;
  }

  @Override
  public Object same(String message, Object expected, Object actual) {
    assertSame(message,  expected, actual);
    return actual;
  }
}
