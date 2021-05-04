def call(String goal, String pomPath) {
  script: 'mvn ${goal} -f ${pomPath}'
}

return this
