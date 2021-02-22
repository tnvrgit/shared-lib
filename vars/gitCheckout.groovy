package com.tnvr

def call(repo) {
  git url: "${repo}"
}

return this
