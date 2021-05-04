package org.foo

def checkOutFrom(repo) {
  git url: "https://github.com/tnvrgit/${repo}"
}

return this
