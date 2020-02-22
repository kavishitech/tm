// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/vinay/Private/Projects/dms/conf/routes
// @DATE:Sat Feb 22 12:07:52 IST 2020


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
