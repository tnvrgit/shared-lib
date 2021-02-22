package com.tnvr

def checkOutFrom(repo) {
  git url: "tnvrgit@github.com:tnvrgit/${repo}"
}

return this
