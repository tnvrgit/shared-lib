def call(String ProjectKey, String pomPath) {
  script: 'mvn sonar:sonar -Dsonar.projectKey=${ProjectKey} -Dsonar.host.url=http://192.168.40.128:9001 -Dsonar.login=15e8fbeab0615b42bc7155ab446639aaeabe87fe -f ${pomPath}'
  
}

return this
