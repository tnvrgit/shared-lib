package com.tnvr.shared-lib

def call(repo) {
  git url: "tnvrgit@github.com:tnvrgit/${repo}"
}

return this
