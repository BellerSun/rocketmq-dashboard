/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.dashboard.testbase;

import static java.io.File.separator;

public class TestConstant {

    public static final String LOCAL_HOST = "127.0.0.1";
    public static final String NAME_SERVER_IP = LOCAL_HOST;
    public static final String BROKER_IP = LOCAL_HOST;
    public static final int NAME_SERVER_PORT = 19153;
    public static final int BROKER_PORT = 19055;
    public static final int BROKER_HA_PORT = 19043;

    public static final String TEST_FILE_ROOT_DIR = System.getProperty("user.home") + separator + "rocketmq-console-test";
    public static final String TEST_CLUSTER_NAME = "ConsoleTestCluster";
    public static final String TEST_BROKER_NAME = "ConsoleTestBroker";
    public static final String BROKER_ADDRESS = BROKER_IP + ":" + BROKER_PORT;
    public static final String NAME_SERVER_ADDRESS = NAME_SERVER_IP + ":" + NAME_SERVER_PORT;


}
