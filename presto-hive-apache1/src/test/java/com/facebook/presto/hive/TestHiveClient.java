/*
 * Licensed under the Apache License, Version 2.0 (the "License");
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
package com.facebook.presto.hive;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestHiveClient
        extends AbstractTestHiveClient
{
    @Parameters({"hive.apache1.metastoreHost", "hive.apache1.metastorePort", "hive.apache1.databaseName"})
    @BeforeMethod
    @Override
    public void setup(String host, int port, String databaseName)
    {
        super.setup(host, port, databaseName);
    }
}
