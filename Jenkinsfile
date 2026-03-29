pipeline
{
	agent any
		tools
		{
			maven 'MAVEN_HOME'
		}
		stages
		{
			stage('Welcome Stage')
			{
				steps
				{
					echo 'Welcome to Pipeline'
				}
			}
			
			stage('Clean Stage')
			{
				steps
				{
					sh 'mvn clean'
				}
			}
			stage('Test Stage')
			{
				steps
				{
					bat 'mvn test'
				}
			}
			stage('Build Stage')
			{
				steps
				{
					sh 'mvn install'
				}
			}
			stage('Build Success')
			{
				steps
				{
					echo 'Build Success'
				}
			}	

			stage('Final Success')
			{
				steps
				{
					echo 'Final Success'
				}
			}	
			stage('Super Final Success')
			{
				steps
				{
					echo 'Super Final Success'
				}
			}

		}
}
