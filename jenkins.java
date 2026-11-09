
node {

    stage('Build') {
        echo 'Building Java Application...'
        sh 'mvn clean package'
        echo 'Build completed successfully!'
    }

    stage('Test') {
        echo 'Testing Java Application...'
        sh 'mvn test'
        echo 'Testing completed successfully!'
    }

    stage('Deploy') {
        echo 'Deploying Java Application...'
        sh 'echo Deploying Java application'
        echo 'Deployment completed successfully!'
    }

}
