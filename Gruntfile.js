/*global module:false*/

var fs = require('fs');

module.exports = function(grunt) {
  require('load-grunt-tasks')(grunt);
  
  grunt.initConfig({
    'clean': {
      'java-client-cruft': [
        'java-client-generated/docs', 
        'java-client-generated/gradle', 
        'java-client-generated/build.gradle',
        'java-client-generated/build.sbt',
        'java-client-generated/git_push.sh',
        'java-client-generated/gradle.properties',
        'java-client-generated/gradlew',
        'java-client-generated/gradlew.bat',
        'java-client-generated/LICENSE',
        'java-client-generated/README.md',
        'java-client-generated/settings.gradle',
        'java-client-generated/src/test',
        'java-client-generated/src/main/AndroidManifest.xml',
        'java-client-generated/src/main/java/io',
        'java-client-generated/src/main/java/fi/otavanopisto/restfulptv/auth',
        'java-client-generated/src/main/java/fi/otavanopisto/restfulptv/*.java'
      ],
      'java-client-sources': ['java-client-generated/src']
    },
    'copy': {
      'java-client-extras': {
        src: '**',
        dest: 'java-client-generated',
        cwd: 'java-client-extras',
        expand: true
      }
    },
    'curl': {
      'swagger-codegen':  {
        src: 'http://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/2.2.1/swagger-codegen-cli-2.2.1.jar',
        dest: 'swagger-codegen-cli.jar'
      }
    },
    'shell': {
      'java-client-generate': {
        command : 'mv java-client-generated/pom.xml java-client-generated/pom.xml.before && \
          java -jar swagger-codegen-cli.jar generate \
          -i ./swagger.yaml \
          -l java \
          --api-package fi.otavanopisto.restfulptv.client\
          --model-package fi.otavanopisto.restfulptv.client.model \
          --group-id fi.otavanopisto.restful-ptv.restful-ptv-rest-client \
          --artifact-id restful-ptv-rest-client\
          --artifact-version `mvn -f java-client-generated/pom.xml.before -q -Dexec.executable=\'echo\' -Dexec.args=\'${project.version}\' --non-recursive org.codehaus.mojo:exec-maven-plugin:1.3.1:exec` \
          --template-dir java-client-templates \
          --library jersey2 \
          --additional-properties dateLibrary=java8 \
          -o java-client-generated/'
      },
      'java-client-install': {
        command : 'mvn install',
        options: {
          execOptions: {
            cwd: 'java-client-generated'
          }
        }
      },
      'java-client-release': {
        command : 'git add src pom.xml && git commit -m "Generated source" && git push && mvn -B release:clean release:prepare release:perform',
        options: {
          execOptions: {
            cwd: 'java-client-generated'
          }
        }
      }
    }
  });
  
  grunt.registerTask('download-dependencies', 'if-missing:curl:swagger-codegen');
  grunt.registerTask('default', ['download-dependencies', 'clean:java-client-sources', 'shell:java-client-generate', 'clean:java-client-cruft', 'copy:java-client-extras', 'shell:java-client-install', 'shell:java-client-release' ]);
  
};