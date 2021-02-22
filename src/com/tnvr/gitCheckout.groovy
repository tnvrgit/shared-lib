package com.tnvr.sharedlib

def checkOutFrom(repo) {
  git url: "tnvrgit@github.com:tnvrgit/${repo}"
}

return this
