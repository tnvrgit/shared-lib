
def call(repo) {
  script: 'git clone -b master ${repo}'
}

return this
