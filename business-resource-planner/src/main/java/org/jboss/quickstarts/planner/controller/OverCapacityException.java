/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the 
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.quickstarts.planner.controller;

/**
 * 
 * Thrown when the total Demand is greater than total capacity
 * 
 * @author rafaelbenevides
 * 
 */
public class OverCapacityException extends Exception {

    private static final long serialVersionUID = 1L;

    public OverCapacityException(int demand, int capacity) {
        super("The total capacity is " + capacity + " for a " + demand + " demand. Increase the number of Vehicles or reduce the number of Customers");
    }

}