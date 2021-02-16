package com.tnvr.shared-lib

def checkOutFrom(repo) {
  git url: "tnvrgit@github.com:tnvrgit/${repo}"
}

return this
