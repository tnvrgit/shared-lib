package com.tnvr.shared-lib

def checkOutFrom(repo) {
  git url: "git@github.com:tnvrgit/${repo}"
}

return this
