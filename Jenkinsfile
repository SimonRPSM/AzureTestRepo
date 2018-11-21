#!/usr/bin/env groovy
pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                echo 'test'
            }
        stage('lv_cli') {
            steps {
                echo 'Testing..'
                bat "labview-cli --kill C:\\Users\\labview\\Desktop\\Research\\lvDiff_Port\\lvDiff.vi -- C:\\Users\\labview\\Desktop\\Research\\jenkins_tests\\sampleVI_1.vi C:\\Users\\labview\\Desktop\\Research\\jenkins_tests\\sampleVI_2.vi C:\\Users\\labview\\Desktop\\sampleVIDiff"              }
            }
        }
    }
}
