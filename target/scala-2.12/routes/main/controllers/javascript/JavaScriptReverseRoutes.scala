// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Madhu/Documents/crimes/Crime_backend/conf/routes
// @DATE:Thu Feb 07 15:41:27 IST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {

  // @LINE:34
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseUsersController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def getCurrentUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.getCurrentUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/currentuser"})
        }
      """
    )
  
    // @LINE:7
    def signInUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.signInUser",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signin"})
        }
      """
    )
  
    // @LINE:5
    def registerUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.registerUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:8
    def signOutUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.signOutUser",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signout"})
        }
      """
    )
  
    // @LINE:9
    def getAllUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersController.getAllUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseHelloWorldController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def hello: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloWorldController.hello",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hello/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:24
    def me: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloWorldController.me",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "me"})
        }
      """
    )
  
    // @LINE:22
    def hellos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloWorldController.hellos",
      """
        function(name0,count1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hellos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0)) + _qS([(count1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("count", count1))])})
        }
      """
    )
  
    // @LINE:20
    def helloMattias: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloWorldController.helloMattias",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hello/mattias"})
        }
      """
    )
  
    // @LINE:19
    def helloWorld: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloWorldController.helloWorld",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "helloWorld"})
        }
      """
    )
  
    // @LINE:23
    def greetings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloWorldController.greetings",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "greetings"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseBooksController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def deleteBookById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.deleteBookById",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "books/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:13
    def getBookById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.getBookById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:16
    def getAllBooks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.getAllBooks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books"})
        }
      """
    )
  
    // @LINE:14
    def updateBookById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.updateBookById",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "books/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:12
    def createBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.createBook",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "books"})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }


}
