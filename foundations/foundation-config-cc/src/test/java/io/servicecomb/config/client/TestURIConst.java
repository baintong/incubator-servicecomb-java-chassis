/*
 * Copyright 2017 Huawei Technologies Co., Ltd
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

package io.servicecomb.config.client;

import org.junit.Assert;
import org.junit.Test;

import mockit.Expectations;
import mockit.Mocked;

public class TestURIConst {
  @Test
  public void testURIV3(final @Mocked ConfigCenterConfig config) {
    // just reset the config
    new Expectations() {{
      config.getDomainName();
      result = "default";
    }};
    
    Assert.assertEquals(URIConst.MEMBERS, "/v3/default/configuration/members");
    Assert.assertEquals(URIConst.REFRESH_ITEMS, "/v3/default/configuration/refresh/items");
    Assert.assertEquals(URIConst.ITEMS, "/v3/default/configuration/items");
  }
  
}
