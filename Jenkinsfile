
node {

    stage('Build') {
        echo 'Building Java Application'
        sh 'mvn clean package -DskipTests'
    }

    stage('Test') {
        echo 'Testing Java Application'
        sh 'mvn test'
    }

    stage('Deploy') {
        echo 'Deploying Java Application'
        echo 'Deployment successful!'
    }

}
