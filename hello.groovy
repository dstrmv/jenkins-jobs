@Library("ci") _

node("master") {
  hello()
  echo sh(script: 'env|sort', returnStdout: true)
  def folders = Jenkins.get().getAllItems(com.cloudbees.hudson.plugins.folder.Folder.class)
  echo "${folders[0].getName()}"
}
