pipeline{
	agent any
	stages{
		stage('checkout'){
			steps{
				println 'check out from GIT !!!'
			}
		}
		stage('Code Analysis'){
			steps{
				echo 'Code Analysis'
			}
		}
		stage('Build'){
			steps{
				echo 'Build'
			}
		}
		stage('Test Automation'){
			steps{
				echo 'Test Automation'
			}
		}
		stage('Deployment'){
			steps{
				echo 'Deployment'
			}
		}
	
	}
}
