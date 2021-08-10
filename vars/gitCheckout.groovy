
def call(repo, branch) {
  script: 'git clone -b ${branch} ${repo}'
}

return this
