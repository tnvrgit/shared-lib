package com.tnvr
class maven implements Serializable {
  def steps
  maven(steps) {this.steps = steps}
  def mvn(args) {
    steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
  }
}
