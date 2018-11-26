#!/usr/bin/env groovy
//Leave the above line alone.  It identifies this as a groovy script.
@Library('vs-build-tools') _

def lvVersions = ['2015']
def nodelabel = 'veristand'

ni.vsbuild.PipelineExecutor.execute(this, nodelabel, lvVersions)
diffPipeline('2015')
