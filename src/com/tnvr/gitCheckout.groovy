package com.tnvr

def checkOutFrom(repo, branch) {
  script: 'git clone -b ${branch} ${repo}'
}

return this
