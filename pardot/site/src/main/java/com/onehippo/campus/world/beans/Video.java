package com.onehippo.campus.world.beans;
/*
 * Copyright 2014 Hippo B.V. (http://www.onehippo.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.hippoecm.hst.content.beans.Node;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;

@HippoEssentialsGenerated(internalName = "world:video")
@Node(jcrType = "world:video")
public class Video extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "world:title")
    public String getTitle() {
        return getProperty("world:title");
    }

    @HippoEssentialsGenerated(internalName = "world:description")
    public String getDescription() {
        return getProperty("world:description");
    }

    @HippoEssentialsGenerated(internalName = "world:link")
    public String getLink() {
        return getProperty("world:link");
    }
}
