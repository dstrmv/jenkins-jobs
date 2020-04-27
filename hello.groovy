node("master") {
  hello()
  def folders = Jenkins.get().getAllItems(com.cloudbees.hudson.plugins.folder.Folder.class)
  def jobs = Jenkins.get().getAllItems(org.jenkinsci.plugins.workflow.job.WorkflowJob)
  echo "${folders[0].getName()}"
  jobs.each {
    echo "${it.getName()}"
  }
  echo "${this.class.name}"
}
