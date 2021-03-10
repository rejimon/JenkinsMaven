job('Maven-Project-with-DSL'){
	description("This maven project is generated via DSL")
	scm{
		git("https://github.com/rejimon/JenkinsMaven.git","master")
		}
	triggers{
		scm('* * * * *')
	}
	steps{
		maven("clean package","maven-samples/single-module/pom.xml")
	}
	publishers{
		archiveArtifacts '**/*.jar'
	}
}