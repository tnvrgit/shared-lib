package com.tnvr

def checkOutFrom(repo) {
  git url: "${repo}"
}

return this
