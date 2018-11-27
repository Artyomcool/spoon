package com.squareup.spoon;

import com.android.ddmlib.testrunner.ITestRunListener;
import com.android.ddmlib.testrunner.TestIdentifier;

import java.util.List;
import java.util.Map;

public interface SpoonListener extends ITestRunListener {
  default void testListReceived(List<TestIdentifier> active, List<TestIdentifier> ignored) {}
  default void testListFinished() {}
  @Override
  default void testRunStarted(String runName, int testCount) {}
  @Override
  default void testStarted(TestIdentifier test) {}
  @Override
  default void testFailed(TestIdentifier test, String trace) {}
  @Override
  default void testAssumptionFailure(TestIdentifier test, String trace) {}
  @Override
  default void testIgnored(TestIdentifier test) {}
  @Override
  default void testEnded(TestIdentifier test, Map<String, String> testMetrics) {}
  @Override
  default void testRunFailed(String errorMessage) {}
  @Override
  default void testRunStopped(long elapsedTime) {}
  @Override
  default void testRunEnded(long elapsedTime, Map<String, String> runMetrics) {}
}
