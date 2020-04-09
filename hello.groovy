@Library("ci") _

node("master") {
  hello()
  echo "${env.toString()}"
}
