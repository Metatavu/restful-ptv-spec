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
        'java-client-generated/src/main/java/fi/metatavu/restfulptv/auth',
        'java-client-generated/src/main/java/fi/metatavu/restfulptv/*.java'
      ],
      'jaxrs-spec-cruft': [
        'jaxrs-spec-generated/src/main/java/fi/metatavu/restful/server/RestApplication.java'
      ],
      'jaxrs-spec-sources': ['jaxrs-spec-generated/src'],
      'java-client-sources': ['java-client-generated/src']
    },
    'copy': {
      'java-client-extras': {
        src: '**',
        dest: 'java-client-generated',
        cwd: 'java-client-extras',
        expand: true
      },
      'jaxrs-spec-extras': {
        src: '**',
        dest: 'jaxrs-spec-generated',
        cwd: 'jaxrs-spec-extras',
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
        command : 'mv java-client-generated/pom.xml java-client-generated/pom.xml.before && ' +
          'java -jar swagger-codegen-cli.jar generate ' +
          '-i ./swagger.yaml ' +
          '-l java ' +
          '--api-package fi.metatavu.restfulptv.client ' +
          '--model-package fi.metatavu.restfulptv.client.model ' +
          '--group-id fi.metatavu.restful-ptv.restful-ptv-rest-client ' +
          '--artifact-id restful-ptv-rest-client ' +
          '--artifact-version `cat java-client-generated/pom.xml.before|grep version -m 1|sed -e \'s/.*<version>//\'|sed -e \'s/<.*//\'` ' +
          '--template-dir java-client-templates ' +
          '--library jersey2 ' +
          '--additional-properties dateLibrary=java8 ' +
          '-o java-client-generated/'
      },
      'jaxrs-spec-generate': {
        command : 'mv jaxrs-spec-generated/pom.xml jaxrs-spec-generated/pom.xml.before && ' +
          'java -jar swagger-codegen-cli.jar generate ' +
          '-i ./swagger.yaml ' +
          '-l jaxrs-spec ' +
          '--api-package fi.metatavu.restfulptv.server.rest ' +
          '--model-package fi.metatavu.restfulptv.server.rest.model ' +
          '--group-id fi.metatavu.restful-ptv ' +
          '--artifact-id restful-ptv-spec ' +
          '--artifact-version `cat jaxrs-spec-generated/pom.xml.before|grep version -m 1|sed -e \'s/.*<version>//\'|sed -e \'s/<.*//\'` ' +
          '--template-dir jaxrs-spec-templates ' +
          '--additional-properties dateLibrary=java8 ' +
          '-o jaxrs-spec-generated/'
      },
      'java-client-install': {
        command : 'mvn install',
        options: {
          execOptions: {
            cwd: 'java-client-generated'
          }
        }
      },
      'jaxrs-spec-install': {
        command : 'mvn install',
        options: {
          execOptions: {
            cwd: 'jaxrs-spec-generated'
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
      },
      'jaxrs-spec-release': {
        command : 'git add src pom.xml swagger.json && git commit -m "Generated source" && git push && mvn -B release:clean release:prepare release:perform',
        options: {
          execOptions: {
            cwd: 'jaxrs-spec-generated'
          }
        }
      }
    }
  });
  
  grunt.registerTask('download-dependencies', 'if-missing:curl:swagger-codegen');
  grunt.registerTask('java-client', ['download-dependencies', 'clean:java-client-sources', 'shell:java-client-generate', 'clean:java-client-cruft', 'copy:java-client-extras', 'shell:java-client-install', 'shell:java-client-release' ]);
  grunt.registerTask('jaxrs-spec', ['download-dependencies', 'clean:jaxrs-spec-sources', 'shell:jaxrs-spec-generate', 'clean:jaxrs-spec-cruft', 'copy:jaxrs-spec-extras', 'shell:jaxrs-spec-install', 'shell:jaxrs-spec-release' ]);
  
  grunt.registerTask('default', ['java-client', 'jaxrs-spec' ]);
  
};