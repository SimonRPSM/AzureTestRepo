package buildtools.stages

class AbstractStage implements Stage{
  Abstractstage(script, String stageName){
    this.script = script
    this.stageName = stageName
  }
  void execute() {
    echo this.stageName
  }
