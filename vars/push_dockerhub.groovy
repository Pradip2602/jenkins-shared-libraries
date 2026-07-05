def call(String credId,String imageName){
    withCredentials([usernamePassword(
                    credentialsId: "${credId}", 
                    passwordVariable: "dockerHubPass", 
                    usernameVariable: "dockerHubUser")]){
                        sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                        echo "Docker login successful...."
                        sh "docker image tag ${imageName}:latest ${env.dockerHubUser}/${imageName}:latest"
                        sh "docker push ${env.dockerHubUser}/${imageName}:latest"
                        echo "docker images pushed successfully...."
                    }
}