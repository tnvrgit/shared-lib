package com.tnvr

def checkOutFrom(repo) {
  script: 'git clone -b master https://github.com/tnvrgit/test/'
}

return this
