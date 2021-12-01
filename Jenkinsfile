node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    def mvn = tool 'Maven';
    withSonarQubeEnv() {
      sh "${mvn} clean verify sonar:sonar -Dsonar.projectKey=hotel -Dsonar.login=a4518bfe6561cff2b93ce83901d83fe0ff5cd20f"
    }
  }
}
