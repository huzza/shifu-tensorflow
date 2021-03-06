/*
 * Copyright [2013-2018] PayPal Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ml.shifu.shifu.core.yarn.appmaster;

import org.apache.hadoop.util.Time;
import org.apache.hadoop.yarn.util.Clock;

/**
 * A monotonic clock from some arbitrary time base in the past, counting in
 * milliseconds, and not affected by settimeofday or similar system clock
 * changes.
 * This is appropriate to use when computing how much longer to wait for an
 * interval to expire.
 * This function can return a negative value and it must be handled correctly
 * by callers. See the documentation of System#nanoTime for caveats.
 */
public class MonotonicClock implements Clock {

  /**
   * Get current time from some arbitrary time base in the past, counting in
   * milliseconds, and not affected by settimeofday or similar system clock
   * changes.
   * @return a monotonic clock that counts in milliseconds.
   */
  public long getTime() {
    return Time.monotonicNow();
  }
}
