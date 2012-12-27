#!/bin/bash

CLASSPATH="${CLASSPATH}:./"
for jar in $(ls lib/*jar); do
	CLASSPATH="${CLASSPATH}:${jar}"
done

java -cp ${CLASSPATH} cc.hdas.try_mvn_war_jar.HelloMain $*
