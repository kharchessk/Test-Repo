pipeline {
  agent any
	tools {
		maven 'M2_HOME'
		}
 // parameters {
	//booleanParam (
	 // defaultValue: false,
	 // description: 'Upload this version to repository?',
	 // name : 'UPLOAD_TO_REPOSITORY')  
//  }
  stages {
	stage('Deploy to repository') {
	  //when {
		// expression {
		//	  return params.UPLOAD_TO_REPOSITORY
		 // }
	 // }
	  steps {
				//sh "mvn clean package -U"
		             //  sh "mvn build-helper:parse-version versions:set -DnewVersion=\\\${parsedVersion.majorVersion}.\\\${parsedVersion.minorVersion}.\\\${parsedVersion.incrementalVersion}-build${env.BUILD_NUMBER} versions:commit"
		               //sh "mvn -DskipTests clean deploy"
		              // echo 'Tagging version'
		     echo 'Updating version before uploading to repository...'
		sh 'mvn build-helper:parse-version versions:set -DnewVersion=\\\${parsedVersion.majorVersion}.\\\${parsedVersion.minorVersion}.\\\${parsedVersion.incrementalVersion}-BUILD-${BUILD_NUMBER} versions:commit'
		echo 'Deploying to respository...'
		sh 'mvn -DskipTests clean deploy'
			            sh "mvn -Dusername='kharchessk@gmail.com' scm:tag"
	  }
	}

  }
}
