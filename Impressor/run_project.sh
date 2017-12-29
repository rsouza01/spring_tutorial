#!/bin/bash

mvn clean && mvn && mvn exec:java -Dexec.mainClass=com.rsouza01.common.App
