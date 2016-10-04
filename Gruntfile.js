/*global module:false*/

var fs = require('fs');

module.exports = function(grunt) {
  require('load-grunt-tasks')(grunt);
  
  grunt.initConfig({
    'clean': {
      'clean-restful-ptv-java-client-cruft': [
        'generated-java-client/docs', 
        'generated-java-client/gradle', 
        'generated-java-client/build.gradle',
        'generated-java-client/build.sbt',
        'generated-java-client/git_push.sh',
        'generated-java-client/gradle.properties',
        'generated-java-client/gradlew',
        'generated-java-client/gradlew.bat',
        'generated-java-client/LICENSE',
        'generated-java-client/README.md',
        'generated-java-client/settings.gradle',
        'generated-java-client/src/test',
        'generated-java-client/src/main/AndroidManifest.xml',
        'generated-java-client/src/main/java/io',
        'generated-java-client/src/main/java/fi/otavanopisto/restfulptv/auth',
        'generated-java-client/src/main/java/fi/otavanopisto/restfulptv/*.java'
      ],
      'sources': ['generated-java-client/src']
    },
    'copy': {
      'copy-restful-ptv-rest-client-extras': {
        src: '**',
        dest: 'generated-java-client',
        cwd: 'client-extras',
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
      'generate-restful-ptv-java-client': {
        command : 'mv generated-java-client/pom.xml generated-java-client/pom.xml.before && \
          java -jar swagger-codegen-cli.jar generate \
          -i ./swagger.yaml \
          -l java \
          --api-package fi.otavanopisto.restfulptv.client\
          --model-package fi.otavanopisto.restfulptv.client.model \
          --group-id fi.otavanopisto.restful-ptv.restful-ptv-rest-client \
          --artifact-id restful-ptv-rest-client\
          --artifact-version `mvn -f generated-java-client/pom.xml.before -q -Dexec.executable=\'echo\' -Dexec.args=\'${project.version}\' --non-recursive org.codehaus.mojo:exec-maven-plugin:1.3.1:exec` \
          --template-dir templates \
          --library jersey2 \
          --additional-properties dateLibrary=java8 \
          -o generated-java-client/'
      },
      'install-restful-ptv-java-client': {
        command : 'mvn install',
        options: {
          execOptions: {
            cwd: 'generated-java-client'
          }
        }
      },
      'release-restful-ptv-java-client': {
        command : 'git add src pom.xml && git commit -m "Generated source" && git push && mvn -B release:clean release:prepare release:perform',
        options: {
          execOptions: {
            cwd: 'generated-java-client'
          }
        }
      }
    }
  });
  
  grunt.registerTask('download-dependencies', 'if-missing:curl:swagger-codegen');
  grunt.registerTask('default', ['download-dependencies', 'clean:sources', 'shell:generate-restful-ptv-java-client', 'clean:clean-restful-ptv-java-client-cruft', 'copy:copy-restful-ptv-rest-client-extras', 'shell:install-restful-ptv-java-client', 'shell:release-restful-ptv-java-client' ]);
  
};