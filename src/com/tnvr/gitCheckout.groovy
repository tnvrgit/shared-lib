package com.tnvr

def checkOutFrom(repo) {
  script: 'git clone -b master ${repo}'
}

return this
