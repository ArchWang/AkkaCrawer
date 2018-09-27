package akkaCrawer.deploy

class AkkaCrawerEnv(env: Map[String,String]= sys.env){
  var masterHost: String = null
  var masterPort: String = null
  var workerHost: String = null
  var workerPort: String = null

  private def loadMasterEnv():Unit = {
    masterHost = Option(masterHost).orElse(env.get("AC_MASTER_HOST")).orNull
    masterPort= Option(masterPort).orElse(env.get("AC_MASTER_PORT")).orNull
  }

}