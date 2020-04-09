@Library("ci") _

node("master") {
  hello()
  echo "${params}"
}
