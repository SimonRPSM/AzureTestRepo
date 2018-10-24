pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat "python --version"
//                bat "labview-cli --kill C:\\Users\\labview\\Documents\\GitHub\\buildsystem\\steps\\lv-build.vi -- 'azurebuild.lvproj' 'My Computer' 'azurebuildspec' 'build_temp' 'C:\Users\labview\.jenkins\workspace'"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                bat "labview-cli --kill C:\\Users\\labview\\Desktop\\cli_tests\\lvDiff.vi -- 'C:\Users\labview\Desktop\sampleVI_1.vi' 'C:\Users\labview\Desktop\sampleVI_2.vi' 'C:\Users\labview\Desktop\sampleVIDiff'"
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
