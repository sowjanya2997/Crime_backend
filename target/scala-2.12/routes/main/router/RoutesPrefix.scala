// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Madhu/Documents/crimes/Crime_backend/conf/routes
// @DATE:Thu Feb 07 15:41:27 IST 2019


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
