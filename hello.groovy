@Library("ci") _

node("master") {
  hello()
  echo sh(script: 'env|sort', returnStdout: true)
}
