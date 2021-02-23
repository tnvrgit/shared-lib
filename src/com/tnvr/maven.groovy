package com.tnvr
class maven {
  def steps
  maven(steps) {this.steps = steps}
  def mvn(args) {
    steps.sh "${steps.tool 'maven'}/bin/mvn -o ${args}"
  }
}
