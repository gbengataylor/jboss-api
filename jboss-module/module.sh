#!/bin/bash

jboss_cli=~/local/devstudio/runtimes/jboss-eap/bin/jboss-cli.sh

if [[ "$1" = "rm" ]] ; then
  cmds="rm-commands.cli"
  ${jboss_cli} -c file="rm-ds.cli"
  ${jboss_cli} -c file="rm-driver-module.cli"

elif [[ "$1" = "add" ]]; then
  ${jboss_cli} -c file="add-module-driver.cli"

else
  echo "usage: module.sh [add|rm]"
  exit
fi
