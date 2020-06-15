node {
   stage('git clone') { // for display purposes
     git branch: 'master', credentialsId:'github.com', url:'https://github.com/FloraLiang/eMartSpringBoot'
   }
   stage('Build') {
           //env.JAVA_HOME="${tool 'jdk1.8.0_231'}"
           withMaven(
            maven: 'maven',
            mavenLocalRepo: '.repository') {
                sh "mvn clean install -Dmaven.test.skip=true"
        }
   }
}