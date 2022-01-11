package org.adligo.tests4j4jj;

import org.adligo.i.tests4j.shared.I_LegacyAsserts;
import org.adligo.i.tests4j.shared.I_ShortAsserts;
import org.adligo.mockito_ext.DefaultMockitoCtx;
import org.junit.jupiter.api.Assertions;

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
    Assertions.assertEquals(message, expected, actual);
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
  public void assertNull(String message, Object actual) {
    Assertions.assertNull(actual, message);
  }

  @Override
  public void assertNull(Object actual, String message) {
    Assertions.assertNull(actual, message);
  }
  
  @Override
  public void assertNotNull(Object actual) {
    Assertions.assertNull(actual);
  }

  @Override
  public void assertNotNull(String message, Object actual) {
    Assertions.assertNull(actual, message);
  }

  @Override
  public void assertNotNull(Object actual, String message) {
    Assertions.assertNull(actual, message);
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
    throw new IllegalStateException("Method not yet implemented");

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
  public void equals(Object expected, Object actual) {
    assertEquals(expected, actual);
  }

  @Override
  public void equals(String message, Object expected, Object actual) {
    assertEquals(message, expected, actual);
  }

  @Override
  public void equals(String expected, String actual) {
    assertEquals(expected, actual);
  }

  @Override
  public void equals(String message, String expected, String actual) {
    assertEquals(message, expected, actual);
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
    assertNull(message, actual);
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
  public void notNull(Object actual) {
    assertNotNull(actual);
  }

  @Override
  public void notNull(String message, Object actual) {
    assertNotNull( message, actual);
  }

  @Override
  public void notEquals(Object expected, Object actual) {
    assertNotEquals( expected, actual);
  }

  @Override
  public void notEquals(String message, Object expected, Object actual) {
    assertNotEquals(message, expected, actual);
  }

  @Override
  public void notEquals(String expected, String actual) {
    assertNotEquals( expected, actual);
  }

  @Override
  public void notEquals(String message, String expected, String actual) {
    assertNotEquals(message,  expected, actual);
  }

  @Override
  public void notSame(Object expected, Object actual) {
    assertNotSame( expected, actual);
  }

  @Override
  public void notSame(String message, Object expected, Object actual) {
    assertNotSame(message,  expected, actual);
  }

  @Override
  public void same(Object expected, Object actual) {
    assertSame( expected, actual);
  }

  @Override
  public void same(String message, Object expected, Object actual) {
    assertSame(message,  expected, actual);
  }
}
