/*
 *  Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.wso2.micro.gateway.jwt.transformer;

import java.util.Map;

/**
 * Defines the interface for writing the  jwt tranformation.
 */
public interface JWTValueTransformer {

    /**
     *  Transform the custom claims  into required format.
     * @param jwtClaims jwtClaims from given JWT
     * @return transformed JWT Claims
     */
    Map<String, Object> transformJWT(Map<String, Object> jwtClaims);
}
