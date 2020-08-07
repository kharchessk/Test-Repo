pipeline {
  agent any
  parameters {
	booleanParam (
	  defaultValue: false,
	  description: 'Upload this version to repository?',
	  name : 'UPLOAD_TO_REPOSITORY')  
  }
  stages {
	stage('Deploy to repository') {
	  when {
		 expression {
			  return params.UPLOAD_TO_REPOSITORY
		  }
	  }
	  steps {
		echo 'Updating version before uploading to repository...'
		bat 'mvn build-helper:parse-version versions:set -DnewVersion=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.incrementalVersion}-BUILD-${BUILD_NUMBER} versions:commit'
		echo 'Deploying to respository...'
		bat 'mvn -DskipTests clean deploy'
		echo 'Tagging version'
		bat 'mvn -Dusername="kharchessk@gmail.com" "Head"'
	  }
	}

  }
}
