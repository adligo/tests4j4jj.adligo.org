package org.adligo.tests4j4jj;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.adligo.i.tests4j.shared.I_CollectionAsserts;
import org.adligo.i.tests4j.shared.I_LegacyAsserts;
import org.adligo.i.tests4j.shared.I_ShortAsserts;
import org.adligo.mockito_ext.MockitoMixin;
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
public class AbstractJjTrial implements MockitoMixin, 
I_CollectionAsserts, I_LegacyAsserts, I_ShortAsserts {

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
  public <O> O contains(Collection<O> collection, O actual) {
    isTrue(collection.contains(actual));
    return actual;
  }

  @Override
  public <O> O contains(String message, Collection<O> collection, O actual) {
    isTrue(message, collection.contains(actual));
    return actual;
  }

  @Override
  public <O, V> O containsKey(Map<O, V> map, O actual) {
    isTrue(map.containsKey(actual));
    return actual;
  }

  @Override
  public <O, V> O containsKey(String message, Map<O, V> map, O actual) {
    isTrue(message, map.containsKey(actual));
    return actual;
  }

  @Override
  public <K, O> O containsValue(Map<K, O> map, O actual) {
    isTrue(map.containsValue(actual));
    return actual;
  }

  @Override
  public <K, O> O containsValue(String message, Map<K, O> map, O actual) {
    isTrue(message, map.containsValue(actual));
    return actual;
  }

  @Override
  public <O> O equals(Object expected, O actual) {
    assertEquals(expected, actual);
    return actual;
  }

  @Override
  public <O> O equals(String message, Object expected, O actual) {
    assertEquals(message, expected, actual);
    return actual;
  }

  @Override
  public String equals(String expected, String actual) {
    assertEquals(expected, actual);
    return actual;
  }

  @Override
  public String equals(String message, String expected, String actual) {
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
  public <O> O notNull(O actual) {
    assertNotNull(actual);
    return actual;
  }

  @Override
  public <O> O notNull(String message, O actual) {
    assertNotNull(actual, message);
    return actual;
  }

  @Override
  public <O> O notEquals(Object expected, O actual) {
    assertNotEquals( expected, actual);
    return actual;
  }

  @Override
  public <O> O notEquals(String message, Object expected, O actual) {
    assertNotEquals(message, expected, actual);
    return actual;
  }

  @Override
  public String notEquals(String expected, String actual) {
    assertNotEquals( expected, actual);
    return actual;
  }

  @Override
  public String notEquals(String message, String expected, String actual) {
    assertNotEquals(message,  expected, actual);
    return actual;
  }

  @Override
  public <O> O  notSame(Object expected, O actual) {
    assertNotSame( expected, actual);
    return actual;
  }

  @Override
  public <O> O  notSame(String message, Object expected, O actual) {
    assertNotSame(message,  expected, actual);
    return actual;
  }

  @Override
  public <O> O  same(Object expected, O actual) {
    assertSame( expected, actual);
    return actual;
  }

  @Override
  public <O> O same(String message, Object expected, O actual) {
    assertSame(message,  expected, actual);
    return actual;
  }

  @Override
  public void thrown(List<Throwable> expected, Runnable runnable) {
    thrown(true, expected, runnable);
  }

  @Override
  public void thrown(String message, List<Throwable> expected, Runnable runnable) {
    thrown(true, message, expected, runnable);
  }
  
  /**
   * @param check added only to get code coverage to 100%
   * @param expected
   * @param runnable
   */
  protected void thrown(boolean check, List<Throwable> expected, Runnable runnable) {
    Throwable caught = null;
    try {
      runnable.run();
    } catch (Throwable t) {
      caught = t;
    }
    if (check) {
      notNull(caught);
      for (Throwable t : expected) {
        same(t.getClass(), caught.getClass());
        equals(t.getMessage(), caught.getMessage());
        caught = caught.getCause();
      }
    }
  }

  /**
   * 
   * @param check added only to get code coverage to 100%
   * @param message
   * @param expected
   * @param runnable
   */
  protected void thrown(boolean check, String message, List<Throwable> expected, Runnable runnable) {
    Throwable caught = null;
    try {
      runnable.run();
    } catch (Throwable t) {
      caught = t;
    }
    if (check) {
      notNull(message, caught);
      for (Throwable t : expected) {
        same(message, t.getClass(), caught.getClass());
        equals(message, t.getMessage(), caught.getMessage());
        caught = caught.getCause();
      }
    }
  }

  @Override
  public <O> O notContains(Collection<O> collection, O actual) {
    isFalse(collection.contains(actual));
    return actual;
  }

  @Override
  public <O> O notContains(String message, Collection<O> collection, O actual) {
    isFalse(message, collection.contains(actual));
    return actual;
  }

  @Override
  public <O, V> O notContainsKey(Map<O, V> map, O actual) {
    isFalse(map.containsKey(actual));
    return actual;
  }

  @Override
  public <O, V> O notContainsKey(String message, Map<O, V> map, O actual) {
    isFalse(message, map.containsKey(actual));
    return actual;
  }

  @Override
  public <K, O> O notContainsValue(Map<K, O> map, O actual) {
    isFalse(map.containsValue(actual));
    return actual;
  }

  @Override
  public <K, O> O notContainsValue(String message, Map<K, O> map, O actual) {
    isFalse(message, map.containsValue(actual));
    return actual;
  }
}
