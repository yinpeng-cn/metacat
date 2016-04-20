/*
 * Copyright 2016 Netflix, Inc.
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

/* Generated By:JavaCC: Do not edit this line. PartitionParserDefaultVisitor.java Version 6.1_2 */
package com.netflix.metacat.common.partition.parser;

public class PartitionParserDefaultVisitor implements PartitionParserVisitor{
  public Object defaultVisit(SimpleNode node, Object data){
    node.childrenAccept(this, data);
    return data;
  }
  public Object visit(SimpleNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTFILTER node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTAND node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTOR node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTNOT node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBETWEEN node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTIN node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTLIKE node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTCOMPARE node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTGT node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTLT node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTLTE node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTGTE node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTEQ node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTNEQ node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTMATCHES node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTNUM node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTSTRING node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTVAR node, Object data){
    return defaultVisit(node, data);
  }
}
/* JavaCC - OriginalChecksum=c7638298b490e0556f0ac443ae5a1aa1 (do not edit this line) */
