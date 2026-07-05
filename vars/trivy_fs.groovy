def call(){
 sh "trivy fs . -o result.json"
 echo "File system scanned successfully and report generated..."   
}