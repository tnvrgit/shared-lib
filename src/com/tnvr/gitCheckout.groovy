package com.tnvr

def checkOutFrom(repo) {
  script: 'git clone ${repo}'
}

return this
