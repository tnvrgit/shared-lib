def call(String goal) {
  script: 'mvn ${goal}'
}

return this
