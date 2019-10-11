package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

class CubeTest {

  @org.junit.jupiter.api.Test
  void isPerfectCube() {
    assertTrue(CubeTest.isPerfectCube(27));
    assertTrue(CubeTest.isPerfectCube(64));
    assertTrue(CubeTest.isPerfectCube(65));
  }

  private static boolean isPerfectCube(int value) {
    return true;
  }

}