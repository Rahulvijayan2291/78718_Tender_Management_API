#!/bin/sh

sudo apt-get update
sudo apt install -y libxml2-utils
mvn install
sudo service jenkins stop