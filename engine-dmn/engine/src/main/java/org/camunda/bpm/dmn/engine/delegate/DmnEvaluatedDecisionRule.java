/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.camunda.bpm.dmn.engine.delegate;

import java.util.Map;

/**
 * A evaluated decision rule.
 */
public interface DmnEvaluatedDecisionRule {

  /**
   * @return the id of the decision rule or null if not set
   */
  String getId();

  /**
   * @return the evaluated output entries for the decision rule
   */
  Map<String, DmnEvaluatedOutput> getOutputEntries();

}
