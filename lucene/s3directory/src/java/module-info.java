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

/** Auto-suggest and Spellchecking support */
module org.apache.lucene.s3directory {

  requires org.apache.lucene.core;
  requires java.logging;
  requires software.amazon.awssdk.core;
  requires software.amazon.awssdk.services.s3;

  exports org.apache.lucene.store.s3;

  provides org.apache.lucene.store.Directory with org.apache.lucene.store.s3.S3Directory;

}
