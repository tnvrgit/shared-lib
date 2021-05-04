
def call(repo) {
  script: 'git clone ${repo}'
}

return this
