// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Madhu/Documents/play-app-demo/conf/routes
// @DATE:Thu Feb 07 14:46:03 IST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
